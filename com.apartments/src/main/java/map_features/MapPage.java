package map_features;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MapPage extends BasePage {

public MapPage(){PageFactory.initElements(driver,this); }

/***switch to hybrid
 * Given a user navigates to the home page
 *  And clicks on drawer Menu
 *  And user clicks on Apartments
 * And user clicks on MIAMI,FL
 * And Navigates to the map
 *  When user clicks on hybrid
 * Then map should be switched to hybrid*/

    @FindBy(xpath = "//button[@class='drawer-menu_drawerMenuTrigger__RoCqW']")
    public WebElement drawerMenuButton;

    @FindBy(xpath = "//button[contains(.,'apartments')]")
    public WebElement apartments;

    @FindBy(xpath = "//div[@class='drawer-menu_drawerMenuSubMenu__GsE3s drawer-menu_drawerSubMenuVisible__OYhG2']//a[.='Miami, FL']")
    public WebElement city;
    @FindBy(xpath = "//button[.='Hybrid']")
    public WebElement hybridButton;

    @FindBy(xpath = "//button[.='Map']")
    public WebElement MapButton;

    public void setDrawerMenuButton(){safeClickOnElement(drawerMenuButton);}
    public void setApartments(){safeClickOnElement(apartments);}
    public void setCity(){safeClickOnElement(city);}
    public void setHybridButton(){safeClickOnElement(hybridButton);}


    public void switchButton(){
        setDrawerMenuButton();
        setApartments();
        setCity();
        setHybridButton();
    }


    /**Look For Apartment From Map
     * Given a user navigates to the home page
     *  *  And clicks on drawer Menu
     *  *  And user clicks on Apartments
     *  * And user clicks on MIAMI,FL
     *  * And Navigates to the map
     *  *  When user clicks on area
     *  * Then info apartment box open
     */
   @FindBy(xpath = "//div[@class='gm-style']//div[6]/button[@class='marker-button_markerButtonCommonStyles__m6me2 marker-button_markerButtonDotStyle__w8gfb']")
   public WebElement clickButton;
   @FindBy(xpath = "//div[@class='marker-popup_card__vcEod']")
    public WebElement infoBox;

   public void setClickButton(){safeClickOnElement(clickButton);}
   public void infoBoxMeth(){
       setDrawerMenuButton();
       setApartments();
       setCity();
       setClickButton();
   }
}
