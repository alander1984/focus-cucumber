
package org.datacontract.schemas._2004._07.egar_focus_interface_businessobjects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExerciseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExerciseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ExpiryNoBarrier"/&gt;
 *     &lt;enumeration value="ExerciseNoBarrier"/&gt;
 *     &lt;enumeration value="ExpiryBarrier"/&gt;
 *     &lt;enumeration value="ExerciseBarrier"/&gt;
 *     &lt;enumeration value="TeminationNoBarrier"/&gt;
 *     &lt;enumeration value="TerminationBarrier"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExerciseType", namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.DealEvents")
@XmlEnum
public enum ExerciseType {

    @XmlEnumValue("ExpiryNoBarrier")
    EXPIRY_NO_BARRIER("ExpiryNoBarrier"),
    @XmlEnumValue("ExerciseNoBarrier")
    EXERCISE_NO_BARRIER("ExerciseNoBarrier"),
    @XmlEnumValue("ExpiryBarrier")
    EXPIRY_BARRIER("ExpiryBarrier"),
    @XmlEnumValue("ExerciseBarrier")
    EXERCISE_BARRIER("ExerciseBarrier"),
    @XmlEnumValue("TeminationNoBarrier")
    TEMINATION_NO_BARRIER("TeminationNoBarrier"),
    @XmlEnumValue("TerminationBarrier")
    TERMINATION_BARRIER("TerminationBarrier");
    private final String value;

    ExerciseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExerciseType fromValue(String v) {
        for (ExerciseType c: ExerciseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
