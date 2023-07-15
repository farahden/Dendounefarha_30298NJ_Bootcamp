package test_authentication_with_fake_data;

import authentication_with_fake_data.RegisterWithFakeData;
import base.BasePage;
import org.testng.annotations.Test;

public class TestLogInWithFakeData extends BasePage {

    @Test

    public void testFakeSignIn() throws InterruptedException {
        RegisterWithFakeData registration=new RegisterWithFakeData();
        registration.register();
    }
}
