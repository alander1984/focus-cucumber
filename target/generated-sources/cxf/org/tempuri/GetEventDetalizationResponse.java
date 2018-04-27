
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule.ServiceDetalizationResult;


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
 *         &lt;element name="GetEventDetalizationResult" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}ServiceDetalizationResult" minOccurs="0"/&gt;
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
    "getEventDetalizationResult"
})
@XmlRootElement(name = "GetEventDetalizationResponse")
public class GetEventDetalizationResponse {

    @XmlElementRef(name = "GetEventDetalizationResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceDetalizationResult> getEventDetalizationResult;

    /**
     * Gets the value of the getEventDetalizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceDetalizationResult }{@code >}
     *     
     */
    public JAXBElement<ServiceDetalizationResult> getGetEventDetalizationResult() {
        return getEventDetalizationResult;
    }

    /**
     * Sets the value of the getEventDetalizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceDetalizationResult }{@code >}
     *     
     */
    public void setGetEventDetalizationResult(JAXBElement<ServiceDetalizationResult> value) {
        this.getEventDetalizationResult = value;
    }

}
