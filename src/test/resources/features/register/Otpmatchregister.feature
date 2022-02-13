Feature: Match otp
  I want to Test otp register request
  Api register succesfully

  Scenario: Otp api match
    Given I am Match Otp
    When I am enter Otp
    When I click Execution button
    Then Otp match
