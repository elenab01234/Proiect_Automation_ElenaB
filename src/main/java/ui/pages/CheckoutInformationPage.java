package ui.pages;

import org.openqa.selenium.By;


public class CheckoutInformationPage extends BasePage {

    private By firstName = By.xpath("//*[@id='first-name']");
    private By lastName = By.xpath("//*[@id='last-name']");
    private By postalCode = By.xpath("//*[@id='postal-code']");
    private By continueButton = By.xpath("//*[@id='continue']");
    private By errorMessage = By.xpath("//*[@data-test='error']");
    private By cancelButton = By.xpath("//*[@id='cancel']");

    public void fillInformation(
            String first,
            String last,
            String zip) {

        writeText(firstName, first);
        writeText(lastName, last);
        writeText(postalCode, zip);
    }

    public void continueCheckout() {
        clickElement(continueButton);
    }

    public String getErrorMessage() {
        return extractText(errorMessage);
    }

    public void cancel() {
        clickElement(cancelButton);
    }
}
