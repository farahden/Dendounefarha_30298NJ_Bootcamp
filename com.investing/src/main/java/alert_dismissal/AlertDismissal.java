package alert_dismissal;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertDismissal extends BasePage {

    public AlertDismissal(){
        PageFactory.initElements(driver,this);
    }
    /**close log in frame proposition
     * Given a user navigates to investing.com
     * And a registration frame pop out
     * When user clicks on exit button
     * then the pop out should disappear*/

    @FindBy(css = "body.takeover.dfpTakeovers.has-promo-strip-header:nth-child(2) div.signupWrap.js-gen-popup.dark_graph:nth-child(22) div.right > i.popupCloseIcon.largeBannerCloser")
    public WebElement exitButton;

    @FindBy(xpath = "//div[@class='right']")
    public WebElement popOout;

    public void exitMeth(){
        exitButton.click();
    }


}
