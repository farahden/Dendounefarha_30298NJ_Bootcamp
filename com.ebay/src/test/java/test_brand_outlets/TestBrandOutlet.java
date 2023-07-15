package test_brand_outlets;

import base.BasePage;
import brand_outlets.BrandOutlet;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBrandOutlet extends BasePage {
    @Test
    public void testbrandOutlet(){
        BrandOutlet brandOutlet=new BrandOutlet();
        brandOutlet.brandOutletSection();
        Assert.assertTrue(isElementVisible(brandOutlet.resultPage));
    }
}
