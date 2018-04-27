
package org.datacontract.schemas._2004._07.egar_focus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for ActionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShowMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="possibleAnswers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="result" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Interface}OperationErrorCode" minOccurs="0"/&gt;
 *         &lt;element name="userAnswer" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionResult", propOrder = {
    "customFormName",
    "description",
    "fieldName",
    "showMessage",
    "caption",
    "defaultAnswer",
    "possibleAnswers",
    "result",
    "userAnswer"
})
public class ActionResult {

    @XmlElementRef(name = "CustomFormName", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customFormName;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "FieldName", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldName;
    @XmlElement(name = "ShowMessage")
    protected Boolean showMessage;
    @XmlElementRef(name = "caption", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caption;
    @XmlElementRef(name = "defaultAnswer", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultAnswer;
    @XmlElementRef(name = "possibleAnswers", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> possibleAnswers;
    @XmlSchemaType(name = "string")
    protected OperationErrorCode result;
    @XmlElementRef(name = "userAnswer", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> userAnswer;

    /**
     * Gets the value of the customFormName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomFormName() {
        return customFormName;
    }

    /**
     * Sets the value of the customFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomFormName(JAXBElement<String> value) {
        this.customFormName = value;
    }

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
     * Gets the value of the showMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMessage() {
        return showMessage;
    }

    /**
     * Sets the value of the showMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMessage(Boolean value) {
        this.showMessage = value;
    }

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
     * Gets the value of the defaultAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultAnswer() {
        return defaultAnswer;
    }

    /**
     * Sets the value of the defaultAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultAnswer(JAXBElement<String> value) {
        this.defaultAnswer = value;
    }

    /**
     * Gets the value of the possibleAnswers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getPossibleAnswers() {
        return possibleAnswers;
    }

    /**
     * Sets the value of the possibleAnswers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setPossibleAnswers(JAXBElement<ArrayOfstring> value) {
        this.possibleAnswers = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link OperationErrorCode }
     *     
     */
    public OperationErrorCode getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationErrorCode }
     *     
     */
    public void setResult(OperationErrorCode value) {
        this.result = value;
    }

    /**
     * Gets the value of the userAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getUserAnswer() {
        return userAnswer;
    }

    /**
     * Sets the value of the userAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setUserAnswer(JAXBElement<ArrayOfstring> value) {
        this.userAnswer = value;
    }

}
