Feature: Delete image
  I want to Test delete
  Api image succesfully

  Scenario: api delete image profile
    Given I am delete image api profile
    When I am login again for delete image profile
    When I click excution api delete image profile
    Then Otp delete image profile succefully