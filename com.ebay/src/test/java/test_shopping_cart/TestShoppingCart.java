package test_shopping_cart;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import shopping_cart.ShoppingCart;

public class TestShoppingCart extends BasePage {
  @Test
    public void testAddToCart(){
        ShoppingCart cart=new ShoppingCart();
        cart.addToCart();
        Assert.assertTrue(isElementVisible(cart.itemAddeToCart));
    }
}
