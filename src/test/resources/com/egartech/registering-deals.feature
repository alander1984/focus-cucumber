   Feature: Checking registering deals
       Scenario Outline: trademonitor
          Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
          When init focus session for username "<login>" with loginName "<loginName>"
          When load trademonitor for deal number "<tradeId>" with horizon from "<horizon>"
          And try execute STP action
          When action on a transaction action: "<stpAction>" execute takes on values true or false "<execute>"
          When get events schedule "<Events>"
          When get  Schedule Parameter with Name:"<fieldName>" Event:"<eventId>" Parametr:"<parameter>"
          When get  Schedule Property with Name: "<fieldName>" and "<property>"
          When get  Schedule Property with Name: "" and ""
          When close session

               Examples:
               | login   | loginName | tradeId | horizon | stpAction | execute | Events | fieldName | eventId | parameter| property |
               | MKinder | MKinder | 1984951 | 2018-04-24 | Cancel | false     |      false        | EventsSchedule | 3486461 |  DealCcyName | IsReadOnly|

       Scenario Outline: fwd_fix_otc_eq

         Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
          When init focus session for username "<login>" with loginName "<loginName>"
          And try execute STP action
          When initialize session with params: "<loginName>" and "<windowsLoginName>" and "<hostName>" and "<aplicationName>" and "<International>" and "<numberDecimalSeparator>" and "<numberGroupSeparator>" and "<ShortDatePatern>"
          When creat new deal with params : "<dealType>" and "<instrType>" and "<fieldsFilter>"
          When click Button by name : "<ButtonName>"
          When deal Field Action with params "<fieldName>" and "<action>" and "<val>"
          When deal Field Change with params "Counterparty" and "<84238169>"
          When deal Field Change with params "TradeTime" and "2018-04-16T01:00:00+03:00"
          When deal Field Change with params "IsStandard" and "False"
          When deal Field Change with params "MarginSystem" and "23"
          When deal Field Change with params "InstrType" and "9"
          When deal Field Change with params "ForwardInstrType" and "0"
          When deal Field Change with params "Underlying" and "854"
          When deal Field Change with params "TradeTime" and "2018-04-16T01:00:00+03:00"
          When deal Field Change with params "Qty" and "120"
          When deal Field Change with params "DealPrice" and "100"
          When deal Field Change with params "Settlement" and "2"
          When deal Field Change with params "TradeDate" and "2018-04-07T00:00:00+03:00"
          When deal Field Change with params "Custodian" and "627"
          When click Button by name : "Branch"
          When deal Field Action with params "Branch" and "Reload" and "<val>"
          When deal Field Change with params "Branch" and "39849"
          When deal Field Change with params "CostCenter" and "201"
          When deal Field Change with params "Portfolio" and "214"
          When deal Field Change with params "Book" and "1420"
          When deal Field Change with params "Channel" and "4"
          When action on a transaction action: "ForControl" execute takes on values true or false "false"
          When action on a transaction action: "ForControl" execute takes on values true or false "true"
          When close session



         Examples:
              | login   | loginName | windowsLoginName| hostName|aplicationName|International|numberDecimalSeparator|numberGroupSeparator|ShortDatePatern| dealType|instrType|fieldsFilter|ButtonName|fieldName|action|val|names|value|
              | MKinder | MKinder |           MKinder        |   ALFALOAD-CL      |      Focus32        |             |   ,                   |                     |        dd.MM.yyyy       |SpotForward|Bond||Counterparty|Counterparty|Reload||||