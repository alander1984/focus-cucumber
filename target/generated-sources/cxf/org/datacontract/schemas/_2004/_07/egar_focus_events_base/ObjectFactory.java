
package org.datacontract.schemas._2004._07.egar_focus_events_base;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.egar_focus_events_base package. 
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

    private final static QName _IdName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Events.Base.Helpers", "IdName");
    private final static QName _ArrayOfIdName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Events.Base.Helpers", "ArrayOfIdName");
    private final static QName _IdNameId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Events.Base.Helpers", "Id");
    private final static QName _IdNameName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Events.Base.Helpers", "Name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.egar_focus_events_base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IdName }
     * 
     */
    public IdName createIdName() {
        return new IdName();
    }

    /**
     * Create an instance of {@link ArrayOfIdName }
     * 
     */
    public ArrayOfIdName createArrayOfIdName() {
        return new ArrayOfIdName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Events.Base.Helpers", name = "IdName")
    public JAXBElement<IdName> createIdName(IdName value) {
        return new JAXBElement<IdName>(_IdName_QNAME, IdName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIdName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Events.Base.Helpers", name = "ArrayOfIdName")
    public JAXBElement<ArrayOfIdName> createArrayOfIdName(ArrayOfIdName value) {
        return new JAXBElement<ArrayOfIdName>(_ArrayOfIdName_QNAME, ArrayOfIdName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Events.Base.Helpers", name = "Id", scope = IdName.class)
    public JAXBElement<Integer> createIdNameId(Integer value) {
        return new JAXBElement<Integer>(_IdNameId_QNAME, Integer.class, IdName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Events.Base.Helpers", name = "Name", scope = IdName.class)
    public JAXBElement<String> createIdNameName(String value) {
        return new JAXBElement<String>(_IdNameName_QNAME, String.class, IdName.class, value);
    }

}
