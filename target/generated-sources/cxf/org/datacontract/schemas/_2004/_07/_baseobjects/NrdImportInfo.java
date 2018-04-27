
package org.datacontract.schemas._2004._07._baseobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.egar_transactionservice_client.NrdImportState;


/**
 * <p>Java class for NrdImportInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NrdImportInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpDealId" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ExpDealIdIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExpLiabilityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExpLiabilityIdIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FocusTradeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FocusTradeId2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FocusTradeId2IsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FocusTradeIdIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMoneyLiability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMoneyLiabilityIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades}NrdImportState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NrdImportInfo", propOrder = {
    "expDealId",
    "expDealIdIsNull",
    "expLiabilityId",
    "expLiabilityIdIsNull",
    "focusTradeId",
    "focusTradeId2",
    "focusTradeId2IsNull",
    "focusTradeIdIsNull",
    "isMoneyLiability",
    "isMoneyLiabilityIsNull",
    "message",
    "messageIsNull",
    "regNo",
    "state"
})
public class NrdImportInfo {

    @XmlElementRef(name = "ExpDealId", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> expDealId;
    @XmlElement(name = "ExpDealIdIsNull")
    protected Boolean expDealIdIsNull;
    @XmlElementRef(name = "ExpLiabilityId", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> expLiabilityId;
    @XmlElement(name = "ExpLiabilityIdIsNull")
    protected Boolean expLiabilityIdIsNull;
    @XmlElementRef(name = "FocusTradeId", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> focusTradeId;
    @XmlElementRef(name = "FocusTradeId2", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> focusTradeId2;
    @XmlElement(name = "FocusTradeId2IsNull")
    protected Boolean focusTradeId2IsNull;
    @XmlElement(name = "FocusTradeIdIsNull")
    protected Boolean focusTradeIdIsNull;
    @XmlElementRef(name = "IsMoneyLiability", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isMoneyLiability;
    @XmlElement(name = "IsMoneyLiabilityIsNull")
    protected Boolean isMoneyLiabilityIsNull;
    @XmlElementRef(name = "Message", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElement(name = "MessageIsNull")
    protected Boolean messageIsNull;
    @XmlElementRef(name = "RegNo", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regNo;
    @XmlElement(name = "State")
    @XmlSchemaType(name = "string")
    protected NrdImportState state;

    /**
     * Gets the value of the expDealId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getExpDealId() {
        return expDealId;
    }

    /**
     * Sets the value of the expDealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setExpDealId(JAXBElement<Double> value) {
        this.expDealId = value;
    }

    /**
     * Gets the value of the expDealIdIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpDealIdIsNull() {
        return expDealIdIsNull;
    }

    /**
     * Sets the value of the expDealIdIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpDealIdIsNull(Boolean value) {
        this.expDealIdIsNull = value;
    }

    /**
     * Gets the value of the expLiabilityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExpLiabilityId() {
        return expLiabilityId;
    }

    /**
     * Sets the value of the expLiabilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExpLiabilityId(JAXBElement<Integer> value) {
        this.expLiabilityId = value;
    }

    /**
     * Gets the value of the expLiabilityIdIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpLiabilityIdIsNull() {
        return expLiabilityIdIsNull;
    }

    /**
     * Sets the value of the expLiabilityIdIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpLiabilityIdIsNull(Boolean value) {
        this.expLiabilityIdIsNull = value;
    }

    /**
     * Gets the value of the focusTradeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFocusTradeId() {
        return focusTradeId;
    }

    /**
     * Sets the value of the focusTradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFocusTradeId(JAXBElement<Integer> value) {
        this.focusTradeId = value;
    }

    /**
     * Gets the value of the focusTradeId2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFocusTradeId2() {
        return focusTradeId2;
    }

    /**
     * Sets the value of the focusTradeId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFocusTradeId2(JAXBElement<Integer> value) {
        this.focusTradeId2 = value;
    }

    /**
     * Gets the value of the focusTradeId2IsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFocusTradeId2IsNull() {
        return focusTradeId2IsNull;
    }

    /**
     * Sets the value of the focusTradeId2IsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFocusTradeId2IsNull(Boolean value) {
        this.focusTradeId2IsNull = value;
    }

    /**
     * Gets the value of the focusTradeIdIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFocusTradeIdIsNull() {
        return focusTradeIdIsNull;
    }

    /**
     * Sets the value of the focusTradeIdIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFocusTradeIdIsNull(Boolean value) {
        this.focusTradeIdIsNull = value;
    }

    /**
     * Gets the value of the isMoneyLiability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsMoneyLiability() {
        return isMoneyLiability;
    }

    /**
     * Sets the value of the isMoneyLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsMoneyLiability(JAXBElement<Boolean> value) {
        this.isMoneyLiability = value;
    }

    /**
     * Gets the value of the isMoneyLiabilityIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMoneyLiabilityIsNull() {
        return isMoneyLiabilityIsNull;
    }

    /**
     * Sets the value of the isMoneyLiabilityIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMoneyLiabilityIsNull(Boolean value) {
        this.isMoneyLiabilityIsNull = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Gets the value of the messageIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMessageIsNull() {
        return messageIsNull;
    }

    /**
     * Sets the value of the messageIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMessageIsNull(Boolean value) {
        this.messageIsNull = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link NrdImportState }
     *     
     */
    public NrdImportState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link NrdImportState }
     *     
     */
    public void setState(NrdImportState value) {
        this.state = value;
    }

}
