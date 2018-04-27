
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fd_object_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fd_object_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Trade"/&gt;
 *     &lt;enumeration value="Assetflow"/&gt;
 *     &lt;enumeration value="GeneralBrokerAgreements"/&gt;
 *     &lt;enumeration value="Accounts"/&gt;
 *     &lt;enumeration value="Ctpt"/&gt;
 *     &lt;enumeration value="Instruments"/&gt;
 *     &lt;enumeration value="TMAgreements"/&gt;
 *     &lt;enumeration value="NettingFlows"/&gt;
 *     &lt;enumeration value="OH"/&gt;
 *     &lt;enumeration value="PNoteTrades"/&gt;
 *     &lt;enumeration value="DealEvents"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "fd_object_type")
@XmlEnum
public enum FdObjectType {

    @XmlEnumValue("Trade")
    TRADE("Trade"),
    @XmlEnumValue("Assetflow")
    ASSETFLOW("Assetflow"),
    @XmlEnumValue("GeneralBrokerAgreements")
    GENERAL_BROKER_AGREEMENTS("GeneralBrokerAgreements"),
    @XmlEnumValue("Accounts")
    ACCOUNTS("Accounts"),
    @XmlEnumValue("Ctpt")
    CTPT("Ctpt"),
    @XmlEnumValue("Instruments")
    INSTRUMENTS("Instruments"),
    @XmlEnumValue("TMAgreements")
    TM_AGREEMENTS("TMAgreements"),
    @XmlEnumValue("NettingFlows")
    NETTING_FLOWS("NettingFlows"),
    OH("OH"),
    @XmlEnumValue("PNoteTrades")
    P_NOTE_TRADES("PNoteTrades"),
    @XmlEnumValue("DealEvents")
    DEAL_EVENTS("DealEvents");
    private final String value;

    FdObjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FdObjectType fromValue(String v) {
        for (FdObjectType c: FdObjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
