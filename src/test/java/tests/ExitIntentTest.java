package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ExitIntentPage;

public class ExitIntentTest extends BaseTest {

    @Test
    public void exitIntentTest() {
        ExitIntentPage exitIntentPage = homePage.goToExitIntentPage();
        exitIntentPage.moveOutOfViewportPane();
        exitIntentPage.waitForModalWindowToAppear();
        String actualWindowText = exitIntentPage.getModalWindowText();
        String expectedWindowText = "used to encourage a user to take an action";
        Assert.assertTrue(actualWindowText.contains(expectedWindowText),
                "The actual text is: " + actualWindowText);
        exitIntentPage.closeModalWindow();
    }
}
