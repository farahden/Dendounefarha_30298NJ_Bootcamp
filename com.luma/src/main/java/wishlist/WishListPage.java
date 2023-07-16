package wishlist;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage extends BasePage {

    @FindBy(xpath = "//img[@alt='Breathe-Easy Tank']")
    public WebElement womanTop;

    @FindBy(xpath = "//div[@class='product-addto-links']//span[.='Add to Wish List']")
    public WebElement addToWishList;

    @FindBy(xpath = "//span[@class='base']")
    public WebElement wishListMessage;

    public WishListPage(){PageFactory.initElements(driver,this); }
    public void selectItem(){safeClickOnElement(womanTop);}
    public void addItem(){safeClickOnElement(addToWishList);}

    public void setwishlist(){
        selectItem();
        addItem();
    }


}
