package authenticate;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration extends BasePage {
   public Registration(){
        PageFactory.initElements(driver,this);
    }
/**Register
 * Given a user navigates to bmw home page
 * and clicks on MyBmw an clicks
 * and clicks on register now
 * and select salutation
 * and enters a valid firstname
 * and enters a valid lastname
 * and enters a valid email
 * and enters a valid password
 * and check box of terme and condition
 * when user submit registration
 * then account is created*/

/**Registaer with invalid data
 * Given a user navigates to bmw home page
 * and clicks on MyBmw an clicks
 * and clicks on register now
 * and select salutation
 * and enters a valid firstname
 * and enters a valid lastname
 * and enters invalid email
 * and enters a valid password
 * and check box of terme and condition
 * when user submit registration
 * then error message should occurs*/

@FindBy(xpath = "//a[@href='http://mybmw.bmwusa.com']")
public WebElement myBMW;

@FindBy(xpath = "//button[@class='custom-button __b secondary']")
public WebElement registerNowButton;

@FindBy(xpath = "//div[@class='custom-select-arrow-down __b']")
public WebElement salutation;

@FindBy(xpath = "//input[@id='firstName']")
public WebElement firstName;

@FindBy(xpath = "//input[@id='lastName']")
 public WebElement lastName;

@FindBy(xpath = "//input[@id='email']")
public WebElement email;

@FindBy(xpath = "//input[@id='password']")
public WebElement password;

@FindBy(xpath = "//span[@class='checkbox__mark __b']")
public WebElement checkBoxButton;

@FindBy(xpath = "//button[@class='custom-button __b primary']")
public WebElement submittregistration;

@FindBy(xpath = "//h1[@class='custom-header-title __b']")
public WebElement accountCreated;

@FindBy(xpath = "//div[@class='custom-error __b']")
public WebElement errorMessage;

public void myBMWmeth(){clickOnElement(myBMW);}
public void registration(){safeClickOnElement(registerNowButton);}
public void selectsalutation (){selectFromDropdownByIndex(salutation,3);}
public void inputFirstName(){sendKeysToElement(firstName,"test");}
public void inputLastName(){sendKeysToElement(lastName,"test");}
public void inputemail(){sendKeysToElement(email,"email@gamil.com");}
public void inputpassword(){sendKeysToElement(password,"123vivalalgerie*/");}
public void checkbox(){checkBoxButton.click();}
public void submition(){submittregistration.submit();}

public void createNewAccount() {
   myBMWmeth();
   registration();
  // selectsalutation();
   inputFirstName();
   inputLastName();
   inputemail();
   inputpassword();
   checkbox();
   submition();
}
public void CreateAccountInvalidEmail()  {
    myBMWmeth();
    registration();
    inputFirstName();
    inputLastName();
    inputemail();
    inputpassword();
    checkbox();
    submition();
}

}
