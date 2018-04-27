
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for risk_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="risk_status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Taken"/&gt;
 *     &lt;enumeration value="Recalled"/&gt;
 *     &lt;enumeration value="Authorized"/&gt;
 *     &lt;enumeration value="NonAuthorized"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "risk_status")
@XmlEnum
public enum RiskStatus {

    @XmlEnumValue("Taken")
    TAKEN("Taken"),
    @XmlEnumValue("Recalled")
    RECALLED("Recalled"),
    @XmlEnumValue("Authorized")
    AUTHORIZED("Authorized"),
    @XmlEnumValue("NonAuthorized")
    NON_AUTHORIZED("NonAuthorized");
    private final String value;

    RiskStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RiskStatus fromValue(String v) {
        for (RiskStatus c: RiskStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
