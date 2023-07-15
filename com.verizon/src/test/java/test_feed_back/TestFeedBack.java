package test_feed_back;

import base.BasePage;
import feedback.FeedBack;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFeedBack extends BasePage {
    @Test
    public void testFeedBack() throws InterruptedException {
        FeedBack feedBack=new FeedBack();
        feedBack.addFeedBack();
        Assert.assertTrue(isElementVisible(feedBack.thankYouMessage));
    }
}
