
package org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDealEventProxy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDealEventProxy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DealEventProxy" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}DealEventProxy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDealEventProxy", propOrder = {
    "dealEventProxy"
})
public class ArrayOfDealEventProxy {

    @XmlElement(name = "DealEventProxy", nillable = true)
    protected List<DealEventProxy> dealEventProxy;

    /**
     * Gets the value of the dealEventProxy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dealEventProxy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDealEventProxy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DealEventProxy }
     * 
     * 
     */
    public List<DealEventProxy> getDealEventProxy() {
        if (dealEventProxy == null) {
            dealEventProxy = new ArrayList<DealEventProxy>();
        }
        return this.dealEventProxy;
    }

}
