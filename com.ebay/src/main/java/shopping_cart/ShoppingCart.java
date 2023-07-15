package shopping_cart;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart extends BasePage {
    public ShoppingCart() {
        PageFactory.initElements(driver, this);
    }

/**Add items to shopping Cart
 * Given a user of Ebay clicks on toys
 * And clicks on dolls and teddy bear
 * And clicks on Disney princess
 * When clicks on Add to cart
 * Then the disney princess should be added
 * */
@FindBy(xpath = "//ul[@class='vl-flyout-nav__container']/li[@class='vl-flyout-nav__js-tab']/a[.='Electronics']")
public WebElement electronics;
@FindBy(xpath = "//div[.='Cell Phones & Smartphones']")
public WebElement shopCellPhones;
@FindBy(xpath = "//p[.='Apple']")
public WebElement shopByBrand;
@FindBy(xpath = "//div[.='iPhone 14 Pro Max']")
public WebElement shopByPhone;
@FindBy(xpath = "//a[.='Apple iPhone 14 Pro Max 128GB ( Unlocked)  US E Sim - Excellent$979.99']")
public WebElement phone;
@FindBy(xpath = "//a[@href='https://cart.payments.ebay.com/sc/add']//span[@class='ux-call-to-action__text']")
public WebElement addToCart;
@FindBy(xpath = "//h2[@class='vi-overlayTitleBar']")
public WebElement  itemAddeToCart;
public void setElectronics(){safeClickOnElement(electronics);}
public void setShopCellPhones(){safeClickOnElement(shopCellPhones);}
public void setShopByBrand(){safeClickOnElement(shopByBrand);}
public void setShopByPhone(){safeClickOnElement(shopByPhone);}
public void setPhone(){safeClickOnElement(phone);}
public void setAddToCart(){safeClickOnElement(addToCart);}

 public void addToCart(){
    setElectronics();
    setShopCellPhones();
    setShopByBrand();
    setShopByPhone();
    setPhone();
    setAddToCart();
 }


}