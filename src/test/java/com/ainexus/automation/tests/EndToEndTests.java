
package com.ainexus.automation.tests;

import com.ainexus.automation.base.BaseTest;
import com.ainexus.automation.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTests extends BaseTest {

    @Test
    public void e2eTest() {
        driver.get("http://localhost:8080/signup");
        new SignupPage(driver).signup("E2E", "e2e@gmail.com", "12345", "India");

        new LoginPage(driver).login("e2e@gmail.com", "12345");

        HomePage home = new HomePage(driver);
        Assert.assertTrue(home.getWelcome().contains("Welcome"));

        home.logout();
    }
}
