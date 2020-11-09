Feature: Country Multi Scenario

  #Senaryolarda aynı olan ilk kısımlar Background olarak yazılabilir
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page


  Scenario: Create a country

    When Create a country
    #önceki yerde ülke adını değiştirmeyinc hata veriyor dikkat
    Then Success message should be displayed


  Scenario: Create a country parameter data

    When Create a country name as "üzücü1" and code as "code2"
    Then Success message should be displayed
