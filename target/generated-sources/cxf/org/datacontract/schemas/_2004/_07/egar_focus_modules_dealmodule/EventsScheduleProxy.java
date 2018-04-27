
package org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for EventsScheduleProxy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsScheduleProxy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventTypeProperty" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1" minOccurs="0"/&gt;
 *         &lt;element name="EventTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="Events" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}ArrayOfDealEventProxy" minOccurs="0"/&gt;
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FieldProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1" minOccurs="0"/&gt;
 *         &lt;element name="Fields" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="Properties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="UsedForKnownTypeSerializationObject" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsScheduleProxy", propOrder = {
    "eventTypeProperty",
    "eventTypes",
    "events",
    "fieldName",
    "fieldProperties",
    "fields",
    "properties",
    "usedForKnownTypeSerializationObject"
})
public class EventsScheduleProxy {

    @XmlElementRef(name = "EventTypeProperty", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> eventTypeProperty;
    @XmlElementRef(name = "EventTypes", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> eventTypes;
    @XmlElementRef(name = "Events", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDealEventProxy> events;
    @XmlElementRef(name = "FieldName", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldName;
    @XmlElementRef(name = "FieldProperties", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> fieldProperties;
    @XmlElementRef(name = "Fields", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> fields;
    @XmlElementRef(name = "Properties", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> properties;
    @XmlElementRef(name = "UsedForKnownTypeSerializationObject", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> usedForKnownTypeSerializationObject;

    /**
     * Gets the value of the eventTypeProperty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> getEventTypeProperty() {
        return eventTypeProperty;
    }

    /**
     * Sets the value of the eventTypeProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }{@code >}
     *     
     */
    public void setEventTypeProperty(JAXBElement<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> value) {
        this.eventTypeProperty = value;
    }

    /**
     * Gets the value of the eventTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getEventTypes() {
        return eventTypes;
    }

    /**
     * Sets the value of the eventTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setEventTypes(JAXBElement<ArrayOfstring> value) {
        this.eventTypes = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDealEventProxy }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDealEventProxy> getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDealEventProxy }{@code >}
     *     
     */
    public void setEvents(JAXBElement<ArrayOfDealEventProxy> value) {
        this.events = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldName(JAXBElement<String> value) {
        this.fieldName = value;
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

}
