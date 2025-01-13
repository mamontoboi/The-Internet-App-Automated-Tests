package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtility extends ActionsUtility{

    public static Select findDropdown(By selector) {
        return new Select(driver.findElement(selector));
    }

    public static void selectByVisibleText(By selector, String text){
        findDropdown(selector).selectByVisibleText(text);
    }
}
