package testAuthenti;


import athentification.Authentification;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignIn extends BasePage {

  @Test
    public void testLogIn(){
        Authentification authentification=new Authentification();
        authentification.SignIn("farah","den","farahlarbi@gmail.com","1234test*","1234test*");
        Assert.assertTrue(isElementVisible(authentification.successfullyRegistredMessage));
    }







}
