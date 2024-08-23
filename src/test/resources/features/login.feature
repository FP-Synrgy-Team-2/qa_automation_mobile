@login
  Feature: Login

   Scenario: login with valid credentials
     Given user is launch jangkau app
     And user input "Fulan123" into username field
     And user input "Fulan123!" into password field
     When user click masuk button
     Then user is redirect to homepage
