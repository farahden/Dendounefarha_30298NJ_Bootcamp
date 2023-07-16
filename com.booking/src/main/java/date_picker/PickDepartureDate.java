package date_picker;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PickDepartureDate extends BasePage {
    public PickDepartureDate(){
        PageFactory.initElements(driver,this);
    }

    public void pickDepartureDateMeth(){
  driver.findElement(By.xpath("//button[.='Check-in Date']")).click();
    String year = "2023";
    String month = "08";
    String day = "14";
        while (true) {
        String monthYear = driver.findElement(By.xpath("//h3[.='July 2023']")).getText();
        String arr[] = monthYear.split(" ");
        String mon = arr[0];
        String yr = arr[1];
        if (mon.equals(month) && yr.equals(year))
            break;
        else
            driver.findElement(By.cssSelector("//h3[.='July 2023']")).click();
    }
    List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='fa3f76ae6b']/div[1]/table[@class='aadb8ed6d3']"));
        for (WebElement date : allDates) {
        String dt = date.getText();
        if (dt.equals(date)) {
            date.click();
            break;
        }
    }


}









}
