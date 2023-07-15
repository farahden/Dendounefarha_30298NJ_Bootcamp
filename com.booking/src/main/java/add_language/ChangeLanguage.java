package add_language;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChangeLanguage extends BasePage {
    public ChangeLanguage(){
        PageFactory.initElements(driver,this);
    }
    /**change language
     * given a user navigates to home page
     * and clicks on american flags
     * when user clicks on francais
     * then language should be french*/

    @FindBy(xpath = "//img[@src='https://t-cf.bstatic.com/design-assets/assets/v3.77.0/images-flags/Us@3x.png']")
    public WebElement americanFlagButton;

    @FindBy(xpath = "//img[@src='https://t-cf.bstatic.com/design-assets/assets/v3.77.0/images-flags/Us@3x.png']")
    public WebElement francais;

    @FindBy(xpath = "//img[@src='https://t-cf.bstatic.com/design-assets/assets/v3.77.0/images-flags/Us@3x.png']")
    public WebElement flag;

    public void setAmericanFlagButton(){safeClickOnElement(americanFlagButton);}
    public void setFrancais() {
        safeClickOnElement(francais);
    }
    public void changeLanguageToFrench(){
        setAmericanFlagButton();
        setFrancais();
    }


}
