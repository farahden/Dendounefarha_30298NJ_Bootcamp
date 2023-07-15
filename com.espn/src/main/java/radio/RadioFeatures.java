package radio;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RadioFeatures extends BasePage {
    public RadioFeatures(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//li[@class='pillar listen']")
    public WebElement listeners;

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+listen+listen_live']")
    public WebElement listenLive;

    @FindBy (className = "vjs-play-control vjs-control vjs-button vjs-paused")
    public WebElement play;

    public void listeners(){hoverOverElement(listeners);}
    public void listenlive(){
      safeClickOnElement(listenLive);
      clickOnElement(listenLive);
    }
    public void play() throws InterruptedException {
        driver.manage().timeouts().getImplicitWaitTimeout();
        safeClickOnElement(play);


    }




public void listenToradio(){
        listeners();
        listenlive();
}
public void playlive() throws InterruptedException {
        listenToradio();
        play();
}



}
