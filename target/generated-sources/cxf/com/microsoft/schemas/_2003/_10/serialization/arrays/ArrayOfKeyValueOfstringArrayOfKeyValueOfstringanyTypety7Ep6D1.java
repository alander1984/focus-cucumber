
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1", propOrder = {
    "keyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1"
})
public class ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 {

    @XmlElement(name = "KeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1")
    protected List<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 .KeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> keyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1;

    /**
     * Gets the value of the keyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 .KeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 .KeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1> getKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1() {
        if (keyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 == null) {
            keyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 = new ArrayList<ArrayOfKeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 .KeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1>();
        }
        return this.keyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1;
    }


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
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType"/&gt;
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
        "key",
        "value"
    })
    public static class KeyValueOfstringArrayOfKeyValueOfstringanyTypety7Ep6D1 {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfKeyValueOfstringanyType value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfKeyValueOfstringanyType }
         *     
         */
        public ArrayOfKeyValueOfstringanyType getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfKeyValueOfstringanyType }
         *     
         */
        public void setValue(ArrayOfKeyValueOfstringanyType value) {
            this.value = value;
        }

    }

}
