
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trade_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="trade_status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PendConf"/&gt;
 *     &lt;enumeration value="Canceled"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *     &lt;enumeration value="Hold"/&gt;
 *     &lt;enumeration value="Trial"/&gt;
 *     &lt;enumeration value="Confirmed"/&gt;
 *     &lt;enumeration value="Approved"/&gt;
 *     &lt;enumeration value="Split"/&gt;
 *     &lt;enumeration value="Broken"/&gt;
 *     &lt;enumeration value="Canceled2"/&gt;
 *     &lt;enumeration value="Structured"/&gt;
 *     &lt;enumeration value="Exercised"/&gt;
 *     &lt;enumeration value="CashSettled"/&gt;
 *     &lt;enumeration value="NewConfirmed"/&gt;
 *     &lt;enumeration value="ExercisedConfirmed"/&gt;
 *     &lt;enumeration value="CashSettledConfirmed"/&gt;
 *     &lt;enumeration value="CancelConfirmed"/&gt;
 *     &lt;enumeration value="Terminated"/&gt;
 *     &lt;enumeration value="TerminatedConfirm"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "trade_status")
@XmlEnum
public enum TradeStatus {

    @XmlEnumValue("PendConf")
    PEND_CONF("PendConf"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Hold")
    HOLD("Hold"),
    @XmlEnumValue("Trial")
    TRIAL("Trial"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Split")
    SPLIT("Split"),
    @XmlEnumValue("Broken")
    BROKEN("Broken"),
    @XmlEnumValue("Canceled2")
    CANCELED_2("Canceled2"),
    @XmlEnumValue("Structured")
    STRUCTURED("Structured"),
    @XmlEnumValue("Exercised")
    EXERCISED("Exercised"),
    @XmlEnumValue("CashSettled")
    CASH_SETTLED("CashSettled"),
    @XmlEnumValue("NewConfirmed")
    NEW_CONFIRMED("NewConfirmed"),
    @XmlEnumValue("ExercisedConfirmed")
    EXERCISED_CONFIRMED("ExercisedConfirmed"),
    @XmlEnumValue("CashSettledConfirmed")
    CASH_SETTLED_CONFIRMED("CashSettledConfirmed"),
    @XmlEnumValue("CancelConfirmed")
    CANCEL_CONFIRMED("CancelConfirmed"),
    @XmlEnumValue("Terminated")
    TERMINATED("Terminated"),
    @XmlEnumValue("TerminatedConfirm")
    TERMINATED_CONFIRM("TerminatedConfirm");
    private final String value;

    TradeStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TradeStatus fromValue(String v) {
        for (TradeStatus c: TradeStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
