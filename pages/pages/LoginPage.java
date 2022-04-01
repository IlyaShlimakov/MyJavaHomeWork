package pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage<driver> {

    @FindBy(xpath = "//button[text()='Войти']")
    private WebElement loginButton;

    @FindBy(xpath = "//iframe[@class='ag-popup__frame__layout__iframe']")
    private WebElement emailField1;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement emailField2;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement passwordButton1;
    @FindBy(xpath = " //input[@type='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@data-test-id='submit-button']")
    private WebElement passwordButton2;

    @FindBy(xpath = "//button[@data-test-id='submit-button']")
    private WebElement passwordSubmit;

    @FindBy(xpath = "//a[@class='compose-button compose-button_white compose-button_short js-shortcut']")
    private WebElement mailButton;

    @FindBy(xpath = "//input[@class='container--H9L5q size_s--3_M-_']")
    private WebElement emailField3;
    @FindBy(xpath = " //input[@name='Subject']")
    private WebElement emailField4;

    @FindBy(xpath = "//div[contains(@class, 'cke_editable')]/div")
    private WebElement emailField5;

    ;

    @FindBy(xpath = "//span[@class='button2__txt']")
    private WebElement emaildButton;
    private CharSequence text;

    public LoginPage(WebDriver webdriver)
    {
        PageFactory.initElements(webdriver, this);
    }


    public void enterLoginAndPass(String login, String password) {


        emailField2.sendKeys(login);
        passwordField.sendKeys(password);
        emailField4.sendKeys(login);
        emailField4.sendKeys(text);
        emailField5.sendKeys(text);


    }

    public void clickEnterButton()
    {
        loginButton.click();
        emailField1.click();
        emailField2.click();
        passwordButton1.click();
        passwordField.click();
        passwordButton2.click();
        passwordSubmit.click();
        mailButton.click();
        emailField3.click();
        emailField4.click();
        emailField5.click();
    }
}
