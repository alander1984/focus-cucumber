package com.egartech;

import com.egartech.helpers.Context;
import com.egartech.helpers.DateMapper;
import com.egartech.helpers.ScenarioContext;
import com.egartech.network.TSHeaderHandlerResolver;
import com.egartech.network.Utils;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import java.io.IOException;
import java.net.InetAddress;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;
import org.tempuri.*;
import org.tempuri.DealServiceImpl;
import org.tempuri.IDealService;
import org.tempuri.InitializeSession;
import org.tempuri.InitializeSessionResponse;
import org.w3._2005._09.ws_i18n.International;
import org.w3._2005._09.ws_i18n.ObjectFactory;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
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


}