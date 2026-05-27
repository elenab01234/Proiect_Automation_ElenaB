package pages;

import org.openqa.selenium.By;


public class CartPage extends BasePage {
    private By prodNameCart = By.xpath(
            "//*[contains(@data-test,'product-title')]");

    public boolean isProductInCart(String productName) {
        return productName.equals(extractText(prodNameCart));
    }
}
