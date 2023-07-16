package calendar;

import authenticate.Authenticate;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateEvent extends BasePage {
    public CreateEvent(){
        PageFactory.initElements(driver,this);
    }

/**create event
 * Given authenticated user is logged in
 * and hover over calender
 * when clicks on plus sign
 * Then user should be able to create event*/

@FindBy(xpath = "//a[.='Calendar']")
public WebElement calender;

@FindBy(xpath = "//div[@id='main-nav']/div[2]/button[@class='ui mini basic icon button']")
public WebElement plus;

@FindBy(xpath = "//span[@class='selectable ']")
public WebElement title;

public void calender(){hoverOverElement(calender);}
public void addcalender(){clickOnElement(plus);}
public void createEvent(){
    Authenticate login=new Authenticate();
    login.setLogIn();
    calender();
    addcalender();
}

/**add event
 * given a user clicked on add event
 * an user input title
 * and user select start date
 * and user select end date
 * and user select category
 * and user write discription
 * and user write task
 * and user set alert time
 * and user set allert place
 * and user assign task
 * and user add company
 * and user set identifier*/
@FindBy(xpath = "//input[@name='title']")
    public WebElement inputtitle;
public void enterTitle(){sendKeysToElement(inputtitle,"set the app logo");}
    Authenticate login=new Authenticate();
    /*pick starting date*/
    public void pickstartingdate(){

        driver.findElement(By.xpath( "//input[@class='calendarField react-datepicker-ignore-onclickoutside']")).click();
        String year = "2023";
        String month = "08";
        String day = "14";
        while (true) {
            String monthYear = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String yr = arr[1];
            if (mon.equals(month) && yr.equals(year))
                break;
            else
                driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next react-datepicker__navigation--next--with-time']")).click();
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='react-datepicker__month']"));
        for (WebElement date : allDates) {
            String dt = date.getText();
            if (dt.equals(date)) {
                date.click();
                break;
            }
        }}

        public void startingdate(){
            Authenticate login=new Authenticate();
            login.setLogIn();
           // calender();
            //addcalender();
        //pickstartingdate();
        }
    @FindBy(xpath = "//div[.='SelectImportantOpportunityOptionalCriticalMeetingSocialTime OffPrivate']")
    public WebElement selectCategory;
    public void selectcategory(){
        selectFromDropdownByVisibleText(selectCategory,"Important");
    }

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement description;
    public void addDescription(){sendKeysToElement(description,"this is a test");}


public void pickendingdate(){
        driver.findElement(By.xpath( "//input[@class='calendarField react-datepicker-ignore-onclickoutside']")).click();
        String year = "2023";
        String month = "08";
        String day = "17";
        while (true) {
            String monthYear = driver.findElement(By.xpath("//input[@class='calendarField react-datepicker-ignore-onclickoutside']")).getText();
            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String yr = arr[1];
            if (mon.equals(month) && yr.equals(year))
                break;
            else
                driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next react-datepicker__navigation--next--with-time']")).click();
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='react-datepicker__month']"));
        for (WebElement date : allDates) {
            String dt = date.getText();
            if (dt.equals(date)) {
                date.click();
                break;
            }
        }}

  public void pickdate(){
        createEvent();
        pickstartingdate();
  }

  public void pickdateending(){
      createEvent();
      pickendingdate();
  }



}