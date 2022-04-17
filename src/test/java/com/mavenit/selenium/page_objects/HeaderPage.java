package com.mavenit.selenium.page_objects;

import com.mavenit.selenium.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderPage extends DriverManager {

    @FindBy(id = "searchTerm")
    private WebElement searchBox;

    @FindBy(css = "._1gqeQ")
    private WebElement searchBtn;

    public void search(String product) {
        driver.findElement(By.id("searchTerm  lkdsfnjlksdjflkdsjflsdj")).sendKeys(product);
        driver.findElement(By.cssSelector("._1gqeQ")).click();
    }



    //1st approach
    public WebElement selectNavItem(String item, String elementValue) {
        List<WebElement> elements = driver.findElements(By.cssSelector(elementValue));
        boolean isElementFound = false;
        WebElement foundElement = null;
        for (WebElement navItemElement : elements) {
            if (navItemElement.getText().equalsIgnoreCase(item)) {
                Actions action = new Actions(driver);
                action.moveToElement(navItemElement).build().perform();
                isElementFound = true;
                foundElement = navItemElement;
                break;
            }
        }
        if (!isElementFound) {
            throw new RuntimeException("Element is not found " + item);
        }
        sleep(3000);
        return foundElement;
    }

    public WebElement hoverToNavItem(String item) {
        return selectNavItem(item, "._3rkgc");
    }

    public void hoverToLeftPanelItem(String item) {
        selectNavItem(item, "._1Ce4i");
    }

    public void hoverToProductItem(String item) {
        selectNavItem(item, "._39ydj").click();
    }

    //2nd approach
    public WebElement hOverNavIt(String item) {
        WebElement navElement = driver.findElement(By.linkText(item));
        Actions action = new Actions(driver);
        action.moveToElement(navElement).build().perform();
        sleep(3000);
        return navElement;
    }
}
