
package org.datacontract.schemas._2004._07.egar_focus_interface_businessobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for TradeInstruments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeInstruments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/&gt;
 *         &lt;element name="columns" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals}ArrayOfTradeInstrumentColumn"/&gt;
 *         &lt;element name="rows" type="{http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals}ArrayOfTradeInstrumentRow"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeInstruments", propOrder = {
    "actions",
    "columns",
    "rows"
})
public class TradeInstruments {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfstring actions;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTradeInstrumentColumn columns;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTradeInstrumentRow rows;

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setActions(ArrayOfstring value) {
        this.actions = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTradeInstrumentColumn }
     *     
     */
    public ArrayOfTradeInstrumentColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTradeInstrumentColumn }
     *     
     */
    public void setColumns(ArrayOfTradeInstrumentColumn value) {
        this.columns = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTradeInstrumentRow }
     *     
     */
    public ArrayOfTradeInstrumentRow getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTradeInstrumentRow }
     *     
     */
    public void setRows(ArrayOfTradeInstrumentRow value) {
        this.rows = value;
    }

}
