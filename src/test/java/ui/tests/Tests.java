package ui.tests;

import ui.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class Tests extends BaseTest {

    @Test
    public void TC01_validLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(
                "standard_user",
                "secret_sauce");

        HomePage homePage=new HomePage();
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @Test
    public void TC02_invalidPassword() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user","wrong");

        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void TC03_invalidUser() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("wrong", "secret_sauce");

        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void TC04_emptyUsername() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("", "secret_sauce");

        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username is required");
    }

    @Test
    public void TC05_emptyPassword() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "");

        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Password is required");
    }
}
