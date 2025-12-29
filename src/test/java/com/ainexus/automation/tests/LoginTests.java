
package com.ainexus.automation.tests;

import com.ainexus.automation.base.BaseTest;
import com.ainexus.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("test@gmail.com", "12345");
        Assert.assertTrue(driver.getCurrentUrl().contains("home"));
    }
}
