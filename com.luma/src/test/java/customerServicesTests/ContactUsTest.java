package customerServicesTests;

import base.BasePage;
import costumerService.ContactCustomerService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends BasePage {

    @Test
    public void testContactUs(){
        ContactCustomerService contactCustomerService=new ContactCustomerService();
      contactCustomerService.CustomerService("farah den","farahden@gmail.com","123-456-789","this is a test");
        Assert.assertTrue(isElementVisible(contactCustomerService.actualResult));
    }



}
