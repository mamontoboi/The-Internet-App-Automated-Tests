package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IFramePage;
import pages.NestedFramePage;

import static pages.NestedFramePage.Frames.*;

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
        nestedFramePage.goToNestedFrame(BOTTOM);
        String bottomText = nestedFramePage.getText();
        Assert.assertEquals(bottomText,
                "BOTTOM", "\n The actual bottom frame text is " + bottomText);
        nestedFramePage.returnToDefaultContext();
        nestedFramePage.goToNestedFrame(TOP);
        nestedFramePage.goToNestedFrame(LEFT);
        String leftText = nestedFramePage.getText();
        Assert.assertEquals(leftText,
                "LEFT", "\n The actual left frame text is " + leftText);
        nestedFramePage.returnToDefaultContext();
        nestedFramePage.goToNestedFrame(TOP);
        nestedFramePage.goToNestedFrame(RIGHT);
        String rightText = nestedFramePage.getText();
        Assert.assertEquals(rightText,
                "RIGHT", "\n The actual right frame text is " + rightText);
    }
}
