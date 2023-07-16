package ShoppingCart;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**Test Add Item to shopping cart
 * As a user of luma
 *And I hover over the navigation bar
 * And I click on men
 * and i click on tops
 * and I select Item
 * And I select color
 * AND I select size
 * when I click on Add button
 * I should be able to see the item added
  */
public class AddToShoppingCard extends BasePage {

    public AddToShoppingCard(){ PageFactory.initElements(driver,this); }

    @FindBy(xpath= "//a[@href='https://magento.softwaretestingboard.com/men.html']/span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    public  WebElement menDropDownButton;

   @FindBy(xpath = "//ol[@class='items']//a[.='Tops']")
    public WebElement tops;

    @FindBy(xpath = "//ol[@class='products list items product-items']/li[3]")
    public WebElement item;

    @FindBy(xpath ="//div[@class='swatch-attribute size']//div[.='M']" )
    public WebElement size;

    @FindBy(xpath = "//div[@class='swatch-option color']")
    public WebElement color;

    @FindBy(xpath = "//button[@id='product-addtocart-button']")
   public WebElement addingButton;

    @FindBy(xpath ="//div[@class='minicart-wrapper']/a[@href='https://magento.softwaretestingboard.com/checkout/cart/']")
   public WebElement itemAdded;



    public void dropDown(){ safeClickOnElement(menDropDownButton);}

    public void selectSection() {safeClickOnElement(tops); }

    public void chooseItem(){safeClickOnElement(item);}

    public void getSize(){safeClickOnElement(size);}

    public void chooseColor(){ safeClickOnElement(color);}

    public void addButton(){safeClickOnElement(addingButton); }

public void addToCart() {
    dropDown();
    selectSection();
    chooseItem();
    getSize();
    chooseColor();
    addButton();

}
}










