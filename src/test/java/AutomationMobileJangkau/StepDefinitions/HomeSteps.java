package AutomationMobileJangkau.StepDefinitions;

import AutomationMobileJangkau.BaseTest;
import AutomationMobileJangkau.page.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import static org.testng.AssertJUnit.assertEquals;

public class HomeSteps extends BaseTest {
    private HomePage homepage;

    @Before
    public void setup(){
        homepage = new HomePage(driver);
    }

    //Steps Definitions
    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homepage.validateHomePage();
    }

    @Then("user sees remaining own balance in their account")
    public void userSeesRemainingOwnBalanceInTheirAccount() {
        String remainingBalance =homepage.balance();
        assertEquals("********", remainingBalance);
    }
}


