
package org.datacontract.schemas._2004._07.egar_focus_framework;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.egar_focus_framework package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnumRoundingRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Framework.Types", "enumRoundingRule");
    private final static QName _EnumNovationRole_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Framework.Types", "EnumNovationRole");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.egar_focus_framework
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumRoundingRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Framework.Types", name = "enumRoundingRule")
    public JAXBElement<EnumRoundingRule> createEnumRoundingRule(EnumRoundingRule value) {
        return new JAXBElement<EnumRoundingRule>(_EnumRoundingRule_QNAME, EnumRoundingRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumNovationRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Framework.Types", name = "EnumNovationRole")
    public JAXBElement<EnumNovationRole> createEnumNovationRole(EnumNovationRole value) {
        return new JAXBElement<EnumNovationRole>(_EnumNovationRole_QNAME, EnumNovationRole.class, null, value);
    }

}
