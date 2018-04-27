
package org.w3._2005._09.ws_i18n;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.w3._2005._09.ws_i18n package. 
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

    private final static QName _International_QNAME = new QName("http://www.w3.org/2005/09/ws-i18n", "International");
    private final static QName _InternationalLocale_QNAME = new QName("http://www.w3.org/2005/09/ws-i18n", "Locale");
    private final static QName _InternationalTZ_QNAME = new QName("http://www.w3.org/2005/09/ws-i18n", "TZ");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._2005._09.ws_i18n
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link International }
     * 
     */
    public International createInternational() {
        return new International();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link International }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/09/ws-i18n", name = "International")
    public JAXBElement<International> createInternational(International value) {
        return new JAXBElement<International>(_International_QNAME, International.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/09/ws-i18n", name = "Locale", scope = International.class)
    public JAXBElement<String> createInternationalLocale(String value) {
        return new JAXBElement<String>(_InternationalLocale_QNAME, String.class, International.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/09/ws-i18n", name = "TZ", scope = International.class)
    public JAXBElement<String> createInternationalTZ(String value) {
        return new JAXBElement<String>(_InternationalTZ_QNAME, String.class, International.class, value);
    }

}
