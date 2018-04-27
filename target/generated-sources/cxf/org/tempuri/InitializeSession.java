
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2005._09.ws_i18n.International;


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
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WindowsLoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="International" type="{http://www.w3.org/2005/09/ws-i18n}International" minOccurs="0"/&gt;
 *         &lt;element name="NumberDecimalSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberGroupSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortDatePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "userName",
    "windowsLoginName",
    "hostName",
    "applicationName",
    "international",
    "numberDecimalSeparator",
    "numberGroupSeparator",
    "shortDatePattern"
})
@XmlRootElement(name = "InitializeSession")
public class InitializeSession {

    @XmlElementRef(name = "UserName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userName;
    @XmlElementRef(name = "WindowsLoginName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> windowsLoginName;
    @XmlElementRef(name = "HostName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostName;
    @XmlElementRef(name = "ApplicationName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicationName;
    @XmlElementRef(name = "International", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<International> international;
    @XmlElementRef(name = "NumberDecimalSeparator", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberDecimalSeparator;
    @XmlElementRef(name = "NumberGroupSeparator", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberGroupSeparator;
    @XmlElementRef(name = "ShortDatePattern", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shortDatePattern;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

    /**
     * Gets the value of the windowsLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWindowsLoginName() {
        return windowsLoginName;
    }

    /**
     * Sets the value of the windowsLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWindowsLoginName(JAXBElement<String> value) {
        this.windowsLoginName = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostName(JAXBElement<String> value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationName(JAXBElement<String> value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the international property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link International }{@code >}
     *     
     */
    public JAXBElement<International> getInternational() {
        return international;
    }

    /**
     * Sets the value of the international property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link International }{@code >}
     *     
     */
    public void setInternational(JAXBElement<International> value) {
        this.international = value;
    }

    /**
     * Gets the value of the numberDecimalSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberDecimalSeparator() {
        return numberDecimalSeparator;
    }

    /**
     * Sets the value of the numberDecimalSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberDecimalSeparator(JAXBElement<String> value) {
        this.numberDecimalSeparator = value;
    }

    /**
     * Gets the value of the numberGroupSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberGroupSeparator() {
        return numberGroupSeparator;
    }

    /**
     * Sets the value of the numberGroupSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberGroupSeparator(JAXBElement<String> value) {
        this.numberGroupSeparator = value;
    }

    /**
     * Gets the value of the shortDatePattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShortDatePattern() {
        return shortDatePattern;
    }

    /**
     * Sets the value of the shortDatePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShortDatePattern(JAXBElement<String> value) {
        this.shortDatePattern = value;
    }

}
