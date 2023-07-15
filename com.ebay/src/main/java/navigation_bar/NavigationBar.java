package navigation_bar;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar extends BasePage {
    public NavigationBar(){
        PageFactory.initElements(driver,this); }

    /**Test Navigation
     * Given a user navigates to home page
     * When I click on Home & Decor
     * Then I a drop down
     * */

    @FindBy(xpath = "//li[contains(.,'Home & GardenExpand: Home & GardenTop CategoriesYard, Garden & Outdoor Living It')]")
    public WebElement homeNDecor;

    @FindBy(xpath = "//ul[.='eBay Home & Garden']")
    public WebElement resultMessage;
    public void setHomeNDecor(){safeClickOnElement(homeNDecor);}



    /**Test JewelryAndWatches
 * Given a user navigates Jewelry And Watches
 * When click on engagement and wedding
 *Then user should see engagement ring
 * */

    @FindBy(xpath = "//ul[@class='vl-flyout-nav__container']/li[@class='vl-flyout-nav__js-tab']/a[.='Jewelry & Watches']")
    public WebElement jewelryAndWatches;
    @FindBy(xpath = "//span[.='Engagement & Wedding']")
    public WebElement engagementAndWedding;
    @FindBy(xpath = "//a[.='Engagement Rings']")
    public WebElement engagementRing;
public void setJewelryAndWatches(){safeClickOnElement(jewelryAndWatches);}
public void setEngagementAndWedding(){safeClickOnElement(engagementAndWedding);}
public void jewelryAndWatchesMeth(){
    setJewelryAndWatches();
    setEngagementAndWedding();
}



}
