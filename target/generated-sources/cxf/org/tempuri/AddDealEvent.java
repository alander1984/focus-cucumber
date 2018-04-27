
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.ArrayOfAddDealEventContract;


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
 *         &lt;element name="trade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="events" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}ArrayOfAddDealEventContract" minOccurs="0"/&gt;
 *         &lt;element name="afterAddAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trader" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "trade",
    "events",
    "afterAddAction",
    "trader"
})
@XmlRootElement(name = "AddDealEvent")
public class AddDealEvent {

    protected Integer trade;
    @XmlElementRef(name = "events", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddDealEventContract> events;
    @XmlElementRef(name = "afterAddAction", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> afterAddAction;
    @XmlElementRef(name = "trader", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> trader;

    /**
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrade(Integer value) {
        this.trade = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddDealEventContract }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddDealEventContract> getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddDealEventContract }{@code >}
     *     
     */
    public void setEvents(JAXBElement<ArrayOfAddDealEventContract> value) {
        this.events = value;
    }

    /**
     * Gets the value of the afterAddAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAfterAddAction() {
        return afterAddAction;
    }

    /**
     * Sets the value of the afterAddAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAfterAddAction(JAXBElement<String> value) {
        this.afterAddAction = value;
    }

    /**
     * Gets the value of the trader property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTrader() {
        return trader;
    }

    /**
     * Sets the value of the trader property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTrader(JAXBElement<Integer> value) {
        this.trader = value;
    }

}
