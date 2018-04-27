
package org.datacontract.schemas._2004._07.egar_focus_framework;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumRoundingRule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumRoundingRule"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Final_Accr_to_0_dp"/&gt;
 *     &lt;enumeration value="Final_Accr_to_1_dp"/&gt;
 *     &lt;enumeration value="Final_Accr_to_2_dp"/&gt;
 *     &lt;enumeration value="Final_Accr_to_3_dp"/&gt;
 *     &lt;enumeration value="Final_Accr_to_4_dp"/&gt;
 *     &lt;enumeration value="Final_Accr_to_5_dp"/&gt;
 *     &lt;enumeration value="Final_Accr_to_6_dp"/&gt;
 *     &lt;enumeration value="Final_Accr_to_7_dp"/&gt;
 *     &lt;enumeration value="Final_Accr_to_8_dp"/&gt;
 *     &lt;enumeration value="Final_Accr_to_9_dp"/&gt;
 *     &lt;enumeration value="Final_Trunc_to_0_dp"/&gt;
 *     &lt;enumeration value="Final_Trunc_to_1_dp"/&gt;
 *     &lt;enumeration value="Final_Trunc_to_2_dp"/&gt;
 *     &lt;enumeration value="Final_Trunc_to_3_dp"/&gt;
 *     &lt;enumeration value="Final_Trunc_to_4_dp"/&gt;
 *     &lt;enumeration value="Final_Trunc_to_5_dp"/&gt;
 *     &lt;enumeration value="Final_Trunc_to_6_dp"/&gt;
 *     &lt;enumeration value="Final_Trunc_to_7_dp"/&gt;
 *     &lt;enumeration value="Final_Trunc_to_8_dp"/&gt;
 *     &lt;enumeration value="Final_Trunc_to_9_dp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumRoundingRule", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Framework.Types")
@XmlEnum
public enum EnumRoundingRule {

    @XmlEnumValue("Final_Accr_to_0_dp")
    FINAL_ACCR_TO_0_DP("Final_Accr_to_0_dp"),
    @XmlEnumValue("Final_Accr_to_1_dp")
    FINAL_ACCR_TO_1_DP("Final_Accr_to_1_dp"),
    @XmlEnumValue("Final_Accr_to_2_dp")
    FINAL_ACCR_TO_2_DP("Final_Accr_to_2_dp"),
    @XmlEnumValue("Final_Accr_to_3_dp")
    FINAL_ACCR_TO_3_DP("Final_Accr_to_3_dp"),
    @XmlEnumValue("Final_Accr_to_4_dp")
    FINAL_ACCR_TO_4_DP("Final_Accr_to_4_dp"),
    @XmlEnumValue("Final_Accr_to_5_dp")
    FINAL_ACCR_TO_5_DP("Final_Accr_to_5_dp"),
    @XmlEnumValue("Final_Accr_to_6_dp")
    FINAL_ACCR_TO_6_DP("Final_Accr_to_6_dp"),
    @XmlEnumValue("Final_Accr_to_7_dp")
    FINAL_ACCR_TO_7_DP("Final_Accr_to_7_dp"),
    @XmlEnumValue("Final_Accr_to_8_dp")
    FINAL_ACCR_TO_8_DP("Final_Accr_to_8_dp"),
    @XmlEnumValue("Final_Accr_to_9_dp")
    FINAL_ACCR_TO_9_DP("Final_Accr_to_9_dp"),
    @XmlEnumValue("Final_Trunc_to_0_dp")
    FINAL_TRUNC_TO_0_DP("Final_Trunc_to_0_dp"),
    @XmlEnumValue("Final_Trunc_to_1_dp")
    FINAL_TRUNC_TO_1_DP("Final_Trunc_to_1_dp"),
    @XmlEnumValue("Final_Trunc_to_2_dp")
    FINAL_TRUNC_TO_2_DP("Final_Trunc_to_2_dp"),
    @XmlEnumValue("Final_Trunc_to_3_dp")
    FINAL_TRUNC_TO_3_DP("Final_Trunc_to_3_dp"),
    @XmlEnumValue("Final_Trunc_to_4_dp")
    FINAL_TRUNC_TO_4_DP("Final_Trunc_to_4_dp"),
    @XmlEnumValue("Final_Trunc_to_5_dp")
    FINAL_TRUNC_TO_5_DP("Final_Trunc_to_5_dp"),
    @XmlEnumValue("Final_Trunc_to_6_dp")
    FINAL_TRUNC_TO_6_DP("Final_Trunc_to_6_dp"),
    @XmlEnumValue("Final_Trunc_to_7_dp")
    FINAL_TRUNC_TO_7_DP("Final_Trunc_to_7_dp"),
    @XmlEnumValue("Final_Trunc_to_8_dp")
    FINAL_TRUNC_TO_8_DP("Final_Trunc_to_8_dp"),
    @XmlEnumValue("Final_Trunc_to_9_dp")
    FINAL_TRUNC_TO_9_DP("Final_Trunc_to_9_dp");
    private final String value;

    EnumRoundingRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumRoundingRule fromValue(String v) {
        for (EnumRoundingRule c: EnumRoundingRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
