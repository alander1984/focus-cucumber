
package org.datacontract.schemas._2004._07.egar_focus_framework;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumNovationRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumNovationRole"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Transferor"/&gt;
 *     &lt;enumeration value="Transferee"/&gt;
 *     &lt;enumeration value="RemainingParty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumNovationRole", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Framework.Types")
@XmlEnum
public enum EnumNovationRole {

    @XmlEnumValue("Transferor")
    TRANSFEROR("Transferor"),
    @XmlEnumValue("Transferee")
    TRANSFEREE("Transferee"),
    @XmlEnumValue("RemainingParty")
    REMAINING_PARTY("RemainingParty");
    private final String value;

    EnumNovationRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumNovationRole fromValue(String v) {
        for (EnumNovationRole c: EnumNovationRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
