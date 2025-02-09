package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utilities.ActionsUtility.sendKeys;
import static utilities.WaitUtility.explicitWaitUntilAlertIsPresent;

public class SwitchToUtility extends Utility{

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static void setAlertText(String[] words) {
        Alert alert = switchTo().alert();
        for (int i = 0; i < words.length; i++) {
            alert.sendKeys(words[i]);
            sendKeys(Keys.TAB);
        }
    }

    public static void acceptAlert() {
        explicitWaitUntilAlertIsPresent(5);
        switchTo().alert().accept();
    }

    public static void switchToFrameElement(WebElement element) {
        switchTo().frame(element);
    }

    public static void switchToDefaultContent() {
        switchTo().defaultContent();
    }
}
