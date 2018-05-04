Feature: Checking registering deals

    Scenario Outline: trademonitor
        Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
        When init focus session for username "<login>" with loginName "<loginName>"
        When load trademonitor for deal number "<tradeId>" with horizon from "<horizon>"
        And try execute STP action
        Then I should be told "Nope"

        Examples:
            | login   | loginName | tradeId | horizon |
            | MKinder | MKinder | 1984951 | 2018-04-24 |
