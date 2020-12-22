Feature: Nationalities functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Nationalities page


  Scenario: Create Nationalities
    Then Create a Nationality name as "4441"
    Then Success message should be displayed

  Scenario: Edit Nationalities
    Then User edit the "4441" to "os11"
    Then Success message should be displayed

  Scenario: Delete Nationalities
    Then User delete the "os11"
    Then Success message should be displayed

   @RegressionTest
  Scenario: Nationalities All functionality
    Then Create a Nationality name as "isc666"
    Then Success message should be displayed
    Then User edit the "isc666" to "isc62"
    Then Success message should be displayed
    Then User delete the "isc62"
    Then Success message should be displayed