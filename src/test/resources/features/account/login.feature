Feature: Login
  As a Facebook user
  I want to see my timeline
  So that I can like or comment my friend post


  Scenario: Login Success
    Given I am on the Login Page
    When I enter my username and password correctly
    And I click 'Login' button
    Then I am taken to the dashboard

  Scenario: Login Failed because username wrong
    Given I am on the Login Page failed username
    When I enter wrong my username
    And I click 'Login' button failed username
    Then I am taken to the dashboard failed username

  Scenario: Login failed because password wrong
    Given  I am on the login page pass
    When I enter wrong my pass
    And I click 'Login' button pass
    Then I am taken to dashbord failed wrong pass

  Scenario: Login failed username blank
    Given I am on the login page blank
    When I enter password without username
    And I click 'Login' button blank
    Then I am taken pop up masukan username






