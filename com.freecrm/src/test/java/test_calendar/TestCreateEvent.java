package test_calendar;

import base.BasePage;
import calendar.CreateEvent;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateEvent extends BasePage {


    @Test
public void testcreateEvent(){

        CreateEvent create=new CreateEvent();
        create.createEvent();
        Assert.assertTrue(isElementVisible(create.title));
    }

@Test
public void testPickstartingdate(){
CreateEvent date=new CreateEvent();
date.createEvent();
}

@Test
    public void testendingdate(){
        CreateEvent endDate=new CreateEvent();
        endDate.pickdateending();
}


























}
