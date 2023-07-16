package athentification;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogOutPage extends BasePage {
 public LogOutPage (){PageFactory.initElements(driver,this);}
    /**Test Log Out Summary:
     * as user when i navigate to url
     * and click on account
     * And I click on SignOut button
     * than I should be able to log out*/
    @FindBy(xpath = "//div[@class='panel header']//button[@class='action switch']")
    public WebElement dropDown;

    @FindBy(xpath = "//li[@class='customer-welcome active']//a[contains(.,'Sign Out')]")
    public WebElement signOutButton;

    @FindBy(xpath = "//div[@class='panel header']//a[contains(.,'Sign In')]")
    public WebElement resultSignOut;

     public void dropDownButton(){
        safeClickOnElement(dropDown);
     }
     public void signOutButton(){
       safeClickOnElement(signOutButton);
     }

 public void logOut(){
        dropDownButton();
        signOutButton();


 }


}
