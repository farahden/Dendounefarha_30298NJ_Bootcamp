package radio_button;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton extends BasePage {
public RadioButton(){
    PageFactory.initElements(driver,this);
}
@FindBy(xpath = "//span[.='Airport taxis']")
    public WebElement taxis;
@FindBy(xpath = "//label[@class='rw-radio rw-return-radio__affirmative']/span[@class='rw-radio__label']")
public WebElement returnRadioButton;
@FindBy(xpath = "//undefined[contains(.,'Pickup DetailsPick-up locationUse up and down keys to access and browse suggesti')]")
public WebElement returnTable;
public void getATaxi(){clickOnElement(taxis);}
public void radioButton(){
    clickOnElement(returnRadioButton);
}
public void radiobuttonTest()  {

    getATaxi();
    radioButton();
}




}
