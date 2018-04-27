
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealEventStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DealEventStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Confirmed"/&gt;
 *     &lt;enumeration value="Canceled"/&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Approved"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="FOConfirmed"/&gt;
 *     &lt;enumeration value="SentToBO"/&gt;
 *     &lt;enumeration value="RecalledFromBO"/&gt;
 *     &lt;enumeration value="BOProcessed"/&gt;
 *     &lt;enumeration value="NonAuthorized"/&gt;
 *     &lt;enumeration value="FOConfirmedA"/&gt;
 *     &lt;enumeration value="FOConfirmedB"/&gt;
 *     &lt;enumeration value="FORevision"/&gt;
 *     &lt;enumeration value="RiskControl"/&gt;
 *     &lt;enumeration value="RiskAuthorized"/&gt;
 *     &lt;enumeration value="Prolonged"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DealEventStatus")
@XmlEnum
public enum DealEventStatus {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("FOConfirmed")
    FO_CONFIRMED("FOConfirmed"),
    @XmlEnumValue("SentToBO")
    SENT_TO_BO("SentToBO"),
    @XmlEnumValue("RecalledFromBO")
    RECALLED_FROM_BO("RecalledFromBO"),
    @XmlEnumValue("BOProcessed")
    BO_PROCESSED("BOProcessed"),
    @XmlEnumValue("NonAuthorized")
    NON_AUTHORIZED("NonAuthorized"),
    @XmlEnumValue("FOConfirmedA")
    FO_CONFIRMED_A("FOConfirmedA"),
    @XmlEnumValue("FOConfirmedB")
    FO_CONFIRMED_B("FOConfirmedB"),
    @XmlEnumValue("FORevision")
    FO_REVISION("FORevision"),
    @XmlEnumValue("RiskControl")
    RISK_CONTROL("RiskControl"),
    @XmlEnumValue("RiskAuthorized")
    RISK_AUTHORIZED("RiskAuthorized"),
    @XmlEnumValue("Prolonged")
    PROLONGED("Prolonged");
    private final String value;

    DealEventStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DealEventStatus fromValue(String v) {
        for (DealEventStatus c: DealEventStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
