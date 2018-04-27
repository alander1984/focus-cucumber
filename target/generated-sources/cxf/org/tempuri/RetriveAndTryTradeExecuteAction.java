
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="tradeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="stpAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionParam" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Interface}InterActionParams" minOccurs="0"/&gt;
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
    "tradeId",
    "stpAction",
    "actionParam"
})
@XmlRootElement(name = "RetriveAndTryTradeExecuteAction")
public class RetriveAndTryTradeExecuteAction {

    protected Integer tradeId;
    @XmlElementRef(name = "stpAction", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stpAction;
    @XmlElementRef(name = "actionParam", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<InterActionParams> actionParam;

    /**
     * Gets the value of the tradeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTradeId() {
        return tradeId;
    }

    /**
     * Sets the value of the tradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTradeId(Integer value) {
        this.tradeId = value;
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
     * Gets the value of the actionParam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}
     *     
     */
    public JAXBElement<InterActionParams> getActionParam() {
        return actionParam;
    }

    /**
     * Sets the value of the actionParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterActionParams }{@code >}
     *     
     */
    public void setActionParam(JAXBElement<InterActionParams> value) {
        this.actionParam = value;
    }

}
