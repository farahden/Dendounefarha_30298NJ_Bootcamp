package test_verizon_subl_inks;

import base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizon_sub_links.SubLinks;

public class TestSubLinks extends BasePage {


@Test
    public void testLinks(){
        SubLinks subLinks=new SubLinks();
        subLinks.getBuyNowLink();
        Assert.assertTrue(isElementVisible(subLinks.buyingPage));
    }

    @Test
    public void testLink(){
    SubLinks subLinks=new SubLinks();
    subLinks.setBringYourPhone();
        fluentWait.until(ExpectedConditions.visibilityOf(subLinks.theHeadLine));
        Assert.assertTrue(isElementVisible(subLinks.phones));
    }

    @Test
    public void testThirdLink(){
    SubLinks subLinks=new SubLinks();
    subLinks.getOfferDetails();
    Assert.assertTrue(isElementVisible(subLinks.offerDetails));
    }

}
