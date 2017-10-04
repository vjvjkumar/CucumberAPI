Feature: the version can be retrieved
  Scenario: client makes call to GET /customer
    When the client calls /customer
    Then the employee receives status code of 200
    And the response should contain:
      """
     {"firstName":"John","lastName":"Doe","ssn":"***-**-3124","location":"Dallas,TX"}
      """