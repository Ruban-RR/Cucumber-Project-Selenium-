Feature: Login Page

  Scenario Outline: To check the login functionality.
    Given I am on the saucedemo login page
    When I enter the Username "<user>"
    And I enter the Password "<pass>"
    And I click the Login button
    Then I should see an error msg as login failed if login failed

    Examples: 
      | user | pass    |
      | locked_out_user | secret_sauce |
      | standard_user   | secret_sauce |
