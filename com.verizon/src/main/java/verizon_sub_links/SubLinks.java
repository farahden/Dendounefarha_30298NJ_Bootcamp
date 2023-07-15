package verizon_sub_links;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubLinks extends BasePage {
    public SubLinks(){ PageFactory.initElements(driver,this); }
/**Test Sub Links Summary
 * Given a user of verizon navigates to home page
 * When user clicks on a link
 * then link's page should land properly */


@FindBy(xpath = "//a[.='Buy now']")
    public WebElement buyNowLink;
@FindBy(xpath = "//ol[@class='StyledBreadcrumbList-VDS__sc-k5phk0-1 ghQRFc']")
    public WebElement buyingPage;

public void getBuyNowLink(){clickOnElement(buyNowLink);}

@FindBy(xpath = "//a[.='bring your phone']")
    public WebElement bringYourPhone;
@FindBy(xpath = "//h2[@class='u-fontDisplay u-textLineHeightExtraTight  u-text--xs40 u-text--md u-text--lg64 u-textBold      u-marginBottom--xs0 u-marginBottom--lg0']")
    public WebElement theHeadLine;
@FindBy(xpath = "//div[@class='wrapper-category-tilelets progress-bar-slider']/a[1]/div[@class='tilelet u-paddingX--xs16 u-paddingY--xs12 u-paddingAll--xl24']")
public WebElement phones;
public void setBringYourPhone(){clickOnElement(bringYourPhone);}

@FindBy(xpath = "//a[.='Offer Details']")
    public WebElement offerDetails;
@FindBy(xpath = "//div[@class='gnav20-modal-content']")
    public WebElement iframe;

public void getOfferDetails(){safeClickOnElement(offerDetails);}













}
