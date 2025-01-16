package tests;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

@Test
public class KeyPressesTest extends BaseTest {

    public void keyPressesEscapeTest() {
        KeyPressesPage keyPressesPage = homePage.goToKeyPressesPage();
        keyPressesPage.pressKey(Keys.ESCAPE);
        String actualText = keyPressesPage.getEnteredKey();
        Assert.assertEquals(actualText, "ESCAPE",
                "\n The actual text is: " + actualText + " \n");
    }

    public void keyPressesSemicolonTest() {
        KeyPressesPage keyPressesPage = homePage.goToKeyPressesPage();
        keyPressesPage.pressKey(Keys.SEMICOLON);
        String actualText = keyPressesPage.getEnteredKey();
        Assert.assertEquals(actualText, "",
                "\n The actual text is: " + actualText + " \n");
    }
}
