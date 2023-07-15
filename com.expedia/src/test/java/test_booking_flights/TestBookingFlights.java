package test_booking_flights;

import base.BasePage;
import booking_lights.Booking;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TestBookingFlights extends BasePage {




   @Test
    public void testFromDatePicker() throws InterruptedException {
        Booking booking=new Booking();
        booking.setButtonFromDate();
        webDriverWait.until(ExpectedConditions.visibilityOf(booking.headerFromDatePickerMonthLeft));
        String monthYear = "072023";
        booking.navigateDatePickerTo(monthYear);

        String table = booking.determineWhichMonthTable(monthYear);

        String departureDate = "24";
        safeClickOnElement(booking.getMonthDayButtonFromTable(table, departureDate));

        monthYear = "092023";
        booking.navigateDatePickerTo(monthYear);
        table = booking.determineWhichMonthTable(monthYear);
       Thread.sleep(5000);
        String returnDate = "4";
        clickOnElement(booking.getMonthDayButtonFromTable(table, returnDate));

        Thread.sleep(5000);

    }

}
