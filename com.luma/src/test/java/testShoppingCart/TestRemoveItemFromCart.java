package testShoppingCart;

import ShoppingCart.RemoveItemClass;
import athentification.LogInPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRemoveItemFromCart extends BasePage {


    @Test
    public void testRemoveItem() throws InterruptedException {
        LogInPage logInPage= new LogInPage();
        String validEmail ="farahden@gmail.com";
        String validPassword="1120FD*/";
        logInPage.getLogIn(validEmail,validPassword);
        Thread.sleep(3000);
        RemoveItemClass removeItemClass=new RemoveItemClass();
        removeItemClass.removeItemFromCart();
        Assert.assertTrue(isElementVisible(removeItemClass.message));



    }












}
