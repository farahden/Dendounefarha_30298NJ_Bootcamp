package test_drawer_menu;

import base.BasePage;
import drawer_menu.DrawerMenu;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDrawerMenu extends BasePage {

@Test
    public void testOpenDrawerMenu(){
        DrawerMenu drawerMenu=new DrawerMenu();
        drawerMenu.openDrawerMenu();
        Assert.assertTrue(isElementVisible(drawerMenu.drawerMenuFrame));
    }

@Test
    public void testCloseMenu(){
    DrawerMenu drawerMenu=new DrawerMenu();
    drawerMenu.closeMenu();
    Assert.assertTrue(isElementVisible(drawerMenu.header));
}

@Test
    public void testOpenSubMenu(){
        DrawerMenu drawerMenu=new DrawerMenu();
        drawerMenu.subMenu();
        Assert.assertTrue(isElementVisible(drawerMenu.subMenuFrame));
}

@Test
    public void testSelectCity(){
        DrawerMenu drawerMenu=new DrawerMenu();
        drawerMenu.selectCity();
        Assert.assertTrue(isElementVisible(drawerMenu.mapPage));
}

@Test
    public void testNavigateBackToHomePage(){
    DrawerMenu drawerMenu=new DrawerMenu();
    drawerMenu.setHomePage();
    Assert.assertTrue(isElementVisible(drawerMenu.homePage));
}

}
