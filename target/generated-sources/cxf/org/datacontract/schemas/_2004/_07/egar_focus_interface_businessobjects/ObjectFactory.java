
package org.datacontract.schemas._2004._07.egar_focus_interface_businessobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.egar_focus_events_base.ArrayOfIdName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.egar_focus_interface_businessobjects package. 
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

    private final static QName _TradeInstruments_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals", "TradeInstruments");
    private final static QName _ArrayOfTradeInstrumentColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals", "ArrayOfTradeInstrumentColumn");
    private final static QName _TradeInstrumentColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals", "TradeInstrumentColumn");
    private final static QName _ArrayOfTradeInstrumentRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals", "ArrayOfTradeInstrumentRow");
    private final static QName _TradeInstrumentRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals", "TradeInstrumentRow");
    private final static QName _ExerciseType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.DealEvents", "ExerciseType");
    private final static QName _SanctionControlRow_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.SanctionControl", "SanctionControlRow");
    private final static QName _SanctionControlRowAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.SanctionControl", "Action");
    private final static QName _SanctionControlRowEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.SanctionControl", "Event");
    private final static QName _SanctionControlRowReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.SanctionControl", "Reason");
    private final static QName _SanctionControlRowUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.SanctionControl", "User");
    private final static QName _TradeInstrumentColumnPossibleValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals", "possibleValues");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.egar_focus_interface_businessobjects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TradeInstruments }
     * 
     */
    public TradeInstruments createTradeInstruments() {
        return new TradeInstruments();
    }

    /**
     * Create an instance of {@link ArrayOfTradeInstrumentColumn }
     * 
     */
    public ArrayOfTradeInstrumentColumn createArrayOfTradeInstrumentColumn() {
        return new ArrayOfTradeInstrumentColumn();
    }

    /**
     * Create an instance of {@link TradeInstrumentColumn }
     * 
     */
    public TradeInstrumentColumn createTradeInstrumentColumn() {
        return new TradeInstrumentColumn();
    }

    /**
     * Create an instance of {@link ArrayOfTradeInstrumentRow }
     * 
     */
    public ArrayOfTradeInstrumentRow createArrayOfTradeInstrumentRow() {
        return new ArrayOfTradeInstrumentRow();
    }

    /**
     * Create an instance of {@link TradeInstrumentRow }
     * 
     */
    public TradeInstrumentRow createTradeInstrumentRow() {
        return new TradeInstrumentRow();
    }

    /**
     * Create an instance of {@link SanctionControlRow }
     * 
     */
    public SanctionControlRow createSanctionControlRow() {
        return new SanctionControlRow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeInstruments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals", name = "TradeInstruments")
    public JAXBElement<TradeInstruments> createTradeInstruments(TradeInstruments value) {
        return new JAXBElement<TradeInstruments>(_TradeInstruments_QNAME, TradeInstruments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTradeInstrumentColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals", name = "ArrayOfTradeInstrumentColumn")
    public JAXBElement<ArrayOfTradeInstrumentColumn> createArrayOfTradeInstrumentColumn(ArrayOfTradeInstrumentColumn value) {
        return new JAXBElement<ArrayOfTradeInstrumentColumn>(_ArrayOfTradeInstrumentColumn_QNAME, ArrayOfTradeInstrumentColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeInstrumentColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals", name = "TradeInstrumentColumn")
    public JAXBElement<TradeInstrumentColumn> createTradeInstrumentColumn(TradeInstrumentColumn value) {
        return new JAXBElement<TradeInstrumentColumn>(_TradeInstrumentColumn_QNAME, TradeInstrumentColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTradeInstrumentRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals", name = "ArrayOfTradeInstrumentRow")
    public JAXBElement<ArrayOfTradeInstrumentRow> createArrayOfTradeInstrumentRow(ArrayOfTradeInstrumentRow value) {
        return new JAXBElement<ArrayOfTradeInstrumentRow>(_ArrayOfTradeInstrumentRow_QNAME, ArrayOfTradeInstrumentRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeInstrumentRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals", name = "TradeInstrumentRow")
    public JAXBElement<TradeInstrumentRow> createTradeInstrumentRow(TradeInstrumentRow value) {
        return new JAXBElement<TradeInstrumentRow>(_TradeInstrumentRow_QNAME, TradeInstrumentRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExerciseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.DealEvents", name = "ExerciseType")
    public JAXBElement<ExerciseType> createExerciseType(ExerciseType value) {
        return new JAXBElement<ExerciseType>(_ExerciseType_QNAME, ExerciseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SanctionControlRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.SanctionControl", name = "SanctionControlRow")
    public JAXBElement<SanctionControlRow> createSanctionControlRow(SanctionControlRow value) {
        return new JAXBElement<SanctionControlRow>(_SanctionControlRow_QNAME, SanctionControlRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.SanctionControl", name = "Action", scope = SanctionControlRow.class)
    public JAXBElement<String> createSanctionControlRowAction(String value) {
        return new JAXBElement<String>(_SanctionControlRowAction_QNAME, String.class, SanctionControlRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.SanctionControl", name = "Event", scope = SanctionControlRow.class)
    public JAXBElement<String> createSanctionControlRowEvent(String value) {
        return new JAXBElement<String>(_SanctionControlRowEvent_QNAME, String.class, SanctionControlRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.SanctionControl", name = "Reason", scope = SanctionControlRow.class)
    public JAXBElement<String> createSanctionControlRowReason(String value) {
        return new JAXBElement<String>(_SanctionControlRowReason_QNAME, String.class, SanctionControlRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.SanctionControl", name = "User", scope = SanctionControlRow.class)
    public JAXBElement<String> createSanctionControlRowUser(String value) {
        return new JAXBElement<String>(_SanctionControlRowUser_QNAME, String.class, SanctionControlRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIdName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.Focus.Interface.BusinessObjects.FocusDeals", name = "possibleValues", scope = TradeInstrumentColumn.class)
    public JAXBElement<ArrayOfIdName> createTradeInstrumentColumnPossibleValues(ArrayOfIdName value) {
        return new JAXBElement<ArrayOfIdName>(_TradeInstrumentColumnPossibleValues_QNAME, ArrayOfIdName.class, TradeInstrumentColumn.class, value);
    }

}
