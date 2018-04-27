
package org.datacontract.schemas._2004._07._baseobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NrdTradeBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NrdTradeBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChannelIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Exp_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Exp_numIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Expdeal_id" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Expdeal_idIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Exrqntn_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Exrqntn_dtIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Liabilities" type="{http://schemas.datacontract.org/2004/07/_BaseObjects}ArrayOfNrdLiability" minOccurs="0"/&gt;
 *         &lt;element name="Portfolio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PortfolioIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProfitCenter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProfitCenterIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Reg_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Reg_dateIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Reg_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reg_noIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Termntn_dt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Termntn_dtIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TransactionState_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
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
@XmlType(name = "NrdTradeBase", propOrder = {
    "channel",
    "channelIsNull",
    "expNum",
    "expNumIsNull",
    "expdealId",
    "expdealIdIsNull",
    "exrqntnDt",
    "exrqntnDtIsNull",
    "liabilities",
    "portfolio",
    "portfolioIsNull",
    "profitCenter",
    "profitCenterIsNull",
    "regDate",
    "regDateIsNull",
    "regNo",
    "regNoIsNull",
    "termntnDt",
    "termntnDtIsNull",
    "transactionStateId",
    "transactionStateIdIsNull"
})
public class NrdTradeBase {

    @XmlElementRef(name = "Channel", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> channel;
    @XmlElement(name = "ChannelIsNull")
    protected Boolean channelIsNull;
    @XmlElementRef(name = "Exp_num", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expNum;
    @XmlElement(name = "Exp_numIsNull")
    protected Boolean expNumIsNull;
    @XmlElementRef(name = "Expdeal_id", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> expdealId;
    @XmlElement(name = "Expdeal_idIsNull")
    protected Boolean expdealIdIsNull;
    @XmlElementRef(name = "Exrqntn_dt", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> exrqntnDt;
    @XmlElement(name = "Exrqntn_dtIsNull")
    protected Boolean exrqntnDtIsNull;
    @XmlElementRef(name = "Liabilities", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNrdLiability> liabilities;
    @XmlElementRef(name = "Portfolio", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> portfolio;
    @XmlElement(name = "PortfolioIsNull")
    protected Boolean portfolioIsNull;
    @XmlElementRef(name = "ProfitCenter", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> profitCenter;
    @XmlElement(name = "ProfitCenterIsNull")
    protected Boolean profitCenterIsNull;
    @XmlElementRef(name = "Reg_date", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> regDate;
    @XmlElement(name = "Reg_dateIsNull")
    protected Boolean regDateIsNull;
    @XmlElementRef(name = "Reg_no", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regNo;
    @XmlElement(name = "Reg_noIsNull")
    protected Boolean regNoIsNull;
    @XmlElementRef(name = "Termntn_dt", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> termntnDt;
    @XmlElement(name = "Termntn_dtIsNull")
    protected Boolean termntnDtIsNull;
    @XmlElementRef(name = "TransactionState_id", namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> transactionStateId;
    @XmlElement(name = "TransactionState_idIsNull")
    protected Boolean transactionStateIdIsNull;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChannel(JAXBElement<Integer> value) {
        this.channel = value;
    }

    /**
     * Gets the value of the channelIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChannelIsNull() {
        return channelIsNull;
    }

    /**
     * Sets the value of the channelIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChannelIsNull(Boolean value) {
        this.channelIsNull = value;
    }

    /**
     * Gets the value of the expNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpNum() {
        return expNum;
    }

    /**
     * Sets the value of the expNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpNum(JAXBElement<String> value) {
        this.expNum = value;
    }

    /**
     * Gets the value of the expNumIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpNumIsNull() {
        return expNumIsNull;
    }

    /**
     * Sets the value of the expNumIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpNumIsNull(Boolean value) {
        this.expNumIsNull = value;
    }

    /**
     * Gets the value of the expdealId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getExpdealId() {
        return expdealId;
    }

    /**
     * Sets the value of the expdealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setExpdealId(JAXBElement<Double> value) {
        this.expdealId = value;
    }

    /**
     * Gets the value of the expdealIdIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpdealIdIsNull() {
        return expdealIdIsNull;
    }

    /**
     * Sets the value of the expdealIdIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpdealIdIsNull(Boolean value) {
        this.expdealIdIsNull = value;
    }

    /**
     * Gets the value of the exrqntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExrqntnDt() {
        return exrqntnDt;
    }

    /**
     * Sets the value of the exrqntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExrqntnDt(JAXBElement<XMLGregorianCalendar> value) {
        this.exrqntnDt = value;
    }

    /**
     * Gets the value of the exrqntnDtIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExrqntnDtIsNull() {
        return exrqntnDtIsNull;
    }

    /**
     * Sets the value of the exrqntnDtIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExrqntnDtIsNull(Boolean value) {
        this.exrqntnDtIsNull = value;
    }

    /**
     * Gets the value of the liabilities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNrdLiability }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNrdLiability> getLiabilities() {
        return liabilities;
    }

    /**
     * Sets the value of the liabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNrdLiability }{@code >}
     *     
     */
    public void setLiabilities(JAXBElement<ArrayOfNrdLiability> value) {
        this.liabilities = value;
    }

    /**
     * Gets the value of the portfolio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPortfolio() {
        return portfolio;
    }

    /**
     * Sets the value of the portfolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPortfolio(JAXBElement<Integer> value) {
        this.portfolio = value;
    }

    /**
     * Gets the value of the portfolioIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPortfolioIsNull() {
        return portfolioIsNull;
    }

    /**
     * Sets the value of the portfolioIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPortfolioIsNull(Boolean value) {
        this.portfolioIsNull = value;
    }

    /**
     * Gets the value of the profitCenter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getProfitCenter() {
        return profitCenter;
    }

    /**
     * Sets the value of the profitCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setProfitCenter(JAXBElement<Integer> value) {
        this.profitCenter = value;
    }

    /**
     * Gets the value of the profitCenterIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProfitCenterIsNull() {
        return profitCenterIsNull;
    }

    /**
     * Sets the value of the profitCenterIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProfitCenterIsNull(Boolean value) {
        this.profitCenterIsNull = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRegDate(JAXBElement<XMLGregorianCalendar> value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the regDateIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegDateIsNull() {
        return regDateIsNull;
    }

    /**
     * Sets the value of the regDateIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegDateIsNull(Boolean value) {
        this.regDateIsNull = value;
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
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTermntnDt(JAXBElement<XMLGregorianCalendar> value) {
        this.termntnDt = value;
    }

    /**
     * Gets the value of the termntnDtIsNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTermntnDtIsNull() {
        return termntnDtIsNull;
    }

    /**
     * Sets the value of the termntnDtIsNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTermntnDtIsNull(Boolean value) {
        this.termntnDtIsNull = value;
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

}
