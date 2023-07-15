package search_bar;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoSearch extends BasePage {
    public DoSearch(){
        PageFactory.initElements(driver,this);
    }
    /**do search summary
     * Given a user navigates to ebay.com
     * And navigates to search bar
     * When user enter search item
     * and click search
     * then page search result should be landed properly*/
    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement searchbar;
    @FindBy(xpath = "//input[@id='gh-btn']")
    public WebElement searchButton;
    @FindBy(xpath = "//input[@id='gh-btn']")
    public WebElement serchResult;

public void searchbarmeth(){safeClickOnElement(searchbar);}
public void enterSearch(){sendKeysToElement(searchbar,"dolls");}
public void deletesearch(){clearSendKeysToElement(searchbar,"Barbie Doll");}
public void setSearchbar(){clickOnElement(searchButton);}

public void searchItem(){
    searchbarmeth();
    enterSearch();
    setSearchbar();
}
public void research(){
    searchbarmeth();
    enterSearch();
    deletesearch();
    setSearchbar();
}



}
