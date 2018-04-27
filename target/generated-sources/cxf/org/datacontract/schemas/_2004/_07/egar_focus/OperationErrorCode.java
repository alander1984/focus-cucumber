
package org.datacontract.schemas._2004._07.egar_focus;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationErrorCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PermissionsNotAllowed"/&gt;
 *     &lt;enumeration value="InsuffisientEntry"/&gt;
 *     &lt;enumeration value="ValidationError"/&gt;
 *     &lt;enumeration value="RealFlowsExistsError"/&gt;
 *     &lt;enumeration value="NettingFlowsExists"/&gt;
 *     &lt;enumeration value="FlowsBOStatusExists"/&gt;
 *     &lt;enumeration value="UnsupportedOperation"/&gt;
 *     &lt;enumeration value="UnspecifiedError"/&gt;
 *     &lt;enumeration value="ConfirmMessage"/&gt;
 *     &lt;enumeration value="RealFlowsExists"/&gt;
 *     &lt;enumeration value="TradeDateIsHoliday"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="PrintTicket"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationErrorCode")
@XmlEnum
public enum OperationErrorCode {

    @XmlEnumValue("PermissionsNotAllowed")
    PERMISSIONS_NOT_ALLOWED("PermissionsNotAllowed"),
    @XmlEnumValue("InsuffisientEntry")
    INSUFFISIENT_ENTRY("InsuffisientEntry"),
    @XmlEnumValue("ValidationError")
    VALIDATION_ERROR("ValidationError"),
    @XmlEnumValue("RealFlowsExistsError")
    REAL_FLOWS_EXISTS_ERROR("RealFlowsExistsError"),
    @XmlEnumValue("NettingFlowsExists")
    NETTING_FLOWS_EXISTS("NettingFlowsExists"),
    @XmlEnumValue("FlowsBOStatusExists")
    FLOWS_BO_STATUS_EXISTS("FlowsBOStatusExists"),
    @XmlEnumValue("UnsupportedOperation")
    UNSUPPORTED_OPERATION("UnsupportedOperation"),
    @XmlEnumValue("UnspecifiedError")
    UNSPECIFIED_ERROR("UnspecifiedError"),
    @XmlEnumValue("ConfirmMessage")
    CONFIRM_MESSAGE("ConfirmMessage"),
    @XmlEnumValue("RealFlowsExists")
    REAL_FLOWS_EXISTS("RealFlowsExists"),
    @XmlEnumValue("TradeDateIsHoliday")
    TRADE_DATE_IS_HOLIDAY("TradeDateIsHoliday"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("PrintTicket")
    PRINT_TICKET("PrintTicket");
    private final String value;

    OperationErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationErrorCode fromValue(String v) {
        for (OperationErrorCode c: OperationErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
