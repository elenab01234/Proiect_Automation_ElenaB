package ui.tests;

import ui.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pages.*;
import ui.utils.DriverFactory;


public class Tests extends BaseTest {

    //    TC01 - Login valid
    //    Se face login cu user valid
    //    Se verifica afisarea paginii principale
    @Test
    public void TC01_validLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(
                "standard_user",
                "secret_sauce");

        HomePage homePage=new HomePage();
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    //    TC02 - Login invalid password
    //    Parola gresita
    //    Se verifica mesajul de eroare
    @Test
    public void TC02_invalidPassword() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user","wrong");

        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service");
    }

    //    TC03 - Login invalid user
    //    User gresit
    //    Se verifica mesajul de eroare
    @Test
    public void TC03_invalidUser() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("wrong", "secret_sauce");

        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service");
    }

    //    TC04 - Username gol
    //    Username este gol
    //    Se verifica mesajul de eroare
    @Test
    public void TC04_emptyUsername() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("", "secret_sauce");

        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username is required");
    }

    //    TC05 - Password gol
    //    Parola este goala
    //    Se verifica mesajul de eroare
    @Test
    public void TC05_emptyPassword() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "");

        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Password is required");
    }

    //    TC06 - Plasare comanda
    //    Login valid
    //    Selectare produs
    //    Adaugare in cos
    //    Checkout
    //    Completare informatii utilizator
    //    Finalizare comanda
    //    Verificare mesaj de succes
    @Test
    public void TC06_placeOrder(){
        LoginPage loginPage = new LoginPage();
        loginPage.login(
                "standard_user",
                "secret_sauce");

        HomePage homePage = new HomePage();
        homePage.clickOnProductwithNLabel("Sauce Labs Bolt T-Shirt");

        ProductPage productPage = new ProductPage();
        productPage.addToCart();
        productPage.openCart();

        CartPage cartPage = new CartPage();
        cartPage.checkout();

        CheckoutInformationPage checkoutInformationPage =new CheckoutInformationPage();
        checkoutInformationPage.fillInformation(
                "Bogdan",
                "Popescu",
                "111144");
        checkoutInformationPage.continueCheckout();

        CheckoutOverviewPage overviewPage =new CheckoutOverviewPage();
        overviewPage.finishOrder();

        CheckoutCompletePage completePage =new CheckoutCompletePage();
        Assert.assertEquals(completePage.getSuccessMessage(),
                "Thank you for your order!");
    }
}
