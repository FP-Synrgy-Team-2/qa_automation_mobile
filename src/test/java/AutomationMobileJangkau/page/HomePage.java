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
    By transferBanner = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvTitlePage']");
    By accountNumberSource = By.xpath("//androidx.cardview.widget.CardView[@resource-id='com.example.jangkau:id/cardRekeningSumber']");
    By accountNumberDestination = AppiumBy.accessibilityId("Textfield input nomor rekening tujuan");
    By transferBalance = AppiumBy.accessibilityId("Textfield input nominal transfer");
    By transferNotes = AppiumBy.accessibilityId("Textfield input catatan");
    By nextTransferButton = By.xpath("//android.widget.Button[@resource-id='com.example.jangkau:id/btnNext']");
    By confirmTransferButton = By.xpath("//android.widget.Button[@resource-id='com.example.jangkau:id/btnNext']");
    By berandaButton = AppiumBy.accessibilityId("tombol beranda");
    //validate transfer
    By checkAccountNameDestination = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvName']");
    By checkAccountNumber = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvRekening']");
    By checkAmountTransfer = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvNominal']");
    By checkTotalAmount = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvTransfer']");
    By checkAccountSource = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvLabelRekening']");
    //PIN locator
    By pinNo1 = AppiumBy.accessibilityId("Number 1");
    By pinNo4 = AppiumBy.accessibilityId("Number 4");
    By pinNo2 = AppiumBy.accessibilityId("Number 2");
    By pinNo6 = AppiumBy.accessibilityId("Number 6");
    //validate transfer success
    By checkSuccessIcon = AppiumBy.accessibilityId("Ilustrasi Transaksi Berhasil");
    By checkIDTransaction = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvTransactionId']");
    By accountRecipient = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvRekening']");
    By checkAmount = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvNominal']");
    By checkTransactionTime = By.xpath("//android.widget.TextView[@resource-id='com.example.jangkau:id/tvDate']");


    //Method Action
    public void validateHomePage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(userNameBanner));
        wait.until(ExpectedConditions.presenceOfElementLocated(remainingBalace));
        wait.until(ExpectedConditions.presenceOfElementLocated(accountNumber));
    }

    public void validateTransferPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(transferBanner));
        wait.until(ExpectedConditions.presenceOfElementLocated(accountNumberSource));
    }

    public void validateBeforeTransfer(){
        wait.until(ExpectedConditions.presenceOfElementLocated(checkAccountNameDestination));
        wait.until(ExpectedConditions.presenceOfElementLocated(checkAccountNumber));
        wait.until(ExpectedConditions.presenceOfElementLocated(checkAmountTransfer));
        wait.until(ExpectedConditions.presenceOfElementLocated(checkTotalAmount));
        wait.until(ExpectedConditions.presenceOfElementLocated(checkAccountSource));
    }

    public void validateTransferSuccess(){
        wait.until(ExpectedConditions.presenceOfElementLocated(checkSuccessIcon));
        wait.until(ExpectedConditions.presenceOfElementLocated(checkIDTransaction));
        wait.until(ExpectedConditions.presenceOfElementLocated(accountRecipient));
        wait.until(ExpectedConditions.presenceOfElementLocated(checkAmount));
        wait.until(ExpectedConditions.presenceOfElementLocated(checkTransactionTime));
    }

    public void remainBalance() {
       wait.until(ExpectedConditions.presenceOfElementLocated(remainingBalace)).isDisplayed();
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

    public void clickPinButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinNo1)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinNo4)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinNo2)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinNo6)).click();
    }
}
