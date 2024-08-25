  Feature: Login with valid credentials
    Scenario: Login with valid credentials
      Given user is launch the app
      And user click masuk button
      And user input username with "Fulan123"
      And user input password with "FulanPassword123!"
      When user click login button
      Then user is on homepage