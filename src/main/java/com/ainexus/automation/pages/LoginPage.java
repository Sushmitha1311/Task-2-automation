
package com.ainexus.automation.pages;

import org.openqa.selenium.*;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By email = By.id("email");
    By password = By.id("password");
    By loginBtn = By.id("loginBtn");

    public void login(String e, String p) {
        driver.findElement(email).sendKeys(e);
        driver.findElement(password).sendKeys(p);
        driver.findElement(loginBtn).click();
    }
}
