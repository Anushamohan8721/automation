package com.mavenit.selenium.page_objects;

import com.mavenit.selenium.driver.DriverManager;
import com.mavenit.selenium.utils.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends DriverManager {

    public String getProductTitle() {
        return driver.findElement(By.cssSelector(".styles__SearchTerm-sc-1haccah-1")).getText();
    }
    public void selectAproduct() {
        List<WebElement> productWebElements = driver.findElements(By.cssSelector("a[id^='product-title-']"));
        int elementSize = productWebElements.size();
        System.out.println("Found number of products: " + elementSize);
        int randomIndex = new Helpers().randomNumber(elementSize);
        WebElement selectedWebElement = productWebElements.get(randomIndex);
        String expected = selectedWebElement.getText();
        System.out.println("Selected product name: " + expected);
        selectedWebElement.click();
        sleep(3000);
    }
    public void selectRating(String choice) {
        List<WebElement> ratingWebElements = driver.findElements(By.cssSelector("#content-container>label"));
        for (WebElement ratingElement : ratingWebElements) {
            String labelTxt = ratingElement.getText();
            if (labelTxt.startsWith(choice)) {
                ratingElement.click();
                break;
            }
        }
        sleep(5000);
    }
    public List<Double> getAllProductsRatings() {
        List<Double> list = new ArrayList<>();
        List<WebElement> ratingElements = driver.findElements(By.cssSelector("div[data-test='component-ratings']"));
        for (WebElement ratingElement : ratingElements) {
            String ratingInString = ratingElement.getAttribute("data-star-rating");
            double ratingInDouble = Double.parseDouble(ratingInString);
            list.add(ratingInDouble);
        }
        return list;
    }

}
