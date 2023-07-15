package test_authentication;

import authenticate.Authenticate;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {


@Test
    public void testCreateAccount()  {
        Authenticate signUp=new Authenticate();
        signUp.createAccount();
        Assert.assertTrue(isElementVisible(signUp.confirmationNumb));
    }
@Test
    public void testlogin(){
        Authenticate login=new Authenticate();
        login.setLogIn();
        Assert.assertTrue(isElementVisible(login.usernameDisplayed));
}
@Test
    public void testLogOut(){
    Authenticate logOut=new Authenticate();
    logOut.logout();
    Assert.assertTrue(isElementVisible(logOut.sbmittbutton));
}





}
