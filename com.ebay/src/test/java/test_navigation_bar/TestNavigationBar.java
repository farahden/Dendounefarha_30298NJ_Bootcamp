package test_navigation_bar;

import base.BasePage;
import navigation_bar.NavigationBar;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNavigationBar extends BasePage {


    @Test
    public void testNavigationBar(){
        NavigationBar navigationBar=new NavigationBar();
        navigationBar.setHomeNDecor();
        Assert.assertTrue(isElementVisible(navigationBar.resultMessage));
    }

@Test
public void testJewelryAndWatches(){
    NavigationBar navigationBar=new NavigationBar();
    navigationBar.jewelryAndWatchesMeth();
    Assert.assertTrue(isElementVisible(navigationBar.engagementRing));
    }
}