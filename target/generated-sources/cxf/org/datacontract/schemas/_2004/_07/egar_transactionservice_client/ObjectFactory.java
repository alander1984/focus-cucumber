
package org.datacontract.schemas._2004._07.egar_transactionservice_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.egar_transactionservice_client package. 
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

    private final static QName _DealType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "deal_type");
    private final static QName _InstrType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "instr_type");
    private final static QName _TradeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "trade_type");
    private final static QName _DealEventStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "DealEventStatus");
    private final static QName _TradeStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "trade_status");
    private final static QName _BoStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "bo_status");
    private final static QName _PayInterest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "pay_interest");
    private final static QName _SettleType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "settle_type");
    private final static QName _CDSTypePriceofCurv_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "CDSTypePriceofCurv");
    private final static QName _CDSInputModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "CDSInputModel");
    private final static QName _ArrayOfDealEventStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "ArrayOfDealEventStatus");
    private final static QName _FOStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "FO_Status");
    private final static QName _RiskStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "risk_status");
    private final static QName _BOParamStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "BO_Param_Status");
    private final static QName _AccountingStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "AccountingStatus");
    private final static QName _CtptLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "ctpt_level");
    private final static QName _FdObjectType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "fd_object_type");
    private final static QName _TradeLsStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "trade_ls_status");
    private final static QName _NrdImportState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", "NrdImportState");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.egar_transactionservice_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfDealEventStatus }
     * 
     */
    public ArrayOfDealEventStatus createArrayOfDealEventStatus() {
        return new ArrayOfDealEventStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "deal_type")
    public JAXBElement<String> createDealType(String value) {
        return new JAXBElement<String>(_DealType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "instr_type")
    public JAXBElement<String> createInstrType(String value) {
        return new JAXBElement<String>(_InstrType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "trade_type")
    public JAXBElement<TradeType> createTradeType(TradeType value) {
        return new JAXBElement<TradeType>(_TradeType_QNAME, TradeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DealEventStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "DealEventStatus")
    public JAXBElement<DealEventStatus> createDealEventStatus(DealEventStatus value) {
        return new JAXBElement<DealEventStatus>(_DealEventStatus_QNAME, DealEventStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "trade_status")
    public JAXBElement<TradeStatus> createTradeStatus(TradeStatus value) {
        return new JAXBElement<TradeStatus>(_TradeStatus_QNAME, TradeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "bo_status")
    public JAXBElement<BoStatus> createBoStatus(BoStatus value) {
        return new JAXBElement<BoStatus>(_BoStatus_QNAME, BoStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayInterest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "pay_interest")
    public JAXBElement<PayInterest> createPayInterest(PayInterest value) {
        return new JAXBElement<PayInterest>(_PayInterest_QNAME, PayInterest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "settle_type")
    public JAXBElement<SettleType> createSettleType(SettleType value) {
        return new JAXBElement<SettleType>(_SettleType_QNAME, SettleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CDSTypePriceofCurv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "CDSTypePriceofCurv")
    public JAXBElement<CDSTypePriceofCurv> createCDSTypePriceofCurv(CDSTypePriceofCurv value) {
        return new JAXBElement<CDSTypePriceofCurv>(_CDSTypePriceofCurv_QNAME, CDSTypePriceofCurv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CDSInputModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "CDSInputModel")
    public JAXBElement<CDSInputModel> createCDSInputModel(CDSInputModel value) {
        return new JAXBElement<CDSInputModel>(_CDSInputModel_QNAME, CDSInputModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDealEventStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "ArrayOfDealEventStatus")
    public JAXBElement<ArrayOfDealEventStatus> createArrayOfDealEventStatus(ArrayOfDealEventStatus value) {
        return new JAXBElement<ArrayOfDealEventStatus>(_ArrayOfDealEventStatus_QNAME, ArrayOfDealEventStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FOStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "FO_Status")
    public JAXBElement<FOStatus> createFOStatus(FOStatus value) {
        return new JAXBElement<FOStatus>(_FOStatus_QNAME, FOStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiskStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "risk_status")
    public JAXBElement<RiskStatus> createRiskStatus(RiskStatus value) {
        return new JAXBElement<RiskStatus>(_RiskStatus_QNAME, RiskStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOParamStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "BO_Param_Status")
    public JAXBElement<BOParamStatus> createBOParamStatus(BOParamStatus value) {
        return new JAXBElement<BOParamStatus>(_BOParamStatus_QNAME, BOParamStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "AccountingStatus")
    public JAXBElement<AccountingStatus> createAccountingStatus(AccountingStatus value) {
        return new JAXBElement<AccountingStatus>(_AccountingStatus_QNAME, AccountingStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CtptLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "ctpt_level")
    public JAXBElement<CtptLevel> createCtptLevel(CtptLevel value) {
        return new JAXBElement<CtptLevel>(_CtptLevel_QNAME, CtptLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FdObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "fd_object_type")
    public JAXBElement<FdObjectType> createFdObjectType(FdObjectType value) {
        return new JAXBElement<FdObjectType>(_FdObjectType_QNAME, FdObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeLsStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "trade_ls_status")
    public JAXBElement<TradeLsStatus> createTradeLsStatus(TradeLsStatus value) {
        return new JAXBElement<TradeLsStatus>(_TradeLsStatus_QNAME, TradeLsStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NrdImportState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Egar.TransactionService.Client.Trades", name = "NrdImportState")
    public JAXBElement<NrdImportState> createNrdImportState(NrdImportState value) {
        return new JAXBElement<NrdImportState>(_NrdImportState_QNAME, NrdImportState.class, null, value);
    }

}
