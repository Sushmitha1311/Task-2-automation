
package com.ainexus.automation.tests;

import com.ainexus.automation.base.BaseTest;
import com.ainexus.automation.pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTests extends BaseTest {

    @Test
    public void signupTest() {
        driver.get("http://localhost:8080/signup");
        SignupPage signup = new SignupPage(driver);
        signup.signup("TestUser", "test@gmail.com", "12345", "India");
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }
}
