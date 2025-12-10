package com.saucedemo.dataprovider;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "validCredentials")
    public static Object[][] getValidCredentials() {
        return new Object[][] {
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"}
        };
    }

    @DataProvider(name = "invalidCredentials")
    public static Object[][] getInvalidCredentials() {
        return new Object[][] {
                {"invalid_user", "secret_sauce", "Username and password do not match"},
                {"standard_user", "wrong_password", "Username and password do not match"},
                {"locked_out_user", "secret_sauce", "Sorry, this user has been locked out"},
                {"", "secret_sauce", "Username is required"},
                {"standard_user", "", "Password is required"}
        };
    }
}