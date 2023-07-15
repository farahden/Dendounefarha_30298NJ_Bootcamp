package bookin_a_trip;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookTrip extends BasePage {
    public BookTrip() {
        PageFactory.initElements(driver, this);
    }

    /**
     * look for
     * Given a user is at Expedia home page
     * and hover over going to
     * When user enters "miami"
     * Then user should
     */

    @FindBy(xpath = "//button[@class='uitk-fake-input uitk-form-field-trigger']")
    public WebElement goingTo;
    @FindBy(xpath = "//section[@class='uitk-popover-sheet uitk-typeahead-menu-container " +
            "uitk-sheet uitk-popover-sheet-inline-pos-leading uitk-popover-sheet-block-pos-trailing uitk-popover-sheet-open']")
    public WebElement miamiResult;

    public void destination() {
        hoverOverElement(goingTo);
        sendKeysToElement(goingTo, "miami");
    }
/*****************************************************************/
    /**
     * date picker Test
     * Given A user hover over date table
     * And user select departure date
     * And User select returnDate
     * When user clicks on done
     * Then user should see selected dates appears on the field
     */


    public void pickDate() {
        driver.findElement(By.xpath("//button[@id='date_form_field-btn']")).click();
        String year = "2023";
        String month = "08";
        String day = "14";
        while (true) {
            String monthYear = driver.findElement(By.xpath("//div[@class='uitk-layout-flex uitk-layout-flex-justify-content-space-between uitk-date-picker-menu-pagination-container']")).getText();
            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String yr = arr[1];
            if (mon.equals(month) && yr.equals(year))
                break;
            else
                driver.findElement(By.xpath("//button[.='Next month']")).click();
        }
        List<WebElement> allDates = driver.findElements(By.xpath("\"//div[@class='uitk-date-picker-menu-months-container']/div[1]/table/tbody"));
        for (WebElement date : allDates) {
            String dt = date.getText();
            if (dt.equals(date)) {
                date.click();
                break;
            }
        }


    }
    /**travelers and rooms
     * Given a user navigates to travelers and Clicks
     * and added number of travelers
     * and set number of children
     *  When select age of the child
     * Then user should see the age of enfant required*/
@FindBy(xpath = "//button[@class='uitk-menu-trigger open-room-picker-observer-root uitk-fake-input uitk-form-field-trigger']")
public WebElement field;

public void setTravelers() throws InterruptedException {

    Thread.sleep(5000);
    safeClickOnElement(field);
     for(int i=0;i<3;i++){
         driver.findElement(By.xpath("//span[.='Increase the number of adults in room 1']")).click();
     }for (int k=0;k<2;k++){
         driver.findElement(By.xpath("//span[.='Increase the number of children in room 1']")).click();
    }


}

 @FindBy(xpath = "//select[@class='uitk-field-select']")
public WebElement ageRequired;



}







