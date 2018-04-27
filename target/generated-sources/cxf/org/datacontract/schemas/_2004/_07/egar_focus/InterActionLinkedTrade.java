
package org.datacontract.schemas._2004._07.egar_focus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterActionLinkedTrade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterActionLinkedTrade"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Egar.Focus.Interface}InterActionParams"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkedTrade" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterActionLinkedTrade", propOrder = {
    "linkedTrade"
})
public class InterActionLinkedTrade
    extends InterActionParams
{

    @XmlElementRef(name = "LinkedTrade", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> linkedTrade;

    /**
     * Gets the value of the linkedTrade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getLinkedTrade() {
        return linkedTrade;
    }

    /**
     * Sets the value of the linkedTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setLinkedTrade(JAXBElement<Object> value) {
        this.linkedTrade = value;
    }

}
