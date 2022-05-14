@tag
Feature: Testing Actitime Aplication

  @tag1
  Scenario: Testing ActiTime Login functionality by valid User
    Given User Already having Aplication Url
    And Also having Uesrname and Password
    When User Enter Username and Password and click on login button
   
    Then Actitime home page should be Display
    And close the browser
