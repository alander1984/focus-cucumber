
package org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.egar_focus.InterActionParams;
import org.datacontract.schemas._2004._07.egar_focus.OperationErrorCode;


/**
 * <p>Java class for ServiceOperationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceOperationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowMessageBox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="actionParams" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Interface}InterActionParams" minOccurs="0"/&gt;
 *         &lt;element name="result" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Interface}OperationErrorCode" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorDump" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOperationResult", propOrder = {
    "isCompleted",
    "showMessageBox",
    "actionParams",
    "result",
    "description",
    "errorDump",
    "sessionID",
    "userName"
})
@XmlSeeAlso({
    ServiceDealOperation.class,
    ServiceValueResult.class,
    ServiceDetalizationResult.class
})
public class ServiceOperationResult {

    @XmlElement(name = "IsCompleted")
    protected Boolean isCompleted;
    @XmlElement(name = "ShowMessageBox")
    protected Boolean showMessageBox;
    @XmlElementRef(name = "actionParams", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<InterActionParams> actionParams;
    @XmlSchemaType(name = "string")
    protected OperationErrorCode result;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "ErrorDump", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorDump;
    @XmlElementRef(name = "SessionID", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionID;
    @XmlElementRef(name = "UserName", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userName;

    /**
     * Gets the value of the isCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompleted() {
        return isCompleted;
    }

    /**
     * Sets the value of the isCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompleted(Boolean value) {
        this.isCompleted = value;
    }

    /**
     * Gets the value of the showMessageBox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMessageBox() {
        return showMessageBox;
    }

    /**
     * Sets the value of the showMessageBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMessageBox(Boolean value) {
        this.showMessageBox = value;
    }

    /**
     * Gets the value of the actionParams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}
     *     
     */
    public JAXBElement<InterActionParams> getActionParams() {
        return actionParams;
    }

    /**
     * Sets the value of the actionParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}
     *     
     */
    public void setActionParams(JAXBElement<InterActionParams> value) {
        this.actionParams = value;
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
     * Gets the value of the errorDump property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorDump() {
        return errorDump;
    }

    /**
     * Sets the value of the errorDump property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorDump(JAXBElement<String> value) {
        this.errorDump = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionID(JAXBElement<String> value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

}
