package AutomationMobileJangkau.StepDefinitions;

import AutomationMobileJangkau.BaseTest;
import AutomationMobileJangkau.page.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps extends BaseTest {

    private LoginPage loginPage;

    // Initialize Driver
    @Before
    public void setup(){
        loginPage = new LoginPage(driver);
    }

    // Step definitions
    @Given("user is launch jangkau app")
    public void userIsLaunchJangkauApp() {
        // Implementasi untuk meluncurkan aplikasi Jangkau
    }

    @And("user input {string} into username field")
    public void userInputIntoUsernameField(String arg0) {
    }


    @And("user input {string} into password field")
    public void userInputIntoPasswordField(String arg0) {
    }

    @When("user click masuk button")
    public void userClickMasukButton() {
    }

    @Then("user is redirect to homepage")
    public void userIsRedirectToHomepage() {
    }
}
