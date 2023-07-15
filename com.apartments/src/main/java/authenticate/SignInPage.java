package authenticate;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage{
    /**Sign In test summary:
     * Given a user of apartment.com
     * And navigates to the home page
     * And  hovers over SignUp and clicks
     * and enters a valid firstName
     * And enters a valid lastName
     * And enters a valid email
     * AND enters a valid password
     * and verify password
     * When clicks on Create account button
     * Then Account should be created*/

public SignInPage(){
    PageFactory.initElements(driver,this);
}
    @FindBy(xpath = "//li[@class='page-header_pageHeaderPipe__JGPY9 page-header_pageHeaderSignupLink__efAAi']/button[@class='page-header_pageHeaderLink__22pE5']")
    public WebElement signUp;
    @FindBy(xpath = "//input[@name='givenName']")
    public WebElement  firstName;
    @FindBy(xpath = "//input[@name='familyName']")
    public WebElement  lastName;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement verifiedPassword;
    @FindBy(xpath = "//button[.='Create Account']")
    public WebElement createAccountButton;
    @FindBy(xpath = "//button[.='Create Account']")
    public WebElement accountCreated;

public void setSignUp(){safeClickOnElement(signUp);}
public void setFirstName(){sendKeysToElement(firstName,"farah");}
public void setLastName(){sendKeysToElement(lastName,"Den");}
public void setEmail(){sendKeysToElement(email,"farahden@gmail.com");}
public void setPassword(){sendKeysToElement(password,"123FD*/lkj");}
public void setVerifiedPassword(){sendKeysToElement(verifiedPassword,"123FD*/lkj");}
public void setCreateAccountButton(){safeClickOnElement(createAccountButton);}


public void createAccountMethod() {

    setSignUp();
    setFirstName();
    setLastName();
    setEmail();
    setPassword();
    setVerifiedPassword();
    setCreateAccountButton();
}


/**Negative Testing
 * 1-Invalid Email:
     *Given a user of apartment.com
     * And navigates to the home page
     * And  hovers over SignUp and clicks
     * and enters a valid firstName
     * And enters a valid lastName
     * And enters a invalid email
     * AND enters a valid password
     * and verify password
     * When clicks on Create account buton
     * Then an error message should be appeared*/
    @FindBy(xpath = "//div[@class='form-error_formError__xL46G']")
    public WebElement errorMessage;

    public void setInvalidEmail(){sendKeysToElement(email,"invalid@@gmail.com");}

    public void invalidEmail(){
        setSignUp();
        setFirstName();
        setLastName();
        setInvalidEmail();
        setPassword();
        setVerifiedPassword();
        setCreateAccountButton();
    }


    /**negative testing:
     * 2- Invalid PassWord
     * Given a user of apartment.com
     * And navigates to the home page
     * And  hovers over SignUp and clicks
     * and enters a valid firstName
     * And enters a valid lastName
     * And enters a valid email
     * AND enters a invalid password
     * and enter invalid verified password
     * When clicks on Create account button
     * Then an error message should be appeared*/
    @FindBy (xpath = "//p[.='Should be at least 8 characters']")
    public WebElement invalidPassword;
    public void setInvalidPassword(){sendKeysToElement(password,"123");}
    public void invalidPassWordMeth(){
        setSignUp();
        setFirstName();
        setLastName();
        setEmail();
        setInvalidPassword();
        setVerifiedPassword();
        setCreateAccountButton();
    }

    /**negative testing:
     * 3-Enter Invalid verified PassWord
     * Given a user of apartment.com
     * And navigates to the home page
     * And  hovers over SignUp and clicks
     * and enters a valid firstName
     * And enters a valid lastName
     * And enters a valid email
     * AND enters a valid password
     * and enter invalid verified password
     * When clicks on Create account button
     * Then an error message should be appeared*/
    @FindBy(xpath = "//p[@class='input_error__fjsJB']")
    public WebElement invalidVerifiedPassword;
    public void setInvalidVerifiedPassword(){sendKeysToElement(verifiedPassword,"Ayeline23");}
    public void invalidVerifiedPasswordMeth(){
        setSignUp();
        setFirstName();
        setLastName();
        setEmail();
        setPassword();
        setInvalidVerifiedPassword();
        setCreateAccountButton();
    }

    /**Skipping field summary
     * Given a user of apartment.com
     * And navigates to the home page
     * And  hovers over SignUp and clicks
     * and does not enter a valid firstName
     * And enters a valid lastName
     * And enters a invalid email
     * AND enters a valid password
     * and enter invalid verified password
     * When clicks on Create account button
     * Then an error message should be appeared*/

@FindBy(xpath = "//p[@class='input_error__fjsJB']")
    public WebElement InputField;
    public void emptyInputField(){
        setSignUp();
        setFirstName();
        setEmail();
        setPassword();
        setVerifiedPassword();
        setCreateAccountButton();

    }































}
