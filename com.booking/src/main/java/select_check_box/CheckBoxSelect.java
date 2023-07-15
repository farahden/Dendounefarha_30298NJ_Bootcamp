package select_check_box;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxSelect extends BasePage {
    public CheckBoxSelect(){
        PageFactory.initElements(driver,this);
    }
    /**Given a user navigates to home page
     * when user clicks on the show me holiday rentals
     * Then the check box should be checked
     * */

    @FindBy(xpath = "//span[@class='bbdb949247']")
    public WebElement checkBox;

    public void selectCheckBox()  {

        clickOnElement(checkBox);}

        /**Given A user */
}
