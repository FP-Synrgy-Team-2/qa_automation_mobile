package AutomationMobileJangkau.page;


import AutomationMobileJangkau.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BaseTest {

    private AndroidDriver driver;

    public LoginPage(AndroidDriver driver){
        this.driver = this.driver;
    }

    //Locator
    By masukButton = AppiumBy.accessibilityId("Tombol Masuk");
    By usernameForm = By.xpath("//android.widget.EditText[@content-desc='textfield input untuk username']");
    By passwordForm = By.xpath("//android.widget.EditText[@content-desc='textfield untuk input password']");

    //Method action for locator
    public void clickMasukButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(masukButton)).click();
    }

    public void inputUsername(String username){
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameForm)).sendKeys(username);
    }

    public void inputPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordForm)).sendKeys(password);
    }
}


