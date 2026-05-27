package ui.pages;

import org.openqa.selenium.By;


public class ProductPage extends BasePage {
    private By prodName = By.xpath("//*[@data-test='product-name']");
    private By prodPrice = By.xpath("//*[@data-test='unit-price']");
    private By addToCart = By.xpath("//button[contains(@id,'add-to-cart')]");
    private By goToCart = By.className("shopping_cart_link");

    public String getProductName() {
        return extractText(prodName);
    }

    public String getProductPrice(){
        return extractText(prodPrice);
    }

    public void addToCart(){
        clickElement(addToCart);
    }

    public void openCart(){
        clickElement(goToCart);
    }
}