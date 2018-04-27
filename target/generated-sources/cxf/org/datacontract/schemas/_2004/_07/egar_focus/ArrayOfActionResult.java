
package org.datacontract.schemas._2004._07.egar_focus;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfActionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfActionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionResult" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Interface}ActionResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActionResult", propOrder = {
    "actionResult"
})
public class ArrayOfActionResult {

    @XmlElement(name = "ActionResult", nillable = true)
    protected List<ActionResult> actionResult;

    /**
     * Gets the value of the actionResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionResult }
     * 
     * 
     */
    public List<ActionResult> getActionResult() {
        if (actionResult == null) {
            actionResult = new ArrayList<ActionResult>();
        }
        return this.actionResult;
    }

}
