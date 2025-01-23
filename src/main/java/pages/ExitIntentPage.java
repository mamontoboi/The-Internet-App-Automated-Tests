package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import static utilities.MouseMovement.MoveCursorToTheUpperLeftCorner;
import static utilities.Utility.getWindowSize;
import static utilities.WaitUtility.explicitWaitUntilElementIsPresent;

public class ExitIntentPage extends HomePage {

    private By modalWindow = By.cssSelector("div.modal");
    private By modalWindowText = By.cssSelector("div.modal-body > p");
    private By closeButton = By.xpath("//p[text()='Close']");

    public void moveOutOfViewportPane() {
        Dimension dimensions = getWindowSize();
        MoveCursorToTheUpperLeftCorner(dimensions.width, dimensions.height);
    }

    public void waitForModalWindowToAppear() {
        explicitWaitUntilElementIsPresent(5, modalWindow);
    }

    public String getModalWindowText() {
        return find(modalWindowText).getText();
    }

    public void closeModalWindow() {
        click(closeButton);
    }
}
