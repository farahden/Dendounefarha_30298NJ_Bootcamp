package homepage_pubs;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Advertisements extends BasePage {
public Advertisements(){PageFactory.initElements(driver,this);}

@FindBy (xpath = "iframe[src*='cb19128199f3c98f4b3154a7872d909e.safeframe.googlesyndication.com/safeframe/1-0-40/html/container.html'] > iframe[src*='s0.2mdn.net/sadbundle/13421802914901393408/index.html?e=69&leftOffset=0&topOffset=0&c=Urh9PyoCOw&t=1&renderingType=2&ev=01_250']")
public  WebElement iFrame;

public void switchFrame(){
    driver.switchTo().frame( "Billboard_Default");
   driver.switchTo().parentFrame();
}



}
