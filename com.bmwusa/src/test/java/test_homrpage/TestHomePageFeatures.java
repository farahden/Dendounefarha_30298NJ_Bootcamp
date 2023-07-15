package test_homrpage;

import base.BasePage;
import homepageDisplay.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageFeatures extends BasePage {
   @Test
    public void testElectrics(){
        HomePage homePage=new HomePage();
        homePage.theBMWelectrics();
        Assert.assertTrue(isElementVisible(homePage.electroMobility));
    }
    @Test
    public void testhybrid(){
       HomePage homePage=new HomePage();
       homePage.setHybrid();
       Assert.assertTrue(isElementVisible(homePage.watchVideo));

    }
    @Test
    public void testGetToVideo(){
       HomePage homePage=new HomePage();
       homePage.gettovideo();
    }
    @Test
    public void testplayVideo(){
        HomePage homePage=new HomePage();
        homePage.playVideo();

    }
@Test
    public void testMuteVideo(){
    HomePage homePage=new HomePage();
    homePage.mutevideo();
}

}
