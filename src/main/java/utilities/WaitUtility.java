package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility extends Utility{

    private static WebDriverWait waitForSeconds(int seconds){
        return new WebDriverWait(driver, Duration.ofSeconds(seconds));
    }

    public static void explicitWaitUntilAlertIsPresent(int seconds) {
        waitForSeconds(seconds).until(ExpectedConditions.alertIsPresent());
    }

    public static void explicitWaitUntilElementIsPresent(int seconds, By selector) {
        waitForSeconds(seconds).until(ExpectedConditions.visibilityOfElementLocated(selector));
    }

    public static void explicitWaitForCondition(int seconds, By selector, String attribute, String value) {
        waitForSeconds(seconds).until(ExpectedConditions.attributeContains(selector, attribute, value));
    }
}
