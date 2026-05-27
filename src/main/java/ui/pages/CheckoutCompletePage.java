package ui.pages;

import org.openqa.selenium.By;


public class CheckoutCompletePage extends BasePage {
    private By successMessage = By.xpath("//*[@class='complete-header']");
    private By backHomeButton = By.xpath("//*[@id='back-to-products']");

    public String getSuccessMessage() {
        return extractText(successMessage);
    }

    public void backHome() {
        clickElement(backHomeButton);
    }
}
