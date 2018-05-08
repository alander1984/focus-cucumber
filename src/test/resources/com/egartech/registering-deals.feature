Feature: Checking registering deals

    Scenario Outline: trademonitor
        Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
        When init focus session for username "<login>" with loginName "<loginName>"
        When load trademonitor for deal number "<tradeId>" with horizon from "<horizon>"
        And try execute STP action
        When Send xml tryExecuteSTPAction with params "<stpAction>" and "<execute>"
        When Send xml GetEventsSchedule with params "<showCanceledEvents>"
        When Send xml ScheduleGetParameter with params "<fieldName>" and "<eventId>" and "<parameter>"
        When Send xml ScheduleGetProperty with params "<fieldName>" and "<property>"
        When Send xml CloseSession without  params

        Examples:
            | login   | loginName | tradeId | horizon | stpAction | execute | showCanceledEvents | fieldName | eventId | parameter| property |
            | MKinder | MKinder | 1984951 | 2018-04-24 | Cancel | false     |      false        | EventsSchedule | 3486461 |  DealCcyName | IsReadOnly|
