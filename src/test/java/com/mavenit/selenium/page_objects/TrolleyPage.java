package com.mavenit.selenium.page_objects;

import com.mavenit.selenium.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class TrolleyPage extends DriverManager {
    public List<String> getProductsInTrolley() {
        List<WebElement> trolleyElements = driver.findElements(By.cssSelector("a[data-e2e='product-name']"));  // 2
        List<String> actualList = new ArrayList<>();
        for (WebElement element : trolleyElements) {
            String productNameInTrolley = element.getText();
            if (!productNameInTrolley.isEmpty()) {
                actualList.add(productNameInTrolley);
            }
        }
        return actualList;
    }

    public void selectQuantity(int choice) {
        WebElement selectElement = driver.findElement(By.cssSelector("select[data-e2e='product-quantity']"));
        Select select = new Select(selectElement);
        select.selectByVisibleText(String.valueOf(choice));
    }
    public double getPriceForProduct() {
        String priceInString = driver.findElement(By.cssSelector("span[data-e2e='product-line-price']"))
                .getText().replace("£", "");
        return Double.parseDouble(priceInString);
    }
}
