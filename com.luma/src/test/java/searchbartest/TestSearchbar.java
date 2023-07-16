package searchbartest;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import searchBar.SearchBarPage;

public class TestSearchbar extends BasePage {
//test search

    @Test
    public void testSearchElement(){
        SearchBarPage searchBarPage=new SearchBarPage();
        searchBarPage.serchBar();
        Assert.assertTrue(isElementVisible(searchBarPage.actualResult));
    }



}

