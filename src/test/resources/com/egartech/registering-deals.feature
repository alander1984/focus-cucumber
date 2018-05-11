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
        When deal Field Change with params "<names>" and "<value>"


        Examples:
            | login   | loginName | windowsLoginName| hostName|aplicationName|International|numberDecimalSeparator|numberGroupSeparator|ShortDatePatern| dealType|instrType|fieldsFilter|ButtonName|fieldName|action|val|names|value|
            | MKinder | MKinder |           MKinder        |   ALFALOAD-CL      |      Focus32        |             |   ,                   |                     |        dd.MM.yyyy       |SpotForward|Bond||Counterparty|Counterparty|Reload||||