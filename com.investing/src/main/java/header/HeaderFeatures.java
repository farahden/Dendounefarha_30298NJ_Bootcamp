package header;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderFeatures extends BasePage {
    public HeaderFeatures(){
        PageFactory.initElements(driver,this);
    }
    /**new tab
     * Given user navigates to inveting.com
     * and hover over header
     * when user clicks on investing pro
     * then a new tab should be opened*/

@FindBy(xpath = "div.ba22ca0f div.ccb86a1f div.a1b8c034 div.d4e75ecb > img.ac1b5926")
public WebElement investingLogo;
public void investingtab(){
    driver.findElement(By.xpath("//a[@id='investingProNavMenuItem']")).click();
    driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
}

@FindBy(xpath = "//a[@href='//www.investing.com/analysis/']")
public WebElement analysis;

@FindBy(xpath = "//ul[@class='navMenuUL']/li[6]//ul[@class='main']")
    public WebElement navigationMenu;

@FindBy(xpath = "//header/div[@id='navBar']/nav[@id='navMenu']/ul[1]/li[1]/a[1]")
public WebElement markets;
@FindBy(xpath = "//ul[@class='subMenuNav']")
public WebElement subMenu;

public void nvigateTRoAnalysis(){
  hoverOverElement(analysis);
}
public void navigateToMarkest(){
    hoverOverElement(markets);
}



}
