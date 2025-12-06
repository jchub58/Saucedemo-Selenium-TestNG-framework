package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    private By cartItems = By.className("cart_item");
    private By checkoutButton = By.id("checkout");
    private By continueShoppingButton = By.id("continue-shopping");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getCartItemCount() {
        return driver.findElements(cartItems).size();
    }

    public void proceedToCheckout() {
        driver.findElement(checkoutButton).click();
    }
}