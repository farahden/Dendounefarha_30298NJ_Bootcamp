package test_search_bar;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import search_bar.DoSearch;

public class TestSearchBar extends BasePage {

   @Test
    public void testSearch(){
        DoSearch search=new DoSearch();
        search.searchItem();
        Assert.assertTrue(isElementVisible(search.serchResult));
    }

    @Test
    public void testResearch(){
       DoSearch research=new DoSearch();
       research.research();
    }


}
