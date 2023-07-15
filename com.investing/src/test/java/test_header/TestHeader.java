package test_header;

import base.BasePage;
import header.HeaderFeatures;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeader extends BasePage {

    @Test
    public void testnewtab(){
        HeaderFeatures header=new HeaderFeatures();
        header.investingtab();
       fluentWait.until(ExpectedConditions.visibilityOf(header.investingLogo));
        Assert.assertTrue(isElementVisible(header.investingLogo));
    }
@Test
public void testAnalysis(){
        HeaderFeatures header=new HeaderFeatures();
        header.nvigateTRoAnalysis();
        Assert.assertTrue(isElementVisible(header.navigationMenu));
}
@Test
public void testmarketSubMenu(){
        HeaderFeatures hd=new HeaderFeatures();
        hd.navigateToMarkest();
        Assert.assertTrue(isElementVisible(hd.subMenu));
}




}
