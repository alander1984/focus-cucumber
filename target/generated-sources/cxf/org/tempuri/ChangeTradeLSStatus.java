
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.egar_transactionservice_client.TradeLsStatus;


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
 *         &lt;element name="tradeIDs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="lsStatus" type="{http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades}trade_ls_status" minOccurs="0"/&gt;
 *         &lt;element name="traderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "tradeIDs",
    "lsStatus",
    "traderName"
})
@XmlRootElement(name = "ChangeTradeLSStatus")
public class ChangeTradeLSStatus {

    @XmlElementRef(name = "tradeIDs", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> tradeIDs;
    @XmlSchemaType(name = "string")
    protected TradeLsStatus lsStatus;
    @XmlElementRef(name = "traderName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> traderName;

    /**
     * Gets the value of the tradeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getTradeIDs() {
        return tradeIDs;
    }

    /**
     * Sets the value of the tradeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setTradeIDs(JAXBElement<ArrayOfint> value) {
        this.tradeIDs = value;
    }

    /**
     * Gets the value of the lsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TradeLsStatus }
     *     
     */
    public TradeLsStatus getLsStatus() {
        return lsStatus;
    }

    /**
     * Sets the value of the lsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeLsStatus }
     *     
     */
    public void setLsStatus(TradeLsStatus value) {
        this.lsStatus = value;
    }

    /**
     * Gets the value of the traderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTraderName() {
        return traderName;
    }

    /**
     * Sets the value of the traderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTraderName(JAXBElement<String> value) {
        this.traderName = value;
    }

}
