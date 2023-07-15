import base.BasePage;
import bookin_a_trip.BookTrip;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBookATrip extends BasePage {

    @Test
    public void testSetDestination(){
        BookTrip bookTrip=new BookTrip();
        bookTrip.destination();
        Assert.assertTrue(isElementVisible(bookTrip.miamiResult));
    }

    @Test
    public void testBookAtrip(){
        BookTrip bookTrip=new BookTrip();
        bookTrip.pickDate();
    }

@Test
    public void testAddTravelers() throws InterruptedException {
        BookTrip bookTrip=new BookTrip();
        bookTrip.setTravelers();
        Assert.assertTrue(isElementVisible(bookTrip.ageRequired));
}

}
