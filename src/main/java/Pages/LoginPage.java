package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Elements Locators
     **/
    @FindBy(xpath = "//a[@class='google-sign-up google-register']")
    private WebElement signInWithGoogle;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id='buttonFormLogin']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@id='remember']")
    private WebElement rememberMeCheckBox;

    @FindBy(xpath = "//a[text()='Forgot Your Password?']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//h3[text()='Log In to your account']")
    private WebElement loginHeaderText;


    public Prospects clickOnLoginButton() {
        loginButton.click();
        return new Prospects(driver);
    }


    public LoginPage clickOnRememberMe() {
        rememberMeCheckBox.click();
        return this;
    }

    public LoginPage typeUserEmail(String userName) {
        emailField.sendKeys(userName);
        return this;
    }


    public LoginPage typeUserPassword(String userPassword) {
        passwordField.sendKeys(userPassword);
        return this;
    }


    //actions
    public Prospects login(String userEmail, String userPassword) {
        this.typeUserEmail(userEmail);
        this.typeUserPassword(userPassword);
        this.clickOnLoginButton();
        return new Prospects(driver);
    }

    public RestorePasswordPage clickOnForgotPassword() {
        forgotPasswordLink.click();
        return new RestorePasswordPage(driver);
    }

    public String getHeaderText() {
        String text = loginHeaderText.getText();
        return text;
    }

}
