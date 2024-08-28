package AutomationMobileJangkau.StepDefinitions;

import AutomationMobileJangkau.BaseTest;
import AutomationMobileJangkau.page.HomePage;
import AutomationMobileJangkau.page.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

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

    //check balance
    @Given("user is login with valid credentials")
    public void userIsLoginWithValidCredentials() {
    }

    @Then("user sees remaining own balance in their account")
    public void userSeesRemainingOwnBalanceInTheirAccount() {
        homepage.remainBalance();
    }

    //Transfer
    @Given("User is on the Transfer Antar BCA screen")
    public void userIsOnTheTransferAntarBCAScreen() {
        homepage.clickTransferButton();
        homepage.clickNewInputButton();
        homepage.validateTransferPage();
    }

    @When("User fills the form with the following details:")
    public void userFillsTheFormWithTheFollowingDetails(DataTable dataTable) {
        List<Map<String, String>> formData = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> data : formData) {
            String field = data.get("Field");
            String value = data.get("Value");

            switch(field) {
                case "Nomor Rekening Tujuan":
                    homepage.inputAccountNumberDestination(value);
                    break;
                case "Nominal Transfer":
                    homepage.inputTransferBalance(value);
                    break;
                case "Catatan":
                    homepage.inputTransferNotes(value);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown field: " + field);
            }
        }
    }

    @And("User clicks on Lanjutkan")
    public void userClicksOnLanjutkan() {
        homepage.clickNextTransferButton();
    }

    @Then("User should see the confirmation screen")
    public void userShouldSeeTheConfirmationScreen() {

    }


}


