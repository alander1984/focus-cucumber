
package org.datacontract.schemas._2004._07.egar_focus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.EventsScheduleProxy;


/**
 * <p>Java class for InterActionParamSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterActionParamSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Egar.Focus.Interface}InterActionParams"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Schedule" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}EventsScheduleProxy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterActionParamSchedule", propOrder = {
    "schedule"
})
public class InterActionParamSchedule
    extends InterActionParams
{

    @XmlElementRef(name = "Schedule", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", type = JAXBElement.class, required = false)
    protected JAXBElement<EventsScheduleProxy> schedule;

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventsScheduleProxy }{@code >}
     *     
     */
    public JAXBElement<EventsScheduleProxy> getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventsScheduleProxy }{@code >}
     *     
     */
    public void setSchedule(JAXBElement<EventsScheduleProxy> value) {
        this.schedule = value;
    }

}
