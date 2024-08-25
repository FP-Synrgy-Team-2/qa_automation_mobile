package AutomationMobileJangkau.page;


import AutomationMobileJangkau.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BaseTest {

    private AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    //Locator
    By masukButton = AppiumBy.accessibilityId("Tombol Masuk");
    By usernameForm = By.xpath("//android.widget.EditText[@content-desc='textfield input untuk username']");
    By passwordForm = By.xpath("//android.widget.EditText[@content-desc='textfield untuk input password']");
    By loginButton = By.xpath("//android.widget.Button[@resource-id='com.example.jangkau:id/btnLogin']");
    By errorAlert = By.xpath("//android.widget.TextView[contains(@text, 'Username dan password salah, silahkan coba lagi')]");
    By loadingPage = By.xpath("//android.view.ViewGroup[@resource-id='com.example.jangkau:id/main']");

    //Method action for locator
    public void clickMasukButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(masukButton)).click();
    }

//    public void waitLoading(){
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(loadingPage));
//    }

    public String invalidNotification(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorAlert)).getText();
    }

    public void inputUsername(String username){
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameForm)).sendKeys(username);
    }

    public void inputPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordForm)).sendKeys(password);
    }

    public void clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
    }

//    public void invalidAlert(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(errorAlert)).isDisplayed();
//    }
}


