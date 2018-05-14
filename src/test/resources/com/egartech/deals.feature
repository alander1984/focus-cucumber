 Feature: Deals
   Scenario Outline: fwd_fix_b2b_bond
     Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
     When init focus session for username "<login>" with loginName "<loginName>"
     And try execute STP action
     When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
     When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
     When deal Field Change with params "TradeType" and "2"

     Examples:
       | login   | loginName |International|numberGroupSeparator|
       | MKinder | MKinder |               |                    |