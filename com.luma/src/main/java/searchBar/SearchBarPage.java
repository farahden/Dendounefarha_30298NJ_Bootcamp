package searchBar;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBarPage extends BasePage {

    /**
     * Test search feature:
     * As a user user of LUMA
     * when I enter a valid name in a search bar
     * And I hit enter
     * I should be able to see the result of my search
     */

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchInput;

    @FindBy(xpath = "//span[@class='base']")
    public WebElement actualResult;

    public void InputSearch(String element) {
        sendKeysToElement(searchInput, "bags");
    }

    public void setSearch() {
        safeClickOnElement(searchInput);
    }

    public SearchBarPage() {
        PageFactory.initElements(driver, this);
    }

    public void serchBar() {
        InputSearch("bags");
        setSearch();

    }


}










