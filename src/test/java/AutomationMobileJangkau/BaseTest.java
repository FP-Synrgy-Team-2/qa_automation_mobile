package AutomationMobileJangkau;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    public static AndroidDriver driver;
    public static WebDriverWait wait;

    public static void setupDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("deviceName", "0062301V251021BF ");
        capabilities.setCapability("app", "D:/KERJA/Sertifikasi Binar/jangkau.apk");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.example.jangkau");
        capabilities.setCapability("appActivity", "com.example.jangkau.SplashActivity");

        driver = new AndroidDriver(capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public static void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void resetApp() {
//        driver.terminateApp("com.example.jangkau");
        driver.activateApp("com.example.jangkau");
    }
}
