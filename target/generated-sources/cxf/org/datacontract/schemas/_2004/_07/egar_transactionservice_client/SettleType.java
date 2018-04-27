
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for settle_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="settle_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Physical"/&gt;
 *     &lt;enumeration value="Cash"/&gt;
 *     &lt;enumeration value="AuctionSettlement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "settle_type")
@XmlEnum
public enum SettleType {

    @XmlEnumValue("Physical")
    PHYSICAL("Physical"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("AuctionSettlement")
    AUCTION_SETTLEMENT("AuctionSettlement");
    private final String value;

    SettleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SettleType fromValue(String v) {
        for (SettleType c: SettleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
