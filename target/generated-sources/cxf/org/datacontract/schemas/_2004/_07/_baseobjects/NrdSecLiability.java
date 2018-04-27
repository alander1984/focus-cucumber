
package org.datacontract.schemas._2004._07._baseobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NrdSecLiability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NrdSecLiability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Basis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BasisIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Focus_tradeID1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Focus_tradeID1IsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Focus_tradeID2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Focus_tradeID2IsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Link_exp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Link_expIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Reg_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reg_noIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sec_isin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sec_isinIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="i_type" type="{http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades}instr_type" minOccurs="0"/&gt;
 *         &lt;element name="i_typeIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="instrument" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="instrumentIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="payment_ccy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="payment_ccyIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="qtyIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="standard_settlement_date" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="standard_settlement_dateIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NrdSecLiability", propOrder = {
    "basis",
    "basisIsNull",
    "focusTradeID1",
    "focusTradeID1IsNull",
    "focusTradeID2",
    "focusTradeID2IsNull",
    "id",
    "linkExp",
    "linkExpIsNull",
    "regNo",
    "regNoIsNull",
    "secIsin",
    "secIsinIsNull",
    "iType",
    "iTypeIsNull",
    "instrument",
    "instrumentIsNull",
    "paymentCcy",
    "paymentCcyIsNull",
    "qty",
    "qtyIsNull",
    "standardSettlementDate",
    "standardSettlementDateIsNull"
})
public class NrdSecLiability {

    @XmlElementRef(name = "Basis", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> basis;
    @XmlElement(name = "BasisIsNull")
    protected Boolean basisIsNull;
    @XmlElementRef(name = "Focus_tradeID1", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> focusTradeID1;
    @XmlElement(name = "Focus_tradeID1IsNull")
    protected Boolean focusTradeID1IsNull;
    @XmlElementRef(name = "Focus_tradeID2", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> focusTradeID2;
    @XmlElement(name = "Focus_tradeID2IsNull")
    protected Boolean focusTradeID2IsNull;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "Link_exp", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> linkExp;
    @XmlElement(name = "Link_expIsNull")
    protected Boolean linkExpIsNull;
    @XmlElementRef(name = "Reg_no", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regNo;
    @XmlElement(name = "Reg_noIsNull")
    protected Boolean regNoIsNull;
    @XmlElementRef(name = "Sec_isin", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secIsin;
    @XmlElement(name = "Sec_isinIsNull")
    protected Boolean secIsinIsNull;
    @XmlElementRef(name = "i_type", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iType;
    @XmlElement(name = "i_typeIsNull")
    protected Boolean iTypeIsNull;
    @XmlElementRef(name = "instrument", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> instrument;
    protected Boolean instrumentIsNull;
    @XmlElementRef(name = "payment_ccy", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> paymentCcy;
    @XmlElement(name = "payment_ccyIsNull")
    protected Boolean paymentCcyIsNull;
    @XmlElementRef(name = "qty", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qty;
    protected Boolean qtyIsNull;
    @XmlElementRef(name = "standard_settlement_date", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> standardSettlementDate;
    @XmlElement(name = "standard_settlement_dateIsNull")
    protected Boolean standardSettlementDateIsNull;

    /**
     * Gets the value of the basis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBasis() {
        return basis;
    }

    /**
     * Sets the value of the basis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBasis(JAXBElement<Integer> value) {
        this.basis = value;
    }

    /**
     * Gets the value of the basisIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasisIsNull() {
        return basisIsNull;
    }

    /**
     * Sets the value of the basisIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasisIsNull(Boolean value) {
        this.basisIsNull = value;
    }

    /**
     * Gets the value of the focusTradeID1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFocusTradeID1() {
        return focusTradeID1;
    }

    /**
     * Sets the value of the focusTradeID1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFocusTradeID1(JAXBElement<Integer> value) {
        this.focusTradeID1 = value;
    }

    /**
     * Gets the value of the focusTradeID1IsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFocusTradeID1IsNull() {
        return focusTradeID1IsNull;
    }

    /**
     * Sets the value of the focusTradeID1IsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFocusTradeID1IsNull(Boolean value) {
        this.focusTradeID1IsNull = value;
    }

    /**
     * Gets the value of the focusTradeID2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFocusTradeID2() {
        return focusTradeID2;
    }

    /**
     * Sets the value of the focusTradeID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFocusTradeID2(JAXBElement<Integer> value) {
        this.focusTradeID2 = value;
    }

    /**
     * Gets the value of the focusTradeID2IsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFocusTradeID2IsNull() {
        return focusTradeID2IsNull;
    }

    /**
     * Sets the value of the focusTradeID2IsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFocusTradeID2IsNull(Boolean value) {
        this.focusTradeID2IsNull = value;
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
     * Gets the value of the linkExp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLinkExp() {
        return linkExp;
    }

    /**
     * Sets the value of the linkExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLinkExp(JAXBElement<Double> value) {
        this.linkExp = value;
    }

    /**
     * Gets the value of the linkExpIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinkExpIsNull() {
        return linkExpIsNull;
    }

    /**
     * Sets the value of the linkExpIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkExpIsNull(Boolean value) {
        this.linkExpIsNull = value;
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
     * Gets the value of the secIsin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecIsin() {
        return secIsin;
    }

    /**
     * Sets the value of the secIsin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecIsin(JAXBElement<String> value) {
        this.secIsin = value;
    }

    /**
     * Gets the value of the secIsinIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecIsinIsNull() {
        return secIsinIsNull;
    }

    /**
     * Sets the value of the secIsinIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecIsinIsNull(Boolean value) {
        this.secIsinIsNull = value;
    }

    /**
     * Gets the value of the iType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIType() {
        return iType;
    }

    /**
     * Sets the value of the iType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIType(JAXBElement<String> value) {
        this.iType = value;
    }

    /**
     * Gets the value of the iTypeIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isITypeIsNull() {
        return iTypeIsNull;
    }

    /**
     * Sets the value of the iTypeIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setITypeIsNull(Boolean value) {
        this.iTypeIsNull = value;
    }

    /**
     * Gets the value of the instrument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInstrument() {
        return instrument;
    }

    /**
     * Sets the value of the instrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInstrument(JAXBElement<Integer> value) {
        this.instrument = value;
    }

    /**
     * Gets the value of the instrumentIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstrumentIsNull() {
        return instrumentIsNull;
    }

    /**
     * Sets the value of the instrumentIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstrumentIsNull(Boolean value) {
        this.instrumentIsNull = value;
    }

    /**
     * Gets the value of the paymentCcy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPaymentCcy() {
        return paymentCcy;
    }

    /**
     * Sets the value of the paymentCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPaymentCcy(JAXBElement<Integer> value) {
        this.paymentCcy = value;
    }

    /**
     * Gets the value of the paymentCcyIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentCcyIsNull() {
        return paymentCcyIsNull;
    }

    /**
     * Sets the value of the paymentCcyIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentCcyIsNull(Boolean value) {
        this.paymentCcyIsNull = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQty(JAXBElement<Double> value) {
        this.qty = value;
    }

    /**
     * Gets the value of the qtyIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQtyIsNull() {
        return qtyIsNull;
    }

    /**
     * Sets the value of the qtyIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQtyIsNull(Boolean value) {
        this.qtyIsNull = value;
    }

    /**
     * Gets the value of the standardSettlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStandardSettlementDate() {
        return standardSettlementDate;
    }

    /**
     * Sets the value of the standardSettlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStandardSettlementDate(JAXBElement<Integer> value) {
        this.standardSettlementDate = value;
    }

    /**
     * Gets the value of the standardSettlementDateIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandardSettlementDateIsNull() {
        return standardSettlementDateIsNull;
    }

    /**
     * Sets the value of the standardSettlementDateIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandardSettlementDateIsNull(Boolean value) {
        this.standardSettlementDateIsNull = value;
    }

}
