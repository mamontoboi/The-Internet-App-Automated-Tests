package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IFramePage;
import pages.NestedFramePage;

@Test
public class FrameTest extends BaseTest {

    public void iFramesTest() {
        IFramePage iFramePage = homePage.goToFramesPage().goToiFramePage();
        iFramePage.closeNotificationIfVisible();
        String actualText = iFramePage.getTextFromIFrameBox();
        String expectedText = "Your content goes here.";
        Assert.assertEquals(actualText, expectedText,
                "\n The text in the box is incorrect: " + actualText);
    }

    public void nestedFramesTest() {
        NestedFramePage nestedFramePage = homePage.goToFramesPage().goToNestedFramePage();
//        go to frame top => frame middle => default =>
    }
}
