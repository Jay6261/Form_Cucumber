

@tag
Feature: Login Feature
 

  @tag1
  Scenario: Validating login page
    Given user open chrome and enters url
    When user enters username
    And user enters password
    And clicks on login
    Then Welcome back message is displayed

 
