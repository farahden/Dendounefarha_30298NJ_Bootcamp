package test_dismiss_alert;

import alert_dismissal.AlertDismissal;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDismissAllert extends BasePage {

@Test
    public void testExitAlert(){
        AlertDismissal alertDismissal=new AlertDismissal();
        alertDismissal.exitMeth();
        Assert.assertFalse(isElementVisible(alertDismissal.popOout));
    }
}
