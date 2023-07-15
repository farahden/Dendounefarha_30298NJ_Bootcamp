package test_radio;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import radio.RadioFeatures;

public class TestRadioFeatures extends BasePage {

    @Test
    public void testlistenToradio(){
        RadioFeatures radio=new RadioFeatures();
        radio.listenToradio();
        Assert.assertTrue(isElementVisible(radio.play));
    }

   @Test
    public void testplaylive() throws InterruptedException {
        RadioFeatures radio=new RadioFeatures();
        radio.playlive();


   }





























}
