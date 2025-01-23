package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HiddenElementBasePage;
import pages.BasePageWithoutElement;

import static pages.DynamicLoadingElementsBasePage.Stage.*;

@Test
public class DynamicLoadingTest extends BaseTest {

    public void hiddenElementPageTest() {
        var dynamicLoadingPage = homePage.goToDynamicLoadingPage();
        HiddenElementBasePage hiddenElementPage = dynamicLoadingPage.goToHiddenElementPage();
        boolean isFinishElementNotDisplayed = hiddenElementPage
                .ifElementIsHidden(HELLO_WORLD);
        Assert.assertTrue(isFinishElementNotDisplayed,
                "\n Hello World text is displayed! \n");
        hiddenElementPage.startTheProcess();
        hiddenElementPage.checkIfLoadingProcessHasStarted();
        hiddenElementPage.waitUntilLoadingBarIsHidden();
        boolean isStartButtonNotDisplayed = hiddenElementPage
                .ifElementIsHidden(START_BUTTON);
        Assert.assertTrue(isStartButtonNotDisplayed,
                "\n Start button is not hidden! \n");
    }

    public void absentElementPageTest() {
        var dynamicLoadingPage = homePage.goToDynamicLoadingPage();
        BasePageWithoutElement notPresentElementPage = dynamicLoadingPage.goToNotPresentElementPage();
        boolean isFinishElementNotPresentDisplayed = notPresentElementPage
                .checkIfFinishElementNotPresent();
        Assert.assertTrue(isFinishElementNotPresentDisplayed,
                "\n Hello World element is present! \n");
        notPresentElementPage.startTheProcess();
        notPresentElementPage.checkIfLoadingProcessHasStarted();
        notPresentElementPage.waitUntilLoadingBarIsHidden();
        boolean isStartButtonNotDisplayed = notPresentElementPage
                .ifElementIsHidden(START_BUTTON);
        Assert.assertTrue(isStartButtonNotDisplayed,
                "\n Start button is not hidden! \n");
    }
}
