
package com.ainexus.automation.pages;

import org.openqa.selenium.*;

public class SignupPage {
    WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("username");
    By email = By.id("email");
    By password = By.id("password");
    By address = By.id("address");
    By signupBtn = By.id("signupBtn");

    public void signup(String u, String e, String p, String a) {
        driver.findElement(username).sendKeys(u);
        driver.findElement(email).sendKeys(e);
        driver.findElement(password).sendKeys(p);
        driver.findElement(address).sendKeys(a);
        driver.findElement(signupBtn).click();
    }
}
