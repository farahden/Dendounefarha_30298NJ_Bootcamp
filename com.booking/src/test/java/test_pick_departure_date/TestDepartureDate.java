package test_pick_departure_date;

import base.BasePage;
import date_picker.PickDepartureDate;
import org.testng.annotations.Test;

public class TestDepartureDate extends BasePage {
    @Test
    public void testDepartureDate(){
        PickDepartureDate pickDepartureDate=new PickDepartureDate();
        pickDepartureDate.pickDepartureDateMeth();
    }
}
