package ui.pages;

import org.openqa.selenium.By;


public class CartPage extends BasePage {
    private By prodNameCart = By.xpath("//*[contains(@data-test,'product-title')]");
    private By checkoutButton = By.xpath("//*[@id='checkout']");

    public boolean isProductInCart(String productName) {
        return productName.equals(extractText(prodNameCart));
    }

    public void checkout() {
        clickElement(checkoutButton);
    }
}
