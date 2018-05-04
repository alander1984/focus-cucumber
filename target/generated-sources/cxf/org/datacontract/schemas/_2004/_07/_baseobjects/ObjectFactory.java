
package org.datacontract.schemas._2004._07._baseobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07._baseobjects package. 
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

    private final static QName _NrdTradeBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "NrdTradeBase");
    private final static QName _ArrayOfNrdLiability_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "ArrayOfNrdLiability");
    private final static QName _NrdLiability_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "NrdLiability");
    private final static QName _NrdCashLiability_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "NrdCashLiability");
    private final static QName _ArrayOfNrdSecLiability_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "ArrayOfNrdSecLiability");
    private final static QName _NrdSecLiability_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "NrdSecLiability");
    private final static QName _NrdImportInfoCollection_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "NrdImportInfoCollection");
    private final static QName _ArrayOfNrdImportInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "ArrayOfNrdImportInfo");
    private final static QName _NrdImportInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "NrdImportInfo");
    private final static QName _NrdImportInfoExpDealId_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "ExpDealId");
    private final static QName _NrdImportInfoExpLiabilityId_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "ExpLiabilityId");
    private final static QName _NrdImportInfoFocusTradeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "FocusTradeId");
    private final static QName _NrdImportInfoFocusTradeId2_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "FocusTradeId2");
    private final static QName _NrdImportInfoIsMoneyLiability_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "IsMoneyLiability");
    private final static QName _NrdImportInfoMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Message");
    private final static QName _NrdImportInfoRegNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "RegNo");
    private final static QName _NrdImportInfoCollectionItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Items");
    private final static QName _NrdSecLiabilityBasis_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Basis");
    private final static QName _NrdSecLiabilityFocusTradeID1_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Focus_tradeID1");
    private final static QName _NrdSecLiabilityFocusTradeID2_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Focus_tradeID2");
    private final static QName _NrdSecLiabilityLinkExp_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Link_exp");
    private final static QName _NrdSecLiabilityRegNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Reg_no");
    private final static QName _NrdSecLiabilitySecIsin_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Sec_isin");
    private final static QName _NrdSecLiabilityIType_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "i_type");
    private final static QName _NrdSecLiabilityInstrument_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "instrument");
    private final static QName _NrdSecLiabilityPaymentCcy_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "payment_ccy");
    private final static QName _NrdSecLiabilityQty_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "qty");
    private final static QName _NrdSecLiabilityStandardSettlementDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "standard_settlement_date");
    private final static QName _NrdCashLiabilityCashOpen_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Cash_open");
    private final static QName _NrdCashLiabilityErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "ErrorMessage");
    private final static QName _NrdCashLiabilityFocusTradeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Focus_tradeID");
    private final static QName _NrdCashLiabilityInterest_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Interest");
    private final static QName _NrdCashLiabilityTransactionStateId_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "TransactionState_id");
    private final static QName _NrdLiabilityBacketC_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Backet_c");
    private final static QName _NrdLiabilityExpId_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Exp_id");
    private final static QName _NrdLiabilityFMoney_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "F_money");
    private final static QName _NrdLiabilityNrdSecLiabilities_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "NrdSecLiabilities");
    private final static QName _NrdLiabilityAccountingBasket_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "accounting_basket");
    private final static QName _NrdTradeBaseChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Channel");
    private final static QName _NrdTradeBaseExpNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Exp_num");
    private final static QName _NrdTradeBaseExpdealId_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Expdeal_id");
    private final static QName _NrdTradeBaseExrqntnDt_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Exrqntn_dt");
    private final static QName _NrdTradeBaseLiabilities_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Liabilities");
    private final static QName _NrdTradeBasePortfolio_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Portfolio");
    private final static QName _NrdTradeBaseProfitCenter_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "ProfitCenter");
    private final static QName _NrdTradeBaseRegDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Reg_date");
    private final static QName _NrdTradeBaseTermntnDt_QNAME = new QName("http://schemas.datacontract.org/2004/07/_BaseObjects", "Termntn_dt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07._baseobjects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NrdTradeBase }
     * 
     */
    public NrdTradeBase createNrdTradeBase() {
        return new NrdTradeBase();
    }

    /**
     * Create an instance of {@link ArrayOfNrdLiability }
     * 
     */
    public ArrayOfNrdLiability createArrayOfNrdLiability() {
        return new ArrayOfNrdLiability();
    }

    /**
     * Create an instance of {@link NrdLiability }
     * 
     */
    public NrdLiability createNrdLiability() {
        return new NrdLiability();
    }

    /**
     * Create an instance of {@link NrdCashLiability }
     * 
     */
    public NrdCashLiability createNrdCashLiability() {
        return new NrdCashLiability();
    }

    /**
     * Create an instance of {@link ArrayOfNrdSecLiability }
     * 
     */
    public ArrayOfNrdSecLiability createArrayOfNrdSecLiability() {
        return new ArrayOfNrdSecLiability();
    }

    /**
     * Create an instance of {@link NrdSecLiability }
     * 
     */
    public NrdSecLiability createNrdSecLiability() {
        return new NrdSecLiability();
    }

    /**
     * Create an instance of {@link NrdImportInfoCollection }
     * 
     */
    public NrdImportInfoCollection createNrdImportInfoCollection() {
        return new NrdImportInfoCollection();
    }

    /**
     * Create an instance of {@link ArrayOfNrdImportInfo }
     * 
     */
    public ArrayOfNrdImportInfo createArrayOfNrdImportInfo() {
        return new ArrayOfNrdImportInfo();
    }

    /**
     * Create an instance of {@link NrdImportInfo }
     * 
     */
    public NrdImportInfo createNrdImportInfo() {
        return new NrdImportInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NrdTradeBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "NrdTradeBase")
    public JAXBElement<NrdTradeBase> createNrdTradeBase(NrdTradeBase value) {
        return new JAXBElement<NrdTradeBase>(_NrdTradeBase_QNAME, NrdTradeBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNrdLiability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "ArrayOfNrdLiability")
    public JAXBElement<ArrayOfNrdLiability> createArrayOfNrdLiability(ArrayOfNrdLiability value) {
        return new JAXBElement<ArrayOfNrdLiability>(_ArrayOfNrdLiability_QNAME, ArrayOfNrdLiability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NrdLiability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "NrdLiability")
    public JAXBElement<NrdLiability> createNrdLiability(NrdLiability value) {
        return new JAXBElement<NrdLiability>(_NrdLiability_QNAME, NrdLiability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NrdCashLiability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "NrdCashLiability")
    public JAXBElement<NrdCashLiability> createNrdCashLiability(NrdCashLiability value) {
        return new JAXBElement<NrdCashLiability>(_NrdCashLiability_QNAME, NrdCashLiability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNrdSecLiability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "ArrayOfNrdSecLiability")
    public JAXBElement<ArrayOfNrdSecLiability> createArrayOfNrdSecLiability(ArrayOfNrdSecLiability value) {
        return new JAXBElement<ArrayOfNrdSecLiability>(_ArrayOfNrdSecLiability_QNAME, ArrayOfNrdSecLiability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NrdSecLiability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "NrdSecLiability")
    public JAXBElement<NrdSecLiability> createNrdSecLiability(NrdSecLiability value) {
        return new JAXBElement<NrdSecLiability>(_NrdSecLiability_QNAME, NrdSecLiability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NrdImportInfoCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "NrdImportInfoCollection")
    public JAXBElement<NrdImportInfoCollection> createNrdImportInfoCollection(NrdImportInfoCollection value) {
        return new JAXBElement<NrdImportInfoCollection>(_NrdImportInfoCollection_QNAME, NrdImportInfoCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNrdImportInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "ArrayOfNrdImportInfo")
    public JAXBElement<ArrayOfNrdImportInfo> createArrayOfNrdImportInfo(ArrayOfNrdImportInfo value) {
        return new JAXBElement<ArrayOfNrdImportInfo>(_ArrayOfNrdImportInfo_QNAME, ArrayOfNrdImportInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NrdImportInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "NrdImportInfo")
    public JAXBElement<NrdImportInfo> createNrdImportInfo(NrdImportInfo value) {
        return new JAXBElement<NrdImportInfo>(_NrdImportInfo_QNAME, NrdImportInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "ExpDealId", scope = NrdImportInfo.class)
    public JAXBElement<Double> createNrdImportInfoExpDealId(Double value) {
        return new JAXBElement<Double>(_NrdImportInfoExpDealId_QNAME, Double.class, NrdImportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "ExpLiabilityId", scope = NrdImportInfo.class)
    public JAXBElement<Integer> createNrdImportInfoExpLiabilityId(Integer value) {
        return new JAXBElement<Integer>(_NrdImportInfoExpLiabilityId_QNAME, Integer.class, NrdImportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "FocusTradeId", scope = NrdImportInfo.class)
    public JAXBElement<Integer> createNrdImportInfoFocusTradeId(Integer value) {
        return new JAXBElement<Integer>(_NrdImportInfoFocusTradeId_QNAME, Integer.class, NrdImportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "FocusTradeId2", scope = NrdImportInfo.class)
    public JAXBElement<Integer> createNrdImportInfoFocusTradeId2(Integer value) {
        return new JAXBElement<Integer>(_NrdImportInfoFocusTradeId2_QNAME, Integer.class, NrdImportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "IsMoneyLiability", scope = NrdImportInfo.class)
    public JAXBElement<Boolean> createNrdImportInfoIsMoneyLiability(Boolean value) {
        return new JAXBElement<Boolean>(_NrdImportInfoIsMoneyLiability_QNAME, Boolean.class, NrdImportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Message", scope = NrdImportInfo.class)
    public JAXBElement<String> createNrdImportInfoMessage(String value) {
        return new JAXBElement<String>(_NrdImportInfoMessage_QNAME, String.class, NrdImportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "RegNo", scope = NrdImportInfo.class)
    public JAXBElement<String> createNrdImportInfoRegNo(String value) {
        return new JAXBElement<String>(_NrdImportInfoRegNo_QNAME, String.class, NrdImportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNrdImportInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Items", scope = NrdImportInfoCollection.class)
    public JAXBElement<ArrayOfNrdImportInfo> createNrdImportInfoCollectionItems(ArrayOfNrdImportInfo value) {
        return new JAXBElement<ArrayOfNrdImportInfo>(_NrdImportInfoCollectionItems_QNAME, ArrayOfNrdImportInfo.class, NrdImportInfoCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Basis", scope = NrdSecLiability.class)
    public JAXBElement<Integer> createNrdSecLiabilityBasis(Integer value) {
        return new JAXBElement<Integer>(_NrdSecLiabilityBasis_QNAME, Integer.class, NrdSecLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Focus_tradeID1", scope = NrdSecLiability.class)
    public JAXBElement<Integer> createNrdSecLiabilityFocusTradeID1(Integer value) {
        return new JAXBElement<Integer>(_NrdSecLiabilityFocusTradeID1_QNAME, Integer.class, NrdSecLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Focus_tradeID2", scope = NrdSecLiability.class)
    public JAXBElement<Integer> createNrdSecLiabilityFocusTradeID2(Integer value) {
        return new JAXBElement<Integer>(_NrdSecLiabilityFocusTradeID2_QNAME, Integer.class, NrdSecLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Link_exp", scope = NrdSecLiability.class)
    public JAXBElement<Double> createNrdSecLiabilityLinkExp(Double value) {
        return new JAXBElement<Double>(_NrdSecLiabilityLinkExp_QNAME, Double.class, NrdSecLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Reg_no", scope = NrdSecLiability.class)
    public JAXBElement<String> createNrdSecLiabilityRegNo(String value) {
        return new JAXBElement<String>(_NrdSecLiabilityRegNo_QNAME, String.class, NrdSecLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Sec_isin", scope = NrdSecLiability.class)
    public JAXBElement<String> createNrdSecLiabilitySecIsin(String value) {
        return new JAXBElement<String>(_NrdSecLiabilitySecIsin_QNAME, String.class, NrdSecLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "i_type", scope = NrdSecLiability.class)
    public JAXBElement<String> createNrdSecLiabilityIType(String value) {
        return new JAXBElement<String>(_NrdSecLiabilityIType_QNAME, String.class, NrdSecLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "instrument", scope = NrdSecLiability.class)
    public JAXBElement<Integer> createNrdSecLiabilityInstrument(Integer value) {
        return new JAXBElement<Integer>(_NrdSecLiabilityInstrument_QNAME, Integer.class, NrdSecLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "payment_ccy", scope = NrdSecLiability.class)
    public JAXBElement<Integer> createNrdSecLiabilityPaymentCcy(Integer value) {
        return new JAXBElement<Integer>(_NrdSecLiabilityPaymentCcy_QNAME, Integer.class, NrdSecLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "qty", scope = NrdSecLiability.class)
    public JAXBElement<Double> createNrdSecLiabilityQty(Double value) {
        return new JAXBElement<Double>(_NrdSecLiabilityQty_QNAME, Double.class, NrdSecLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "standard_settlement_date", scope = NrdSecLiability.class)
    public JAXBElement<Integer> createNrdSecLiabilityStandardSettlementDate(Integer value) {
        return new JAXBElement<Integer>(_NrdSecLiabilityStandardSettlementDate_QNAME, Integer.class, NrdSecLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Cash_open", scope = NrdCashLiability.class)
    public JAXBElement<Double> createNrdCashLiabilityCashOpen(Double value) {
        return new JAXBElement<Double>(_NrdCashLiabilityCashOpen_QNAME, Double.class, NrdCashLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "ErrorMessage", scope = NrdCashLiability.class)
    public JAXBElement<String> createNrdCashLiabilityErrorMessage(String value) {
        return new JAXBElement<String>(_NrdCashLiabilityErrorMessage_QNAME, String.class, NrdCashLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Focus_tradeID", scope = NrdCashLiability.class)
    public JAXBElement<Integer> createNrdCashLiabilityFocusTradeID(Integer value) {
        return new JAXBElement<Integer>(_NrdCashLiabilityFocusTradeID_QNAME, Integer.class, NrdCashLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Interest", scope = NrdCashLiability.class)
    public JAXBElement<Double> createNrdCashLiabilityInterest(Double value) {
        return new JAXBElement<Double>(_NrdCashLiabilityInterest_QNAME, Double.class, NrdCashLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Reg_no", scope = NrdCashLiability.class)
    public JAXBElement<String> createNrdCashLiabilityRegNo(String value) {
        return new JAXBElement<String>(_NrdSecLiabilityRegNo_QNAME, String.class, NrdCashLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "TransactionState_id", scope = NrdCashLiability.class)
    public JAXBElement<Integer> createNrdCashLiabilityTransactionStateId(Integer value) {
        return new JAXBElement<Integer>(_NrdCashLiabilityTransactionStateId_QNAME, Integer.class, NrdCashLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Backet_c", scope = NrdLiability.class)
    public JAXBElement<String> createNrdLiabilityBacketC(String value) {
        return new JAXBElement<String>(_NrdLiabilityBacketC_QNAME, String.class, NrdLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Exp_id", scope = NrdLiability.class)
    public JAXBElement<Double> createNrdLiabilityExpId(Double value) {
        return new JAXBElement<Double>(_NrdLiabilityExpId_QNAME, Double.class, NrdLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "F_money", scope = NrdLiability.class)
    public JAXBElement<Short> createNrdLiabilityFMoney(Short value) {
        return new JAXBElement<Short>(_NrdLiabilityFMoney_QNAME, Short.class, NrdLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NrdCashLiability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "NrdCashLiability", scope = NrdLiability.class)
    public JAXBElement<NrdCashLiability> createNrdLiabilityNrdCashLiability(NrdCashLiability value) {
        return new JAXBElement<NrdCashLiability>(_NrdCashLiability_QNAME, NrdCashLiability.class, NrdLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNrdSecLiability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "NrdSecLiabilities", scope = NrdLiability.class)
    public JAXBElement<ArrayOfNrdSecLiability> createNrdLiabilityNrdSecLiabilities(ArrayOfNrdSecLiability value) {
        return new JAXBElement<ArrayOfNrdSecLiability>(_NrdLiabilityNrdSecLiabilities_QNAME, ArrayOfNrdSecLiability.class, NrdLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Reg_no", scope = NrdLiability.class)
    public JAXBElement<String> createNrdLiabilityRegNo(String value) {
        return new JAXBElement<String>(_NrdSecLiabilityRegNo_QNAME, String.class, NrdLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "TransactionState_id", scope = NrdLiability.class)
    public JAXBElement<Short> createNrdLiabilityTransactionStateId(Short value) {
        return new JAXBElement<Short>(_NrdCashLiabilityTransactionStateId_QNAME, Short.class, NrdLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "accounting_basket", scope = NrdLiability.class)
    public JAXBElement<Short> createNrdLiabilityAccountingBasket(Short value) {
        return new JAXBElement<Short>(_NrdLiabilityAccountingBasket_QNAME, Short.class, NrdLiability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Channel", scope = NrdTradeBase.class)
    public JAXBElement<Integer> createNrdTradeBaseChannel(Integer value) {
        return new JAXBElement<Integer>(_NrdTradeBaseChannel_QNAME, Integer.class, NrdTradeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Exp_num", scope = NrdTradeBase.class)
    public JAXBElement<String> createNrdTradeBaseExpNum(String value) {
        return new JAXBElement<String>(_NrdTradeBaseExpNum_QNAME, String.class, NrdTradeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Expdeal_id", scope = NrdTradeBase.class)
    public JAXBElement<Double> createNrdTradeBaseExpdealId(Double value) {
        return new JAXBElement<Double>(_NrdTradeBaseExpdealId_QNAME, Double.class, NrdTradeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Exrqntn_dt", scope = NrdTradeBase.class)
    public JAXBElement<XMLGregorianCalendar> createNrdTradeBaseExrqntnDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NrdTradeBaseExrqntnDt_QNAME, XMLGregorianCalendar.class, NrdTradeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNrdLiability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Liabilities", scope = NrdTradeBase.class)
    public JAXBElement<ArrayOfNrdLiability> createNrdTradeBaseLiabilities(ArrayOfNrdLiability value) {
        return new JAXBElement<ArrayOfNrdLiability>(_NrdTradeBaseLiabilities_QNAME, ArrayOfNrdLiability.class, NrdTradeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Portfolio", scope = NrdTradeBase.class)
    public JAXBElement<Integer> createNrdTradeBasePortfolio(Integer value) {
        return new JAXBElement<Integer>(_NrdTradeBasePortfolio_QNAME, Integer.class, NrdTradeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "ProfitCenter", scope = NrdTradeBase.class)
    public JAXBElement<Integer> createNrdTradeBaseProfitCenter(Integer value) {
        return new JAXBElement<Integer>(_NrdTradeBaseProfitCenter_QNAME, Integer.class, NrdTradeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Reg_date", scope = NrdTradeBase.class)
    public JAXBElement<XMLGregorianCalendar> createNrdTradeBaseRegDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NrdTradeBaseRegDate_QNAME, XMLGregorianCalendar.class, NrdTradeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Reg_no", scope = NrdTradeBase.class)
    public JAXBElement<String> createNrdTradeBaseRegNo(String value) {
        return new JAXBElement<String>(_NrdSecLiabilityRegNo_QNAME, String.class, NrdTradeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "Termntn_dt", scope = NrdTradeBase.class)
    public JAXBElement<XMLGregorianCalendar> createNrdTradeBaseTermntnDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NrdTradeBaseTermntnDt_QNAME, XMLGregorianCalendar.class, NrdTradeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/_BaseObjects", name = "TransactionState_id", scope = NrdTradeBase.class)
    public JAXBElement<Short> createNrdTradeBaseTransactionStateId(Short value) {
        return new JAXBElement<Short>(_NrdCashLiabilityTransactionStateId_QNAME, Short.class, NrdTradeBase.class, value);
    }

}
