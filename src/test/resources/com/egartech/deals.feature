 Feature: Deals
   Scenario Outline: fwd_fix_b2b_bond
     Given the web service is running at "alfaload-app.egar.egartech.com" port "6767"
     When init focus session for username "<login>" with loginName "<loginName>"
     And try execute STP action
     When initialize session with params: "<loginName>" and "<loginName>" and "ALFALOAD-CL" and "Focus32" and "<International>" and "," and "<numberGroupSeparator>" and "dd.MM.yyyy"
     When creat new deal with params : "SpotForward" and "Bond" and "PropOTC"
#~4
     When deal Field Change with params "TradeType" and "2"
   #  When deal Field Change with params "TradeType" and "2"
     When deal Field Change with params "TradeDate" and "2018-04-12T00:00:00+03:00"
   #  When deal Field Change with params "TradeDate" and "2018-04-12T00:00:00+03:00"
     When deal Field Change with params "MarginSystem" and "23"
     When deal Field Change with params "Underlying" and "83137"
     When deal Field Change with params "QtyItems" and "100"
     When deal Field Change with params "Price" and "100"
     When deal Field Change with params "CostCenter" and "201"
     When deal Field Change with params "Portfolio" and "214"
     When deal Field Change with params "Book" and "1420"
     When deal Field Change with params "DestCostCenter" and "201"
     When deal Field Change with params "DestPortfolio" and "214"
     When deal Field Change with params "DestBook" and "1419"
     When deal Field Change with params "DestBook" and "1419"
     When deal Field Change with params "Channel" and "3"
#17

     When action on a transaction action: "ForControl" execute takes on values true or false "false"
     # Попробуй переписать именно этот метод.....
     When action on a transaction action: "ForControl" execute takes on values true or false "true"
     When close session


     Examples:
       | login   | loginName |International|numberGroupSeparator|
       | MKinder | MKinder |               |                    |