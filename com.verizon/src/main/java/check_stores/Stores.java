package check_stores;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Stores extends BasePage {
    public Stores (){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='gnav20-row-one opacityOne']//a[contains(.,'Stores')]")
    public WebElement stores;


    @FindBy(xpath = "//input[@id='storesData']")
    public WebElement zipCodeField;

    @FindBy(xpath = "//li[@class='u-colorPrimary u-marginBottom--0 u-text--12 match']")
    public WebElement locationConfirmation;

    @FindBy(xpath = "//h2[@id='slSearch-TitleId']")
    public WebElement pageStoresLocation;

    @FindBy(xpath = "//div[@class='u-flex u-flexColumn--md u-flexColumn--xs']/a[@href='javascript:void(0)']")
    public WebElement useMyLocation;

    @FindBy(xpath = "//span[.='Use my location']")
    public WebElement usingLocation;

    /*  @FindBy(xpath = "")
      public WebElement;
      @FindBy(xpath = "")
      public WebElement;
      @FindBy(xpath = "")
      public WebElement;*/
    Actions act=new Actions(driver);
    public void setStores(){stores.click();}
    public void setZipCodeField(){sendKeysToElement(zipCodeField,"07306");}
    public void setLocationConfirmation(){
        fluentWait.until(ExpectedConditions.visibilityOf(locationConfirmation));
        act.doubleClick(locationConfirmation);}
    public void setUseMyLocation(){useMyLocation.click();}
    public void setUsingLocation(){usingLocation.click();}


    public void lookForStoresByZipCode(){
        setStores();
        setZipCodeField();
        setLocationConfirmation();
    }
    public void lookForStoresByLocation(){
        setStores();
        setUseMyLocation();
        setUsingLocation();
    }

























}
