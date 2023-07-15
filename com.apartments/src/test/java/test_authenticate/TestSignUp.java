package test_authenticate;

import authenticate.SignInPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignUp extends BasePage {

   @Test
    public void testSignUpMethod() {
        SignInPage signInPage=new SignInPage();
        signInPage.createAccountMethod();
        Assert.assertTrue(isElementVisible(signInPage.accountCreated));
    }

    @Test
    public void testInvalidEmail(){
        SignInPage signInPage=new SignInPage();
      signInPage.invalidEmail();
      Assert.assertTrue(isElementVisible(signInPage.errorMessage));
    }

    @Test
    public void testInvalidPassword(){
    SignInPage signInPage=new SignInPage();
    signInPage.invalidPassWordMeth();
    Assert.assertTrue(isElementVisible(signInPage.invalidPassword));
}

    @Test
    public void testInvalidVerifiedEmail(){
    SignInPage signInPage=new SignInPage();
    signInPage.invalidVerifiedPasswordMeth();
    Assert.assertTrue(isElementVisible(signInPage.invalidVerifiedPassword));
}

    @Test
    public void testSkipInputField(){
        SignInPage signInPage=new SignInPage();
        signInPage.emptyInputField();
        Assert.assertTrue(isElementVisible(signInPage.InputField));
    }






}
