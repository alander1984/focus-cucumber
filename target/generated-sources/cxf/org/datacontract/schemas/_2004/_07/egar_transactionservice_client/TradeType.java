
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trade_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="trade_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Brokerage"/&gt;
 *     &lt;enumeration value="PropOTC"/&gt;
 *     &lt;enumeration value="Book2Book"/&gt;
 *     &lt;enumeration value="Branch2Branch"/&gt;
 *     &lt;enumeration value="Prop"/&gt;
 *     &lt;enumeration value="PropET"/&gt;
 *     &lt;enumeration value="Underwriting"/&gt;
 *     &lt;enumeration value="CopyToCtpt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "trade_type")
@XmlEnum
public enum TradeType {

    @XmlEnumValue("Brokerage")
    BROKERAGE("Brokerage"),
    @XmlEnumValue("PropOTC")
    PROP_OTC("PropOTC"),
    @XmlEnumValue("Book2Book")
    BOOK_2_BOOK("Book2Book"),
    @XmlEnumValue("Branch2Branch")
    BRANCH_2_BRANCH("Branch2Branch"),
    @XmlEnumValue("Prop")
    PROP("Prop"),
    @XmlEnumValue("PropET")
    PROP_ET("PropET"),
    @XmlEnumValue("Underwriting")
    UNDERWRITING("Underwriting"),
    @XmlEnumValue("CopyToCtpt")
    COPY_TO_CTPT("CopyToCtpt");
    private final String value;

    TradeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TradeType fromValue(String v) {
        for (TradeType c: TradeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
