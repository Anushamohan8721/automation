package com.mavenit.selenium.page_objects;

import com.mavenit.selenium.driver.DriverManager;
import org.openqa.selenium.By;

public class DesPage extends DriverManager {
    public void addToTrolley() {
        driver.findElement(By.cssSelector("button[data-test='add-to-t" +
                "rolley-button-button']")).click();
        sleep(4000);
    }

    public void goToTrolley() {
        driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();
        sleep(3000);
    }
    public void selectQuantity(){

    }
}
