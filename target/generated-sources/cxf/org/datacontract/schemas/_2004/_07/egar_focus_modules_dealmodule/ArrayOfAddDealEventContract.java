
package org.datacontract.schemas._2004._07.egar_focus_modules_dealmodule;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAddDealEventContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAddDealEventContract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddDealEventContract" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Modules.DealModule.Integration}AddDealEventContract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddDealEventContract", propOrder = {
    "addDealEventContract"
})
public class ArrayOfAddDealEventContract {

    @XmlElement(name = "AddDealEventContract", nillable = true)
    protected List<AddDealEventContract> addDealEventContract;

    /**
     * Gets the value of the addDealEventContract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addDealEventContract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddDealEventContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddDealEventContract }
     * 
     * 
     */
    public List<AddDealEventContract> getAddDealEventContract() {
        if (addDealEventContract == null) {
            addDealEventContract = new ArrayList<AddDealEventContract>();
        }
        return this.addDealEventContract;
    }

}
