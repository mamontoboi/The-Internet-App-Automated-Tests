package utilities;

import base.BasePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import pages.InputsPage;

public class Utility {

    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }

    public static Dimension getWindowSize() {
        return driver.manage().window().getSize();
    }
}
