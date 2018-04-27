
package org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import org.datacontract.schemas._2004._07.egar_focus.EnumFieldTypes;
import org.datacontract.schemas._2004._07.egar_focus_events_base.ArrayOfIdName;


/**
 * <p>Java class for DealField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraValues" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="FieldType" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.FieldsRepository}enumFieldTypes"/&gt;
 *         &lt;element name="FormatString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsManualEdited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSearchable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Quotation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TextEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ValueItems" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Events.Base.Helpers}ArrayOfIdName" minOccurs="0"/&gt;
 *         &lt;element name="ValueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealField", propOrder = {
    "description",
    "descriptionEng",
    "enabled",
    "errorText",
    "extraValues",
    "fieldType",
    "formatString",
    "isManualEdited",
    "isSearchable",
    "name",
    "quotation",
    "text",
    "textEng",
    "value",
    "valueItems",
    "valueType",
    "visible"
})
public class DealField {

    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DescriptionEng", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptionEng;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElementRef(name = "ErrorText", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorText;
    @XmlElementRef(name = "ExtraValues", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> extraValues;
    @XmlElement(name = "FieldType", required = true)
    @XmlSchemaType(name = "string")
    protected EnumFieldTypes fieldType;
    @XmlElementRef(name = "FormatString", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formatString;
    @XmlElement(name = "IsManualEdited")
    protected Boolean isManualEdited;
    @XmlElement(name = "IsSearchable")
    protected Boolean isSearchable;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "Quotation")
    protected Double quotation;
    @XmlElementRef(name = "Text", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;
    @XmlElementRef(name = "TextEng", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textEng;
    @XmlElement(name = "Value", required = true, nillable = true)
    protected Object value;
    @XmlElementRef(name = "ValueItems", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfIdName> valueItems;
    @XmlElementRef(name = "ValueType", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valueType;
    @XmlElement(name = "Visible")
    protected Boolean visible;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionEng property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptionEng() {
        return descriptionEng;
    }

    /**
     * Sets the value of the descriptionEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptionEng(JAXBElement<String> value) {
        this.descriptionEng = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorText(JAXBElement<String> value) {
        this.errorText = value;
    }

    /**
     * Gets the value of the extraValues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getExtraValues() {
        return extraValues;
    }

    /**
     * Sets the value of the extraValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setExtraValues(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.extraValues = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumFieldTypes }
     *     
     */
    public EnumFieldTypes getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumFieldTypes }
     *     
     */
    public void setFieldType(EnumFieldTypes value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the formatString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormatString() {
        return formatString;
    }

    /**
     * Sets the value of the formatString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormatString(JAXBElement<String> value) {
        this.formatString = value;
    }

    /**
     * Gets the value of the isManualEdited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManualEdited() {
        return isManualEdited;
    }

    /**
     * Sets the value of the isManualEdited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManualEdited(Boolean value) {
        this.isManualEdited = value;
    }

    /**
     * Gets the value of the isSearchable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSearchable() {
        return isSearchable;
    }

    /**
     * Sets the value of the isSearchable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSearchable(Boolean value) {
        this.isSearchable = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the quotation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuotation() {
        return quotation;
    }

    /**
     * Sets the value of the quotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuotation(Double value) {
        this.quotation = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setText(JAXBElement<String> value) {
        this.text = value;
    }

    /**
     * Gets the value of the textEng property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextEng() {
        return textEng;
    }

    /**
     * Sets the value of the textEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextEng(JAXBElement<String> value) {
        this.textEng = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIdName }{@code >}
     *     
     */
    public JAXBElement<ArrayOfIdName> getValueItems() {
        return valueItems;
    }

    /**
     * Sets the value of the valueItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIdName }{@code >}
     *     
     */
    public void setValueItems(JAXBElement<ArrayOfIdName> value) {
        this.valueItems = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValueType(JAXBElement<String> value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

}
