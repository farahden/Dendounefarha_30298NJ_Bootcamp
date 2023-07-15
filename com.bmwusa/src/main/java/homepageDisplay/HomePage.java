package homepageDisplay;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    /**Given a user navigates to bmw.com
     * when user clicks onBMW Electric
     * then user shod be in section of electroMobility,*/
@FindBy(xpath = "//a[.='BMW Electric']")
    public WebElement BMWElectric;
@FindBy(xpath = "//h2[@class='globalnav-local__title label-1--bold']")
public WebElement electroMobility;
    /**Given a user navigates to bmw.com
     * And user clicks onBMW Electric
     * and user navigates tosection of electroMobility,
     * When user clicks on plag in Hybrid
     * Then a video should be aploaded*/



@FindBy(xpath = "//ul[@class='globalnav-local__links']//a[contains(.,'Plug-in Hybrid')]")
public WebElement hybrid;

@FindBy(css = "[analytics-event='tier1-fma-1-1.unplug-and-play.watch-video.button']")
public  WebElement watchVideo;

@FindBy(id = "6306276130112_html5_api")
public WebElement video;

@FindBy(css = "[title='Play'] > .vjs-icon-placeholder")
public WebElement pause_play_button;

@FindBy(css= ".vjs-vol-3 > .vjs-icon-placeholder")
public WebElement volumeButton;

public void theBMWelectrics(){safeClickOnElement(BMWElectric);}
public void plagInHybrid(){safeClickOnElement(hybrid);}
public void setHybrid(){
    theBMWelectrics();
    plagInHybrid();
}

public void watchvideo(){watchVideo.click();}
public void video(){hoverOverElement(video);
video.click();}
public void setPause_play_button(){pause_play_button.click();}
public void setVolume(){volumeButton.click();}

public void gettovideo(){
    setHybrid();
    webDriverWait.until(ExpectedConditions.visibilityOf(watchVideo));
    watchvideo();
}
public void playVideo(){
    gettovideo();
    webDriverWait.until(ExpectedConditions.visibilityOf(pause_play_button));
    video();
    setPause_play_button();
}
public void mutevideo(){
    gettovideo();
    webDriverWait.until(ExpectedConditions.visibilityOf(volumeButton));
    setVolume();
}

}
