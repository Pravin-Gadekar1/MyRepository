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
  Scenario Outline: Testing Actitime login functionality By user <user> <username> <password>
    Given User already having Application Url as <url>
    And also having username as <username> and password as <password>
    When user enters username and password and click on login button
    Then Actitime home page will be displayed with application  page title as <title>
   And Closed the browser

    Examples: 
      | user    | url                        | username | password  | title                       |
      | valid   | https://demo.actitime.com/ | admin    | manager   | actiTIME - Enter Time-Track |
      | invalid | https://demo.actitime.com/ | admin12  | manager   | actiTIME - Login            |
      | invalid | https://demo.actitime.com/ | admin    | manager23 | actiTIME - Login            |
