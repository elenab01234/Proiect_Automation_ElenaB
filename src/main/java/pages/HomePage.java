package pages;

import org.openqa.selenium.By;


public class HomePage extends BasePage {

    private final By title = By.className("title");
    private By prodName = By.xpath("//*[@data-test='product-name']");
    private By prodPrice = By.xpath("//*[@data-test='unit-price']");
    private By addToCart = By.id("btn-add-to-cart");
    private By goToCart = By.xpath("//*[@data-test='cart-quantity']");


    public String getProductPrice(){
        return extractText(prodPrice);
    }

    public void addToCart(){
        clickElement(addToCart);
    }

    public void openCart(){
        clickElement(goToCart);
    }

   public void clickOnProductwithNLabel(String productName){
        clickElement(By.xpath("//h5[contains(text(),'" + productName + "')]"));
    }

    public boolean isHomePageDisplayed() {
        return driver.findElement(title).isDisplayed();
    }
}

