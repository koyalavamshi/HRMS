Feature: OrangeHRM Login
  @Registration_Test
  Scenario: Logo presence on OrangeHRM home page
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verify that the logo present on page
    And click on new registration page
    And enter the username "vamshi"
    And  enter the password "Vamshi18"
    And   enter comform_password "Vamshi18"
    And   enter the fullname "vamshi koyala"
    And enter the emailaddress "koyalavamshi@123"
    Then close browser


