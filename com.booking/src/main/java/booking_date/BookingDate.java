package booking_date;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingDate extends BasePage {
    public BookingDate(){
        PageFactory.initElements(driver,this);
    }
    Actions actions=new Actions(driver);
    @FindBy (xpath = "//div[@class='d606c76c5a']")
    public WebElement datefield;
    public void dateFieldmeth(){clickOnElement(datefield);}

    @FindBy (xpath = "//button[@class='fc63351294 a822bdf511 e3c025e003 fa565176a8 cfb238afa1 c334e6f658 ae1678b153 c9fa5fc96d be298b15fa']")
    public WebElement toNextMonth;
    public void nextMonth(){actions.doubleClick(toNextMonth);}

    @FindBy(xpath = "//div[@class='fa3f76ae6b']//tr[4]//span[@class='b21c1c6c83']/span[.='20']")
    public WebElement departureday;

    public void departureDay(){safeClickOnElement(departureday);}

    @FindBy(xpath = "//div[@class='fa3f76ae6b']//tr[3]/td[2]/span[@class='b21c1c6c83 c0620ea0a7']")
    public WebElement returnday;
    public void returnDay(){clickOnElement(returnday);}

    @FindBy(xpath = "//div[@class='c5d667353d efea941f13']")
    public WebElement resut;

    public void bookmeth(){
        dateFieldmeth();
        nextMonth();
        departureDay();
        returnDay();

    }







}
