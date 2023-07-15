package test_radio_button;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import radio_button.RadioButton;

public class TestRadioButton extends BasePage {
@Test
   public void testradiobutton() {
       RadioButton radioButton=new RadioButton();
       radioButton.radiobuttonTest();
       Assert.assertTrue(isElementVisible(radioButton.returnTable));
   }

}
