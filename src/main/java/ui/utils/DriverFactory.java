package ui.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver driver;   // WebDriver has no get() method

    public static void initDriver() {
        if (driver == null) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            new WaitUtils(driver);
          }

    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

