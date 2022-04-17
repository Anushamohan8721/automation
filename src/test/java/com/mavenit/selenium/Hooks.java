package com.mavenit.selenium;

import com.mavenit.selenium.driver.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

    DriverManager driverManager=new DriverManager();
    Scenario scenario;

    @Before
    public void setUp(){
        driverManager.openBrowser();;
        driverManager.maxBrowser();
        driverManager.navigateToUrl();
        driverManager.acceptCookies();
    }

    @After
    public void tearDown(Scenario scenario){
        this.scenario= scenario;
        if(scenario.isFailed()){
            driverManager.takeScreenShot(scenario);
        }

        driverManager.closeBrowser();

    }
}
