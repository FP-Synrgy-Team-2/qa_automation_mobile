package AutomationMobileJangkau;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class CucumberHooks {

    @BeforeAll
    public static void beforeAll() {
        BaseTest.setupDriver();
    }

    @AfterAll
    public static void afterAll() {
        BaseTest.stopDriver();
    }
}
