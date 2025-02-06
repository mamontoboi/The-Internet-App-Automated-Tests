package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationMessagePage;

public class NotificationMessageTest extends BaseTest {

    @Test
    public void notificationMessageTest() {
        NotificationMessagePage notificationMessagePage = homePage.goToNotificationMessagePage();
        boolean isNotificationActionSuccessful = notificationMessagePage.isActionSuccessful();
        Assert.assertTrue(isNotificationActionSuccessful, "\n Action is not successful within 10 attempts.\n");
    }
}
