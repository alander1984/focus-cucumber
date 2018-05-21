   Feature: Checking registering deals
       Scenario Outline: 1
          Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
          When init focus session for username "<login>" with loginName "<loginName>"
          When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
          When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
         When deal Field Change with params "TradeType" and "1"
         When deal Field Change with params "TradeDate" and "01.03.2018"
         When deal Field Change with params "MarginSystem" and ""
         When deal Field Change with params "Underlying" and "81573"
         When deal Field Change with params "Counterparty" and "10000448"
         When deal Field Change with params "Channel" and "8"
         When deal Field Change with params "Book" and "63"
         When deal Field Change with params "OpenForward" and "0"
         When deal Field Change with params "TradeTime" and "12:00:00"
         When deal Field Change with params "Qty" and "1000000"
         When deal Field Change with params "Side" and "1"
         When deal Field Change with params "SettlementType" and "0"
         When deal Field Change with params "IsStandard" and "true"
         When deal Field Change with params "IsForMargin" and "0"
         When deal Field Change with params "InstrType" and "7"
         When deal Field Change with params "DealPrice" and "94,354"
         When deal Field Change with params "ExpiryDate" and "11.05.2018"
         When deal Field Change with params "Settlement" and "2"
         When deal Field Change with params "Custodian" and "644"
         When deal Field Change with params "InterestRate" and ""
         When deal Field Change with params "Branch" and "28931"
         When deal Field Change with params "DestBook" and ""
         When close session


         Examples:
           | login   | loginName |
           | MKinder | MKinder |

     Scenario Outline: 2
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "1"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and ""
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "10000448"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "0"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "-1"
       When deal Field Change with params "SettlementType" and "1"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "0"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and ""
       When deal Field Change with params "Custodian" and ""
       When deal Field Change with params "InterestRate" and ""
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |


     Scenario Outline: 3
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "1"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "25"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "10000448"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "1"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "1"
       When deal Field Change with params "SettlementType" and "0"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and "5"
       When deal Field Change with params "Custodian" and "644"
       When deal Field Change with params "InterestRate" and "10"
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 4
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "1"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "23"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "10000448"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "1"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "-1"
       When deal Field Change with params "SettlementType" and "1"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and ""
       When deal Field Change with params "Custodian" and ""
       When deal Field Change with params "InterestRate" and "10"
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 5
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "1"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "23"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "10000448"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "0"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "1"
       When deal Field Change with params "SettlementType" and "0"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and "1"
       When deal Field Change with params "Custodian" and "644"
       When deal Field Change with params "InterestRate" and ""
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 6
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "1"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "25"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "10000448"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "0"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "-1"
       When deal Field Change with params "SettlementType" and "1"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and ""
       When deal Field Change with params "Custodian" and ""
       When deal Field Change with params "InterestRate" and ""
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 8
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "1"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and ""
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "10000448"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "1"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "-1"
       When deal Field Change with params "SettlementType" and "1"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "0"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and ""
       When deal Field Change with params "Custodian" and ""
       When deal Field Change with params "InterestRate" and "10"
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 9
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "1"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "25"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "10000448"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "0"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "1"
       When deal Field Change with params "SettlementType" and "0"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and "5"
       When deal Field Change with params "Custodian" and "644"
       When deal Field Change with params "InterestRate" and ""
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 10
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "1"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "23"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "10000448"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "0"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "-1"
       When deal Field Change with params "SettlementType" and "1"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and ""
       When deal Field Change with params "Custodian" and ""
       When deal Field Change with params "InterestRate" and ""
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |



     Scenario Outline: 11
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "1"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "23"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "10000448"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "1"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "1"
       When deal Field Change with params "SettlementType" and "0"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and "1"
       When deal Field Change with params "Custodian" and "644"
       When deal Field Change with params "InterestRate" and "10"
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 12
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "1"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and ""
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "10000448"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "1"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "-1"
       When deal Field Change with params "SettlementType" and "1"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "0"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and ""
       When deal Field Change with params "Custodian" and ""
       When deal Field Change with params "InterestRate" and "10"
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 13
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "2"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and ""
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and ""
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "0"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "1"
       When deal Field Change with params "SettlementType" and "0"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "0"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and "1"
       When deal Field Change with params "Custodian" and "644"
       When deal Field Change with params "InterestRate" and ""
       When deal Field Change with params "Branch" and ""
       When deal Field Change with params "DestBook" and "1372"
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 14
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "2"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "25"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and ""
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "0"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "-1"
       When deal Field Change with params "SettlementType" and "1"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and ""
       When deal Field Change with params "Custodian" and ""
       When deal Field Change with params "InterestRate" and ""
       When deal Field Change with params "Branch" and ""
       When deal Field Change with params "DestBook" and "1372"
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 15
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "2"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "25"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and ""
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "1"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "1"
       When deal Field Change with params "SettlementType" and "0"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and "2"
       When deal Field Change with params "Custodian" and "644"
       When deal Field Change with params "InterestRate" and "10"
       When deal Field Change with params "Branch" and ""
       When deal Field Change with params "DestBook" and "1372"
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 16
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "2"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "23"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and ""
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and "63"
       When deal Field Change with params "OpenForward" and "1"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "-1"

       When deal Field Change with params "SettlementType" and "1"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and ""
       When deal Field Change with params "Custodian" and ""
       When deal Field Change with params "InterestRate" and "10"
       When deal Field Change with params "Branch" and ""
       When deal Field Change with params "DestBook" and "1372"
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 17
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "7"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "24"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "39849"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and ""
       When deal Field Change with params "OpenForward" and "0"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "1"
       When deal Field Change with params "SettlementType" and "0"
       When deal Field Change with params "IsStandard" and "true"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and "2"
       When deal Field Change with params "Custodian" and "644"
       When deal Field Change with params "InterestRate" and ""
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |

     Scenario Outline: 18
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "7"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "25"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "39849"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and ""
       When deal Field Change with params "OpenForward" and "0"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "-1"
       When deal Field Change with params "SettlementType" and "1"
       When deal Field Change with params "IsStandard" and "false"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and ""
       When deal Field Change with params "Custodian" and ""
       When deal Field Change with params "InterestRate" and ""
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |


     Scenario Outline: 19
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "7"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and ""
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "39849"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and ""
       When deal Field Change with params "OpenForward" and "1"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "1"
       When deal Field Change with params "SettlementType" and "0"
       When deal Field Change with params "IsStandard" and "false"
       When deal Field Change with params "IsForMargin" and "0"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and "5"
       When deal Field Change with params "Custodian" and "644"
       When deal Field Change with params "InterestRate" and "10"
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |


     Scenario Outline: 20
       Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
       When init focus session for username "<login>" with loginName "<loginName>"
       When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
       When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
       When deal Field Change with params "TradeType" and "7"
       When deal Field Change with params "TradeDate" and "01.03.2018"
       When deal Field Change with params "MarginSystem" and "23"
       When deal Field Change with params "Underlying" and "81573"
       When deal Field Change with params "Counterparty" and "39849"
       When deal Field Change with params "Channel" and "8"
       When deal Field Change with params "Book" and ""
       When deal Field Change with params "OpenForward" and "1"
       When deal Field Change with params "TradeTime" and "12:00:00"
       When deal Field Change with params "Qty" and "1000000"
       When deal Field Change with params "Side" and "-1"
       When deal Field Change with params "SettlementType" and "1"
       When deal Field Change with params "IsStandard" and "false"
       When deal Field Change with params "IsForMargin" and "1"
       When deal Field Change with params "InstrType" and "7"
       When deal Field Change with params "DealPrice" and "94,354"
       When deal Field Change with params "ExpiryDate" and "11.05.2018"
       When deal Field Change with params "Settlement" and ""
       When deal Field Change with params "Custodian" and ""
       When deal Field Change with params "InterestRate" and "10"
       When deal Field Change with params "Branch" and "28931"
       When deal Field Change with params "DestBook" and ""
       When close session


       Examples:
         | login   | loginName |
         | MKinder | MKinder |
