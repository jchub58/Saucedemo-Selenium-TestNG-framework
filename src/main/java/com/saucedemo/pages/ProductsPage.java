package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

/**
 * Products listing page object
 */
public class ProductsPage {
    private WebDriver driver;

    private By pageTitle = By.className("title");
    private By productItems = By.className("inventory_item");
    private By addToCartButtons = By.cssSelector("[data-test^='add-to-cart']");
    private By cartBadge = By.className("shopping_cart_badge");
    private By cartLink = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public int getProductCount() {
        return driver.findElements(productItems).size();
    }

    public void addProductToCart(int index) {
        List<WebElement> buttons = driver.findElements(addToCartButtons);
        if (index < buttons.size()) {
            buttons.get(index).click();
        }
    }

    public void goToCart() {
        driver.findElement(cartLink).click();
    }

    public String getCartBadgeCount(){
        return driver.findElement(cartBadge).getText();
    }
}