package test_homepage_pubs;

import base.BasePage;
import homepage_pubs.Advertisements;
import org.testng.annotations.Test;

public class TestAdvertisements extends BasePage {
@Test
public void testSwichFrame(){
    Advertisements ads=new Advertisements();
    ads.switchFrame();
}

}
