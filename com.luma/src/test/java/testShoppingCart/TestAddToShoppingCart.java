package testShoppingCart;

import ShoppingCart.AddToShoppingCard;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddToShoppingCart extends BasePage {
    @Test
    public void addIem(){
        AddToShoppingCard addToShoppingCard=new AddToShoppingCard();
        addToShoppingCard.addToCart();
        Assert.assertTrue(isElementVisible(addToShoppingCard.itemAdded));
    }



}
