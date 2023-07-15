package authentication_with_fake_data;

import base.BasePage;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValues;
import com.github.javafaker.service.FakeValuesService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class RegisterWithFakeData extends BasePage {
    public RegisterWithFakeData() {
        PageFactory.initElements(driver, this);
    }
    /**genarate fake data
     * Given a user navigates to investing.com
     * and clicks on free sign up
     * and  clicks on sign up with email
     * And enter a valid firstName
     * And enter a valid LastName
     * And enter a valid email
     * And enter a valid password
     * When user submitt sign in
     * the he should be signed in
     * (did not complete it because it is asking confirmation number that was sent to email)*/

@FindBy(xpath = "//div[@class='topBarText']/a[.='Free Sign Up']")
public WebElement freeSignUp;
public void signUpButton(){clickOnElement(freeSignUp);}

@FindBy (xpath = "//div[@id='signingPopup']//a[@id='signUPBtn']")
public WebElement signUpWithEmail;
public void SignUpWithEmailMeth(){safeClickOnElement(signUpWithEmail);}

public WebElement submitButton;


    static Faker faker=new Faker();

    public static  void  firstNameField(){
        driver.findElement(By.xpath("//input[@id='in_user_firstname']")).sendKeys(faker.name().firstName());

    }
    public static void lastNameField() {
         driver.findElement(By.xpath("//input[@id='in_user_lastname']")).sendKeys(faker.name().lastName());
    }
    public static void emailInputField(){
         driver.findElement(By.xpath("//input[@id='in_user_email']")).sendKeys(faker.internet().emailAddress());
    }
    public static void passwordInputField(){
        driver.findElement(By.xpath("//input[@id='in_password']")).sendKeys(faker.internet().password());
    }
    public void register() throws InterruptedException {
        signUpButton();
        SignUpWithEmailMeth();
        firstNameField();
        lastNameField();
        Thread.sleep(2000);
        emailInputField();
        Thread.sleep(3000);
        passwordInputField();

    }

}