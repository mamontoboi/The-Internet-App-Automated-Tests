package pages;

import org.openqa.selenium.By;

import static utilities.WaitUtility.explicitWaitUntilElementIsPresent;

public class NotificationMessagePage extends HomePage {

    private By clickHere = By.linkText("Click here");
    private By notificationMessage = By.id("flash");
    private By closeNotificationMessage = By.className("close");

    private void loadNewMessage() {
        click(clickHere);
    }

    private String getNotificationMessageText() {
        explicitWaitUntilElementIsPresent(5, notificationMessage);
        return find(notificationMessage).getText().strip();
    }

    private void closeNotificationMessage() {
        click(closeNotificationMessage);
    }

    public boolean isActionSuccessful() {
        int attempt = 0;
        while (attempt < 10){
            loadNewMessage();
            String notification = getNotificationMessageText();
            if (notification.contains("Action successful")) {
                return true;
            }
            closeNotificationMessage();
            attempt++;
        }
        return false;
    }
}
