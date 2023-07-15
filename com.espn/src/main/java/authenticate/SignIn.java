package authenticate;

import base.BasePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignIn extends BasePage {
    public SignIn(){
        PageFactory.initElements(driver,this); }
        /**Sign In:
         * Given a user navigates to espn.com
         * and hover over sign in  icon
         * and clicks
         * and user clicks on log in
         * and user clicks on look sign in with userName
         * and user clicks on sign in
         * and user enters a valid */

@FindBy (xpath = "//article[@id='sideLogin-left-rail']/button[@class='button med']")
    public WebElement signUp;


@FindBy(id = "oneid-iframe")
public WebElement iframe;


@FindBy(xpath = "//a[.='Looking for username login?']")
public WebElement userNameLogIn ;

 @FindBy(xpath = "//button[@id='BtnCreateAccount']")
public WebElement signUpButton;

 @FindBy(id = "BtnSubmit")
 public WebElement submittButton;

@FindBy(id = "global-user-trigger")
public WebElement profile;

@FindBy(xpath = "//li[@class='user hover']//a[.='Log Out']")
public WebElement logout;

@FindBy(xpath = "//article[@id='sideLogin-left-rail']/button[@class='button-alt med']")
public WebElement login;

public void signup(){
        webDriverWait.until(ExpectedConditions.visibilityOf(signUp));
        signUp.click();}

public void iframe(){
        driver.switchTo().frame("oneid-iframe");
    }

public void username(){
        webDriverWait.until(ExpectedConditions.visibilityOf(userNameLogIn));
        userNameLogIn.click();
    }

public void signupbutton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(signUpButton));
        signUpButton.click();
    }


static Faker faker=new Faker();

    public static  void  firstNameField(){
        driver.findElement(By.id("InputFirstName")).sendKeys(faker.name().firstName());

    }
    public static void lastNameField() {
        driver.findElement(By.id("InputLastName")).sendKeys(faker.name().lastName());
    }
    public static void emailInputField(){
        driver.findElement(By.xpath("//input[@id='InputEmail']")).sendKeys(faker.internet().emailAddress());
    }
    public static void passwordInputField(){
        driver.findElement(By.xpath("//input[@id='password-new']")).sendKeys(faker.internet().password());
    }

    public void submitt(){
        webDriverWait.until(ExpectedConditions.visibilityOf(submittButton));
        submittButton.click();
    }
    public void profileicone(){
        webDriverWait.until(ExpectedConditions.visibilityOf(profile));
        profile.click();
    }
    public void enterdata() {
        firstNameField();
        lastNameField();
        emailInputField();
        passwordInputField();
    }
    public void setLogout(){
        webDriverWait.until(ExpectedConditions.visibilityOf(logout));
        logout.click();
    }

public void login(){
    signup();
    iframe();
    username();
}

public void setSignUpButton(){
    login();
    signupbutton();
}

public void createAccount(){
    setSignUpButton();
    enterdata();

}
public void submittCreation(){
       createAccount();
       submitt();
}

public void confirmCreation(){
        submittCreation();
        profileicone();
}

public void logout(){
        confirmCreation();
        setLogout();
}

    }































