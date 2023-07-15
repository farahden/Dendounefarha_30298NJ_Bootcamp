package authenticate;

import base.BasePage;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Authenticate extends BasePage {
    public Authenticate(){
        PageFactory.initElements(driver,this);
    }
/**Sign Up
 * Given a user navigates to free CRM.com
 * and clicks on sign up
 * And enters email address
 * and checks "I agree the terms"
 * And checks "I'm not a robot"
 * when submitts sign in
 * then a confirmation number should be sent to the entered email*/

    @FindBy(xpath = "//a[contains(.,'sign up')]")
    public WebElement signUpButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInputField;

    @FindBy(xpath = "//div[@id='rc-anchor-container']")
    public WebElement iframe;

    @FindBy(xpath = "//input[@id='terms']")
    public WebElement terms;

    /*@FindBy(id= "iframe[title='reCAPTCHA']")
    public WebElement parentframe;*/

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-checkmark']")
    public WebElement confirmidentity;

    @FindBy(xpath = "//button[@name='action']")
    public WebElement submittButton;

    @FindBy(xpath = "//div[@class='ui raised segment']")
    public WebElement confirmationNumb;


public void signUp(){clickOnElement(signUpButton);}
public void enteremail(){sendKeysToElement(emailInputField,"farahden@gmail.com");}
public void switchframe(){
    driver.switchTo().frame(iframe);

}
public void acceptterms(){terms.click();}
public void checkcaptcha(){confirmidentity.click();}
public void submittion(){clickOnElement(submittButton);}

public void createAccount()  {
    signUp();
    enteremail();
    acceptterms();
   // switchframe();
    //checkcaptcha();
    submittion();}

/**log in
 * given authenticated user navigates to freeCRM.com
 * and clicks on log in
 * and enter email
 * and enters password
 * When user clicks on the submittion button
 * then user should be logged in*/
@FindBy(xpath = "//span[@class='icon icon-xs mdi-chart-bar']")
public WebElement logIn;

@FindBy(xpath = "//input[@name='email']")
public WebElement emailField;

@FindBy(xpath = "//input[@name='password']")
public WebElement password;

@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
public WebElement sbmittbutton;

@FindBy(xpath = "//span[@class='user-display']")
public WebElement usernameDisplayed;

@FindBy(xpath = "//div[@class='ui stacked segment']")
public WebElement pageloaded;

public void loginIcon(){clickOnElement(logIn);}
public void inputEmail(){sendKeysToElement(emailField,"dendounefarha@gmail.com");}
public void inputPassword(){sendKeysToElement(password,"Farahden95");}
public void submitt(){clickOnElement(sbmittbutton);}

public void setLogIn(){

    loginIcon();
    webDriverWait.until(ExpectedConditions.visibilityOf(pageloaded));
    inputEmail();
    inputPassword();
    submitt();


}

/**log out
 * given an authenticated user is logged in
 * when user clicks on sxettings
 * and user clicks on log out
 * then user should bde logged out successfully*/


@FindBy(css = ".floating > .settings")
public WebElement settings;
public void settingsDropdown(){clickOnElement(settings);}
public void selectLogOut(){driver.findElement(By.xpath("//span[.='Log Out']")).click();}

public void logout(){
    setLogIn();
    settingsDropdown();
    selectLogOut();
}










}

























