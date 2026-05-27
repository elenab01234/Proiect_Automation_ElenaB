package ui.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ui.utils.ConfigReader;
import ui.utils.DriverFactory;


public class BaseTest {

    @BeforeMethod
    public void setup() {
        DriverFactory.initDriver();
        DriverFactory.getDriver().get(ConfigReader.getProperty("baseURL"));
        // System.out.println("BASE URL = " + ConfigReader.getProperty("baseURL"));
    }

    @AfterMethod
    public void teardown() {
        DriverFactory.quitDriver();
    }
}