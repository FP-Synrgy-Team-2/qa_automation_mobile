@login
  Feature: Login
    Background: User open the app and proceed to login page
      Given user is launch the app
      And user click masuk button

      Scenario Outline: login with invalid credentials
        And user input username with <username>
        And user input password with <password>
        When user click login button
        Then user is on homepage
  Examples:
    | username | password |
    | "Fulan321"    | "Fulan123!" |
    | "Fulan123"    | "Fulan321!" |
    | "Fulan321"    | "Fulan321!" |
