@login
  Feature: Login
    Background: User open the app and proceed to login page
      Given user is launch the app
      And user click masuk button

      Scenario Outline: login with invalid credentials
        And user input username with <username>
        And user input password with <password>
        When user click login button
        Then user go back to login page
  Examples:
    | username            | password            |
    | "Fulansalah321"     | "FulanPassword123!" |
    | "Fulan123"          | "FulanSalah123!"    |

#    @valid-login
#    Scenario: Login with valid credentials
#      And user input username with "Fulan123"
#      And user input password with "FulanPassword123!"
#      When user click login button
#      Then user is on homepage