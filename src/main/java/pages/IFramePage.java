package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;

import static utilities.SwitchToUtility.switchToFrameElement;
import static utilities.WaitUtility.explicitWaitUntilElementIsPresent;

public class IFramePage extends FramesPage {

    private By notification = By.cssSelector(".tox-notifications-container");
    private By closeNotification = By.xpath("//*[@aria-label='Close']");
    private By textBox = By.id("tinymce");
    private By iFrame = By.cssSelector("[title='Rich Text Area']");

    public void closeNotificationIfVisible() {
        try {
            explicitWaitUntilElementIsPresent(5, notification);
            click(closeNotification);
        } catch (NotFoundException ignored) {

        }
    }

    public void switchToIFrameBox() {
        switchToFrameElement(find(iFrame));
    }

    public String getTextFromIFrameBox() {
        switchToIFrameBox();
        WebElement textBoxContainer = find(textBox);
        return textBoxContainer.findElement(By.tagName("p")).getText();
    }

}
