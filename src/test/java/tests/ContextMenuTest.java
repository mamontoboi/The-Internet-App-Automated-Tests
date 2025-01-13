package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.acceptAlert;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenuTest() {
        var contextMenuPage = homePage.goToContextMenuPage();
        contextMenuPage.rightButtonClickOnElement();
        acceptAlert();
    }
}
