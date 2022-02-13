Feature:Revoke
  Iam test logout Api

  Scenario: Revoke/logout
    Given I am Test api Revoke or logout
    When I am login again
    When I am logout or revoke
    Then I am test revoke logout