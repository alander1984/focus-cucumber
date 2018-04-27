
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDealEventStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDealEventStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DealEventStatus" type="{http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades}DealEventStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDealEventStatus", propOrder = {
    "dealEventStatus"
})
public class ArrayOfDealEventStatus {

    @XmlElement(name = "DealEventStatus")
    @XmlSchemaType(name = "string")
    protected List<DealEventStatus> dealEventStatus;

    /**
     * Gets the value of the dealEventStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dealEventStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDealEventStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DealEventStatus }
     * 
     * 
     */
    public List<DealEventStatus> getDealEventStatus() {
        if (dealEventStatus == null) {
            dealEventStatus = new ArrayList<DealEventStatus>();
        }
        return this.dealEventStatus;
    }

}
