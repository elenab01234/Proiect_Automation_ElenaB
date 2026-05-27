package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;
import utils.WaitUtils;


public class BasePage {
    protected WebDriver driver = DriverFactory.getDriver();
    protected WaitUtils waitUtils = new WaitUtils(driver);

    public void clickElement(By locator) {
    WebElement element = waitUtils.clickable(locator);
    element.click();
    }

    protected void writeText(By locator, String text) {
    WebElement element = waitUtils.visible(locator);
    element.sendKeys(text);
    }

    protected String extractText(By locator) {
    return waitUtils.visible(locator).getText().trim();
    }

    //    //   Metada: extragere text
    //    public WebElement waitForElementVisible(By locator) {
    //        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    //        WebElement visible = wait.until(
    //                ExpectedConditions.visibilityOfElementLocated(
    //                        locator));
    //        return visible;
    //    }
}