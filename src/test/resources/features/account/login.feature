Feature: Login
  As a linkid user
  I want to see my timeline
  So that I can like or comment my friend post


  Scenario: Login Success
    Given I am on the Login page
    When I enter my username and Password correctly
    When I click 'execution' buttom
    Then I am taken to the dashboard
