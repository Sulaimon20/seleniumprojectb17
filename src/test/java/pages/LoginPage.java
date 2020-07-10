package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import test.utilities.Driver;

/*
We will store all Login page related web elements and methods
into this class.
 */
public class LoginPage {
        //constructor
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //locating username input
    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    //locating password input
    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    //locating locating button
    @FindBy(id = "_submit")
    public WebElement loginButton;

    //locating error message
    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;

    @FindBy (xpath = "//a[@href='/user/reset-request']")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement inputUserName;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement requestButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage2;

    //this a method for implementing of login functionality
    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}