package test_share_drop_drag;

import base.BasePage;
import share.ShareClass;
import org.testng.annotations.Test;

public class TestShare extends BasePage {
@Test
    public void testSharefeature() {
        ShareClass shareClass=new ShareClass();
        shareClass.selectrightcity();
        shareClass.clickCityImage();
        shareClass.selectShare();
        shareClass.copyLinkmeth();
    }


}