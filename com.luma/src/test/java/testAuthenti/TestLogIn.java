package testAuthenti;

import athentification.LogInPage;
import athentification.LogOutPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogIn extends BasePage {



    @Test
    public void testLogin(){

        LogInPage logInPage= new LogInPage();
        String validEmail ="farahden@gmail.com";
        String validPassword="1120FD*/";
        logInPage.getLogIn(validEmail,validPassword);
        Assert.assertTrue(isElementVisible(logInPage.resultLoginMessage));
}
    @Test
    public void testLogOut(){
        LogOutPage logOutPage=new LogOutPage();
        logOutPage.logOut();
        Assert.assertTrue(isElementVisible(logOutPage.resultSignOut));
    }

}
