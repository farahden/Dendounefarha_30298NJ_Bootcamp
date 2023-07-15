package test_map_features;

import base.BasePage;
import map_features.MapPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMapFeatures extends BasePage {
    @Test
    public void TestMap(){
        MapPage mapPage=new MapPage();
        mapPage.switchButton();
        Assert.assertTrue(isElementVisible(mapPage.MapButton));
    }

    @Test
    public void TestInfoBox(){
        MapPage mapPage=new MapPage();
        mapPage.infoBoxMeth();
        Assert.assertTrue(isElementVisible(mapPage.infoBox));

    }















}
