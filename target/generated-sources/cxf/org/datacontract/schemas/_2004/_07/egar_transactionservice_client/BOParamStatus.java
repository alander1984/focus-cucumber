
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BO_Param_Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BO_Param_Status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RequiresProcessing"/&gt;
 *     &lt;enumeration value="Processing"/&gt;
 *     &lt;enumeration value="ParametersFilled"/&gt;
 *     &lt;enumeration value="TransferredForProcessing"/&gt;
 *     &lt;enumeration value="AllowedForSettlementPreparation"/&gt;
 *     &lt;enumeration value="AllowedForSettlement"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BO_Param_Status")
@XmlEnum
public enum BOParamStatus {

    @XmlEnumValue("RequiresProcessing")
    REQUIRES_PROCESSING("RequiresProcessing"),
    @XmlEnumValue("Processing")
    PROCESSING("Processing"),
    @XmlEnumValue("ParametersFilled")
    PARAMETERS_FILLED("ParametersFilled"),
    @XmlEnumValue("TransferredForProcessing")
    TRANSFERRED_FOR_PROCESSING("TransferredForProcessing"),
    @XmlEnumValue("AllowedForSettlementPreparation")
    ALLOWED_FOR_SETTLEMENT_PREPARATION("AllowedForSettlementPreparation"),
    @XmlEnumValue("AllowedForSettlement")
    ALLOWED_FOR_SETTLEMENT("AllowedForSettlement"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed");
    private final String value;

    BOParamStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BOParamStatus fromValue(String v) {
        for (BOParamStatus c: BOParamStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
