package ui.pages;

import org.openqa.selenium.By;


public class CheckoutOverviewPage extends BasePage {

    private By finishButton = By.xpath("//*[@id='finish']");
    private By cancelButton = By.xpath("//*[@id='cancel']");

    public void finishOrder() {
        clickElement(finishButton);
    }

    public void cancel() {
        clickElement(cancelButton);
    }
}