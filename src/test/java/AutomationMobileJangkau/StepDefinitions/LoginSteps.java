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
        setupDriver();
        loginPage = new LoginPage(driver);
    }

    // Step definitions
    @Given("user is launch the app")
    public void userIsLaunchJangkauAppAndGoToLoginPage() {
    }

    @And("user click masuk button")
    public void userClickMasukButton() {
        loginPage.clickMasukButton();
    }

    @And("user input username with {string}")
    public void userInputUsernameWithUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWithPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

}
