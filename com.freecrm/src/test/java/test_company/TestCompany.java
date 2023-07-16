package test_company;

import base.BasePage;
import company.CompanyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCompany extends BasePage {
 @Test
    public void testcreateNewCompanie() {
        CompanyPage company = new CompanyPage();
        company.createNewCompanie();
        Assert.assertTrue(isElementVisible(company.created));

    }

@Test
    public void testdeletecompany(){
     CompanyPage delete=new CompanyPage();
     delete.trydelete();
     Assert.assertFalse(isElementVisible(delete.cancelButton));
}


}