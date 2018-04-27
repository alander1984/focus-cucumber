
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.egar_transactionservice_client.BoStatus;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="boStatus" type="{http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades}bo_status" minOccurs="0"/&gt;
 *         &lt;element name="SmartId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgreementNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommissionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrokerPactNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateFactPay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateFactDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tradeID",
    "boStatus",
    "smartId",
    "agreementNum",
    "commissionNum",
    "brokerPactNum",
    "dateFactPay",
    "currId",
    "dateFactDelivery"
})
@XmlRootElement(name = "ChangeTradeBOStatus")
public class ChangeTradeBOStatus {

    protected Integer tradeID;
    @XmlSchemaType(name = "string")
    protected BoStatus boStatus;
    @XmlElementRef(name = "SmartId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smartId;
    @XmlElementRef(name = "AgreementNum", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agreementNum;
    @XmlElementRef(name = "CommissionNum", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commissionNum;
    @XmlElementRef(name = "BrokerPactNum", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brokerPactNum;
    @XmlElementRef(name = "DateFactPay", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateFactPay;
    @XmlElement(name = "CurrId")
    protected Integer currId;
    @XmlElementRef(name = "DateFactDelivery", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateFactDelivery;

    /**
     * Gets the value of the tradeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTradeID() {
        return tradeID;
    }

    /**
     * Sets the value of the tradeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTradeID(Integer value) {
        this.tradeID = value;
    }

    /**
     * Gets the value of the boStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BoStatus }
     *     
     */
    public BoStatus getBoStatus() {
        return boStatus;
    }

    /**
     * Sets the value of the boStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoStatus }
     *     
     */
    public void setBoStatus(BoStatus value) {
        this.boStatus = value;
    }

    /**
     * Gets the value of the smartId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmartId() {
        return smartId;
    }

    /**
     * Sets the value of the smartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmartId(JAXBElement<String> value) {
        this.smartId = value;
    }

    /**
     * Gets the value of the agreementNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgreementNum() {
        return agreementNum;
    }

    /**
     * Sets the value of the agreementNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgreementNum(JAXBElement<String> value) {
        this.agreementNum = value;
    }

    /**
     * Gets the value of the commissionNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommissionNum() {
        return commissionNum;
    }

    /**
     * Sets the value of the commissionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommissionNum(JAXBElement<String> value) {
        this.commissionNum = value;
    }

    /**
     * Gets the value of the brokerPactNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrokerPactNum() {
        return brokerPactNum;
    }

    /**
     * Sets the value of the brokerPactNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrokerPactNum(JAXBElement<String> value) {
        this.brokerPactNum = value;
    }

    /**
     * Gets the value of the dateFactPay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateFactPay() {
        return dateFactPay;
    }

    /**
     * Sets the value of the dateFactPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateFactPay(JAXBElement<String> value) {
        this.dateFactPay = value;
    }

    /**
     * Gets the value of the currId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrId() {
        return currId;
    }

    /**
     * Sets the value of the currId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrId(Integer value) {
        this.currId = value;
    }

    /**
     * Gets the value of the dateFactDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateFactDelivery() {
        return dateFactDelivery;
    }

    /**
     * Sets the value of the dateFactDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateFactDelivery(JAXBElement<String> value) {
        this.dateFactDelivery = value;
    }

}
