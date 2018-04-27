
package org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfstringstring;


/**
 * <p>Java class for DealEventProxy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealEventProxy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1" minOccurs="0"/&gt;
 *         &lt;element name="Actions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="DisplayValue" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="DisplayValueEng" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="EvaluateMessages" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/&gt;
 *         &lt;element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FieldPossibleValues" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1" minOccurs="0"/&gt;
 *         &lt;element name="FieldProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1" minOccurs="0"/&gt;
 *         &lt;element name="Fields" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NotificationValidate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parameters" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="Properties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SectionProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1" minOccurs="0"/&gt;
 *         &lt;element name="Sections" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StpContext" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="UsedForKnownTypeSerializationObject" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ValueValidation" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/&gt;
 *         &lt;element name="Values" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealEventProxy", propOrder = {
    "actionProperties",
    "actions",
    "displayValue",
    "displayValueEng",
    "evaluateMessages",
    "eventDate",
    "eventType",
    "fieldPossibleValues",
    "fieldProperties",
    "fields",
    "id",
    "isActive",
    "notificationValidate",
    "parameters",
    "properties",
    "registrationDate",
    "sectionProperties",
    "sections",
    "status",
    "stpContext",
    "usedForKnownTypeSerializationObject",
    "valueValidation",
    "values"
})
public class DealEventProxy {

    @XmlElementRef(name = "ActionProperties", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> actionProperties;
    @XmlElementRef(name = "Actions", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> actions;
    @XmlElementRef(name = "DisplayValue", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> displayValue;
    @XmlElementRef(name = "DisplayValueEng", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> displayValueEng;
    @XmlElementRef(name = "EvaluateMessages", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePairOfstringstring> evaluateMessages;
    @XmlElementRef(name = "EventDate", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> eventDate;
    @XmlElementRef(name = "EventType", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eventType;
    @XmlElementRef(name = "FieldPossibleValues", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1> fieldPossibleValues;
    @XmlElementRef(name = "FieldProperties", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> fieldProperties;
    @XmlElementRef(name = "Fields", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> fields;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElementRef(name = "NotificationValidate", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificationValidate;
    @XmlElementRef(name = "Parameters", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> parameters;
    @XmlElementRef(name = "Properties", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> properties;
    @XmlElementRef(name = "RegistrationDate", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> registrationDate;
    @XmlElementRef(name = "SectionProperties", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> sectionProperties;
    @XmlElementRef(name = "Sections", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> sections;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> status;
    @XmlElementRef(name = "StpContext", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> stpContext;
    @XmlElementRef(name = "UsedForKnownTypeSerializationObject", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> usedForKnownTypeSerializationObject;
    @XmlElementRef(name = "ValueValidation", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> valueValidation;
    @XmlElementRef(name = "Values", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> values;

    /**
     * Gets the value of the actionProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> getActionProperties() {
        return actionProperties;
    }

    /**
     * Sets the value of the actionProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}
     *     
     */
    public void setActionProperties(JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> value) {
        this.actionProperties = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setActions(JAXBElement<ArrayOfstring> value) {
        this.actions = value;
    }

    /**
     * Gets the value of the displayValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getDisplayValue() {
        return displayValue;
    }

    /**
     * Sets the value of the displayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setDisplayValue(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.displayValue = value;
    }

    /**
     * Gets the value of the displayValueEng property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getDisplayValueEng() {
        return displayValueEng;
    }

    /**
     * Sets the value of the displayValueEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setDisplayValueEng(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.displayValueEng = value;
    }

    /**
     * Gets the value of the evaluateMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValuePairOfstringstring> getEvaluateMessages() {
        return evaluateMessages;
    }

    /**
     * Sets the value of the evaluateMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}
     *     
     */
    public void setEvaluateMessages(JAXBElement<ArrayOfKeyValuePairOfstringstring> value) {
        this.evaluateMessages = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEventDate(JAXBElement<XMLGregorianCalendar> value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEventType(JAXBElement<String> value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the fieldPossibleValues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1> getFieldPossibleValues() {
        return fieldPossibleValues;
    }

    /**
     * Sets the value of the fieldPossibleValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1 }{@code >}
     *     
     */
    public void setFieldPossibleValues(JAXBElement<ArrayOfKeyValueOfstringArrayOfanyTypety7Ep6D1> value) {
        this.fieldPossibleValues = value;
    }

    /**
     * Gets the value of the fieldProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> getFieldProperties() {
        return fieldProperties;
    }

    /**
     * Sets the value of the fieldProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}
     *     
     */
    public void setFieldProperties(JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> value) {
        this.fieldProperties = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setFields(JAXBElement<ArrayOfstring> value) {
        this.fields = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the notificationValidate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationValidate() {
        return notificationValidate;
    }

    /**
     * Sets the value of the notificationValidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationValidate(JAXBElement<String> value) {
        this.notificationValidate = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setParameters(JAXBElement<ArrayOfstring> value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setProperties(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.properties = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRegistrationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the sectionProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> getSectionProperties() {
        return sectionProperties;
    }

    /**
     * Sets the value of the sectionProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}
     *     
     */
    public void setSectionProperties(JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> value) {
        this.sectionProperties = value;
    }

    /**
     * Gets the value of the sections property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getSections() {
        return sections;
    }

    /**
     * Sets the value of the sections property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setSections(JAXBElement<ArrayOfstring> value) {
        this.sections = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStatus(JAXBElement<Integer> value) {
        this.status = value;
    }

    /**
     * Gets the value of the stpContext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getStpContext() {
        return stpContext;
    }

    /**
     * Sets the value of the stpContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setStpContext(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.stpContext = value;
    }

    /**
     * Gets the value of the usedForKnownTypeSerializationObject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getUsedForKnownTypeSerializationObject() {
        return usedForKnownTypeSerializationObject;
    }

    /**
     * Sets the value of the usedForKnownTypeSerializationObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setUsedForKnownTypeSerializationObject(JAXBElement<Object> value) {
        this.usedForKnownTypeSerializationObject = value;
    }

    /**
     * Gets the value of the valueValidation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringstring> getValueValidation() {
        return valueValidation;
    }

    /**
     * Sets the value of the valueValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public void setValueValidation(JAXBElement<ArrayOfKeyValueOfstringstring> value) {
        this.valueValidation = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setValues(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.values = value;
    }

}
