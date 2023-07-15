package test_authenticate;

import authenticate.SignIn;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogIn extends BasePage {



    @Test
    public void testlogin(){
        SignIn sign=new SignIn();
        sign.login();
    }

    @Test
    public void testsetSignUpButton(){
        SignIn signup=new SignIn();
        signup.setSignUpButton();
    }

    @Test
    public void testcreateAccount(){
        SignIn fakedata=new SignIn();
        fakedata.createAccount();

    }

    @Test
    public void testsubmittCreation(){
        SignIn signIn=new SignIn();
        signIn.submittCreation();

}

    @Test
    public void testconfirmcration(){
        SignIn signin=new SignIn();
        signin.confirmCreation();
        Assert.assertTrue(isElementVisible(signin.logout));
}

    @Test
    public void logOut(){
        SignIn logout=new SignIn();
        logout.logout();
        Assert.assertTrue(isElementVisible(logout.logout));
}










}
