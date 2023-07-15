package test_header;

import base.BasePage;
import header.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeader extends BasePage {
    @Test
    public void testSubHeader(){
        Header header=new Header();
        header.setProducts();
        Assert.assertTrue(isElementVisible(header.subHeaderMenu));

    }
}
