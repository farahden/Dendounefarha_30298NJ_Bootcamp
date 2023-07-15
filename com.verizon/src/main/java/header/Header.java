package header;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header extends BasePage {
    public Header(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='gnav20-row-one opacityOne']//a[.='Business']")
    public WebElement business;
    @FindBy(xpath = "//div[@class='gnav20-primary-menu gnav20-mega-drawer']/button[@class='gnav20-menu-label gnav20-menu-label-button gnav20-haschild']")
    public WebElement products;
    @FindBy(xpath = "//div[@class='gnav20-sub-header-menu gnav20-sub-menu gnav20-mega-active']")
    public WebElement subHeaderMenu;

    Actions act=new Actions(driver);
    public void setBusiness(){clickOnElement(business);}
    public void setProducts(){
        setBusiness();
        act.moveToElement(products);}
}
