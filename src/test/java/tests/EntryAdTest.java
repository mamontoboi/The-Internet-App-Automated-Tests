package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntryAdTest extends BaseTest {

    @Test
    public void entryAdTest() {
        var entryAdPage = homePage.goToEntryAdPage();
        String modalWindowText = entryAdPage.getModalWindowText();
        Assert.assertTrue(modalWindowText.contains("to encourage a user to take an action"),
                "The modal window does not contain the expected text.");
        entryAdPage.closeModalWindow();
    }
}
