package company;

import authenticate.Authenticate;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage extends BasePage {
    public CompanyPage(){
        PageFactory.initElements(driver,this);
    }


 /**Create company
  * Given an authenticated user navigated to his account
  * And hover over
  * and click on  plus sign
  * and fill required informations
  * when user clicks on save
  * then company should be saved successfully*/

@FindBy(xpath = "//div[@id='main-nav']")
    public WebElement sidebar;
@FindBy(xpath = "//div[@id='main-nav']/div[4]//i[@class='plus inverted icon']")
    public WebElement plusSign;
@FindBy(xpath = "//form[@class='ui form segment custom-form-container']//div[@class='ui right corner labeled input']/input[@name='name']")
public WebElement companyName;
@FindBy(xpath = "//input[@name='url']")
public WebElement website;

@FindBy(xpath ="//div[@class='four fields']//input[@name='value']" )
public WebElement phoneNum;
@FindBy(xpath = "//div[@class='four fields']//input[@name='name']")
public WebElement data;

@FindBy(xpath = "//button[@class='ui linkedin button']")
public WebElement saveButton;
@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
public WebElement created;


public void navigatetosidebar(){hoverOverElement(sidebar);}
public void addcompanie(){clickOnElement(plusSign);}
public void setname(){sendKeysToElement(companyName,"people N tech");}
public void setUrl(){sendKeysToElement(website," test@piit.us");}
public void number(){sendKeysToElement(phoneNum,"201 123 456");}
public void data(){sendKeysToElement(data,"address");}
public void save(){clickOnElement(saveButton);}


Authenticate log=new Authenticate();
public void createNewCompanie(){
    //first i have to log in
    log.setLogIn();
    navigatetosidebar();
    addcompanie();
    setname();
    setUrl();
    number();
    save();
}

/**delete company
 * Given authenticated user hover over side menu
 * And clicks on company
 * when clicks on delete
 * And a warning message pop out
 * When user clicks on cancel
 * then the pop out should be exited*/

@FindBy(xpath = "//span[.='Companies']")
    public WebElement company;
@FindBy(xpath = "//tr[2]//div[@class='ui fitted read-only checkbox']")
public WebElement checkAmazon;
@FindBy(xpath = "//button[@class='ui left floated button']")
public WebElement cancelButton;
public void company(){clickOnElement(company);}
public void amazon(){safeClickOnElement(checkAmazon);}
public void cancellation(){clickOnElement(cancelButton);}
public void trydelete(){
    log.setLogIn();
    navigatetosidebar();
    company();
    amazon();
    cancellation();
}






}
