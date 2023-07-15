package select_from_drop_down;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownSelection extends BasePage {
   public DropDownSelection(){
    PageFactory.initElements(driver,this);}
    /**Drop Down Selection
     * Given a user navigates to booking.com
     * And clicks on taxi
     * and clicks on time
     * when user select hour
     * and select minutes
     * then user should see the hour and minutes displayed on time field*/
    @FindBy(xpath = "//a[contains(.,'Airport taxis')]")
    public WebElement taxi;

    @FindBy(xpath = "//div[@class='ui-layout__item ui-1/2@m ui-5/12@l']/div[@class='ui-layout ui-layout--gutter-']/div[.='Pick-up time12:00']")
    public WebElement setTime;

    @FindBy(xpath = "//select[@id='pickupHour']")
    public WebElement pickUpHour;

   @FindBy(xpath = "//select[@id='pickupMinute']")
    public WebElement pickUpMinute;

   @FindBy(xpath = "//button[@class='rw-time-picker__confirm']")
   public WebElement confirmButton;

   @FindBy(xpath = "//button[.='04:30']")
   public WebElement timeIsDisplayed;

   public void setConfirm(){
    confirmButton.submit();
   }

    public void getAtaxi(){clickOnElement(taxi);}
    public void getTime(){clickOnElement(setTime);}
    public void selectPickUpHour(){selectFromDropdownByValue(pickUpHour,"04");}
    public void selectPickUpMinute(){selectFromDropdownByValue(pickUpMinute,"30");}


    public void selectPickUpTime(){
     getAtaxi();
     getTime();
     selectPickUpHour();
     selectPickUpMinute();
     setConfirm();
    }

    /*@FindBy("")
    public WebElement element;@FindBy("")
    public WebElement element;@FindBy("")
    public WebElement element;v@FindBy("")
    public WebElement element;@FindBy("")
    public WebElement element;@FindBy("")
    public WebElement element;*/
}
