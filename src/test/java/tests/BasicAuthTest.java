package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class
BasicAuthTest extends BaseTest {

    @Test
    public void basicAuthTest () {
        String username = "admin";
        String password = "admin";

        var basicAuthPage = homePage.goToBasicAuth();
        basicAuthPage.loginViaURL(username, password);
        Assert.assertTrue(basicAuthPage.checkConfirmationText());
    }
}
