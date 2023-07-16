package ShoppingCart;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveItemClass extends BasePage {
    @FindBy(xpath ="//div[@class='minicart-wrapper']/a[@href='https://magento.softwaretestingboard.com/checkout/cart/']")
    public WebElement cartWithItems;

    @FindBy(css = "[data-bind='i18n: \\'View and Edit Cart\\'']")
    public WebElement editCart;

    @FindBy(xpath ="//a[contains(.,'Remove item')]")
    public WebElement deleteItem;

    @FindBy(xpath ="//p[.='You have no items in your shopping cart.']")
    public WebElement message;

    public RemoveItemClass(){ PageFactory.initElements(driver,this); }

    public void fullCart(){safeClickOnElement(cartWithItems);}
    public void setEditCart(){safeClickOnElement(editCart);}
    public void setDeleteItem(){safeClickOnElement(deleteItem);}


    public void removeItemFromCart() throws InterruptedException {
        fullCart();
        Thread.sleep(2000);
        setEditCart();
        setDeleteItem();
        setDeleteItem();

}




















}
