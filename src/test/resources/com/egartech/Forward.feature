   Feature: Checking registering deals
       Scenario Outline: 245
          Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
          When init focus session for username "<login>" with loginName "<loginName>"
          And try execute STP action
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
         # проверь QTY
         When deal Field Change with params "Qty" and "1000000"
         When deal Field Change with params "Side" and "1"
         When deal Field Change with params "SettlementType" and "0"


       #
       #
        # When deal Field Change with params "IsStandard" and "0"
       #   When deal Field Change with params "IsForMargin" and "0"
       #   When deal Field Change with params "InstrType" and "7"
       #
        #
       #   When deal Field Change with params "DealPrice" and "94,354"
       #   When deal Field Change with params "ExpiryDate" and ""
       #   When deal Field Change with params "Settlement" and "2"
       #   When deal Field Change with params "Custodian" and "644"
       #   When deal Field Change with params "InterestRate" and ""
       #   When deal Field Change with params "Branch" and "28931"
       #
       #   When deal Field Change with params "DestBook" and ""

       #   When close session


               Examples:
               | login   | loginName | tradeId | horizon | stpAction | execute | Events | fieldName | eventId | parameter| property |
               | MKinder | MKinder | 1984951 | 2018-04-24 | Cancel | false     |      false        | EventsSchedule | 3486461 |  DealCcyName | IsReadOnly|



