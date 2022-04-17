package com.mavenit.selenium.driver;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class DriverManager {

    public static WebDriver driver;
    String URL = System.getenv("url");

    public DriverManager(){
      //  PageFactory.initElements(driver,this);

    }
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    public void maxBrowser(){
        driver.manage().window().maximize();
    }

    public void navigateToUrl(){
        driver.get(URL);
    }

    public void acceptCookies(){
        driver.findElement(By.id("consent_prompt_submit")).click();
    }

    public void takeScreenShot(Scenario scenario){
        byte[] screenshot =
                ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot , "image/png");
    }

    public void waitForElements(){

    }

    public void sleep(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }





    public void closeBrowser() {
        driver.quit();
    }
}
