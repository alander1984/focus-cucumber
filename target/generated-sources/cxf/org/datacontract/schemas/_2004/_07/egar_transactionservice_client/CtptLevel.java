
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctpt_level.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ctpt_level"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotMember"/&gt;
 *     &lt;enumeration value="Member"/&gt;
 *     &lt;enumeration value="CentralOffice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ctpt_level")
@XmlEnum
public enum CtptLevel {

    @XmlEnumValue("NotMember")
    NOT_MEMBER("NotMember"),
    @XmlEnumValue("Member")
    MEMBER("Member"),
    @XmlEnumValue("CentralOffice")
    CENTRAL_OFFICE("CentralOffice");
    private final String value;

    CtptLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CtptLevel fromValue(String v) {
        for (CtptLevel c: CtptLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
