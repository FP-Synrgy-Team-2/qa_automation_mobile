Feature: Check remaining balance
  Background: User launch the app and login with valid credentials
    And user click masuk button
    And user input username with "Fulan123"
    And user input password with "FulanPassword123!"
    When user click login button
    Then user is on homepage

    Scenario: Check remaining balance
      When user is on homepage
      Then user sees remaining own balance in their account


