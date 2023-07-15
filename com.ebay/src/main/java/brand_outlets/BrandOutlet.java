package brand_outlets;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandOutlet extends BasePage {
    public BrandOutlet(){
        PageFactory.initElements(driver,this);
    }
    /**select item from brand outlet
     * Given a user navigates to ebay home page
     * And clicks on Brand outlet
     * And clicks on handbags
     * When user clicks on Dior
     * than a result page should be landed
     * */

@FindBy(xpath ="//a[contains(.,'Brand Outlet')]" )
public WebElement brandOutlet;

@FindBy(xpath = "//span[.='Handbags']")
public WebElement handbags;

@FindBy(xpath = "//a[.='Dior']")
public WebElement  dior;

@FindBy(xpath = "//h1[@class='title-banner__title']")
public WebElement resultPage;

public void setBrandOutlet(){safeClickOnElement(brandOutlet);}
public void setHandbags(){safeClickOnElement(handbags);}
public void setDior(){safeClickOnElement(dior);}

public void brandOutletSection(){
    setBrandOutlet();
    setHandbags();
    setDior();
}



}
