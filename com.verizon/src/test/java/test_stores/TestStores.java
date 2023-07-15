package test_stores;

import base.BasePage;
import check_stores.Stores;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStores extends BasePage {

@Test
    public void findStoreByZip(){
     Stores stores=new Stores();
     stores.lookForStoresByZipCode();
     Assert.assertTrue(isElementVisible(stores.pageStoresLocation));

    }
@Test
    public void findStoresBylocation(){
    Stores stores=new Stores();
    stores.lookForStoresByLocation();
    Assert.assertTrue(isElementVisible(stores.pageStoresLocation));
    }
}

