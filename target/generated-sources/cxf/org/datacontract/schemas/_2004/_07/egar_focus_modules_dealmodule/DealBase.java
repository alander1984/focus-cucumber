
package org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfstringstring;


/**
 * <p>Java class for DealBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DealGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EvaluateMessages" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/&gt;
 *         &lt;element name="Fields" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}ArrayOfDealField" minOccurs="0"/&gt;
 *         &lt;element name="IsManualEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NeedRefreshFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StpActionsEnabled" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="TemplateId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dynamicParams" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfanyTypeanyType" minOccurs="0"/&gt;
 *         &lt;element name="nEvents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealBase", propOrder = {
    "caption",
    "dealGuid",
    "evaluateMessages",
    "fields",
    "isManualEdit",
    "needRefreshFields",
    "stpActionsEnabled",
    "templateId",
    "dynamicParams",
    "nEvents"
})
public class DealBase {

    @XmlElementRef(name = "Caption", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caption;
    @XmlElementRef(name = "DealGuid", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dealGuid;
    @XmlElementRef(name = "EvaluateMessages", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePairOfstringstring> evaluateMessages;
    @XmlElementRef(name = "Fields", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDealField> fields;
    @XmlElement(name = "IsManualEdit")
    protected Boolean isManualEdit;
    @XmlElement(name = "NeedRefreshFields")
    protected Boolean needRefreshFields;
    @XmlElementRef(name = "StpActionsEnabled", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> stpActionsEnabled;
    @XmlElement(name = "TemplateId")
    protected Integer templateId;
    @XmlElementRef(name = "dynamicParams", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfanyTypeanyType> dynamicParams;
    @XmlElementRef(name = "nEvents", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nEvents;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaption(JAXBElement<String> value) {
        this.caption = value;
    }

    /**
     * Gets the value of the dealGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDealGuid() {
        return dealGuid;
    }

    /**
     * Sets the value of the dealGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDealGuid(JAXBElement<String> value) {
        this.dealGuid = value;
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
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDealField }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDealField> getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDealField }{@code >}
     *     
     */
    public void setFields(JAXBElement<ArrayOfDealField> value) {
        this.fields = value;
    }

    /**
     * Gets the value of the isManualEdit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManualEdit() {
        return isManualEdit;
    }

    /**
     * Sets the value of the isManualEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManualEdit(Boolean value) {
        this.isManualEdit = value;
    }

    /**
     * Gets the value of the needRefreshFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedRefreshFields() {
        return needRefreshFields;
    }

    /**
     * Sets the value of the needRefreshFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedRefreshFields(Boolean value) {
        this.needRefreshFields = value;
    }

    /**
     * Gets the value of the stpActionsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getStpActionsEnabled() {
        return stpActionsEnabled;
    }

    /**
     * Sets the value of the stpActionsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setStpActionsEnabled(JAXBElement<ArrayOfstring> value) {
        this.stpActionsEnabled = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemplateId(Integer value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the dynamicParams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfanyTypeanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfanyTypeanyType> getDynamicParams() {
        return dynamicParams;
    }

    /**
     * Sets the value of the dynamicParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfanyTypeanyType }{@code >}
     *     
     */
    public void setDynamicParams(JAXBElement<ArrayOfKeyValueOfanyTypeanyType> value) {
        this.dynamicParams = value;
    }

    /**
     * Gets the value of the nEvents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNEvents() {
        return nEvents;
    }

    /**
     * Sets the value of the nEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNEvents(JAXBElement<Integer> value) {
        this.nEvents = value;
    }

}
