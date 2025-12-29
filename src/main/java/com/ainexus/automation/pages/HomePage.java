
package com.ainexus.automation.pages;

import org.openqa.selenium.*;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By welcome = By.id("welcome");
    By logout = By.id("logout");

    public String getWelcome() {
        return driver.findElement(welcome).getText();
    }

    public void logout() {
        driver.findElement(logout).click();
    }
}
