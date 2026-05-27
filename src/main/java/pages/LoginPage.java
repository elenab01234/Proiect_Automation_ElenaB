package pages;

import org.openqa.selenium.By;


public class LoginPage extends BasePage {

    private By usernameInput = By.xpath("//input[@id='user-name']");
    private By passwordInput = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//input[@id='login-button']");
    private By errorMessage = By.xpath("//*[@data-test='error']");


    public void login(String username, String password) {
        writeText(usernameInput, username);
        writeText(passwordInput, password);
        clickElement(loginButton);
    }

    public String getErrorMessage() {
        return extractText(errorMessage);
    }
}