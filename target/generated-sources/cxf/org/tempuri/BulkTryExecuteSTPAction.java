
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.egar_focus.InterActionParams;


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
 *         &lt;element name="trades" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="stpAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="execute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fromUser" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Interface}InterActionParams" minOccurs="0"/&gt;
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
    "trades",
    "stpAction",
    "execute",
    "fromUser"
})
@XmlRootElement(name = "BulkTryExecuteSTPAction")
public class BulkTryExecuteSTPAction {

    @XmlElementRef(name = "trades", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> trades;
    @XmlElementRef(name = "stpAction", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stpAction;
    protected Boolean execute;
    @XmlElementRef(name = "fromUser", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<InterActionParams> fromUser;

    /**
     * Gets the value of the trades property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getTrades() {
        return trades;
    }

    /**
     * Sets the value of the trades property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setTrades(JAXBElement<ArrayOfint> value) {
        this.trades = value;
    }

    /**
     * Gets the value of the stpAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStpAction() {
        return stpAction;
    }

    /**
     * Sets the value of the stpAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStpAction(JAXBElement<String> value) {
        this.stpAction = value;
    }

    /**
     * Gets the value of the execute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExecute() {
        return execute;
    }

    /**
     * Sets the value of the execute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExecute(Boolean value) {
        this.execute = value;
    }

    /**
     * Gets the value of the fromUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}
     *     
     */
    public JAXBElement<InterActionParams> getFromUser() {
        return fromUser;
    }

    /**
     * Sets the value of the fromUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}
     *     
     */
    public void setFromUser(JAXBElement<InterActionParams> value) {
        this.fromUser = value;
    }

}
