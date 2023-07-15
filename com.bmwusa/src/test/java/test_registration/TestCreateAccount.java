package test_registration;

import authenticate.Registration;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateAccount extends BasePage {
    @Test
public void testcreateAccount()  {
        Registration registration=new Registration();
        registration.createNewAccount();
        Assert.assertTrue(isElementVisible(registration.accountCreated));
    }

@Test
public void testCreateAccountInvalidEmail() {
    Registration registration=new Registration();
    registration.CreateAccountInvalidEmail();
    Assert.assertTrue(isElementVisible(registration.errorMessage));
}

}
