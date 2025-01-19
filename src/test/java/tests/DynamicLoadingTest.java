package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HiddenElementPage;
import pages.NotPresentElementPage;

@Test
public class DynamicLoadingTest extends BaseTest {

    public void hiddenElementPageTest() {
        var dynamicLoadingPage = homePage.goToDynamicLoadingPage();
        HiddenElementPage hiddenElementPage = dynamicLoadingPage.goToHiddenElementPage();
        boolean isFinishElementNotDisplayed = hiddenElementPage
                .checkIfElementIsNotDisplayed("Hello World!");
        Assert.assertTrue(isFinishElementNotDisplayed, "\n Hello World text is displayed! \n");
        hiddenElementPage.startTheProcess();
        hiddenElementPage.checkIfLoadingProcessHasStarted();
        hiddenElementPage.waitUntilLoadingBarIsHidden();
        boolean isStartButtonNotDisplayed = hiddenElementPage
                .checkIfElementIsNotDisplayed("Start button");
        Assert.assertTrue(isStartButtonNotDisplayed, "\n Start button is not hidden! \n");
    }

    public void notPresentElementPageTest() {
        var dynamicLoadingPage = homePage.goToDynamicLoadingPage();
        NotPresentElementPage notPresentElementPage = dynamicLoadingPage.goToNotPresentElementPage();
        boolean isFinishElementNotPresentDisplayed = notPresentElementPage
                .checkIfFinishElementNotPresent();
        Assert.assertFalse(isFinishElementNotPresentDisplayed, "\n Hello World element is present! \n");
        notPresentElementPage.startTheProcess();
        notPresentElementPage.checkIfLoadingProcessHasStarted();
        notPresentElementPage.waitUntilLoadingBarIsHidden();
        boolean isStartButtonNotDisplayed = notPresentElementPage
                .checkIfProcessFinishedElementIsNotDisplayed("Start button");
        Assert.assertTrue(isStartButtonNotDisplayed, "\n Start button is not hidden! \n");
    }
}
