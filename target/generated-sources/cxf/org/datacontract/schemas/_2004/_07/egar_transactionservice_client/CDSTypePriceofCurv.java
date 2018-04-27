
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CDSTypePriceofCurv.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CDSTypePriceofCurv"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bid"/&gt;
 *     &lt;enumeration value="Ask"/&gt;
 *     &lt;enumeration value="Mid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CDSTypePriceofCurv")
@XmlEnum
public enum CDSTypePriceofCurv {

    @XmlEnumValue("Bid")
    BID("Bid"),
    @XmlEnumValue("Ask")
    ASK("Ask"),
    @XmlEnumValue("Mid")
    MID("Mid");
    private final String value;

    CDSTypePriceofCurv(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDSTypePriceofCurv fromValue(String v) {
        for (CDSTypePriceofCurv c: CDSTypePriceofCurv.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
