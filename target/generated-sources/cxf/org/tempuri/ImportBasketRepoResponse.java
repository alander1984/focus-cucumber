
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07._baseobjects.NrdImportInfoCollection;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImportBasketRepoResult" type="{http://schemas.datacontract.org/2004/07/_BaseObjects}NrdImportInfoCollection" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importBasketRepoResult"
})
@XmlRootElement(name = "ImportBasketRepoResponse")
public class ImportBasketRepoResponse {

    @XmlElementRef(name = "ImportBasketRepoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<NrdImportInfoCollection> importBasketRepoResult;

    /**
     * Gets the value of the importBasketRepoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NrdImportInfoCollection }{@code >}
     *     
     */
    public JAXBElement<NrdImportInfoCollection> getImportBasketRepoResult() {
        return importBasketRepoResult;
    }

    /**
     * Sets the value of the importBasketRepoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NrdImportInfoCollection }{@code >}
     *     
     */
    public void setImportBasketRepoResult(JAXBElement<NrdImportInfoCollection> value) {
        this.importBasketRepoResult = value;
    }

}
