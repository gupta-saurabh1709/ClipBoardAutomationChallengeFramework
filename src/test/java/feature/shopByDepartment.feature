Feature: Shop By Department - Select TV from TV,Appliances,Electronics dropdown

  Background:User clicked on the hamburger menu
    Given User Open Amazon
    When User clicks on the hamburger menu

  Scenario: Select TV from TV,Appliances,Electronics under Shop By Department header
    Then Shop By Department header should display
    When User clicks on TV_Appliances_Electronics dropdown
    Then User clicks on Television