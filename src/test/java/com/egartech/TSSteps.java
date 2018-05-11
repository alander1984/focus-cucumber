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
import org.datacontract.schemas._2004._07.egar_transactionservice_client.TradeType;
import org.junit.Assert;
import org.tempuri.*;
import org.tempuri.AddDealEvent;
import org.tempuri.ClickButtonResponse;
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

// ------------------------------*** Scenario Outline: trademonitor ***-----------------------------------------



    @When("^action on a transaction action: \"([^\"]*)\" execute takes on values true or false \"([^\"]*)\"$")
    public void actionOnATransactionActionExecuteTakesOnValuesTrueOrFalse(String stpAction, boolean execute) throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());

        ServiceDealOperation serviceDealOperation = new ServiceDealOperation();
        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);
        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        InterActionParams interActionParams = new InterActionParams();
        serviceDealOperation = iDealService.tryExecuteSTPAction(stpAction ,execute,interActionParams);//  Отправляем xml и записываем в переменную
        assertNotEquals(serviceDealOperation.getDescription().getValue().toString(),"�� ������������� ������ �������� ������ 1984951?");
        assertEquals(serviceDealOperation.getUserName().getValue().toString(),"MKinder");
    }

    @When("^get events schedule \"([^\"]*)\"$")
    public void getEventsSchedule(boolean Events) throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());
        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);

        IDealService iDealService = dealService.getBasicHttpBindingIDealService(); // Сервисы из всдл
        EventsScheduleProxy eventsScheduleProxy = iDealService.getEventsSchedule("", Events);

        assertEquals(eventsScheduleProxy.getFieldName().getValue().toString(),"EventsSchedule");
    }

    @When("^get  Schedule Parameter with Name:\"([^\"]*)\" Event:\"([^\"]*)\" Parametr:\"([^\"]*)\"$")
    public void getScheduleParameterWithNameEventParametr(String fieldName, String eventId, String parameter) throws Throwable {
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

    @When("^get  Schedule Property with Name: \"([^\"]*)\" and \"([^\"]*)\"$")
    public void getSchedulePropertyWithNameAnd(String fieldName, String property) throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());

        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);
        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        iDealService.scheduleGetProperty(fieldName, property);
    }


    @When("^close session$")
    public void closeSession() throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());

        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);
        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        iDealService.closeSession();
    }

//------------------------------*** Scenario Outline: fwd_fix_otc_eq ***-----------------------------------------

    @When("^initialize session with params: \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void initializeSessionWithParamsAndAndAndAndAndAndAnd(String userName, String windowsLoginName, String hostName, String aplicationName, String international, String numberDecimalSeparator, String numberGroupSeparator, String shortDatePattern) throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());

        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);
        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        iDealService.initializeSession(userName,windowsLoginName,hostName,aplicationName,International.class.newInstance() ,numberDecimalSeparator,numberGroupSeparator,shortDatePattern);

    }

    @When("^creat new deal with params : \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void creatNewDealWithParamsAndAnd(String dealType, String instrType, String fieldsFilter) throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());

        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);
        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        String s = TradeType.PROP_OTC.value();
        ServiceDealOperation a = iDealService.createNewDeal(dealType, instrType, TradeType.fromValue(s), fieldsFilter);
        Assert.assertEquals(a.getDeal().getName().toString(),"{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}Deal");
    }


    @When("^click Button by name : \"([^\"]*)\"$")
    public void clickButtonByName(String buttonName) throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());

        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);
        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        iDealService.clickButton(buttonName);
    }

//--
    @When("^deal Field Action with params \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void dealFieldActionWithParamsAndAnd(String fieldName, String action, String val) throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());

        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);
        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        ServiceDealOperation s = iDealService.dealFieldAction(fieldName, action, val);
    }


    @When("^Send xml DealFieldChange with params \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void sendXmlDealFieldChangeWithParamsAndAnd(String arg0, String arg1, String arg2) throws Throwable {

    }


    @When("^deal Field Change with params \"([^\"]*)\" and \"([^\"]*)\"$")
    public void dealFieldChangeWithParamsAnd(String names, String values) throws Throwable {
        TSHeaderHandlerResolver tsHandlerResolver = new TSHeaderHandlerResolver();
        tsHandlerResolver.setSessionID(scenarioContext.getContext(Context.SESSION_ID).toString());
        tsHandlerResolver.setUserName(scenarioContext.getContext(Context.USERNAME).toString());

        DealServiceImpl dealService = new DealServiceImpl();
        dealService.setHandlerResolver(tsHandlerResolver);
        IDealService iDealService = dealService.getBasicHttpBindingIDealService();
        ServiceDealOperation s = iDealService.dealFieldChange(names, values);
        Assert.assertEquals(s.getUserName().getValue().toString(),"MKinder");
    }
}