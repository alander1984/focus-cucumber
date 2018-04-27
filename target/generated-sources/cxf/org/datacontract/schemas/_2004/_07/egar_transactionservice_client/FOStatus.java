
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FO_Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FO_Status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Processing"/&gt;
 *     &lt;enumeration value="Confirmed"/&gt;
 *     &lt;enumeration value="Canceled"/&gt;
 *     &lt;enumeration value="RecalledFromBO"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="RecalledFromFOB"/&gt;
 *     &lt;enumeration value="RecalledFromRisk"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FO_Status")
@XmlEnum
public enum FOStatus {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Processing")
    PROCESSING("Processing"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("RecalledFromBO")
    RECALLED_FROM_BO("RecalledFromBO"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("RecalledFromFOB")
    RECALLED_FROM_FOB("RecalledFromFOB"),
    @XmlEnumValue("RecalledFromRisk")
    RECALLED_FROM_RISK("RecalledFromRisk");
    private final String value;

    FOStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FOStatus fromValue(String v) {
        for (FOStatus c: FOStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
