Feature: Verify Order
  Scenario: Verify order number
    Given User can be able to Shop on the Menu bar
    When Order a An Apple iPad 8th Gen WiFi Cellular 32GB
    And Select Check out
    And Select Place your order
    Then Print the order number
