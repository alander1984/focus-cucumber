
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.egar_transactionservice_client.TradeType;


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
 *         &lt;element name="dealType" type="{http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades}deal_type" minOccurs="0"/&gt;
 *         &lt;element name="instrType" type="{http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades}instr_type" minOccurs="0"/&gt;
 *         &lt;element name="tradeType" type="{http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades}trade_type" minOccurs="0"/&gt;
 *         &lt;element name="fieldsFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "dealType",
    "instrType",
    "tradeType",
    "fieldsFilter"
})
@XmlRootElement(name = "CreateNewDeal")
public class CreateNewDeal {

    protected String dealType;
    protected String instrType;
    @XmlSchemaType(name = "string")
    protected TradeType tradeType;
    @XmlElementRef(name = "fieldsFilter", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fieldsFilter;

    /**
     * Gets the value of the dealType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealType() {
        return dealType;
    }

    /**
     * Sets the value of the dealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealType(String value) {
        this.dealType = value;
    }

    /**
     * Gets the value of the instrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrType() {
        return instrType;
    }

    /**
     * Sets the value of the instrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrType(String value) {
        this.instrType = value;
    }

    /**
     * Gets the value of the tradeType property.
     * 
     * @return
     *     possible object is
     *     {@link TradeType }
     *     
     */
    public TradeType getTradeType() {
        return tradeType;
    }

    /**
     * Sets the value of the tradeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeType }
     *     
     */
    public void setTradeType(TradeType value) {
        this.tradeType = value;
    }

    /**
     * Gets the value of the fieldsFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldsFilter() {
        return fieldsFilter;
    }

    /**
     * Sets the value of the fieldsFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldsFilter(JAXBElement<String> value) {
        this.fieldsFilter = value;
    }

}
