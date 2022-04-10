/*
package com.mavenit.selenium;

import com.mavenit.selenium.page_objects.DesPage;
import com.mavenit.selenium.page_objects.HeaderPage;
import com.mavenit.selenium.page_objects.SearchResultPage;
import com.mavenit.selenium.page_objects.TrolleyPage;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RegressionTestSuite extends Hooks {
    private HeaderPage headerPage = new HeaderPage();
    private SearchResultPage searchPage= new SearchResultPage();
    private DesPage desPage = new DesPage();
    private TrolleyPage trolleyPage=new TrolleyPage();

    @Test
    public void searchTest() {
        headerPage.search("nike");
        String actual = searchPage.getProductTitle();
        assertThat("nike", is(equalTo(actual)));
        String actualUrl = searchPage.getCurrentUrl();
        assertThat(actualUrl, endsWith("nike"));
    }

    @Test  //basket
    public void basketTest() {
        headerPage.search("nike");
        searchPage.selectAproduct();
        desPage.addToTrolley();
        desPage.goToTrolley();
        List<String> actualList = trolleyPage.getProductsInTrolley();
        assertThat(actualList, hasItem("nike"));
    }

    @Test     // convert this Omar
    public void quantityTest() {
        headerPage.search("nike");
        searchPage.selectAproduct();
        desPage.addToTrolley();
        desPage.goToTrolley();
        double priceForProduct = trolleyPage.getPriceForProduct();
        int quantityChange = 3;
        double expected = priceForProduct * quantityChange;
        trolleyPage.selectQuantity(quantityChange);
        double actual = trolleyPage.getPriceForProduct();
        assertThat(expected, is(equalTo(actual)));
    }

    @Test   // nirav
    public void reviewTest(){
        headerPage.search("nike");
        searchPage.selectRating("1");
        List<Double> actual = searchPage.getAllProductsRatings();
        assertThat(actual,everyItem(greaterThanOrEqualTo(1.0)));
    }

    @Test  // anusha
    public void shopByTest(){
        headerPage.hoverToNavItem("ShOE");
        headerPage.hoverToLeftPanelItem("Technology");
        headerPage.hoverToProductItem("Televisions");
    }

    @Test
    public void shopByTestApp(){
        headerPage.hOverNavIt("Shopping");
        headerPage.hOverNavIt("Technology");
        headerPage.hoverToNavItem("Televisions");
    }
}
*/