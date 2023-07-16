package athentification;


import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Authentification extends BasePage {
    public Authentification(){
        PageFactory.initElements(driver,this);
    }

/**Test Create Account Summary:
 * As a user when I open browser
 * And I navigate to the url
 * And I click on sign in
 * When I enter Valid firstName
 * ANd I enter Valid lastName
 * And I enter a valid Email
 * and I enter a valid email confirmation
 * I should be able to be logged in ,and see the message tha I am successfully logged in
 */


    @FindBy (xpath = "//div[@class='panel header']//a[.='Create an Account']")
    public WebElement CreateAccount;

    @FindBy (xpath = "//input[@id='firstname']")
    public WebElement firstNameInputField;

    @FindBy (xpath = "//input[@id='lastname']")
    public WebElement lastNameInputField;

    @FindBy (xpath = "//input[@id='email_address']")
    public WebElement EmailInputField;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passWordInputField;

    @FindBy (xpath = "//input[@id='password-confirmation']")
    public WebElement passwordConfirmationInputField;

    @FindBy (xpath = "//button[@class='action submit primary']/span[.='Create an Account']")
    public WebElement CreateAccountButton;

    @FindBy(xpath  ="//div[@class='message-success success message']")
    public WebElement successfullyRegistredMessage;


    public void clickCreateAccount(){clickOnElement(CreateAccount);}

    public void typeFirstName(String firstName) {clearSendKeysToElement(firstNameInputField,firstName);}

    public void typeLastName(String lastName) {clearSendKeysToElement(lastNameInputField,lastName); }

    public void EnterEmail(String email){clearSendKeysToElement(EmailInputField,email);}

    public void typePassword(String password) { clearSendKeysToElement(passWordInputField, password); }

    public void typePasswordConfirmation(String passwordConfirmation) {clearSendKeysToElement(passwordConfirmationInputField,passwordConfirmation); }

    public void CreateAccountForSubmission() { clickOnElement(CreateAccountButton);}

        public void SignIn(String firstName,String lastName,String email,String password,String passwordConfirmation) {
            clickCreateAccount();
            typeFirstName(firstName);
            typeLastName(lastName);
            EnterEmail(email);
            typePassword(password);
            typePasswordConfirmation(passwordConfirmation);
            CreateAccountForSubmission();

    }


}
