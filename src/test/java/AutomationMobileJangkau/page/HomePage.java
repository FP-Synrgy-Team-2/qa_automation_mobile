package AutomationMobileJangkau.page;

import AutomationMobileJangkau.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseTest {
    private AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    //Locator Home Page
    By userNameBanner = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tv2']");
    By remainingBalace = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvSaldo']");
    By accountNumber = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvRekening']");
    //transfer feature locator
    By transferButton = AppiumBy.accessibilityId("Tombol Transfer antar BCA");
    By newInputButton = AppiumBy.accessibilityId("Tombol Transfer Antar BCA dengan tujuan baru");
    By accountNumberDestination = AppiumBy.accessibilityId("Textfield input nomor rekening tujuan");
    By transferBalance = AppiumBy.accessibilityId("Textfield input nominal transfer");
    By transferNotes = AppiumBy.accessibilityId("Textfield input catatan");
    By nextTransferButton = By.xpath("//android.widget.Button[@resource-id='com.example.jangkau:id/btnNext']");
    By confirmTransferButton = By.xpath("//android.widget.Button[@resource-id='com.example.jangkau:id/btnNext']");
    By berandaButton = AppiumBy.accessibilityId("tombol beranda");
    //PIN locator
    By pinNo1 = AppiumBy.accessibilityId("Number 1");
    By pinNo4 = AppiumBy.accessibilityId("Number 4");
    By pinNo2 = AppiumBy.accessibilityId("Number 2");
    By pinNo6 = AppiumBy.accessibilityId("Number 6");

    //Method Action
    public void validateHomePage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(userNameBanner));
        wait.until(ExpectedConditions.presenceOfElementLocated(remainingBalace));
        wait.until(ExpectedConditions.presenceOfElementLocated(accountNumber));
    }

    public String balance() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(remainingBalace)).getText();
    }

    public void clickTransferButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferButton)).click();
    }

    public void clickNewInputButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(newInputButton)).click();
    }

    public void inputAccountNumberDestination(String accountNumber){
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountNumberDestination)).sendKeys(accountNumber);
    }

    public void inputTransferBalance(String balance){
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferBalance)).sendKeys(balance);
    }

    public void inputTransferNotes(String notes){
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferNotes)).sendKeys(notes);
    }

    public void clickNextTransferButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nextTransferButton)).click();
    }

    public void clickConfirmTransferButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmTransferButton)).click();
    }

    public void clickBerandaButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(berandaButton)).click();
    }
}
