
package org.datacontract.schemas._2004._07.egar_focus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;


/**
 * <p>Java class for InterActionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterActionParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionResults" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Interface}ArrayOfActionResult" minOccurs="0"/&gt;
 *         &lt;element name="formFields" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="formName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ignoreWarnings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="needToPrintTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterActionParams", propOrder = {
    "actionResults",
    "formFields",
    "formName",
    "ignoreWarnings",
    "needToPrintTicket"
})
@XmlSeeAlso({
    InterActionParamSchedule.class,
    InterActionLinkedTrade.class
})
public class InterActionParams {

    @XmlElementRef(name = "actionResults", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfActionResult> actionResults;
    @XmlElementRef(name = "formFields", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> formFields;
    @XmlElementRef(name = "formName", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formName;
    protected Boolean ignoreWarnings;
    protected Boolean needToPrintTicket;

    /**
     * Gets the value of the actionResults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActionResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfActionResult> getActionResults() {
        return actionResults;
    }

    /**
     * Sets the value of the actionResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActionResult }{@code >}
     *     
     */
    public void setActionResults(JAXBElement<ArrayOfActionResult> value) {
        this.actionResults = value;
    }

    /**
     * Gets the value of the formFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getFormFields() {
        return formFields;
    }

    /**
     * Sets the value of the formFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setFormFields(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.formFields = value;
    }

    /**
     * Gets the value of the formName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormName() {
        return formName;
    }

    /**
     * Sets the value of the formName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormName(JAXBElement<String> value) {
        this.formName = value;
    }

    /**
     * Gets the value of the ignoreWarnings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreWarnings() {
        return ignoreWarnings;
    }

    /**
     * Sets the value of the ignoreWarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreWarnings(Boolean value) {
        this.ignoreWarnings = value;
    }

    /**
     * Gets the value of the needToPrintTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedToPrintTicket() {
        return needToPrintTicket;
    }

    /**
     * Sets the value of the needToPrintTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedToPrintTicket(Boolean value) {
        this.needToPrintTicket = value;
    }

}
