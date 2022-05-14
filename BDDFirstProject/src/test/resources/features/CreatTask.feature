@tag
Feature: Testing actitime apllication

  @tag1
  Scenario: Testing ActiTime Login functionality for valid user
    Given Uese already having Apllication Url
    And Also having Username and Password
    When User enter Username and password and  Clicks on Login button
    Then ActiTime Homepage should be Displayed
    And Closed the browser

  @tag2
  Scenario: Testing ActiTime Task Creation  functionality for valid user
    Given Uese already having Apllication Url
    And Also having Username and Password
    When User enter Username and password and  Clicks on Login button
    And user click on tasks button
    And uesr click on add new button and select new task option
    And user click on Main Project dropdown arrow and select Galaxy Corporation
    And user click on sub Project dropdown arrow and select android prototype
    And user enter task name as ATesting
    And user select worktype as testing and click on creat task button
    Then ActiTime Task will be Created
    And Closed the browser
