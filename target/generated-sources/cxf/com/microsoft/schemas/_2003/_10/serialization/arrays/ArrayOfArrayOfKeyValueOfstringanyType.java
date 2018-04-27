
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfKeyValueOfstringanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfKeyValueOfstringanyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrayOfKeyValueOfstringanyType" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfKeyValueOfstringanyType", propOrder = {
    "arrayOfKeyValueOfstringanyType"
})
public class ArrayOfArrayOfKeyValueOfstringanyType {

    @XmlElement(name = "ArrayOfKeyValueOfstringanyType", nillable = true)
    protected List<ArrayOfKeyValueOfstringanyType> arrayOfKeyValueOfstringanyType;

    /**
     * Gets the value of the arrayOfKeyValueOfstringanyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfKeyValueOfstringanyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfKeyValueOfstringanyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringanyType }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringanyType> getArrayOfKeyValueOfstringanyType() {
        if (arrayOfKeyValueOfstringanyType == null) {
            arrayOfKeyValueOfstringanyType = new ArrayList<ArrayOfKeyValueOfstringanyType>();
        }
        return this.arrayOfKeyValueOfstringanyType;
    }

}
