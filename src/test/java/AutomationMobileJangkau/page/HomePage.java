package AutomationMobileJangkau.page;

import AutomationMobileJangkau.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseTest {
    private AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    //Locator

    By userNameBanner = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tv2']");
    By remainingBalace = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvSaldo']");
    By accountNumber = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvRekening']");

    public void validateHomePage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(userNameBanner));
        wait.until(ExpectedConditions.presenceOfElementLocated(remainingBalace));
        wait.until(ExpectedConditions.presenceOfElementLocated(accountNumber));
    }

    //Method Action

}
