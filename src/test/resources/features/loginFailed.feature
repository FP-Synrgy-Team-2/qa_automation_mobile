@login
  Feature: Login
    Background: User open the app and proceed to login page
      Given user is launch the app
      And user click masuk button

      Scenario Outline: login with invalid credentials
        And user input username with <username>
        And user input password with <password>
        When user click login button
        Then user get alert
  Examples:
    | username            | password            |
    | "Fulansalah321"     | "FulanPassword123!" |
    | "Fulan123"          | "FulanSalah123!"    |

