package com.mavenit.selenium.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverManager {

    public static WebDriver driver;

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
        driver.get("https://www.argos.co.uk/");
    }

    public void acceptCookies(){
        driver.findElement(By.id("consent_prompt_submit")).click();
    }

    public void takeScreenShot(){

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
