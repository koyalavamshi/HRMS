Feature: Login to application
@Login
  Scenario: open the home page
    Given  enter url
    Given enter the user_name "Vamshivk"
    When enter the pass_word "RZ8DA2"
    And click on login btn
    And display the title of the home page
    Then click on logout