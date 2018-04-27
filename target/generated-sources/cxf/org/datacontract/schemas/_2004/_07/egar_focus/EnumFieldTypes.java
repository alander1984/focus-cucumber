
package org.datacontract.schemas._2004._07.egar_focus;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumFieldTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumFieldTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Number"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="Time"/&gt;
 *     &lt;enumeration value="List"/&gt;
 *     &lt;enumeration value="CheckedListBox"/&gt;
 *     &lt;enumeration value="Price"/&gt;
 *     &lt;enumeration value="Button"/&gt;
 *     &lt;enumeration value="CheckBox"/&gt;
 *     &lt;enumeration value="RadioButton"/&gt;
 *     &lt;enumeration value="Rate"/&gt;
 *     &lt;enumeration value="Label"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumFieldTypes", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.FieldsRepository")
@XmlEnum
public enum EnumFieldTypes {

    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("List")
    LIST("List"),
    @XmlEnumValue("CheckedListBox")
    CHECKED_LIST_BOX("CheckedListBox"),
    @XmlEnumValue("Price")
    PRICE("Price"),
    @XmlEnumValue("Button")
    BUTTON("Button"),
    @XmlEnumValue("CheckBox")
    CHECK_BOX("CheckBox"),
    @XmlEnumValue("RadioButton")
    RADIO_BUTTON("RadioButton"),
    @XmlEnumValue("Rate")
    RATE("Rate"),
    @XmlEnumValue("Label")
    LABEL("Label");
    private final String value;

    EnumFieldTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumFieldTypes fromValue(String v) {
        for (EnumFieldTypes c: EnumFieldTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
