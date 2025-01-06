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

        var basicAuthPage = homePage.goToBasicAuthPage();
        basicAuthPage.loginViaURL(username, password);
        Assert.assertTrue(basicAuthPage.checkConfirmationText(),
                "\n Confirmation text is not visible \n");
    }
}
