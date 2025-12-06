package com.saucedemo.tests;

import com.saucedemo.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(ConfigReader.getProperty("base.url"));
    }

    @Test
    public void testValidLogin() {
        driver.findElement(By.id("user-name")).sendKeys(ConfigReader.getProperty("valid.username"));
        driver.findElement(By.id("password")).sendKeys(ConfigReader.getProperty("valid.password"));
        driver.findElement(By.id("login-button")).click();

        String title = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(title, "Products");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
