
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07._baseobjects.NrdImportInfoCollection;
import org.datacontract.schemas._2004._07._baseobjects.NrdTradeBase;
import org.datacontract.schemas._2004._07.egar_focus.InterActionParams;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.ArrayOfAddDealEventContract;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.DealEventProxy;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.EventsScheduleProxy;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.ServiceDealOperation;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.ServiceDetalizationResult;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.ServiceValueResult;
import org.w3._2005._09.ws_i18n.International;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InitializeSessionUserName_QNAME = new QName("http://tempuri.org/", "UserName");
    private final static QName _InitializeSessionWindowsLoginName_QNAME = new QName("http://tempuri.org/", "WindowsLoginName");
    private final static QName _InitializeSessionHostName_QNAME = new QName("http://tempuri.org/", "HostName");
    private final static QName _InitializeSessionApplicationName_QNAME = new QName("http://tempuri.org/", "ApplicationName");
    private final static QName _InitializeSessionInternational_QNAME = new QName("http://tempuri.org/", "International");
    private final static QName _InitializeSessionNumberDecimalSeparator_QNAME = new QName("http://tempuri.org/", "NumberDecimalSeparator");
    private final static QName _InitializeSessionNumberGroupSeparator_QNAME = new QName("http://tempuri.org/", "NumberGroupSeparator");
    private final static QName _InitializeSessionShortDatePattern_QNAME = new QName("http://tempuri.org/", "ShortDatePattern");
    private final static QName _InitializeSessionResponseInitializeSessionResult_QNAME = new QName("http://tempuri.org/", "InitializeSessionResult");
    private final static QName _CloneDealNames_QNAME = new QName("http://tempuri.org/", "names");
    private final static QName _CloneDealValues_QNAME = new QName("http://tempuri.org/", "values");
    private final static QName _CloneDealResponseCloneDealResult_QNAME = new QName("http://tempuri.org/", "CloneDealResult");
    private final static QName _CreateNewDealFieldsFilter_QNAME = new QName("http://tempuri.org/", "fieldsFilter");
    private final static QName _CreateNewDealResponseCreateNewDealResult_QNAME = new QName("http://tempuri.org/", "CreateNewDealResult");
    private final static QName _InitiateDealResponseInitiateDealResult_QNAME = new QName("http://tempuri.org/", "InitiateDealResult");
    private final static QName _LoadTradeResponseLoadTradeResult_QNAME = new QName("http://tempuri.org/", "LoadTradeResult");
    private final static QName _DealFieldsChangeResponseDealFieldsChangeResult_QNAME = new QName("http://tempuri.org/", "DealFieldsChangeResult");
    private final static QName _DealFieldChangeResponseDealFieldChangeResult_QNAME = new QName("http://tempuri.org/", "DealFieldChangeResult");
    private final static QName _DealFieldActionFieldName_QNAME = new QName("http://tempuri.org/", "fieldName");
    private final static QName _DealFieldActionAction_QNAME = new QName("http://tempuri.org/", "action");
    private final static QName _DealFieldActionVal_QNAME = new QName("http://tempuri.org/", "val");
    private final static QName _DealFieldActionResponseDealFieldActionResult_QNAME = new QName("http://tempuri.org/", "DealFieldActionResult");
    private final static QName _ReloadFieldsResponseReloadFieldsResult_QNAME = new QName("http://tempuri.org/", "ReloadFieldsResult");
    private final static QName _TryExecuteSTPActionStpAction_QNAME = new QName("http://tempuri.org/", "stpAction");
    private final static QName _TryExecuteSTPActionFlags_QNAME = new QName("http://tempuri.org/", "flags");
    private final static QName _TryExecuteSTPActionResponseTryExecuteSTPActionResult_QNAME = new QName("http://tempuri.org/", "TryExecuteSTPActionResult");
    private final static QName _CompleteExecuteActionFromUser_QNAME = new QName("http://tempuri.org/", "fromUser");
    private final static QName _CompleteExecuteActionResponseCompleteExecuteActionResult_QNAME = new QName("http://tempuri.org/", "CompleteExecuteActionResult");
    private final static QName _ClickButtonButtonName_QNAME = new QName("http://tempuri.org/", "buttonName");
    private final static QName _ClickButtonResponseClickButtonResult_QNAME = new QName("http://tempuri.org/", "ClickButtonResult");
    private final static QName _GetEventsScheduleFieldName_QNAME = new QName("http://tempuri.org/", "FieldName");
    private final static QName _GetEventsScheduleResponseGetEventsScheduleResult_QNAME = new QName("http://tempuri.org/", "GetEventsScheduleResult");
    private final static QName _ScheduleGetPropertyProperty_QNAME = new QName("http://tempuri.org/", "property");
    private final static QName _ScheduleGetPropertyResponseScheduleGetPropertyResult_QNAME = new QName("http://tempuri.org/", "ScheduleGetPropertyResult");
    private final static QName _ScheduleGetParameterEventId_QNAME = new QName("http://tempuri.org/", "eventId");
    private final static QName _ScheduleGetParameterParameter_QNAME = new QName("http://tempuri.org/", "parameter");
    private final static QName _ScheduleGetParameterResponseScheduleGetParameterResult_QNAME = new QName("http://tempuri.org/", "ScheduleGetParameterResult");
    private final static QName _GetEventDetalizationResponseGetEventDetalizationResult_QNAME = new QName("http://tempuri.org/", "GetEventDetalizationResult");
    private final static QName _GetDealDetalizationResponseGetDealDetalizationResult_QNAME = new QName("http://tempuri.org/", "GetDealDetalizationResult");
    private final static QName _EventStartEditScheduleField_QNAME = new QName("http://tempuri.org/", "scheduleField");
    private final static QName _EventStartEditEventType_QNAME = new QName("http://tempuri.org/", "eventType");
    private final static QName _EventStartEditEventLeg_QNAME = new QName("http://tempuri.org/", "eventLeg");
    private final static QName _EventStartEditResponseEventStartEditResult_QNAME = new QName("http://tempuri.org/", "EventStartEditResult");
    private final static QName _EventSaveEditResponseEventSaveEditResult_QNAME = new QName("http://tempuri.org/", "EventSaveEditResult");
    private final static QName _EventSetValueField_QNAME = new QName("http://tempuri.org/", "field");
    private final static QName _EventSetValueValue_QNAME = new QName("http://tempuri.org/", "value");
    private final static QName _EventSetValueResponseEventSetValueResult_QNAME = new QName("http://tempuri.org/", "EventSetValueResult");
    private final static QName _EventCancelEditResponseEventCancelEditResult_QNAME = new QName("http://tempuri.org/", "EventCancelEditResult");
    private final static QName _AddDealEventEvents_QNAME = new QName("http://tempuri.org/", "events");
    private final static QName _AddDealEventAfterAddAction_QNAME = new QName("http://tempuri.org/", "afterAddAction");
    private final static QName _AddDealEventTrader_QNAME = new QName("http://tempuri.org/", "trader");
    private final static QName _AddDealEventResponseAddDealEventResult_QNAME = new QName("http://tempuri.org/", "AddDealEventResult");
    private final static QName _EventTryExecuteActionActionParams_QNAME = new QName("http://tempuri.org/", "actionParams");
    private final static QName _EventTryExecuteActionResponseEventTryExecuteActionResult_QNAME = new QName("http://tempuri.org/", "EventTryExecuteActionResult");
    private final static QName _RetriveAndTryEventExecuteActionActionParam_QNAME = new QName("http://tempuri.org/", "actionParam");
    private final static QName _RetriveAndTryEventExecuteActionResponseRetriveAndTryEventExecuteActionResult_QNAME = new QName("http://tempuri.org/", "RetriveAndTryEventExecuteActionResult");
    private final static QName _EventClickButtonResponseEventClickButtonResult_QNAME = new QName("http://tempuri.org/", "EventClickButtonResult");
    private final static QName _LinkedTradeEvaluateFieldResponseLinkedTradeEvaluateFieldResult_QNAME = new QName("http://tempuri.org/", "LinkedTradeEvaluateFieldResult");
    private final static QName _LinkedTradeExecuteSTPActionResponseLinkedTradeExecuteSTPActionResult_QNAME = new QName("http://tempuri.org/", "LinkedTradeExecuteSTPActionResult");
    private final static QName _PrintTicketId_QNAME = new QName("http://tempuri.org/", "id");
    private final static QName _PrintTicketResponsePrintTicketResult_QNAME = new QName("http://tempuri.org/", "PrintTicketResult");
    private final static QName _UpdateTradeEndOfDateResponseUpdateTradeEndOfDateResult_QNAME = new QName("http://tempuri.org/", "UpdateTradeEndOfDateResult");
    private final static QName _UpdateCDSTradeEndOfDateResponseUpdateCDSTradeEndOfDateResult_QNAME = new QName("http://tempuri.org/", "UpdateCDSTradeEndOfDateResult");
    private final static QName _UpdateTradeResponseUpdateTradeResult_QNAME = new QName("http://tempuri.org/", "UpdateTradeResult");
    private final static QName _RecalcOpenTradeDateFrom_QNAME = new QName("http://tempuri.org/", "dateFrom");
    private final static QName _RecalcOpenTradeDateTill_QNAME = new QName("http://tempuri.org/", "dateTill");
    private final static QName _RecalcOpenTradeResponseRecalcOpenTradeResult_QNAME = new QName("http://tempuri.org/", "RecalcOpenTradeResult");
    private final static QName _BulkTryExecuteSTPActionTrades_QNAME = new QName("http://tempuri.org/", "trades");
    private final static QName _BulkTryExecuteSTPActionResponseBulkTryExecuteSTPActionResult_QNAME = new QName("http://tempuri.org/", "BulkTryExecuteSTPActionResult");
    private final static QName _GetFundingConsolidatedTradeBooks_QNAME = new QName("http://tempuri.org/", "books");
    private final static QName _GetFundingConsolidatedTradeResponseGetFundingConsolidatedTradeResult_QNAME = new QName("http://tempuri.org/", "GetFundingConsolidatedTradeResult");
    private final static QName _BulkEventTryExecuteActionEventIDs_QNAME = new QName("http://tempuri.org/", "eventIDs");
    private final static QName _BulkEventTryExecuteActionResponseBulkEventTryExecuteActionResult_QNAME = new QName("http://tempuri.org/", "BulkEventTryExecuteActionResult");
    private final static QName _ChangeTradeBOStatusSmartId_QNAME = new QName("http://tempuri.org/", "SmartId");
    private final static QName _ChangeTradeBOStatusAgreementNum_QNAME = new QName("http://tempuri.org/", "AgreementNum");
    private final static QName _ChangeTradeBOStatusCommissionNum_QNAME = new QName("http://tempuri.org/", "CommissionNum");
    private final static QName _ChangeTradeBOStatusBrokerPactNum_QNAME = new QName("http://tempuri.org/", "BrokerPactNum");
    private final static QName _ChangeTradeBOStatusDateFactPay_QNAME = new QName("http://tempuri.org/", "DateFactPay");
    private final static QName _ChangeTradeBOStatusDateFactDelivery_QNAME = new QName("http://tempuri.org/", "DateFactDelivery");
    private final static QName _ChangeTradeBOStatusResponseChangeTradeBOStatusResult_QNAME = new QName("http://tempuri.org/", "ChangeTradeBOStatusResult");
    private final static QName _ChangeTradeLSStatusTradeIDs_QNAME = new QName("http://tempuri.org/", "tradeIDs");
    private final static QName _ChangeTradeLSStatusTraderName_QNAME = new QName("http://tempuri.org/", "traderName");
    private final static QName _ChangeTradeLSStatusResponseChangeTradeLSStatusResult_QNAME = new QName("http://tempuri.org/", "ChangeTradeLSStatusResult");
    private final static QName _BulkAddRateChangeRateChange_QNAME = new QName("http://tempuri.org/", "rateChange");
    private final static QName _BulkAddRateChangeChangedField_QNAME = new QName("http://tempuri.org/", "changedField");
    private final static QName _BulkAddRateChangeResponseBulkAddRateChangeResult_QNAME = new QName("http://tempuri.org/", "BulkAddRateChangeResult");
    private final static QName _GetSessionStatusResponseGetSessionStatusResult_QNAME = new QName("http://tempuri.org/", "GetSessionStatusResult");
    private final static QName _ImportBasketRepoNrdTrade_QNAME = new QName("http://tempuri.org/", "nrdTrade");
    private final static QName _ImportBasketRepoResponseImportBasketRepoResult_QNAME = new QName("http://tempuri.org/", "ImportBasketRepoResult");
    private final static QName _LoadTradeMonitorResponseLoadTradeMonitorResult_QNAME = new QName("http://tempuri.org/", "LoadTradeMonitorResult");
    private final static QName _RetriveAndTryTradeExecuteActionResponseRetriveAndTryTradeExecuteActionResult_QNAME = new QName("http://tempuri.org/", "RetriveAndTryTradeExecuteActionResult");
    private final static QName _GetEventHorizonDate_QNAME = new QName("http://tempuri.org/", "horizonDate");
    private final static QName _GetEventResponseGetEventResult_QNAME = new QName("http://tempuri.org/", "GetEventResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InitializeSession }
     * 
     */
    public InitializeSession createInitializeSession() {
        return new InitializeSession();
    }

    /**
     * Create an instance of {@link InitializeSessionResponse }
     * 
     */
    public InitializeSessionResponse createInitializeSessionResponse() {
        return new InitializeSessionResponse();
    }

    /**
     * Create an instance of {@link CloseSession }
     * 
     */
    public CloseSession createCloseSession() {
        return new CloseSession();
    }

    /**
     * Create an instance of {@link CloseSessionResponse }
     * 
     */
    public CloseSessionResponse createCloseSessionResponse() {
        return new CloseSessionResponse();
    }

    /**
     * Create an instance of {@link CloneDeal }
     * 
     */
    public CloneDeal createCloneDeal() {
        return new CloneDeal();
    }

    /**
     * Create an instance of {@link CloneDealResponse }
     * 
     */
    public CloneDealResponse createCloneDealResponse() {
        return new CloneDealResponse();
    }

    /**
     * Create an instance of {@link CreateNewDeal }
     * 
     */
    public CreateNewDeal createCreateNewDeal() {
        return new CreateNewDeal();
    }

    /**
     * Create an instance of {@link CreateNewDealResponse }
     * 
     */
    public CreateNewDealResponse createCreateNewDealResponse() {
        return new CreateNewDealResponse();
    }

    /**
     * Create an instance of {@link InitiateDeal }
     * 
     */
    public InitiateDeal createInitiateDeal() {
        return new InitiateDeal();
    }

    /**
     * Create an instance of {@link InitiateDealResponse }
     * 
     */
    public InitiateDealResponse createInitiateDealResponse() {
        return new InitiateDealResponse();
    }

    /**
     * Create an instance of {@link LoadTrade }
     * 
     */
    public LoadTrade createLoadTrade() {
        return new LoadTrade();
    }

    /**
     * Create an instance of {@link LoadTradeResponse }
     * 
     */
    public LoadTradeResponse createLoadTradeResponse() {
        return new LoadTradeResponse();
    }

    /**
     * Create an instance of {@link DealFieldsChange }
     * 
     */
    public DealFieldsChange createDealFieldsChange() {
        return new DealFieldsChange();
    }

    /**
     * Create an instance of {@link DealFieldsChangeResponse }
     * 
     */
    public DealFieldsChangeResponse createDealFieldsChangeResponse() {
        return new DealFieldsChangeResponse();
    }

    /**
     * Create an instance of {@link DealFieldChange }
     * 
     */
    public DealFieldChange createDealFieldChange() {
        return new DealFieldChange();
    }

    /**
     * Create an instance of {@link DealFieldChangeResponse }
     * 
     */
    public DealFieldChangeResponse createDealFieldChangeResponse() {
        return new DealFieldChangeResponse();
    }

    /**
     * Create an instance of {@link DealFieldAction }
     * 
     */
    public DealFieldAction createDealFieldAction() {
        return new DealFieldAction();
    }

    /**
     * Create an instance of {@link DealFieldActionResponse }
     * 
     */
    public DealFieldActionResponse createDealFieldActionResponse() {
        return new DealFieldActionResponse();
    }

    /**
     * Create an instance of {@link ReloadFields }
     * 
     */
    public ReloadFields createReloadFields() {
        return new ReloadFields();
    }

    /**
     * Create an instance of {@link ReloadFieldsResponse }
     * 
     */
    public ReloadFieldsResponse createReloadFieldsResponse() {
        return new ReloadFieldsResponse();
    }

    /**
     * Create an instance of {@link TryExecuteSTPAction }
     * 
     */
    public TryExecuteSTPAction createTryExecuteSTPAction() {
        return new TryExecuteSTPAction();
    }

    /**
     * Create an instance of {@link TryExecuteSTPActionResponse }
     * 
     */
    public TryExecuteSTPActionResponse createTryExecuteSTPActionResponse() {
        return new TryExecuteSTPActionResponse();
    }

    /**
     * Create an instance of {@link CompleteExecuteAction }
     * 
     */
    public CompleteExecuteAction createCompleteExecuteAction() {
        return new CompleteExecuteAction();
    }

    /**
     * Create an instance of {@link CompleteExecuteActionResponse }
     * 
     */
    public CompleteExecuteActionResponse createCompleteExecuteActionResponse() {
        return new CompleteExecuteActionResponse();
    }

    /**
     * Create an instance of {@link ClickButton }
     * 
     */
    public ClickButton createClickButton() {
        return new ClickButton();
    }

    /**
     * Create an instance of {@link ClickButtonResponse }
     * 
     */
    public ClickButtonResponse createClickButtonResponse() {
        return new ClickButtonResponse();
    }

    /**
     * Create an instance of {@link GetEventsSchedule }
     * 
     */
    public GetEventsSchedule createGetEventsSchedule() {
        return new GetEventsSchedule();
    }

    /**
     * Create an instance of {@link GetEventsScheduleResponse }
     * 
     */
    public GetEventsScheduleResponse createGetEventsScheduleResponse() {
        return new GetEventsScheduleResponse();
    }

    /**
     * Create an instance of {@link ScheduleGetProperty }
     * 
     */
    public ScheduleGetProperty createScheduleGetProperty() {
        return new ScheduleGetProperty();
    }

    /**
     * Create an instance of {@link ScheduleGetPropertyResponse }
     * 
     */
    public ScheduleGetPropertyResponse createScheduleGetPropertyResponse() {
        return new ScheduleGetPropertyResponse();
    }

    /**
     * Create an instance of {@link ScheduleGetParameter }
     * 
     */
    public ScheduleGetParameter createScheduleGetParameter() {
        return new ScheduleGetParameter();
    }

    /**
     * Create an instance of {@link ScheduleGetParameterResponse }
     * 
     */
    public ScheduleGetParameterResponse createScheduleGetParameterResponse() {
        return new ScheduleGetParameterResponse();
    }

    /**
     * Create an instance of {@link GetEventDetalization }
     * 
     */
    public GetEventDetalization createGetEventDetalization() {
        return new GetEventDetalization();
    }

    /**
     * Create an instance of {@link GetEventDetalizationResponse }
     * 
     */
    public GetEventDetalizationResponse createGetEventDetalizationResponse() {
        return new GetEventDetalizationResponse();
    }

    /**
     * Create an instance of {@link GetDealDetalization }
     * 
     */
    public GetDealDetalization createGetDealDetalization() {
        return new GetDealDetalization();
    }

    /**
     * Create an instance of {@link GetDealDetalizationResponse }
     * 
     */
    public GetDealDetalizationResponse createGetDealDetalizationResponse() {
        return new GetDealDetalizationResponse();
    }

    /**
     * Create an instance of {@link EventStartEdit }
     * 
     */
    public EventStartEdit createEventStartEdit() {
        return new EventStartEdit();
    }

    /**
     * Create an instance of {@link EventStartEditResponse }
     * 
     */
    public EventStartEditResponse createEventStartEditResponse() {
        return new EventStartEditResponse();
    }

    /**
     * Create an instance of {@link EventSaveEdit }
     * 
     */
    public EventSaveEdit createEventSaveEdit() {
        return new EventSaveEdit();
    }

    /**
     * Create an instance of {@link EventSaveEditResponse }
     * 
     */
    public EventSaveEditResponse createEventSaveEditResponse() {
        return new EventSaveEditResponse();
    }

    /**
     * Create an instance of {@link EventSetValue }
     * 
     */
    public EventSetValue createEventSetValue() {
        return new EventSetValue();
    }

    /**
     * Create an instance of {@link EventSetValueResponse }
     * 
     */
    public EventSetValueResponse createEventSetValueResponse() {
        return new EventSetValueResponse();
    }

    /**
     * Create an instance of {@link EventCancelEdit }
     * 
     */
    public EventCancelEdit createEventCancelEdit() {
        return new EventCancelEdit();
    }

    /**
     * Create an instance of {@link EventCancelEditResponse }
     * 
     */
    public EventCancelEditResponse createEventCancelEditResponse() {
        return new EventCancelEditResponse();
    }

    /**
     * Create an instance of {@link AddDealEvent }
     * 
     */
    public AddDealEvent createAddDealEvent() {
        return new AddDealEvent();
    }

    /**
     * Create an instance of {@link AddDealEventResponse }
     * 
     */
    public AddDealEventResponse createAddDealEventResponse() {
        return new AddDealEventResponse();
    }

    /**
     * Create an instance of {@link EventTryExecuteAction }
     * 
     */
    public EventTryExecuteAction createEventTryExecuteAction() {
        return new EventTryExecuteAction();
    }

    /**
     * Create an instance of {@link EventTryExecuteActionResponse }
     * 
     */
    public EventTryExecuteActionResponse createEventTryExecuteActionResponse() {
        return new EventTryExecuteActionResponse();
    }

    /**
     * Create an instance of {@link RetriveAndTryEventExecuteAction }
     * 
     */
    public RetriveAndTryEventExecuteAction createRetriveAndTryEventExecuteAction() {
        return new RetriveAndTryEventExecuteAction();
    }

    /**
     * Create an instance of {@link RetriveAndTryEventExecuteActionResponse }
     * 
     */
    public RetriveAndTryEventExecuteActionResponse createRetriveAndTryEventExecuteActionResponse() {
        return new RetriveAndTryEventExecuteActionResponse();
    }

    /**
     * Create an instance of {@link EventClickButton }
     * 
     */
    public EventClickButton createEventClickButton() {
        return new EventClickButton();
    }

    /**
     * Create an instance of {@link EventClickButtonResponse }
     * 
     */
    public EventClickButtonResponse createEventClickButtonResponse() {
        return new EventClickButtonResponse();
    }

    /**
     * Create an instance of {@link LinkedTradeEvaluateField }
     * 
     */
    public LinkedTradeEvaluateField createLinkedTradeEvaluateField() {
        return new LinkedTradeEvaluateField();
    }

    /**
     * Create an instance of {@link LinkedTradeEvaluateFieldResponse }
     * 
     */
    public LinkedTradeEvaluateFieldResponse createLinkedTradeEvaluateFieldResponse() {
        return new LinkedTradeEvaluateFieldResponse();
    }

    /**
     * Create an instance of {@link LinkedTradeExecuteSTPAction }
     * 
     */
    public LinkedTradeExecuteSTPAction createLinkedTradeExecuteSTPAction() {
        return new LinkedTradeExecuteSTPAction();
    }

    /**
     * Create an instance of {@link LinkedTradeExecuteSTPActionResponse }
     * 
     */
    public LinkedTradeExecuteSTPActionResponse createLinkedTradeExecuteSTPActionResponse() {
        return new LinkedTradeExecuteSTPActionResponse();
    }

    /**
     * Create an instance of {@link PrintTicket }
     * 
     */
    public PrintTicket createPrintTicket() {
        return new PrintTicket();
    }

    /**
     * Create an instance of {@link PrintTicketResponse }
     * 
     */
    public PrintTicketResponse createPrintTicketResponse() {
        return new PrintTicketResponse();
    }

    /**
     * Create an instance of {@link UpdateTradeEndOfDate }
     * 
     */
    public UpdateTradeEndOfDate createUpdateTradeEndOfDate() {
        return new UpdateTradeEndOfDate();
    }

    /**
     * Create an instance of {@link UpdateTradeEndOfDateResponse }
     * 
     */
    public UpdateTradeEndOfDateResponse createUpdateTradeEndOfDateResponse() {
        return new UpdateTradeEndOfDateResponse();
    }

    /**
     * Create an instance of {@link UpdateCDSTradeEndOfDate }
     * 
     */
    public UpdateCDSTradeEndOfDate createUpdateCDSTradeEndOfDate() {
        return new UpdateCDSTradeEndOfDate();
    }

    /**
     * Create an instance of {@link UpdateCDSTradeEndOfDateResponse }
     * 
     */
    public UpdateCDSTradeEndOfDateResponse createUpdateCDSTradeEndOfDateResponse() {
        return new UpdateCDSTradeEndOfDateResponse();
    }

    /**
     * Create an instance of {@link UpdateTrade }
     * 
     */
    public UpdateTrade createUpdateTrade() {
        return new UpdateTrade();
    }

    /**
     * Create an instance of {@link UpdateTradeResponse }
     * 
     */
    public UpdateTradeResponse createUpdateTradeResponse() {
        return new UpdateTradeResponse();
    }

    /**
     * Create an instance of {@link RecalcOpenTrade }
     * 
     */
    public RecalcOpenTrade createRecalcOpenTrade() {
        return new RecalcOpenTrade();
    }

    /**
     * Create an instance of {@link RecalcOpenTradeResponse }
     * 
     */
    public RecalcOpenTradeResponse createRecalcOpenTradeResponse() {
        return new RecalcOpenTradeResponse();
    }

    /**
     * Create an instance of {@link BulkTryExecuteSTPAction }
     * 
     */
    public BulkTryExecuteSTPAction createBulkTryExecuteSTPAction() {
        return new BulkTryExecuteSTPAction();
    }

    /**
     * Create an instance of {@link BulkTryExecuteSTPActionResponse }
     * 
     */
    public BulkTryExecuteSTPActionResponse createBulkTryExecuteSTPActionResponse() {
        return new BulkTryExecuteSTPActionResponse();
    }

    /**
     * Create an instance of {@link GetFundingConsolidatedTrade }
     * 
     */
    public GetFundingConsolidatedTrade createGetFundingConsolidatedTrade() {
        return new GetFundingConsolidatedTrade();
    }

    /**
     * Create an instance of {@link GetFundingConsolidatedTradeResponse }
     * 
     */
    public GetFundingConsolidatedTradeResponse createGetFundingConsolidatedTradeResponse() {
        return new GetFundingConsolidatedTradeResponse();
    }

    /**
     * Create an instance of {@link BulkEventTryExecuteAction }
     * 
     */
    public BulkEventTryExecuteAction createBulkEventTryExecuteAction() {
        return new BulkEventTryExecuteAction();
    }

    /**
     * Create an instance of {@link BulkEventTryExecuteActionResponse }
     * 
     */
    public BulkEventTryExecuteActionResponse createBulkEventTryExecuteActionResponse() {
        return new BulkEventTryExecuteActionResponse();
    }

    /**
     * Create an instance of {@link ChangeTradeBOStatus }
     * 
     */
    public ChangeTradeBOStatus createChangeTradeBOStatus() {
        return new ChangeTradeBOStatus();
    }

    /**
     * Create an instance of {@link ChangeTradeBOStatusResponse }
     * 
     */
    public ChangeTradeBOStatusResponse createChangeTradeBOStatusResponse() {
        return new ChangeTradeBOStatusResponse();
    }

    /**
     * Create an instance of {@link ChangeTradeLSStatus }
     * 
     */
    public ChangeTradeLSStatus createChangeTradeLSStatus() {
        return new ChangeTradeLSStatus();
    }

    /**
     * Create an instance of {@link ChangeTradeLSStatusResponse }
     * 
     */
    public ChangeTradeLSStatusResponse createChangeTradeLSStatusResponse() {
        return new ChangeTradeLSStatusResponse();
    }

    /**
     * Create an instance of {@link BulkAddRateChange }
     * 
     */
    public BulkAddRateChange createBulkAddRateChange() {
        return new BulkAddRateChange();
    }

    /**
     * Create an instance of {@link BulkAddRateChangeResponse }
     * 
     */
    public BulkAddRateChangeResponse createBulkAddRateChangeResponse() {
        return new BulkAddRateChangeResponse();
    }

    /**
     * Create an instance of {@link GetSessionStatus }
     * 
     */
    public GetSessionStatus createGetSessionStatus() {
        return new GetSessionStatus();
    }

    /**
     * Create an instance of {@link GetSessionStatusResponse }
     * 
     */
    public GetSessionStatusResponse createGetSessionStatusResponse() {
        return new GetSessionStatusResponse();
    }

    /**
     * Create an instance of {@link ImportBasketRepo }
     * 
     */
    public ImportBasketRepo createImportBasketRepo() {
        return new ImportBasketRepo();
    }

    /**
     * Create an instance of {@link ImportBasketRepoResponse }
     * 
     */
    public ImportBasketRepoResponse createImportBasketRepoResponse() {
        return new ImportBasketRepoResponse();
    }

    /**
     * Create an instance of {@link LoadTradeMonitor }
     * 
     */
    public LoadTradeMonitor createLoadTradeMonitor() {
        return new LoadTradeMonitor();
    }

    /**
     * Create an instance of {@link LoadTradeMonitorResponse }
     * 
     */
    public LoadTradeMonitorResponse createLoadTradeMonitorResponse() {
        return new LoadTradeMonitorResponse();
    }

    /**
     * Create an instance of {@link RetriveAndTryTradeExecuteAction }
     * 
     */
    public RetriveAndTryTradeExecuteAction createRetriveAndTryTradeExecuteAction() {
        return new RetriveAndTryTradeExecuteAction();
    }

    /**
     * Create an instance of {@link RetriveAndTryTradeExecuteActionResponse }
     * 
     */
    public RetriveAndTryTradeExecuteActionResponse createRetriveAndTryTradeExecuteActionResponse() {
        return new RetriveAndTryTradeExecuteActionResponse();
    }

    /**
     * Create an instance of {@link GetEvent }
     * 
     */
    public GetEvent createGetEvent() {
        return new GetEvent();
    }

    /**
     * Create an instance of {@link GetEventResponse }
     * 
     */
    public GetEventResponse createGetEventResponse() {
        return new GetEventResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = InitializeSession.class)
    public JAXBElement<String> createInitializeSessionUserName(String value) {
        return new JAXBElement<String>(_InitializeSessionUserName_QNAME, String.class, InitializeSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "WindowsLoginName", scope = InitializeSession.class)
    public JAXBElement<String> createInitializeSessionWindowsLoginName(String value) {
        return new JAXBElement<String>(_InitializeSessionWindowsLoginName_QNAME, String.class, InitializeSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "HostName", scope = InitializeSession.class)
    public JAXBElement<String> createInitializeSessionHostName(String value) {
        return new JAXBElement<String>(_InitializeSessionHostName_QNAME, String.class, InitializeSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ApplicationName", scope = InitializeSession.class)
    public JAXBElement<String> createInitializeSessionApplicationName(String value) {
        return new JAXBElement<String>(_InitializeSessionApplicationName_QNAME, String.class, InitializeSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link International }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "International", scope = InitializeSession.class)
    public JAXBElement<International> createInitializeSessionInternational(International value) {
        return new JAXBElement<International>(_InitializeSessionInternational_QNAME, International.class, InitializeSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "NumberDecimalSeparator", scope = InitializeSession.class)
    public JAXBElement<String> createInitializeSessionNumberDecimalSeparator(String value) {
        return new JAXBElement<String>(_InitializeSessionNumberDecimalSeparator_QNAME, String.class, InitializeSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "NumberGroupSeparator", scope = InitializeSession.class)
    public JAXBElement<String> createInitializeSessionNumberGroupSeparator(String value) {
        return new JAXBElement<String>(_InitializeSessionNumberGroupSeparator_QNAME, String.class, InitializeSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ShortDatePattern", scope = InitializeSession.class)
    public JAXBElement<String> createInitializeSessionShortDatePattern(String value) {
        return new JAXBElement<String>(_InitializeSessionShortDatePattern_QNAME, String.class, InitializeSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InitializeSessionResult", scope = InitializeSessionResponse.class)
    public JAXBElement<String> createInitializeSessionResponseInitializeSessionResult(String value) {
        return new JAXBElement<String>(_InitializeSessionResponseInitializeSessionResult_QNAME, String.class, InitializeSessionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "names", scope = CloneDeal.class)
    public JAXBElement<ArrayOfstring> createCloneDealNames(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CloneDealNames_QNAME, ArrayOfstring.class, CloneDeal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "values", scope = CloneDeal.class)
    public JAXBElement<ArrayOfanyType> createCloneDealValues(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_CloneDealValues_QNAME, ArrayOfanyType.class, CloneDeal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CloneDealResult", scope = CloneDealResponse.class)
    public JAXBElement<String> createCloneDealResponseCloneDealResult(String value) {
        return new JAXBElement<String>(_CloneDealResponseCloneDealResult_QNAME, String.class, CloneDealResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fieldsFilter", scope = CreateNewDeal.class)
    public JAXBElement<String> createCreateNewDealFieldsFilter(String value) {
        return new JAXBElement<String>(_CreateNewDealFieldsFilter_QNAME, String.class, CreateNewDeal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreateNewDealResult", scope = CreateNewDealResponse.class)
    public JAXBElement<ServiceDealOperation> createCreateNewDealResponseCreateNewDealResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_CreateNewDealResponseCreateNewDealResult_QNAME, ServiceDealOperation.class, CreateNewDealResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "names", scope = InitiateDeal.class)
    public JAXBElement<ArrayOfstring> createInitiateDealNames(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CloneDealNames_QNAME, ArrayOfstring.class, InitiateDeal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "values", scope = InitiateDeal.class)
    public JAXBElement<ArrayOfanyType> createInitiateDealValues(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_CloneDealValues_QNAME, ArrayOfanyType.class, InitiateDeal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InitiateDealResult", scope = InitiateDealResponse.class)
    public JAXBElement<ServiceDealOperation> createInitiateDealResponseInitiateDealResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_InitiateDealResponseInitiateDealResult_QNAME, ServiceDealOperation.class, InitiateDealResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fieldsFilter", scope = LoadTrade.class)
    public JAXBElement<String> createLoadTradeFieldsFilter(String value) {
        return new JAXBElement<String>(_CreateNewDealFieldsFilter_QNAME, String.class, LoadTrade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LoadTradeResult", scope = LoadTradeResponse.class)
    public JAXBElement<ServiceDealOperation> createLoadTradeResponseLoadTradeResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_LoadTradeResponseLoadTradeResult_QNAME, ServiceDealOperation.class, LoadTradeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "names", scope = DealFieldsChange.class)
    public JAXBElement<ArrayOfstring> createDealFieldsChangeNames(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CloneDealNames_QNAME, ArrayOfstring.class, DealFieldsChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "values", scope = DealFieldsChange.class)
    public JAXBElement<ArrayOfanyType> createDealFieldsChangeValues(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_CloneDealValues_QNAME, ArrayOfanyType.class, DealFieldsChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fieldsFilter", scope = DealFieldsChange.class)
    public JAXBElement<ArrayOfstring> createDealFieldsChangeFieldsFilter(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CreateNewDealFieldsFilter_QNAME, ArrayOfstring.class, DealFieldsChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DealFieldsChangeResult", scope = DealFieldsChangeResponse.class)
    public JAXBElement<ServiceDealOperation> createDealFieldsChangeResponseDealFieldsChangeResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_DealFieldsChangeResponseDealFieldsChangeResult_QNAME, ServiceDealOperation.class, DealFieldsChangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "names", scope = DealFieldChange.class)
    public JAXBElement<String> createDealFieldChangeNames(String value) {
        return new JAXBElement<String>(_CloneDealNames_QNAME, String.class, DealFieldChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "values", scope = DealFieldChange.class)
    public JAXBElement<Object> createDealFieldChangeValues(Object value) {
        return new JAXBElement<Object>(_CloneDealValues_QNAME, Object.class, DealFieldChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DealFieldChangeResult", scope = DealFieldChangeResponse.class)
    public JAXBElement<ServiceDealOperation> createDealFieldChangeResponseDealFieldChangeResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_DealFieldChangeResponseDealFieldChangeResult_QNAME, ServiceDealOperation.class, DealFieldChangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fieldName", scope = DealFieldAction.class)
    public JAXBElement<String> createDealFieldActionFieldName(String value) {
        return new JAXBElement<String>(_DealFieldActionFieldName_QNAME, String.class, DealFieldAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "action", scope = DealFieldAction.class)
    public JAXBElement<String> createDealFieldActionAction(String value) {
        return new JAXBElement<String>(_DealFieldActionAction_QNAME, String.class, DealFieldAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "val", scope = DealFieldAction.class)
    public JAXBElement<Object> createDealFieldActionVal(Object value) {
        return new JAXBElement<Object>(_DealFieldActionVal_QNAME, Object.class, DealFieldAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DealFieldActionResult", scope = DealFieldActionResponse.class)
    public JAXBElement<ServiceDealOperation> createDealFieldActionResponseDealFieldActionResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_DealFieldActionResponseDealFieldActionResult_QNAME, ServiceDealOperation.class, DealFieldActionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReloadFieldsResult", scope = ReloadFieldsResponse.class)
    public JAXBElement<ServiceDealOperation> createReloadFieldsResponseReloadFieldsResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_ReloadFieldsResponseReloadFieldsResult_QNAME, ServiceDealOperation.class, ReloadFieldsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "stpAction", scope = TryExecuteSTPAction.class)
    public JAXBElement<String> createTryExecuteSTPActionStpAction(String value) {
        return new JAXBElement<String>(_TryExecuteSTPActionStpAction_QNAME, String.class, TryExecuteSTPAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "flags", scope = TryExecuteSTPAction.class)
    public JAXBElement<InterActionParams> createTryExecuteSTPActionFlags(InterActionParams value) {
        return new JAXBElement<InterActionParams>(_TryExecuteSTPActionFlags_QNAME, InterActionParams.class, TryExecuteSTPAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TryExecuteSTPActionResult", scope = TryExecuteSTPActionResponse.class)
    public JAXBElement<ServiceDealOperation> createTryExecuteSTPActionResponseTryExecuteSTPActionResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_TryExecuteSTPActionResponseTryExecuteSTPActionResult_QNAME, ServiceDealOperation.class, TryExecuteSTPActionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "stpAction", scope = CompleteExecuteAction.class)
    public JAXBElement<String> createCompleteExecuteActionStpAction(String value) {
        return new JAXBElement<String>(_TryExecuteSTPActionStpAction_QNAME, String.class, CompleteExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fromUser", scope = CompleteExecuteAction.class)
    public JAXBElement<InterActionParams> createCompleteExecuteActionFromUser(InterActionParams value) {
        return new JAXBElement<InterActionParams>(_CompleteExecuteActionFromUser_QNAME, InterActionParams.class, CompleteExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CompleteExecuteActionResult", scope = CompleteExecuteActionResponse.class)
    public JAXBElement<ServiceDealOperation> createCompleteExecuteActionResponseCompleteExecuteActionResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_CompleteExecuteActionResponseCompleteExecuteActionResult_QNAME, ServiceDealOperation.class, CompleteExecuteActionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "buttonName", scope = ClickButton.class)
    public JAXBElement<String> createClickButtonButtonName(String value) {
        return new JAXBElement<String>(_ClickButtonButtonName_QNAME, String.class, ClickButton.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ClickButtonResult", scope = ClickButtonResponse.class)
    public JAXBElement<ServiceDealOperation> createClickButtonResponseClickButtonResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_ClickButtonResponseClickButtonResult_QNAME, ServiceDealOperation.class, ClickButtonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FieldName", scope = GetEventsSchedule.class)
    public JAXBElement<String> createGetEventsScheduleFieldName(String value) {
        return new JAXBElement<String>(_GetEventsScheduleFieldName_QNAME, String.class, GetEventsSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsScheduleProxy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEventsScheduleResult", scope = GetEventsScheduleResponse.class)
    public JAXBElement<EventsScheduleProxy> createGetEventsScheduleResponseGetEventsScheduleResult(EventsScheduleProxy value) {
        return new JAXBElement<EventsScheduleProxy>(_GetEventsScheduleResponseGetEventsScheduleResult_QNAME, EventsScheduleProxy.class, GetEventsScheduleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FieldName", scope = ScheduleGetProperty.class)
    public JAXBElement<String> createScheduleGetPropertyFieldName(String value) {
        return new JAXBElement<String>(_GetEventsScheduleFieldName_QNAME, String.class, ScheduleGetProperty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "property", scope = ScheduleGetProperty.class)
    public JAXBElement<String> createScheduleGetPropertyProperty(String value) {
        return new JAXBElement<String>(_ScheduleGetPropertyProperty_QNAME, String.class, ScheduleGetProperty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ScheduleGetPropertyResult", scope = ScheduleGetPropertyResponse.class)
    public JAXBElement<Object> createScheduleGetPropertyResponseScheduleGetPropertyResult(Object value) {
        return new JAXBElement<Object>(_ScheduleGetPropertyResponseScheduleGetPropertyResult_QNAME, Object.class, ScheduleGetPropertyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FieldName", scope = ScheduleGetParameter.class)
    public JAXBElement<String> createScheduleGetParameterFieldName(String value) {
        return new JAXBElement<String>(_GetEventsScheduleFieldName_QNAME, String.class, ScheduleGetParameter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventId", scope = ScheduleGetParameter.class)
    public JAXBElement<String> createScheduleGetParameterEventId(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterEventId_QNAME, String.class, ScheduleGetParameter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameter", scope = ScheduleGetParameter.class)
    public JAXBElement<String> createScheduleGetParameterParameter(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterParameter_QNAME, String.class, ScheduleGetParameter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceValueResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ScheduleGetParameterResult", scope = ScheduleGetParameterResponse.class)
    public JAXBElement<ServiceValueResult> createScheduleGetParameterResponseScheduleGetParameterResult(ServiceValueResult value) {
        return new JAXBElement<ServiceValueResult>(_ScheduleGetParameterResponseScheduleGetParameterResult_QNAME, ServiceValueResult.class, ScheduleGetParameterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameter", scope = GetEventDetalization.class)
    public JAXBElement<String> createGetEventDetalizationParameter(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterParameter_QNAME, String.class, GetEventDetalization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDetalizationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEventDetalizationResult", scope = GetEventDetalizationResponse.class)
    public JAXBElement<ServiceDetalizationResult> createGetEventDetalizationResponseGetEventDetalizationResult(ServiceDetalizationResult value) {
        return new JAXBElement<ServiceDetalizationResult>(_GetEventDetalizationResponseGetEventDetalizationResult_QNAME, ServiceDetalizationResult.class, GetEventDetalizationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameter", scope = GetDealDetalization.class)
    public JAXBElement<String> createGetDealDetalizationParameter(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterParameter_QNAME, String.class, GetDealDetalization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDetalizationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDealDetalizationResult", scope = GetDealDetalizationResponse.class)
    public JAXBElement<ServiceDetalizationResult> createGetDealDetalizationResponseGetDealDetalizationResult(ServiceDetalizationResult value) {
        return new JAXBElement<ServiceDetalizationResult>(_GetDealDetalizationResponseGetDealDetalizationResult_QNAME, ServiceDetalizationResult.class, GetDealDetalizationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "scheduleField", scope = EventStartEdit.class)
    public JAXBElement<String> createEventStartEditScheduleField(String value) {
        return new JAXBElement<String>(_EventStartEditScheduleField_QNAME, String.class, EventStartEdit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventId", scope = EventStartEdit.class)
    public JAXBElement<String> createEventStartEditEventId(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterEventId_QNAME, String.class, EventStartEdit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventType", scope = EventStartEdit.class)
    public JAXBElement<String> createEventStartEditEventType(String value) {
        return new JAXBElement<String>(_EventStartEditEventType_QNAME, String.class, EventStartEdit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventLeg", scope = EventStartEdit.class)
    public JAXBElement<Integer> createEventStartEditEventLeg(Integer value) {
        return new JAXBElement<Integer>(_EventStartEditEventLeg_QNAME, Integer.class, EventStartEdit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EventStartEditResult", scope = EventStartEditResponse.class)
    public JAXBElement<ServiceDealOperation> createEventStartEditResponseEventStartEditResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_EventStartEditResponseEventStartEditResult_QNAME, ServiceDealOperation.class, EventStartEditResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "scheduleField", scope = EventSaveEdit.class)
    public JAXBElement<String> createEventSaveEditScheduleField(String value) {
        return new JAXBElement<String>(_EventStartEditScheduleField_QNAME, String.class, EventSaveEdit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventId", scope = EventSaveEdit.class)
    public JAXBElement<String> createEventSaveEditEventId(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterEventId_QNAME, String.class, EventSaveEdit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EventSaveEditResult", scope = EventSaveEditResponse.class)
    public JAXBElement<ServiceDealOperation> createEventSaveEditResponseEventSaveEditResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_EventSaveEditResponseEventSaveEditResult_QNAME, ServiceDealOperation.class, EventSaveEditResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "scheduleField", scope = EventSetValue.class)
    public JAXBElement<String> createEventSetValueScheduleField(String value) {
        return new JAXBElement<String>(_EventStartEditScheduleField_QNAME, String.class, EventSetValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventId", scope = EventSetValue.class)
    public JAXBElement<String> createEventSetValueEventId(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterEventId_QNAME, String.class, EventSetValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "field", scope = EventSetValue.class)
    public JAXBElement<String> createEventSetValueField(String value) {
        return new JAXBElement<String>(_EventSetValueField_QNAME, String.class, EventSetValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "value", scope = EventSetValue.class)
    public JAXBElement<Object> createEventSetValueValue(Object value) {
        return new JAXBElement<Object>(_EventSetValueValue_QNAME, Object.class, EventSetValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EventSetValueResult", scope = EventSetValueResponse.class)
    public JAXBElement<ServiceDealOperation> createEventSetValueResponseEventSetValueResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_EventSetValueResponseEventSetValueResult_QNAME, ServiceDealOperation.class, EventSetValueResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "scheduleField", scope = EventCancelEdit.class)
    public JAXBElement<String> createEventCancelEditScheduleField(String value) {
        return new JAXBElement<String>(_EventStartEditScheduleField_QNAME, String.class, EventCancelEdit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventId", scope = EventCancelEdit.class)
    public JAXBElement<String> createEventCancelEditEventId(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterEventId_QNAME, String.class, EventCancelEdit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EventCancelEditResult", scope = EventCancelEditResponse.class)
    public JAXBElement<ServiceDealOperation> createEventCancelEditResponseEventCancelEditResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_EventCancelEditResponseEventCancelEditResult_QNAME, ServiceDealOperation.class, EventCancelEditResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddDealEventContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "events", scope = AddDealEvent.class)
    public JAXBElement<ArrayOfAddDealEventContract> createAddDealEventEvents(ArrayOfAddDealEventContract value) {
        return new JAXBElement<ArrayOfAddDealEventContract>(_AddDealEventEvents_QNAME, ArrayOfAddDealEventContract.class, AddDealEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "afterAddAction", scope = AddDealEvent.class)
    public JAXBElement<String> createAddDealEventAfterAddAction(String value) {
        return new JAXBElement<String>(_AddDealEventAfterAddAction_QNAME, String.class, AddDealEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "trader", scope = AddDealEvent.class)
    public JAXBElement<Integer> createAddDealEventTrader(Integer value) {
        return new JAXBElement<Integer>(_AddDealEventTrader_QNAME, Integer.class, AddDealEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddDealEventResult", scope = AddDealEventResponse.class)
    public JAXBElement<ServiceDealOperation> createAddDealEventResponseAddDealEventResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_AddDealEventResponseAddDealEventResult_QNAME, ServiceDealOperation.class, AddDealEventResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "scheduleField", scope = EventTryExecuteAction.class)
    public JAXBElement<String> createEventTryExecuteActionScheduleField(String value) {
        return new JAXBElement<String>(_EventStartEditScheduleField_QNAME, String.class, EventTryExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventId", scope = EventTryExecuteAction.class)
    public JAXBElement<String> createEventTryExecuteActionEventId(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterEventId_QNAME, String.class, EventTryExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "action", scope = EventTryExecuteAction.class)
    public JAXBElement<String> createEventTryExecuteActionAction(String value) {
        return new JAXBElement<String>(_DealFieldActionAction_QNAME, String.class, EventTryExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "actionParams", scope = EventTryExecuteAction.class)
    public JAXBElement<InterActionParams> createEventTryExecuteActionActionParams(InterActionParams value) {
        return new JAXBElement<InterActionParams>(_EventTryExecuteActionActionParams_QNAME, InterActionParams.class, EventTryExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EventTryExecuteActionResult", scope = EventTryExecuteActionResponse.class)
    public JAXBElement<ServiceDealOperation> createEventTryExecuteActionResponseEventTryExecuteActionResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_EventTryExecuteActionResponseEventTryExecuteActionResult_QNAME, ServiceDealOperation.class, EventTryExecuteActionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventId", scope = RetriveAndTryEventExecuteAction.class)
    public JAXBElement<String> createRetriveAndTryEventExecuteActionEventId(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterEventId_QNAME, String.class, RetriveAndTryEventExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "action", scope = RetriveAndTryEventExecuteAction.class)
    public JAXBElement<String> createRetriveAndTryEventExecuteActionAction(String value) {
        return new JAXBElement<String>(_DealFieldActionAction_QNAME, String.class, RetriveAndTryEventExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "actionParam", scope = RetriveAndTryEventExecuteAction.class)
    public JAXBElement<InterActionParams> createRetriveAndTryEventExecuteActionActionParam(InterActionParams value) {
        return new JAXBElement<InterActionParams>(_RetriveAndTryEventExecuteActionActionParam_QNAME, InterActionParams.class, RetriveAndTryEventExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetriveAndTryEventExecuteActionResult", scope = RetriveAndTryEventExecuteActionResponse.class)
    public JAXBElement<ServiceDealOperation> createRetriveAndTryEventExecuteActionResponseRetriveAndTryEventExecuteActionResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_RetriveAndTryEventExecuteActionResponseRetriveAndTryEventExecuteActionResult_QNAME, ServiceDealOperation.class, RetriveAndTryEventExecuteActionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventId", scope = EventClickButton.class)
    public JAXBElement<String> createEventClickButtonEventId(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterEventId_QNAME, String.class, EventClickButton.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "buttonName", scope = EventClickButton.class)
    public JAXBElement<String> createEventClickButtonButtonName(String value) {
        return new JAXBElement<String>(_ClickButtonButtonName_QNAME, String.class, EventClickButton.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EventClickButtonResult", scope = EventClickButtonResponse.class)
    public JAXBElement<ServiceDealOperation> createEventClickButtonResponseEventClickButtonResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_EventClickButtonResponseEventClickButtonResult_QNAME, ServiceDealOperation.class, EventClickButtonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventId", scope = LinkedTradeEvaluateField.class)
    public JAXBElement<String> createLinkedTradeEvaluateFieldEventId(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterEventId_QNAME, String.class, LinkedTradeEvaluateField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "field", scope = LinkedTradeEvaluateField.class)
    public JAXBElement<String> createLinkedTradeEvaluateFieldField(String value) {
        return new JAXBElement<String>(_EventSetValueField_QNAME, String.class, LinkedTradeEvaluateField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "value", scope = LinkedTradeEvaluateField.class)
    public JAXBElement<Object> createLinkedTradeEvaluateFieldValue(Object value) {
        return new JAXBElement<Object>(_EventSetValueValue_QNAME, Object.class, LinkedTradeEvaluateField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LinkedTradeEvaluateFieldResult", scope = LinkedTradeEvaluateFieldResponse.class)
    public JAXBElement<ServiceDealOperation> createLinkedTradeEvaluateFieldResponseLinkedTradeEvaluateFieldResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_LinkedTradeEvaluateFieldResponseLinkedTradeEvaluateFieldResult_QNAME, ServiceDealOperation.class, LinkedTradeEvaluateFieldResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventId", scope = LinkedTradeExecuteSTPAction.class)
    public JAXBElement<String> createLinkedTradeExecuteSTPActionEventId(String value) {
        return new JAXBElement<String>(_ScheduleGetParameterEventId_QNAME, String.class, LinkedTradeExecuteSTPAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "stpAction", scope = LinkedTradeExecuteSTPAction.class)
    public JAXBElement<String> createLinkedTradeExecuteSTPActionStpAction(String value) {
        return new JAXBElement<String>(_TryExecuteSTPActionStpAction_QNAME, String.class, LinkedTradeExecuteSTPAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fromUser", scope = LinkedTradeExecuteSTPAction.class)
    public JAXBElement<InterActionParams> createLinkedTradeExecuteSTPActionFromUser(InterActionParams value) {
        return new JAXBElement<InterActionParams>(_CompleteExecuteActionFromUser_QNAME, InterActionParams.class, LinkedTradeExecuteSTPAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LinkedTradeExecuteSTPActionResult", scope = LinkedTradeExecuteSTPActionResponse.class)
    public JAXBElement<ServiceDealOperation> createLinkedTradeExecuteSTPActionResponseLinkedTradeExecuteSTPActionResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_LinkedTradeExecuteSTPActionResponseLinkedTradeExecuteSTPActionResult_QNAME, ServiceDealOperation.class, LinkedTradeExecuteSTPActionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id", scope = PrintTicket.class)
    public JAXBElement<ArrayOfint> createPrintTicketId(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_PrintTicketId_QNAME, ArrayOfint.class, PrintTicket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PrintTicketResult", scope = PrintTicketResponse.class)
    public JAXBElement<ServiceDealOperation> createPrintTicketResponsePrintTicketResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_PrintTicketResponsePrintTicketResult_QNAME, ServiceDealOperation.class, PrintTicketResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateTradeEndOfDateResult", scope = UpdateTradeEndOfDateResponse.class)
    public JAXBElement<ServiceDealOperation> createUpdateTradeEndOfDateResponseUpdateTradeEndOfDateResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_UpdateTradeEndOfDateResponseUpdateTradeEndOfDateResult_QNAME, ServiceDealOperation.class, UpdateTradeEndOfDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateCDSTradeEndOfDateResult", scope = UpdateCDSTradeEndOfDateResponse.class)
    public JAXBElement<ServiceDealOperation> createUpdateCDSTradeEndOfDateResponseUpdateCDSTradeEndOfDateResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_UpdateCDSTradeEndOfDateResponseUpdateCDSTradeEndOfDateResult_QNAME, ServiceDealOperation.class, UpdateCDSTradeEndOfDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "names", scope = UpdateTrade.class)
    public JAXBElement<ArrayOfstring> createUpdateTradeNames(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CloneDealNames_QNAME, ArrayOfstring.class, UpdateTrade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "values", scope = UpdateTrade.class)
    public JAXBElement<ArrayOfanyType> createUpdateTradeValues(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_CloneDealValues_QNAME, ArrayOfanyType.class, UpdateTrade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateTradeResult", scope = UpdateTradeResponse.class)
    public JAXBElement<ServiceDealOperation> createUpdateTradeResponseUpdateTradeResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_UpdateTradeResponseUpdateTradeResult_QNAME, ServiceDealOperation.class, UpdateTradeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateFrom", scope = RecalcOpenTrade.class)
    public JAXBElement<XMLGregorianCalendar> createRecalcOpenTradeDateFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RecalcOpenTradeDateFrom_QNAME, XMLGregorianCalendar.class, RecalcOpenTrade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateTill", scope = RecalcOpenTrade.class)
    public JAXBElement<XMLGregorianCalendar> createRecalcOpenTradeDateTill(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RecalcOpenTradeDateTill_QNAME, XMLGregorianCalendar.class, RecalcOpenTrade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RecalcOpenTradeResult", scope = RecalcOpenTradeResponse.class)
    public JAXBElement<ServiceDealOperation> createRecalcOpenTradeResponseRecalcOpenTradeResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_RecalcOpenTradeResponseRecalcOpenTradeResult_QNAME, ServiceDealOperation.class, RecalcOpenTradeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "trades", scope = BulkTryExecuteSTPAction.class)
    public JAXBElement<ArrayOfint> createBulkTryExecuteSTPActionTrades(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_BulkTryExecuteSTPActionTrades_QNAME, ArrayOfint.class, BulkTryExecuteSTPAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "stpAction", scope = BulkTryExecuteSTPAction.class)
    public JAXBElement<String> createBulkTryExecuteSTPActionStpAction(String value) {
        return new JAXBElement<String>(_TryExecuteSTPActionStpAction_QNAME, String.class, BulkTryExecuteSTPAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fromUser", scope = BulkTryExecuteSTPAction.class)
    public JAXBElement<InterActionParams> createBulkTryExecuteSTPActionFromUser(InterActionParams value) {
        return new JAXBElement<InterActionParams>(_CompleteExecuteActionFromUser_QNAME, InterActionParams.class, BulkTryExecuteSTPAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BulkTryExecuteSTPActionResult", scope = BulkTryExecuteSTPActionResponse.class)
    public JAXBElement<ServiceDealOperation> createBulkTryExecuteSTPActionResponseBulkTryExecuteSTPActionResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_BulkTryExecuteSTPActionResponseBulkTryExecuteSTPActionResult_QNAME, ServiceDealOperation.class, BulkTryExecuteSTPActionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "books", scope = GetFundingConsolidatedTrade.class)
    public JAXBElement<ArrayOfint> createGetFundingConsolidatedTradeBooks(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetFundingConsolidatedTradeBooks_QNAME, ArrayOfint.class, GetFundingConsolidatedTrade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFundingConsolidatedTradeResult", scope = GetFundingConsolidatedTradeResponse.class)
    public JAXBElement<ServiceDealOperation> createGetFundingConsolidatedTradeResponseGetFundingConsolidatedTradeResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_GetFundingConsolidatedTradeResponseGetFundingConsolidatedTradeResult_QNAME, ServiceDealOperation.class, GetFundingConsolidatedTradeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "eventIDs", scope = BulkEventTryExecuteAction.class)
    public JAXBElement<ArrayOfint> createBulkEventTryExecuteActionEventIDs(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_BulkEventTryExecuteActionEventIDs_QNAME, ArrayOfint.class, BulkEventTryExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "action", scope = BulkEventTryExecuteAction.class)
    public JAXBElement<String> createBulkEventTryExecuteActionAction(String value) {
        return new JAXBElement<String>(_DealFieldActionAction_QNAME, String.class, BulkEventTryExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "actionParams", scope = BulkEventTryExecuteAction.class)
    public JAXBElement<InterActionParams> createBulkEventTryExecuteActionActionParams(InterActionParams value) {
        return new JAXBElement<InterActionParams>(_EventTryExecuteActionActionParams_QNAME, InterActionParams.class, BulkEventTryExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BulkEventTryExecuteActionResult", scope = BulkEventTryExecuteActionResponse.class)
    public JAXBElement<ServiceDealOperation> createBulkEventTryExecuteActionResponseBulkEventTryExecuteActionResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_BulkEventTryExecuteActionResponseBulkEventTryExecuteActionResult_QNAME, ServiceDealOperation.class, BulkEventTryExecuteActionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SmartId", scope = ChangeTradeBOStatus.class)
    public JAXBElement<String> createChangeTradeBOStatusSmartId(String value) {
        return new JAXBElement<String>(_ChangeTradeBOStatusSmartId_QNAME, String.class, ChangeTradeBOStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AgreementNum", scope = ChangeTradeBOStatus.class)
    public JAXBElement<String> createChangeTradeBOStatusAgreementNum(String value) {
        return new JAXBElement<String>(_ChangeTradeBOStatusAgreementNum_QNAME, String.class, ChangeTradeBOStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CommissionNum", scope = ChangeTradeBOStatus.class)
    public JAXBElement<String> createChangeTradeBOStatusCommissionNum(String value) {
        return new JAXBElement<String>(_ChangeTradeBOStatusCommissionNum_QNAME, String.class, ChangeTradeBOStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BrokerPactNum", scope = ChangeTradeBOStatus.class)
    public JAXBElement<String> createChangeTradeBOStatusBrokerPactNum(String value) {
        return new JAXBElement<String>(_ChangeTradeBOStatusBrokerPactNum_QNAME, String.class, ChangeTradeBOStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DateFactPay", scope = ChangeTradeBOStatus.class)
    public JAXBElement<String> createChangeTradeBOStatusDateFactPay(String value) {
        return new JAXBElement<String>(_ChangeTradeBOStatusDateFactPay_QNAME, String.class, ChangeTradeBOStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DateFactDelivery", scope = ChangeTradeBOStatus.class)
    public JAXBElement<String> createChangeTradeBOStatusDateFactDelivery(String value) {
        return new JAXBElement<String>(_ChangeTradeBOStatusDateFactDelivery_QNAME, String.class, ChangeTradeBOStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ChangeTradeBOStatusResult", scope = ChangeTradeBOStatusResponse.class)
    public JAXBElement<ServiceDealOperation> createChangeTradeBOStatusResponseChangeTradeBOStatusResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_ChangeTradeBOStatusResponseChangeTradeBOStatusResult_QNAME, ServiceDealOperation.class, ChangeTradeBOStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tradeIDs", scope = ChangeTradeLSStatus.class)
    public JAXBElement<ArrayOfint> createChangeTradeLSStatusTradeIDs(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ChangeTradeLSStatusTradeIDs_QNAME, ArrayOfint.class, ChangeTradeLSStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "traderName", scope = ChangeTradeLSStatus.class)
    public JAXBElement<String> createChangeTradeLSStatusTraderName(String value) {
        return new JAXBElement<String>(_ChangeTradeLSStatusTraderName_QNAME, String.class, ChangeTradeLSStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ChangeTradeLSStatusResult", scope = ChangeTradeLSStatusResponse.class)
    public JAXBElement<ServiceDealOperation> createChangeTradeLSStatusResponseChangeTradeLSStatusResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_ChangeTradeLSStatusResponseChangeTradeLSStatusResult_QNAME, ServiceDealOperation.class, ChangeTradeLSStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "trades", scope = BulkAddRateChange.class)
    public JAXBElement<ArrayOfint> createBulkAddRateChangeTrades(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_BulkTryExecuteSTPActionTrades_QNAME, ArrayOfint.class, BulkAddRateChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DealEventProxy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rateChange", scope = BulkAddRateChange.class)
    public JAXBElement<DealEventProxy> createBulkAddRateChangeRateChange(DealEventProxy value) {
        return new JAXBElement<DealEventProxy>(_BulkAddRateChangeRateChange_QNAME, DealEventProxy.class, BulkAddRateChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "changedField", scope = BulkAddRateChange.class)
    public JAXBElement<String> createBulkAddRateChangeChangedField(String value) {
        return new JAXBElement<String>(_BulkAddRateChangeChangedField_QNAME, String.class, BulkAddRateChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fromUser", scope = BulkAddRateChange.class)
    public JAXBElement<InterActionParams> createBulkAddRateChangeFromUser(InterActionParams value) {
        return new JAXBElement<InterActionParams>(_CompleteExecuteActionFromUser_QNAME, InterActionParams.class, BulkAddRateChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BulkAddRateChangeResult", scope = BulkAddRateChangeResponse.class)
    public JAXBElement<ServiceDealOperation> createBulkAddRateChangeResponseBulkAddRateChangeResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_BulkAddRateChangeResponseBulkAddRateChangeResult_QNAME, ServiceDealOperation.class, BulkAddRateChangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSessionStatusResult", scope = GetSessionStatusResponse.class)
    public JAXBElement<ServiceDealOperation> createGetSessionStatusResponseGetSessionStatusResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_GetSessionStatusResponseGetSessionStatusResult_QNAME, ServiceDealOperation.class, GetSessionStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NrdTradeBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nrdTrade", scope = ImportBasketRepo.class)
    public JAXBElement<NrdTradeBase> createImportBasketRepoNrdTrade(NrdTradeBase value) {
        return new JAXBElement<NrdTradeBase>(_ImportBasketRepoNrdTrade_QNAME, NrdTradeBase.class, ImportBasketRepo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NrdImportInfoCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ImportBasketRepoResult", scope = ImportBasketRepoResponse.class)
    public JAXBElement<NrdImportInfoCollection> createImportBasketRepoResponseImportBasketRepoResult(NrdImportInfoCollection value) {
        return new JAXBElement<NrdImportInfoCollection>(_ImportBasketRepoResponseImportBasketRepoResult_QNAME, NrdImportInfoCollection.class, ImportBasketRepoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LoadTradeMonitorResult", scope = LoadTradeMonitorResponse.class)
    public JAXBElement<ServiceDealOperation> createLoadTradeMonitorResponseLoadTradeMonitorResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_LoadTradeMonitorResponseLoadTradeMonitorResult_QNAME, ServiceDealOperation.class, LoadTradeMonitorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "stpAction", scope = RetriveAndTryTradeExecuteAction.class)
    public JAXBElement<String> createRetriveAndTryTradeExecuteActionStpAction(String value) {
        return new JAXBElement<String>(_TryExecuteSTPActionStpAction_QNAME, String.class, RetriveAndTryTradeExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "actionParam", scope = RetriveAndTryTradeExecuteAction.class)
    public JAXBElement<InterActionParams> createRetriveAndTryTradeExecuteActionActionParam(InterActionParams value) {
        return new JAXBElement<InterActionParams>(_RetriveAndTryEventExecuteActionActionParam_QNAME, InterActionParams.class, RetriveAndTryTradeExecuteAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetriveAndTryTradeExecuteActionResult", scope = RetriveAndTryTradeExecuteActionResponse.class)
    public JAXBElement<ServiceDealOperation> createRetriveAndTryTradeExecuteActionResponseRetriveAndTryTradeExecuteActionResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_RetriveAndTryTradeExecuteActionResponseRetriveAndTryTradeExecuteActionResult_QNAME, ServiceDealOperation.class, RetriveAndTryTradeExecuteActionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "horizonDate", scope = GetEvent.class)
    public JAXBElement<XMLGregorianCalendar> createGetEventHorizonDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetEventHorizonDate_QNAME, XMLGregorianCalendar.class, GetEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEventResult", scope = GetEventResponse.class)
    public JAXBElement<ServiceDealOperation> createGetEventResponseGetEventResult(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_GetEventResponseGetEventResult_QNAME, ServiceDealOperation.class, GetEventResponse.class, value);
    }

}
