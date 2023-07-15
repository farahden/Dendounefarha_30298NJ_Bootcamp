package drag_drop_share;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShareClass extends BasePage {
    public ShareClass(){
        PageFactory.initElements(driver,this);
    }
    /**Given a user navigates to booking.com
     * And scroll down
     * When user click on the city right side
     * Then user should be navigated to search result page*/
@FindBy(xpath = "//div[@class='f395e522bd']/a[2]//picture[@class='e4e8d3238b']/img[1]")
 public WebElement rightcity;
@FindBy(xpath = "//nav[@class='d8eab2cf7f']")
public WebElement searchResultPasge;

@FindBy(xpath = "//img[@alt='Josephine Old Town Square Hotel - Czech Leading Hotels']")
public WebElement cityImage;

@FindBy(xpath = "//button[@id='hcta']/span[@class='bui-button__text']")
public WebElement checkAvailabledates;

@FindBy(css = "[aria-label='Share this property'] [viewBox='0 0 24 24']")
public  WebElement shareSign;
 @FindBy(xpath = "//ul[@class='dc227fec5c aa611caf6a f18d6175be']//div[@class='b1e6dd8416 aacd9d0b0a e3d479393e']/div[.='Copy link']")
 public WebElement copyLink;
 public void selectrightcity(){
     safeClickOnElement(rightcity);
 }
 public void clickCityImage(){
     safeClickOnElement(cityImage);
 }
 public void selectShare(){safeClickOnElement(shareSign);}
 public void copyLinkmeth(){
    clickOnElement(copyLink);
 }












}
