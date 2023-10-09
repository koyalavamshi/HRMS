Feature: Validating User details
  Scenario Outline: verify if user details is being successful using getdetailsAPI
    Given User details playload with "<First_name>" "<Last_name>"
    When user calls "getUserAPI" with "GET" http request
    Then the API call got success with status code 200
#    And "status" in response body is "OK"


    Examples:
             |First_name  |Last_name|
             |Vamshi      |Koyala   |
             |chiku       |virat    |