
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trade_ls_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="trade_ls_status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AwaitingAuthorization_0"/&gt;
 *     &lt;enumeration value="AwaitingAuthorization_1"/&gt;
 *     &lt;enumeration value="NotAuthorized"/&gt;
 *     &lt;enumeration value="Authorized"/&gt;
 *     &lt;enumeration value="NotRequired"/&gt;
 *     &lt;enumeration value="AwaitingSkipDetails"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "trade_ls_status")
@XmlEnum
public enum TradeLsStatus {

    @XmlEnumValue("AwaitingAuthorization_0")
    AWAITING_AUTHORIZATION_0("AwaitingAuthorization_0"),
    @XmlEnumValue("AwaitingAuthorization_1")
    AWAITING_AUTHORIZATION_1("AwaitingAuthorization_1"),
    @XmlEnumValue("NotAuthorized")
    NOT_AUTHORIZED("NotAuthorized"),
    @XmlEnumValue("Authorized")
    AUTHORIZED("Authorized"),
    @XmlEnumValue("NotRequired")
    NOT_REQUIRED("NotRequired"),
    @XmlEnumValue("AwaitingSkipDetails")
    AWAITING_SKIP_DETAILS("AwaitingSkipDetails");
    private final String value;

    TradeLsStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TradeLsStatus fromValue(String v) {
        for (TradeLsStatus c: TradeLsStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
