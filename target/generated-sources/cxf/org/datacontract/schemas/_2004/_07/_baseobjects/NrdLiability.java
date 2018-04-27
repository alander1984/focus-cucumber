
package org.datacontract.schemas._2004._07._baseobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NrdLiability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NrdLiability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Backet_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Backet_cIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Exp_id" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Exp_idIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="F_money" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="F_moneyIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NrdCashLiability" type="{http://schemas.datacontract.org/2004/07/_BaseObjects}NrdCashLiability" minOccurs="0"/&gt;
 *         &lt;element name="NrdSecLiabilities" type="{http://schemas.datacontract.org/2004/07/_BaseObjects}ArrayOfNrdSecLiability" minOccurs="0"/&gt;
 *         &lt;element name="Reg_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reg_noIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransactionState_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="TransactionState_idIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="accounting_basket" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="accounting_basketIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NrdLiability", propOrder = {
    "backetC",
    "backetCIsNull",
    "expId",
    "expIdIsNull",
    "fMoney",
    "fMoneyIsNull",
    "nrdCashLiability",
    "nrdSecLiabilities",
    "regNo",
    "regNoIsNull",
    "transactionStateId",
    "transactionStateIdIsNull",
    "accountingBasket",
    "accountingBasketIsNull"
})
public class NrdLiability {

    @XmlElementRef(name = "Backet_c", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backetC;
    @XmlElement(name = "Backet_cIsNull")
    protected Boolean backetCIsNull;
    @XmlElementRef(name = "Exp_id", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> expId;
    @XmlElement(name = "Exp_idIsNull")
    protected Boolean expIdIsNull;
    @XmlElementRef(name = "F_money", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> fMoney;
    @XmlElement(name = "F_moneyIsNull")
    protected Boolean fMoneyIsNull;
    @XmlElementRef(name = "NrdCashLiability", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<NrdCashLiability> nrdCashLiability;
    @XmlElementRef(name = "NrdSecLiabilities", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNrdSecLiability> nrdSecLiabilities;
    @XmlElementRef(name = "Reg_no", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regNo;
    @XmlElement(name = "Reg_noIsNull")
    protected Boolean regNoIsNull;
    @XmlElementRef(name = "TransactionState_id", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> transactionStateId;
    @XmlElement(name = "TransactionState_idIsNull")
    protected Boolean transactionStateIdIsNull;
    @XmlElementRef(name = "accounting_basket", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> accountingBasket;
    @XmlElement(name = "accounting_basketIsNull")
    protected Boolean accountingBasketIsNull;

    /**
     * Gets the value of the backetC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBacketC() {
        return backetC;
    }

    /**
     * Sets the value of the backetC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBacketC(JAXBElement<String> value) {
        this.backetC = value;
    }

    /**
     * Gets the value of the backetCIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBacketCIsNull() {
        return backetCIsNull;
    }

    /**
     * Sets the value of the backetCIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBacketCIsNull(Boolean value) {
        this.backetCIsNull = value;
    }

    /**
     * Gets the value of the expId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getExpId() {
        return expId;
    }

    /**
     * Sets the value of the expId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setExpId(JAXBElement<Double> value) {
        this.expId = value;
    }

    /**
     * Gets the value of the expIdIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpIdIsNull() {
        return expIdIsNull;
    }

    /**
     * Sets the value of the expIdIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpIdIsNull(Boolean value) {
        this.expIdIsNull = value;
    }

    /**
     * Gets the value of the fMoney property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFMoney() {
        return fMoney;
    }

    /**
     * Sets the value of the fMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFMoney(JAXBElement<Short> value) {
        this.fMoney = value;
    }

    /**
     * Gets the value of the fMoneyIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFMoneyIsNull() {
        return fMoneyIsNull;
    }

    /**
     * Sets the value of the fMoneyIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFMoneyIsNull(Boolean value) {
        this.fMoneyIsNull = value;
    }

    /**
     * Gets the value of the nrdCashLiability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NrdCashLiability }{@code >}
     *     
     */
    public JAXBElement<NrdCashLiability> getNrdCashLiability() {
        return nrdCashLiability;
    }

    /**
     * Sets the value of the nrdCashLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NrdCashLiability }{@code >}
     *     
     */
    public void setNrdCashLiability(JAXBElement<NrdCashLiability> value) {
        this.nrdCashLiability = value;
    }

    /**
     * Gets the value of the nrdSecLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNrdSecLiability }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNrdSecLiability> getNrdSecLiabilities() {
        return nrdSecLiabilities;
    }

    /**
     * Sets the value of the nrdSecLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNrdSecLiability }{@code >}
     *     
     */
    public void setNrdSecLiabilities(JAXBElement<ArrayOfNrdSecLiability> value) {
        this.nrdSecLiabilities = value;
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
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTransactionStateId() {
        return transactionStateId;
    }

    /**
     * Sets the value of the transactionStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTransactionStateId(JAXBElement<Short> value) {
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

    /**
     * Gets the value of the accountingBasket property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAccountingBasket() {
        return accountingBasket;
    }

    /**
     * Sets the value of the accountingBasket property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAccountingBasket(JAXBElement<Short> value) {
        this.accountingBasket = value;
    }

    /**
     * Gets the value of the accountingBasketIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountingBasketIsNull() {
        return accountingBasketIsNull;
    }

    /**
     * Sets the value of the accountingBasketIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountingBasketIsNull(Boolean value) {
        this.accountingBasketIsNull = value;
    }

}
