package com.saucedemo.tests;

import com.saucedemo.tests.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.utils.ConfigReader;
import com.saucedemo.listener.AllureListener;

@Listeners({AllureListener.class})
@Epic("SauceDemo Application")
@Feature("Login Functionality")
public class LoginTests extends BaseTest {
    private LoginPage loginPage;

    @BeforeMethod
    public void initPages() {
        loginPage = new LoginPage(driver);
    }

    @Test(groups = {"smoke", "regression"})
    @Story("Valid Login")
    @Description("Test valid user login with standard credentials")
    @Severity(SeverityLevel.CRITICAL)
    public void testValidLogin() {
        loginPage.login(
                ConfigReader.getProperty("valid.username"),
                ConfigReader.getProperty("valid.password")
        );
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertEquals(productsPage.getPageTitle(), "Products");
    }
}