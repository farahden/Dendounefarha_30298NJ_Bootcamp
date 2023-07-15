package drawer_menu;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrawerMenu extends BasePage {

public DrawerMenu(){
    PageFactory.initElements(driver,this);
}


/***Test open Drawer Menu
 * Given  a user navigates to the home page
 * when clicks on drawer Menu
 * then the drawer should be appeared
 * */

@FindBy(xpath = "//button[@class='drawer-menu_drawerMenuTrigger__RoCqW']")
    public WebElement drawerMenuButton;
@FindBy(xpath ="//div[@class='drawer-menu_drawerMenuSubMenuBase__wfjxY drawer-menu_drawerMenuBackToMainMenu__NYoJ_']" )
    public WebElement drawerMenuFrame;

public void setDrawerMenuButton(){safeClickOnElement(drawerMenuButton);}
public void openDrawerMenu(){
    setDrawerMenuButton();
}

/**Close Drawer Menu
 * Given  a user navigates to the home page
 *  * And clicks on drawer Menu
 *  * when users clicks on exit
 *  then user should be exited
 * */
@FindBy(xpath = "//button[.='Close navigation menu']")
    public WebElement closeButton;
@FindBy(xpath = "//div[@class='page-header_pageHeaderLeft__xw_AW']")
public WebElement header;

public void setCloseButton(){safeClickOnElement(closeButton);}
public void closeMenu(){
    openDrawerMenu();
    setCloseButton();

}

/**Drawer Sub Menu
 * Given  a user navigates to the home page
 *  *  * And clicks on drawer Menu
 *  *  * And user clicks on Apartments
 *  *  then user should be  on the sub menu
 * */
@FindBy(xpath = "//button[contains(.,'apartments')]")
public WebElement apartments;
@FindBy(xpath = "//div[@class='drawer-menu_drawerMenuSubMenu__GsE3s drawer-menu_drawerSubMenuVisible__OYhG2']/ul[@class='drawer-menu_drawerMenuBody__P3z6Y drawer-menu_drawerMenuItems___PPc5']")
public WebElement subMenuFrame;
public void setApartments(){safeClickOnElement(apartments);}
public void subMenu(){
    openDrawerMenu();
    setApartments();
}

/**Look For appartment in a city
 * * Given  a user navigates to the home page
 * And clicks on drawer Menu
 * And user clicks on Apartments
 * When user clicks on MIAMI,FL
 * Then a map appears
 *  * */
 @FindBy(xpath = "//div[@class='drawer-menu_drawerMenuSubMenu__GsE3s drawer-menu_drawerSubMenuVisible__OYhG2']//a[.='Miami, FL']")
    public WebElement city;
 @FindBy(xpath = "//div[@class='gm-style']/div[2]/div[contains(.,'To navigate, press the arrow keys.$2.7k$2,675+Bezel at MiamiSchedule Tour • (305')]")
    public WebElement mapPage;

 public void setCity(){safeClickOnElement(city);}
 public void selectCity(){
     subMenu();
     setCity();
 }

 /**Back To Home Page
  * Given  a user navigates to the home page
  *  * And clicks on drawer Menu
  *  * And user clicks on Apartments
  *  * And user clicks on MIAMI,FL
  *  * When user clicks on the logo"Rent"
  *  Then user should be navigated to home page
  * */

 @FindBy (xpath = "//li[@class='breadcrumbs_breadcrumb__wKWLt']/a[.='Home']")
 public WebElement Logo;
    @FindBy (xpath = "//h1[@id='hero-heading']")
    public WebElement homePage;
    public void setLogo(){safeClickOnElement(Logo);}
    public void setHomePage(){
    selectCity();
    setLogo();
}


















}
