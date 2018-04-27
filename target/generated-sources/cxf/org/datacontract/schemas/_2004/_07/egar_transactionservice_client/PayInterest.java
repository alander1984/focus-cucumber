
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pay_interest.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pay_interest"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotPay"/&gt;
 *     &lt;enumeration value="Pay"/&gt;
 *     &lt;enumeration value="Capitalize"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "pay_interest")
@XmlEnum
public enum PayInterest {

    @XmlEnumValue("NotPay")
    NOT_PAY("NotPay"),
    @XmlEnumValue("Pay")
    PAY("Pay"),
    @XmlEnumValue("Capitalize")
    CAPITALIZE("Capitalize");
    private final String value;

    PayInterest(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayInterest fromValue(String v) {
        for (PayInterest c: PayInterest.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
