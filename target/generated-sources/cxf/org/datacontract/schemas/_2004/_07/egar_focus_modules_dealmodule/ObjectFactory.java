
package org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.egar_focus.InterActionParams;
import org.datacontract.schemas._2004._07.egar_focus_events_base.ArrayOfIdName;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfstringstring;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule package. 
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

    private final static QName _EventsScheduleProxy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "EventsScheduleProxy");
    private final static QName _ArrayOfDealEventProxy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ArrayOfDealEventProxy");
    private final static QName _DealEventProxy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "DealEventProxy");
    private final static QName _DealBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "DealBase");
    private final static QName _ArrayOfDealField_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ArrayOfDealField");
    private final static QName _DealField_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "DealField");
    private final static QName _ArrayOfAddDealEventContract_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ArrayOfAddDealEventContract");
    private final static QName _AddDealEventContract_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "AddDealEventContract");
    private final static QName _ServiceDealOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ServiceDealOperation");
    private final static QName _ServiceOperationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ServiceOperationResult");
    private final static QName _ServiceValueResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ServiceValueResult");
    private final static QName _ServiceDetalizationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ServiceDetalizationResult");
    private final static QName _ServiceOperationResultActionParams_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "actionParams");
    private final static QName _ServiceOperationResultDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Description");
    private final static QName _ServiceOperationResultErrorDump_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ErrorDump");
    private final static QName _ServiceOperationResultSessionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "SessionID");
    private final static QName _ServiceOperationResultUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "UserName");
    private final static QName _ServiceDetalizationResultFields_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Fields");
    private final static QName _ServiceValueResultValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Value");
    private final static QName _ServiceDealOperationEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Event");
    private final static QName _ServiceDealOperationDeal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Deal");
    private final static QName _AddDealEventContractSaveAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "SaveAction");
    private final static QName _DealFieldDescriptionEng_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "DescriptionEng");
    private final static QName _DealFieldErrorText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ErrorText");
    private final static QName _DealFieldExtraValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ExtraValues");
    private final static QName _DealFieldFormatString_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "FormatString");
    private final static QName _DealFieldText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Text");
    private final static QName _DealFieldTextEng_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "TextEng");
    private final static QName _DealFieldValueItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ValueItems");
    private final static QName _DealFieldValueType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ValueType");
    private final static QName _DealBaseCaption_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Caption");
    private final static QName _DealBaseDealGuid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "DealGuid");
    private final static QName _DealBaseEvaluateMessages_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "EvaluateMessages");
    private final static QName _DealBaseStpActionsEnabled_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "StpActionsEnabled");
    private final static QName _DealBaseDynamicParams_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "dynamicParams");
    private final static QName _DealBaseNEvents_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "nEvents");
    private final static QName _DealEventProxyActionProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ActionProperties");
    private final static QName _DealEventProxyActions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Actions");
    private final static QName _DealEventProxyDisplayValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "DisplayValue");
    private final static QName _DealEventProxyDisplayValueEng_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "DisplayValueEng");
    private final static QName _DealEventProxyEventDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "EventDate");
    private final static QName _DealEventProxyEventType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "EventType");
    private final static QName _DealEventProxyFieldPossibleValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "FieldPossibleValues");
    private final static QName _DealEventProxyFieldProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "FieldProperties");
    private final static QName _DealEventProxyId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Id");
    private final static QName _DealEventProxyNotificationValidate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "NotificationValidate");
    private final static QName _DealEventProxyParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Parameters");
    private final static QName _DealEventProxyProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Properties");
    private final static QName _DealEventProxyRegistrationDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "RegistrationDate");
    private final static QName _DealEventProxySectionProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "SectionProperties");
    private final static QName _DealEventProxySections_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Sections");
    private final static QName _DealEventProxyStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Status");
    private final static QName _DealEventProxyStpContext_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "StpContext");
    private final static QName _DealEventProxyUsedForKnownTypeSerializationObject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "UsedForKnownTypeSerializationObject");
    private final static QName _DealEventProxyValueValidation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "ValueValidation");
    private final static QName _DealEventProxyValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Values");
    private final static QName _EventsScheduleProxyEventTypeProperty_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "EventTypeProperty");
    private final static QName _EventsScheduleProxyEventTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "EventTypes");
    private final static QName _EventsScheduleProxyEvents_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "Events");
    private final static QName _EventsScheduleProxyFieldName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", "FieldName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventsScheduleProxy }
     * 
     */
    public EventsScheduleProxy createEventsScheduleProxy() {
        return new EventsScheduleProxy();
    }

    /**
     * Create an instance of {@link ArrayOfDealEventProxy }
     * 
     */
    public ArrayOfDealEventProxy createArrayOfDealEventProxy() {
        return new ArrayOfDealEventProxy();
    }

    /**
     * Create an instance of {@link DealEventProxy }
     * 
     */
    public DealEventProxy createDealEventProxy() {
        return new DealEventProxy();
    }

    /**
     * Create an instance of {@link DealBase }
     * 
     */
    public DealBase createDealBase() {
        return new DealBase();
    }

    /**
     * Create an instance of {@link ArrayOfDealField }
     * 
     */
    public ArrayOfDealField createArrayOfDealField() {
        return new ArrayOfDealField();
    }

    /**
     * Create an instance of {@link DealField }
     * 
     */
    public DealField createDealField() {
        return new DealField();
    }

    /**
     * Create an instance of {@link ArrayOfAddDealEventContract }
     * 
     */
    public ArrayOfAddDealEventContract createArrayOfAddDealEventContract() {
        return new ArrayOfAddDealEventContract();
    }

    /**
     * Create an instance of {@link AddDealEventContract }
     * 
     */
    public AddDealEventContract createAddDealEventContract() {
        return new AddDealEventContract();
    }

    /**
     * Create an instance of {@link ServiceDealOperation }
     * 
     */
    public ServiceDealOperation createServiceDealOperation() {
        return new ServiceDealOperation();
    }

    /**
     * Create an instance of {@link ServiceOperationResult }
     * 
     */
    public ServiceOperationResult createServiceOperationResult() {
        return new ServiceOperationResult();
    }

    /**
     * Create an instance of {@link ServiceValueResult }
     * 
     */
    public ServiceValueResult createServiceValueResult() {
        return new ServiceValueResult();
    }

    /**
     * Create an instance of {@link ServiceDetalizationResult }
     * 
     */
    public ServiceDetalizationResult createServiceDetalizationResult() {
        return new ServiceDetalizationResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsScheduleProxy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "EventsScheduleProxy")
    public JAXBElement<EventsScheduleProxy> createEventsScheduleProxy(EventsScheduleProxy value) {
        return new JAXBElement<EventsScheduleProxy>(_EventsScheduleProxy_QNAME, EventsScheduleProxy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDealEventProxy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ArrayOfDealEventProxy")
    public JAXBElement<ArrayOfDealEventProxy> createArrayOfDealEventProxy(ArrayOfDealEventProxy value) {
        return new JAXBElement<ArrayOfDealEventProxy>(_ArrayOfDealEventProxy_QNAME, ArrayOfDealEventProxy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DealEventProxy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "DealEventProxy")
    public JAXBElement<DealEventProxy> createDealEventProxy(DealEventProxy value) {
        return new JAXBElement<DealEventProxy>(_DealEventProxy_QNAME, DealEventProxy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DealBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "DealBase")
    public JAXBElement<DealBase> createDealBase(DealBase value) {
        return new JAXBElement<DealBase>(_DealBase_QNAME, DealBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDealField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ArrayOfDealField")
    public JAXBElement<ArrayOfDealField> createArrayOfDealField(ArrayOfDealField value) {
        return new JAXBElement<ArrayOfDealField>(_ArrayOfDealField_QNAME, ArrayOfDealField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DealField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "DealField")
    public JAXBElement<DealField> createDealField(DealField value) {
        return new JAXBElement<DealField>(_DealField_QNAME, DealField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddDealEventContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ArrayOfAddDealEventContract")
    public JAXBElement<ArrayOfAddDealEventContract> createArrayOfAddDealEventContract(ArrayOfAddDealEventContract value) {
        return new JAXBElement<ArrayOfAddDealEventContract>(_ArrayOfAddDealEventContract_QNAME, ArrayOfAddDealEventContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDealEventContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "AddDealEventContract")
    public JAXBElement<AddDealEventContract> createAddDealEventContract(AddDealEventContract value) {
        return new JAXBElement<AddDealEventContract>(_AddDealEventContract_QNAME, AddDealEventContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDealOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ServiceDealOperation")
    public JAXBElement<ServiceDealOperation> createServiceDealOperation(ServiceDealOperation value) {
        return new JAXBElement<ServiceDealOperation>(_ServiceDealOperation_QNAME, ServiceDealOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ServiceOperationResult")
    public JAXBElement<ServiceOperationResult> createServiceOperationResult(ServiceOperationResult value) {
        return new JAXBElement<ServiceOperationResult>(_ServiceOperationResult_QNAME, ServiceOperationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceValueResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ServiceValueResult")
    public JAXBElement<ServiceValueResult> createServiceValueResult(ServiceValueResult value) {
        return new JAXBElement<ServiceValueResult>(_ServiceValueResult_QNAME, ServiceValueResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDetalizationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ServiceDetalizationResult")
    public JAXBElement<ServiceDetalizationResult> createServiceDetalizationResult(ServiceDetalizationResult value) {
        return new JAXBElement<ServiceDetalizationResult>(_ServiceDetalizationResult_QNAME, ServiceDetalizationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "actionParams", scope = ServiceOperationResult.class)
    public JAXBElement<InterActionParams> createServiceOperationResultActionParams(InterActionParams value) {
        return new JAXBElement<InterActionParams>(_ServiceOperationResultActionParams_QNAME, InterActionParams.class, ServiceOperationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Description", scope = ServiceOperationResult.class)
    public JAXBElement<String> createServiceOperationResultDescription(String value) {
        return new JAXBElement<String>(_ServiceOperationResultDescription_QNAME, String.class, ServiceOperationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ErrorDump", scope = ServiceOperationResult.class)
    public JAXBElement<String> createServiceOperationResultErrorDump(String value) {
        return new JAXBElement<String>(_ServiceOperationResultErrorDump_QNAME, String.class, ServiceOperationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "SessionID", scope = ServiceOperationResult.class)
    public JAXBElement<String> createServiceOperationResultSessionID(String value) {
        return new JAXBElement<String>(_ServiceOperationResultSessionID_QNAME, String.class, ServiceOperationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "UserName", scope = ServiceOperationResult.class)
    public JAXBElement<String> createServiceOperationResultUserName(String value) {
        return new JAXBElement<String>(_ServiceOperationResultUserName_QNAME, String.class, ServiceOperationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDealField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Fields", scope = ServiceDetalizationResult.class)
    public JAXBElement<ArrayOfDealField> createServiceDetalizationResultFields(ArrayOfDealField value) {
        return new JAXBElement<ArrayOfDealField>(_ServiceDetalizationResultFields_QNAME, ArrayOfDealField.class, ServiceDetalizationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Value", scope = ServiceValueResult.class)
    public JAXBElement<Object> createServiceValueResultValue(Object value) {
        return new JAXBElement<Object>(_ServiceValueResultValue_QNAME, Object.class, ServiceValueResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DealEventProxy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Event", scope = ServiceDealOperation.class)
    public JAXBElement<DealEventProxy> createServiceDealOperationEvent(DealEventProxy value) {
        return new JAXBElement<DealEventProxy>(_ServiceDealOperationEvent_QNAME, DealEventProxy.class, ServiceDealOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DealBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Deal", scope = ServiceDealOperation.class)
    public JAXBElement<DealBase> createServiceDealOperationDeal(DealBase value) {
        return new JAXBElement<DealBase>(_ServiceDealOperationDeal_QNAME, DealBase.class, ServiceDealOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Fields", scope = AddDealEventContract.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createAddDealEventContractFields(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_ServiceDetalizationResultFields_QNAME, ArrayOfKeyValueOfstringanyType.class, AddDealEventContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "SaveAction", scope = AddDealEventContract.class)
    public JAXBElement<String> createAddDealEventContractSaveAction(String value) {
        return new JAXBElement<String>(_AddDealEventContractSaveAction_QNAME, String.class, AddDealEventContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Description", scope = DealField.class)
    public JAXBElement<String> createDealFieldDescription(String value) {
        return new JAXBElement<String>(_ServiceOperationResultDescription_QNAME, String.class, DealField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "DescriptionEng", scope = DealField.class)
    public JAXBElement<String> createDealFieldDescriptionEng(String value) {
        return new JAXBElement<String>(_DealFieldDescriptionEng_QNAME, String.class, DealField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ErrorText", scope = DealField.class)
    public JAXBElement<String> createDealFieldErrorText(String value) {
        return new JAXBElement<String>(_DealFieldErrorText_QNAME, String.class, DealField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ExtraValues", scope = DealField.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createDealFieldExtraValues(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_DealFieldExtraValues_QNAME, ArrayOfKeyValueOfstringanyType.class, DealField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "FormatString", scope = DealField.class)
    public JAXBElement<String> createDealFieldFormatString(String value) {
        return new JAXBElement<String>(_DealFieldFormatString_QNAME, String.class, DealField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Text", scope = DealField.class)
    public JAXBElement<String> createDealFieldText(String value) {
        return new JAXBElement<String>(_DealFieldText_QNAME, String.class, DealField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "TextEng", scope = DealField.class)
    public JAXBElement<String> createDealFieldTextEng(String value) {
        return new JAXBElement<String>(_DealFieldTextEng_QNAME, String.class, DealField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIdName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ValueItems", scope = DealField.class)
    public JAXBElement<ArrayOfIdName> createDealFieldValueItems(ArrayOfIdName value) {
        return new JAXBElement<ArrayOfIdName>(_DealFieldValueItems_QNAME, ArrayOfIdName.class, DealField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ValueType", scope = DealField.class)
    public JAXBElement<String> createDealFieldValueType(String value) {
        return new JAXBElement<String>(_DealFieldValueType_QNAME, String.class, DealField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Caption", scope = DealBase.class)
    public JAXBElement<String> createDealBaseCaption(String value) {
        return new JAXBElement<String>(_DealBaseCaption_QNAME, String.class, DealBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "DealGuid", scope = DealBase.class)
    public JAXBElement<String> createDealBaseDealGuid(String value) {
        return new JAXBElement<String>(_DealBaseDealGuid_QNAME, String.class, DealBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "EvaluateMessages", scope = DealBase.class)
    public JAXBElement<ArrayOfKeyValuePairOfstringstring> createDealBaseEvaluateMessages(ArrayOfKeyValuePairOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValuePairOfstringstring>(_DealBaseEvaluateMessages_QNAME, ArrayOfKeyValuePairOfstringstring.class, DealBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDealField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Fields", scope = DealBase.class)
    public JAXBElement<ArrayOfDealField> createDealBaseFields(ArrayOfDealField value) {
        return new JAXBElement<ArrayOfDealField>(_ServiceDetalizationResultFields_QNAME, ArrayOfDealField.class, DealBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "StpActionsEnabled", scope = DealBase.class)
    public JAXBElement<ArrayOfstring> createDealBaseStpActionsEnabled(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DealBaseStpActionsEnabled_QNAME, ArrayOfstring.class, DealBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfanyTypeanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "dynamicParams", scope = DealBase.class)
    public JAXBElement<ArrayOfKeyValueOfanyTypeanyType> createDealBaseDynamicParams(ArrayOfKeyValueOfanyTypeanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfanyTypeanyType>(_DealBaseDynamicParams_QNAME, ArrayOfKeyValueOfanyTypeanyType.class, DealBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "nEvents", scope = DealBase.class)
    public JAXBElement<Integer> createDealBaseNEvents(Integer value) {
        return new JAXBElement<Integer>(_DealBaseNEvents_QNAME, Integer.class, DealBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ActionProperties", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> createDealEventProxyActionProperties(ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 value) {
        return new JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1>(_DealEventProxyActionProperties_QNAME, ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 .class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Actions", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfstring> createDealEventProxyActions(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DealEventProxyActions_QNAME, ArrayOfstring.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "DisplayValue", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createDealEventProxyDisplayValue(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_DealEventProxyDisplayValue_QNAME, ArrayOfKeyValueOfstringanyType.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "DisplayValueEng", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createDealEventProxyDisplayValueEng(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_DealEventProxyDisplayValueEng_QNAME, ArrayOfKeyValueOfstringanyType.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "EvaluateMessages", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfKeyValuePairOfstringstring> createDealEventProxyEvaluateMessages(ArrayOfKeyValuePairOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValuePairOfstringstring>(_DealBaseEvaluateMessages_QNAME, ArrayOfKeyValuePairOfstringstring.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "EventDate", scope = DealEventProxy.class)
    public JAXBElement<XMLGregorianCalendar> createDealEventProxyEventDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DealEventProxyEventDate_QNAME, XMLGregorianCalendar.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "EventType", scope = DealEventProxy.class)
    public JAXBElement<String> createDealEventProxyEventType(String value) {
        return new JAXBElement<String>(_DealEventProxyEventType_QNAME, String.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "FieldPossibleValues", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1> createDealEventProxyFieldPossibleValues(ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 value) {
        return new JAXBElement<ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1>(_DealEventProxyFieldPossibleValues_QNAME, ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 .class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "FieldProperties", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> createDealEventProxyFieldProperties(ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 value) {
        return new JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1>(_DealEventProxyFieldProperties_QNAME, ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 .class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Fields", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfstring> createDealEventProxyFields(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ServiceDetalizationResultFields_QNAME, ArrayOfstring.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Id", scope = DealEventProxy.class)
    public JAXBElement<String> createDealEventProxyId(String value) {
        return new JAXBElement<String>(_DealEventProxyId_QNAME, String.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "NotificationValidate", scope = DealEventProxy.class)
    public JAXBElement<String> createDealEventProxyNotificationValidate(String value) {
        return new JAXBElement<String>(_DealEventProxyNotificationValidate_QNAME, String.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Parameters", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfstring> createDealEventProxyParameters(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DealEventProxyParameters_QNAME, ArrayOfstring.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Properties", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createDealEventProxyProperties(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_DealEventProxyProperties_QNAME, ArrayOfKeyValueOfstringanyType.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "RegistrationDate", scope = DealEventProxy.class)
    public JAXBElement<XMLGregorianCalendar> createDealEventProxyRegistrationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DealEventProxyRegistrationDate_QNAME, XMLGregorianCalendar.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "SectionProperties", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> createDealEventProxySectionProperties(ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 value) {
        return new JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1>(_DealEventProxySectionProperties_QNAME, ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 .class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Sections", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfstring> createDealEventProxySections(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DealEventProxySections_QNAME, ArrayOfstring.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Status", scope = DealEventProxy.class)
    public JAXBElement<Integer> createDealEventProxyStatus(Integer value) {
        return new JAXBElement<Integer>(_DealEventProxyStatus_QNAME, Integer.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "StpContext", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createDealEventProxyStpContext(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_DealEventProxyStpContext_QNAME, ArrayOfKeyValueOfstringanyType.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "UsedForKnownTypeSerializationObject", scope = DealEventProxy.class)
    public JAXBElement<Object> createDealEventProxyUsedForKnownTypeSerializationObject(Object value) {
        return new JAXBElement<Object>(_DealEventProxyUsedForKnownTypeSerializationObject_QNAME, Object.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "ValueValidation", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createDealEventProxyValueValidation(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_DealEventProxyValueValidation_QNAME, ArrayOfKeyValueOfstringstring.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Values", scope = DealEventProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createDealEventProxyValues(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_DealEventProxyValues_QNAME, ArrayOfKeyValueOfstringanyType.class, DealEventProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "EventTypeProperty", scope = EventsScheduleProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> createEventsScheduleProxyEventTypeProperty(ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 value) {
        return new JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1>(_EventsScheduleProxyEventTypeProperty_QNAME, ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 .class, EventsScheduleProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "EventTypes", scope = EventsScheduleProxy.class)
    public JAXBElement<ArrayOfstring> createEventsScheduleProxyEventTypes(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_EventsScheduleProxyEventTypes_QNAME, ArrayOfstring.class, EventsScheduleProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDealEventProxy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Events", scope = EventsScheduleProxy.class)
    public JAXBElement<ArrayOfDealEventProxy> createEventsScheduleProxyEvents(ArrayOfDealEventProxy value) {
        return new JAXBElement<ArrayOfDealEventProxy>(_EventsScheduleProxyEvents_QNAME, ArrayOfDealEventProxy.class, EventsScheduleProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "FieldName", scope = EventsScheduleProxy.class)
    public JAXBElement<String> createEventsScheduleProxyFieldName(String value) {
        return new JAXBElement<String>(_EventsScheduleProxyFieldName_QNAME, String.class, EventsScheduleProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "FieldProperties", scope = EventsScheduleProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> createEventsScheduleProxyFieldProperties(ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 value) {
        return new JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1>(_DealEventProxyFieldProperties_QNAME, ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 .class, EventsScheduleProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Fields", scope = EventsScheduleProxy.class)
    public JAXBElement<ArrayOfstring> createEventsScheduleProxyFields(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ServiceDetalizationResultFields_QNAME, ArrayOfstring.class, EventsScheduleProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "Properties", scope = EventsScheduleProxy.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createEventsScheduleProxyProperties(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_DealEventProxyProperties_QNAME, ArrayOfKeyValueOfstringanyType.class, EventsScheduleProxy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", name = "UsedForKnownTypeSerializationObject", scope = EventsScheduleProxy.class)
    public JAXBElement<Object> createEventsScheduleProxyUsedForKnownTypeSerializationObject(Object value) {
        return new JAXBElement<Object>(_DealEventProxyUsedForKnownTypeSerializationObject_QNAME, Object.class, EventsScheduleProxy.class, value);
    }

}
