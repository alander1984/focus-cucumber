
package org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceDealOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDealOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}ServiceOperationResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Event" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}DealEventProxy" minOccurs="0"/&gt;
 *         &lt;element name="Deal" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}DealBase" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDealOperation", propOrder = {
    "event",
    "deal"
})
public class ServiceDealOperation
    extends ServiceOperationResult
{

    @XmlElementRef(name = "Event", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<DealEventProxy> event;
    @XmlElementRef(name = "Deal", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration", type = JAXBElement.class, required = false)
    protected JAXBElement<DealBase> deal;

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DealEventProxy }{@code >}
     *     
     */
    public JAXBElement<DealEventProxy> getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DealEventProxy }{@code >}
     *     
     */
    public void setEvent(JAXBElement<DealEventProxy> value) {
        this.event = value;
    }

    /**
     * Gets the value of the deal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DealBase }{@code >}
     *     
     */
    public JAXBElement<DealBase> getDeal() {
        return deal;
    }

    /**
     * Sets the value of the deal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DealBase }{@code >}
     *     
     */
    public void setDeal(JAXBElement<DealBase> value) {
        this.deal = value;
    }

}
