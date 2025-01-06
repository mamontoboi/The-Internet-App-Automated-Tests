package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static utilities.ActionsUtility.sendKeys;

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
}
