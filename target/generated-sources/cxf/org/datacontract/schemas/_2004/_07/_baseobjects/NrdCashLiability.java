
package org.datacontract.schemas._2004._07._baseobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NrdCashLiability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NrdCashLiability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cash_open" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cash_openIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessageIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Focus_tradeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Focus_tradeIDIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Interest" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="InterestIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Reg_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reg_noIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransactionState_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TransactionState_idIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NrdCashLiability", propOrder = {
    "cashOpen",
    "cashOpenIsNull",
    "errorMessage",
    "errorMessageIsNull",
    "focusTradeID",
    "focusTradeIDIsNull",
    "id",
    "interest",
    "interestIsNull",
    "regNo",
    "regNoIsNull",
    "transactionStateId",
    "transactionStateIdIsNull"
})
public class NrdCashLiability {

    @XmlElementRef(name = "Cash_open", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cashOpen;
    @XmlElement(name = "Cash_openIsNull")
    protected Boolean cashOpenIsNull;
    @XmlElementRef(name = "ErrorMessage", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMessage;
    @XmlElement(name = "ErrorMessageIsNull")
    protected Boolean errorMessageIsNull;
    @XmlElementRef(name = "Focus_tradeID", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> focusTradeID;
    @XmlElement(name = "Focus_tradeIDIsNull")
    protected Boolean focusTradeIDIsNull;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "Interest", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> interest;
    @XmlElement(name = "InterestIsNull")
    protected Boolean interestIsNull;
    @XmlElementRef(name = "Reg_no", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regNo;
    @XmlElement(name = "Reg_noIsNull")
    protected Boolean regNoIsNull;
    @XmlElementRef(name = "TransactionState_id", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> transactionStateId;
    @XmlElement(name = "TransactionState_idIsNull")
    protected Boolean transactionStateIdIsNull;

    /**
     * Gets the value of the cashOpen property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCashOpen() {
        return cashOpen;
    }

    /**
     * Sets the value of the cashOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCashOpen(JAXBElement<Double> value) {
        this.cashOpen = value;
    }

    /**
     * Gets the value of the cashOpenIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCashOpenIsNull() {
        return cashOpenIsNull;
    }

    /**
     * Sets the value of the cashOpenIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCashOpenIsNull(Boolean value) {
        this.cashOpenIsNull = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorMessageIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrorMessageIsNull() {
        return errorMessageIsNull;
    }

    /**
     * Sets the value of the errorMessageIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorMessageIsNull(Boolean value) {
        this.errorMessageIsNull = value;
    }

    /**
     * Gets the value of the focusTradeID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFocusTradeID() {
        return focusTradeID;
    }

    /**
     * Sets the value of the focusTradeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFocusTradeID(JAXBElement<Integer> value) {
        this.focusTradeID = value;
    }

    /**
     * Gets the value of the focusTradeIDIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFocusTradeIDIsNull() {
        return focusTradeIDIsNull;
    }

    /**
     * Sets the value of the focusTradeIDIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFocusTradeIDIsNull(Boolean value) {
        this.focusTradeIDIsNull = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getInterest() {
        return interest;
    }

    /**
     * Sets the value of the interest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setInterest(JAXBElement<Double> value) {
        this.interest = value;
    }

    /**
     * Gets the value of the interestIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestIsNull() {
        return interestIsNull;
    }

    /**
     * Sets the value of the interestIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterestIsNull(Boolean value) {
        this.interestIsNull = value;
    }

    /**
     * Gets the value of the regNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegNo() {
        return regNo;
    }

    /**
     * Sets the value of the regNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegNo(JAXBElement<String> value) {
        this.regNo = value;
    }

    /**
     * Gets the value of the regNoIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegNoIsNull() {
        return regNoIsNull;
    }

    /**
     * Sets the value of the regNoIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegNoIsNull(Boolean value) {
        this.regNoIsNull = value;
    }

    /**
     * Gets the value of the transactionStateId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTransactionStateId() {
        return transactionStateId;
    }

    /**
     * Sets the value of the transactionStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTransactionStateId(JAXBElement<Integer> value) {
        this.transactionStateId = value;
    }

    /**
     * Gets the value of the transactionStateIdIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransactionStateIdIsNull() {
        return transactionStateIdIsNull;
    }

    /**
     * Sets the value of the transactionStateIdIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransactionStateIdIsNull(Boolean value) {
        this.transactionStateIdIsNull = value;
    }

}
