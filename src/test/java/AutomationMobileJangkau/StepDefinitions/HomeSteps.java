package AutomationMobileJangkau.StepDefinitions;

import AutomationMobileJangkau.BaseTest;
import AutomationMobileJangkau.page.HomePage;
import AutomationMobileJangkau.page.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.testng.AssertJUnit.assertTrue;

public class HomeSteps extends BaseTest {
    private HomePage homepage;
    private LoginPage loginpage;

    @Before
    public void setup(){
        loginpage = new LoginPage(driver);
        homepage = new HomePage(driver);
    }

    //Steps Definitions
    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homepage.validateHomePage();
    }

    @Given("user is login with valid credentials")
    public void userIsLoginWithValidCredentials() {
    }

    @Then("user sees remaining own balance in their account")
    public void userSeesRemainingOwnBalanceInTheirAccount() {
        homepage.remainBalance();
    }

    @Given("User is on the Transfer Antar BCA screen")
    public void userIsOnTheTransferAntarBCAScreen() {
    }


}


