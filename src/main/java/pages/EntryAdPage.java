package pages;

import base.BasePage;
import org.openqa.selenium.By;

import static utilities.WaitUtility.explicitWaitUntilElementIsPresent;


public class EntryAdPage extends BasePage {

    private By modalWindow = By.cssSelector("div.modal");
    private By modalWindowText = By.cssSelector("div.modal-body p");
    private By closeButton = By.xpath("//*[text()='Close']");

    public String getModalWindowText() {
        explicitWaitUntilElementIsPresent(5, modalWindow);
        return find(modalWindowText).getText();
    }

    public void closeModalWindow() {
        click(closeButton);
    }
}
