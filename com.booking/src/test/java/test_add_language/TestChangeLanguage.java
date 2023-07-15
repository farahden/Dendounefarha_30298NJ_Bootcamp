package test_add_language;

import add_language.ChangeLanguage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeLanguage extends BasePage {

@Test
    public void TestChangetoFrench(){
        ChangeLanguage changeLanguage=new ChangeLanguage();
        changeLanguage.changeLanguageToFrench();
        Assert.assertTrue(isElementVisible(changeLanguage.flag));
    }










}
