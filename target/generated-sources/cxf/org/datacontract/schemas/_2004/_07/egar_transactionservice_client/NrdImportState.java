
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NrdImportState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NrdImportState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Reload"/&gt;
 *     &lt;enumeration value="NotProcessed"/&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Filtered"/&gt;
 *     &lt;enumeration value="ManualProcessing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NrdImportState")
@XmlEnum
public enum NrdImportState {

    @XmlEnumValue("Reload")
    RELOAD("Reload"),
    @XmlEnumValue("NotProcessed")
    NOT_PROCESSED("NotProcessed"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Filtered")
    FILTERED("Filtered"),
    @XmlEnumValue("ManualProcessing")
    MANUAL_PROCESSING("ManualProcessing");
    private final String value;

    NrdImportState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NrdImportState fromValue(String v) {
        for (NrdImportState c: NrdImportState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
