package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utility{

    public static void dragAndDropByValue(WebElement source, int targetValue){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = arguments[1]; " +
                "arguments[0].dispatchEvent(new Event('change'))", source, targetValue);
    }
}
