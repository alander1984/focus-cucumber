
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
 *         &lt;element name="GetDealDetalizationResult" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}ServiceDetalizationResult" minOccurs="0"/&gt;
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
    "getDealDetalizationResult"
})
@XmlRootElement(name = "GetDealDetalizationResponse")
public class GetDealDetalizationResponse {

    @XmlElementRef(name = "GetDealDetalizationResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceDetalizationResult> getDealDetalizationResult;

    /**
     * Gets the value of the getDealDetalizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceDetalizationResult }{@code >}
     *     
     */
    public JAXBElement<ServiceDetalizationResult> getGetDealDetalizationResult() {
        return getDealDetalizationResult;
    }

    /**
     * Sets the value of the getDealDetalizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceDetalizationResult }{@code >}
     *     
     */
    public void setGetDealDetalizationResult(JAXBElement<ServiceDetalizationResult> value) {
        this.getDealDetalizationResult = value;
    }

}
