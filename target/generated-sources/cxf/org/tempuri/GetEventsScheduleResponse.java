
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.EventsScheduleProxy;


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
 *         &lt;element name="GetEventsScheduleResult" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}EventsScheduleProxy" minOccurs="0"/&gt;
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
    "getEventsScheduleResult"
})
@XmlRootElement(name = "GetEventsScheduleResponse")
public class GetEventsScheduleResponse {

    @XmlElementRef(name = "GetEventsScheduleResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<EventsScheduleProxy> getEventsScheduleResult;

    /**
     * Gets the value of the getEventsScheduleResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventsScheduleProxy }{@code >}
     *     
     */
    public JAXBElement<EventsScheduleProxy> getGetEventsScheduleResult() {
        return getEventsScheduleResult;
    }

    /**
     * Sets the value of the getEventsScheduleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventsScheduleProxy }{@code >}
     *     
     */
    public void setGetEventsScheduleResult(JAXBElement<EventsScheduleProxy> value) {
        this.getEventsScheduleResult = value;
    }

}
