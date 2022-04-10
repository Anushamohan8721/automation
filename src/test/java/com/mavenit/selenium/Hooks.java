package com.mavenit.selenium;

import com.mavenit.selenium.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

    DriverManager driverManager=new DriverManager();

    @Before
    public void setUp(){
        driverManager.openBrowser();;
        driverManager.maxBrowser();
        driverManager.navigateToUrl();
        driverManager.acceptCookies();
    }

    @After
    public void tearDown(){
        driverManager.closeBrowser();

    }
}
