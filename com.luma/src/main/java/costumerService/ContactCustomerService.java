package costumerService;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactCustomerService extends BasePage {
    /**Test Summary of contacting customer service
     * As a user of luma app
     * when I scroll down to the bottom of the home page
     * And I Click on contact as
     * when I enter a valid name
     * and I enter a valid email
     * and I enter a valid phone number
     * and I write a message
     * When I click on submmit button
     * then I should be to see the welcoming message*/

    @FindBy(xpath = "//a[.='Contact Us']")
    public WebElement contactUs;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement InputName;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement inputEmail;
    @FindBy(xpath = "//input[@id='telephone']")
    public WebElement phoneNum;
    @FindBy(xpath = "//textarea[@id='comment']")
    public WebElement message;
    @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement submittButton;
    @FindBy(xpath = "//div[@class='message-success success message']/div[contains(.,\"Thanks for contacting us with your comments and questions. We'll respond to you\")]")
    public WebElement actualResult;

    public ContactCustomerService(){
        PageFactory.initElements(driver,this);}

        public void contactUs(){ safeClickOnElement(contactUs);}
        public void enterName(String name){sendKeysToElement(InputName,name);}
        public void enterEmail(String email){sendKeysToElement(inputEmail,email);}
        public void enterPHoneNum(String number){sendKeysToElement(phoneNum,number);}
        public void writeMessage(String text){sendKeysToElement(message,text);}
        public void setSubmittButton(){safeClickOnElement(submittButton);}


        public void CustomerService(String name,String email,String number,String text){
        contactUs();
        enterName(name);
        enterEmail(email);
        enterPHoneNum(number);
        writeMessage(text);
        setSubmittButton();

        }








    }

