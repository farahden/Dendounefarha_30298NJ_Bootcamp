package test_select_from_drop_down;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import select_from_drop_down.DropDownSelection;

public class TestSelectFromDropDown extends BasePage {
    @Test
    public void testSelectHour(){
        DropDownSelection dropDownSelection=new DropDownSelection();
        dropDownSelection.getAtaxi();
        dropDownSelection.getTime();
        dropDownSelection.selectPickUpHour();

    }
    @Test
    public void testSelectMinute(){
        DropDownSelection dropDownSelection=new DropDownSelection();
        dropDownSelection.getAtaxi();
        dropDownSelection.getTime();
        dropDownSelection.selectPickUpMinute();
    }
@Test
    public void TestSelectHourAndMinute(){
        DropDownSelection dropDownSelection=new DropDownSelection();
        dropDownSelection.selectPickUpTime();
        Assert.assertTrue(isElementVisible(dropDownSelection.timeIsDisplayed));
    }
}
