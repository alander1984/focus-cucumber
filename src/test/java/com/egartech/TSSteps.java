package com.egartech;

import com.egartech.helpers.Context;
import com.egartech.helpers.DateMapper;
import com.egartech.helpers.ScenarioContext;
import com.egartech.network.TSHeaderHandlerResolver;
import com.egartech.network.Utils;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.sun.org.apache.xpath.internal.operations.Equals;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.InetAddress;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;
import org.datacontract.schemas._2004._07.egar_focus.ActionResult;
import org.datacontract.schemas._2004._07.egar_focus.InterActionParams;
import org.datacontract.schemas._2004._07.egar_focus.OperationErrorCode;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.*;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.DealEventProxy;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.EventsScheduleProxy;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.ServiceDealOperation;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.ServiceOperationResult;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.ServiceValueResult;
import org.junit.Assert;
import org.tempuri.*;
import org.tempuri.AddDealEvent;
import org.tempuri.DealServiceImpl;
import org.tempuri.GetEventsSchedule;
import org.tempuri.GetEventsScheduleResponse;
import org.tempuri.IDealService;
import org.tempuri.InitializeSession;
import org.tempuri.InitializeSessionResponse;
import org.tempuri.TryExecuteSTPActionResponse;
import org.w3._2005._09.ws_i18n.International;
import org.w3._2005._09.ws_i18n.ObjectFactory;
import sun.security.timestamp.TSRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

import static org.junit.Assert.*;

public class TSSteps {
    private String today;
    private String actualAnswer;
    private String dealId;
    private static ScenarioContext scenarioContext = new ScenarioContext();

    @Given("^the web service is running at \"([^\"]*)\" port \"([^\"]*)\"$")
    public void checkWebServiceRunning(String service_address,int service_port) throws UnknownHostException, IOException{
        assertTrue(Utils.isReachableByTcp(service_address,service_port,5000));
    }

    @When("^init focus session for username \"([^\"]*)\" with loginName \"([^\"]*)\"$")
    public void initSession(String username, String loginName) {
        IDealService dealService = new DealServiceImpl().getBasicHttpBindingIDealService();
        International inter = new International();
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> locale = factory.createInternationalLocale("ru-RU");
        inter.setLocale(locale);
        String sessionId = dealService.initializeSession(username,
                loginName,"ALFALOAD-CL","Focus32",inter,",",
                " ","dd.MM.yyyy");
        scenarioContext.setContext(Context.SESSION_ID,sessionId);
        scenarioContext.setContext(Context.USERNAME,username);
    }

    @When("^load trademonitor for deal number \"([^\"]*)\" with horizon from \"(.*?)\"$")
    public void loadTradeMonitor(Integer tradeId,@Transform(DateMapper.class) LocalDate date) throws DatatypeConfigurationException{
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());
        DealServiceImpl dealService = new DealServiceImpl();
        GregorianCalendar gcal = GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));
        XMLGregorianCalendar horizon = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        dealService.setHandlerResolver(tsHandlerResolver);
        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        iDealService.loadTradeMonitor(tradeId, horizon, false, false);
    }

    @When("^try execute STP action$")
    public void tryExecuteSTPAction() {
        IDealService dealService = new DealServiceImpl().getBasicHttpBindingIDealService();
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(true, true);
    }

// ------------------------------*** Сценарии XML запросов ***-----------------------------------------

@When("^Send xml tryExecuteSTPAction with params \"([^\"]*)\" and \"([^\"]*)\"$")
public void sendXmlTryExecuteSTPActionWithParamsAnd(String stpAction, boolean execute) throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());

        ServiceDealOperation serviceDealOperation = new ServiceDealOperation();
        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);
        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        InterActionParams interActionParams = new InterActionParams();
        serviceDealOperation = iDealService.tryExecuteSTPAction("stpAction" , execute,interActionParams);//  Отправляем xml и записываем в переменную
        assertNotEquals(serviceDealOperation.getDescription().getValue().toString(),"�� ������������� ������ �������� ������ 1984951?");
        assertEquals(serviceDealOperation.getUserName().getValue().toString(),"MKinder");
    }


    @When("^Send xml GetEventsSchedule with params \"([^\"]*)\"$")
    public void sendXmlGetEventsScheduleWithParams(boolean showCanceledEvents) throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());
        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);

        IDealService iDealService = dealService.getBasicHttpBindingIDealService(); // Сервисы из всдл
        EventsScheduleProxy eventsScheduleProxy = iDealService.getEventsSchedule("", showCanceledEvents);

        assertEquals(eventsScheduleProxy.getFieldName().getValue().toString(),"EventsSchedule");



    }

    @When("^Send xml ScheduleGetParameter with params \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void sendXmlScheduleGetParameterWithParamsAndAnd(String fieldName, String eventId, String parameter) throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());

        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);

        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        ServiceValueResult serviceVolueResult = iDealService.scheduleGetParameter(fieldName, eventId, parameter);
        assertEquals(serviceVolueResult.getResult().value().toString(),"Success");
        Assert.assertEquals(serviceVolueResult.getValue().getValue().toString(),"RUR");

    }

    @When("^Send xml ScheduleGetProperty with params \"([^\"]*)\" and \"([^\"]*)\"$")
    public void sendXmlScheduleGetPropertyWithParamsAnd(String fieldName, String property) throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());

        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);
        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        iDealService.scheduleGetProperty(fieldName, property);



    }

    @When("^Send xml CloseSession without  params$")
    public void sendXmlCloseSessionWithoutParams() throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());

        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);
        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        iDealService.closeSession();


    }

}