
package org.datacontract.schemas._2004._07._baseobjects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNrdLiability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNrdLiability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NrdLiability" type="{http://schemas.datacontract.org/2004/07/_BaseObjects}NrdLiability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNrdLiability", propOrder = {
    "nrdLiability"
})
public class ArrayOfNrdLiability {

    @XmlElement(name = "NrdLiability", nillable = true)
    protected List<NrdLiability> nrdLiability;

    /**
     * Gets the value of the nrdLiability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nrdLiability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNrdLiability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NrdLiability }
     * 
     * 
     */
    public List<NrdLiability> getNrdLiability() {
        if (nrdLiability == null) {
            nrdLiability = new ArrayList<NrdLiability>();
        }
        return this.nrdLiability;
    }

}
