package ui.pages;

import org.openqa.selenium.By;


public class ProductPage extends BasePage {
    private By prodName = By.xpath("//*[@data-test='product-name']");
    private By prodPrice = By.xpath("//*[@data-test='unit-price']");
    private By addToCart = By.id("btn-add-to-cart");
    private By goToCart = By.xpath("//*[@data-test='cart-quantity']");

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