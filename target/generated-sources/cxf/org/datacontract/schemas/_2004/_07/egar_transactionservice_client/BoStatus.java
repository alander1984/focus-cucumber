
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bo_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bo_status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UnSent"/&gt;
 *     &lt;enumeration value="Delivered"/&gt;
 *     &lt;enumeration value="Canceled"/&gt;
 *     &lt;enumeration value="Paid"/&gt;
 *     &lt;enumeration value="Registered"/&gt;
 *     &lt;enumeration value="SentToBO"/&gt;
 *     &lt;enumeration value="Verified"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *     &lt;enumeration value="Exercised"/&gt;
 *     &lt;enumeration value="ClosedNoExercised"/&gt;
 *     &lt;enumeration value="NotRequired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "bo_status")
@XmlEnum
public enum BoStatus {

    @XmlEnumValue("UnSent")
    UN_SENT("UnSent"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("SentToBO")
    SENT_TO_BO("SentToBO"),
    @XmlEnumValue("Verified")
    VERIFIED("Verified"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Exercised")
    EXERCISED("Exercised"),
    @XmlEnumValue("ClosedNoExercised")
    CLOSED_NO_EXERCISED("ClosedNoExercised"),
    @XmlEnumValue("NotRequired")
    NOT_REQUIRED("NotRequired");
    private final String value;

    BoStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoStatus fromValue(String v) {
        for (BoStatus c: BoStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
