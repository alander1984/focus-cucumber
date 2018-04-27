
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CDSInputModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CDSInputModel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Spread"/&gt;
 *     &lt;enumeration value="Upfront"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CDSInputModel")
@XmlEnum
public enum CDSInputModel {

    @XmlEnumValue("Spread")
    SPREAD("Spread"),
    @XmlEnumValue("Upfront")
    UPFRONT("Upfront");
    private final String value;

    CDSInputModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDSInputModel fromValue(String v) {
        for (CDSInputModel c: CDSInputModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
