
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountingStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AwaitingProcessing"/&gt;
 *     &lt;enumeration value="TakenForProcessing"/&gt;
 *     &lt;enumeration value="PreparationStarted"/&gt;
 *     &lt;enumeration value="PreparationCompleted"/&gt;
 *     &lt;enumeration value="Settled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountingStatus")
@XmlEnum
public enum AccountingStatus {

    @XmlEnumValue("AwaitingProcessing")
    AWAITING_PROCESSING("AwaitingProcessing"),
    @XmlEnumValue("TakenForProcessing")
    TAKEN_FOR_PROCESSING("TakenForProcessing"),
    @XmlEnumValue("PreparationStarted")
    PREPARATION_STARTED("PreparationStarted"),
    @XmlEnumValue("PreparationCompleted")
    PREPARATION_COMPLETED("PreparationCompleted"),
    @XmlEnumValue("Settled")
    SETTLED("Settled");
    private final String value;

    AccountingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountingStatus fromValue(String v) {
        for (AccountingStatus c: AccountingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
