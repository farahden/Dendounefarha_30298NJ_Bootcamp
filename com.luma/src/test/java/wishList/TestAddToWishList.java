package wishList;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import wishlist.WishListPage;

public class TestAddToWishList extends BasePage {

    @Test
    public void testAddItem(){
        WishListPage wishListPage=new WishListPage();
        wishListPage.setwishlist();
        Assert.assertTrue(isElementVisible(wishListPage.wishListMessage));
    }




}
