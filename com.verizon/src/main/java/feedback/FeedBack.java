package feedback;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedBack extends BasePage {
    public FeedBack(){PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//img[@alt='Feedback']")
    public WebElement feedBack;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/form[1]/main[1]/div[3]/div[2]/div[1]/label[10]")
    public WebElement submitANumber;

    @FindBy(xpath = "//textarea[@class='_3VgxUzppbTclqye69HSxig']")
    public WebElement addComment;

    @FindBy(xpath = "//select[@class='_1FGlSZ-XuP6a_WzPyMjJXy _2h7ZD9-DEoA9lLUR0Yxku5']")
    public WebElement perpposeOfVisit;

    @FindBy(xpath = "//button[@name='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//p[.='Thank you for providing feedback']")
    public WebElement thankYouMessage;

    public void setFeedBack() {clickOnElement(feedBack);}
    public void setSubmitANumber(){safeClickOnElement(submitANumber);}
    public void setAddComment (){sendKeysToElement(addComment,"thank you");}
    public void setPerpposeOfVisit() throws InterruptedException {safeClickOnElement(perpposeOfVisit);
        wait(3000);
        selectFromDropdownByIndex(perpposeOfVisit,1); }
    public void setSubmitButton(){clickOnElement(submitButton);}

    public void addFeedBack() throws InterruptedException {
        setFeedBack();
        setSubmitANumber();
        setAddComment();
        setPerpposeOfVisit();
        setSubmitButton();


    }








}
