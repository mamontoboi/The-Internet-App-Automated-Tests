package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    protected WebElement find(By selector) {
        return driver.findElement(selector);
    }

    protected void set(By selector, String text) {
        find(selector).clear();
        find(selector).sendKeys(text);
    }

    protected void click(By selector) {
        find(selector).click();
    }
}
