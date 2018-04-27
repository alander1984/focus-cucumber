
package org.datacontract.schemas._2004._07.egar_focus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.EventsScheduleProxy;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.egar_focus package. 
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

    private final static QName _EnumFieldTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.FieldsRepository", "enumFieldTypes");
    private final static QName _OperationErrorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "OperationErrorCode");
    private final static QName _InterActionParams_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "InterActionParams");
    private final static QName _ArrayOfActionResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "ArrayOfActionResult");
    private final static QName _ActionResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "ActionResult");
    private final static QName _InterActionParamSchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "InterActionParamSchedule");
    private final static QName _InterActionLinkedTrade_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "InterActionLinkedTrade");
    private final static QName _InterActionParamsActionResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "actionResults");
    private final static QName _InterActionParamsFormFields_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "formFields");
    private final static QName _InterActionParamsFormName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "formName");
    private final static QName _InterActionLinkedTradeLinkedTrade_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "LinkedTrade");
    private final static QName _InterActionParamScheduleSchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "Schedule");
    private final static QName _ActionResultCustomFormName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "CustomFormName");
    private final static QName _ActionResultDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "Description");
    private final static QName _ActionResultFieldName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "FieldName");
    private final static QName _ActionResultCaption_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "caption");
    private final static QName _ActionResultDefaultAnswer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "defaultAnswer");
    private final static QName _ActionResultPossibleAnswers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "possibleAnswers");
    private final static QName _ActionResultUserAnswer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", "userAnswer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.egar_focus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InterActionParams }
     * 
     */
    public InterActionParams createInterActionParams() {
        return new InterActionParams();
    }

    /**
     * Create an instance of {@link ArrayOfActionResult }
     * 
     */
    public ArrayOfActionResult createArrayOfActionResult() {
        return new ArrayOfActionResult();
    }

    /**
     * Create an instance of {@link ActionResult }
     * 
     */
    public ActionResult createActionResult() {
        return new ActionResult();
    }

    /**
     * Create an instance of {@link InterActionParamSchedule }
     * 
     */
    public InterActionParamSchedule createInterActionParamSchedule() {
        return new InterActionParamSchedule();
    }

    /**
     * Create an instance of {@link InterActionLinkedTrade }
     * 
     */
    public InterActionLinkedTrade createInterActionLinkedTrade() {
        return new InterActionLinkedTrade();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumFieldTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.FieldsRepository", name = "enumFieldTypes")
    public JAXBElement<EnumFieldTypes> createEnumFieldTypes(EnumFieldTypes value) {
        return new JAXBElement<EnumFieldTypes>(_EnumFieldTypes_QNAME, EnumFieldTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationErrorCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "OperationErrorCode")
    public JAXBElement<OperationErrorCode> createOperationErrorCode(OperationErrorCode value) {
        return new JAXBElement<OperationErrorCode>(_OperationErrorCode_QNAME, OperationErrorCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "InterActionParams")
    public JAXBElement<InterActionParams> createInterActionParams(InterActionParams value) {
        return new JAXBElement<InterActionParams>(_InterActionParams_QNAME, InterActionParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfActionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "ArrayOfActionResult")
    public JAXBElement<ArrayOfActionResult> createArrayOfActionResult(ArrayOfActionResult value) {
        return new JAXBElement<ArrayOfActionResult>(_ArrayOfActionResult_QNAME, ArrayOfActionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "ActionResult")
    public JAXBElement<ActionResult> createActionResult(ActionResult value) {
        return new JAXBElement<ActionResult>(_ActionResult_QNAME, ActionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionParamSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "InterActionParamSchedule")
    public JAXBElement<InterActionParamSchedule> createInterActionParamSchedule(InterActionParamSchedule value) {
        return new JAXBElement<InterActionParamSchedule>(_InterActionParamSchedule_QNAME, InterActionParamSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterActionLinkedTrade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "InterActionLinkedTrade")
    public JAXBElement<InterActionLinkedTrade> createInterActionLinkedTrade(InterActionLinkedTrade value) {
        return new JAXBElement<InterActionLinkedTrade>(_InterActionLinkedTrade_QNAME, InterActionLinkedTrade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfActionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "actionResults", scope = InterActionParams.class)
    public JAXBElement<ArrayOfActionResult> createInterActionParamsActionResults(ArrayOfActionResult value) {
        return new JAXBElement<ArrayOfActionResult>(_InterActionParamsActionResults_QNAME, ArrayOfActionResult.class, InterActionParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "formFields", scope = InterActionParams.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createInterActionParamsFormFields(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_InterActionParamsFormFields_QNAME, ArrayOfKeyValueOfstringanyType.class, InterActionParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "formName", scope = InterActionParams.class)
    public JAXBElement<String> createInterActionParamsFormName(String value) {
        return new JAXBElement<String>(_InterActionParamsFormName_QNAME, String.class, InterActionParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "LinkedTrade", scope = InterActionLinkedTrade.class)
    public JAXBElement<Object> createInterActionLinkedTradeLinkedTrade(Object value) {
        return new JAXBElement<Object>(_InterActionLinkedTradeLinkedTrade_QNAME, Object.class, InterActionLinkedTrade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventsScheduleProxy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "Schedule", scope = InterActionParamSchedule.class)
    public JAXBElement<EventsScheduleProxy> createInterActionParamScheduleSchedule(EventsScheduleProxy value) {
        return new JAXBElement<EventsScheduleProxy>(_InterActionParamScheduleSchedule_QNAME, EventsScheduleProxy.class, InterActionParamSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "CustomFormName", scope = ActionResult.class)
    public JAXBElement<String> createActionResultCustomFormName(String value) {
        return new JAXBElement<String>(_ActionResultCustomFormName_QNAME, String.class, ActionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "Description", scope = ActionResult.class)
    public JAXBElement<String> createActionResultDescription(String value) {
        return new JAXBElement<String>(_ActionResultDescription_QNAME, String.class, ActionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "FieldName", scope = ActionResult.class)
    public JAXBElement<String> createActionResultFieldName(String value) {
        return new JAXBElement<String>(_ActionResultFieldName_QNAME, String.class, ActionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "caption", scope = ActionResult.class)
    public JAXBElement<String> createActionResultCaption(String value) {
        return new JAXBElement<String>(_ActionResultCaption_QNAME, String.class, ActionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "defaultAnswer", scope = ActionResult.class)
    public JAXBElement<String> createActionResultDefaultAnswer(String value) {
        return new JAXBElement<String>(_ActionResultDefaultAnswer_QNAME, String.class, ActionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "possibleAnswers", scope = ActionResult.class)
    public JAXBElement<ArrayOfstring> createActionResultPossibleAnswers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ActionResultPossibleAnswers_QNAME, ArrayOfstring.class, ActionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", name = "userAnswer", scope = ActionResult.class)
    public JAXBElement<ArrayOfstring> createActionResultUserAnswer(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ActionResultUserAnswer_QNAME, ArrayOfstring.class, ActionResult.class, value);
    }

}
