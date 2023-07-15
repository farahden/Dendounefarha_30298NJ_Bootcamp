package test_booking_date;

import base.BasePage;
import booking_date.BookingDate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBookingDate extends BasePage {
    @Test
    public void testBooking(){
        BookingDate bookingDate=new BookingDate();
        bookingDate.bookmeth();
        Assert.assertFalse(isElementVisible(bookingDate.resut));
    }






}
