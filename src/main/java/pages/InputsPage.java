package pages;

import base.BasePage;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;

import static utilities.ActionsUtility.sendKeys;

public class InputsPage extends BasePage {

    private By inputField = By.cssSelector(".example input");

    public void enterNumber(int number) {
        String numberStr = String.valueOf(number);
        set(inputField, numberStr);
    }

    public String getInputFieldData() {
//        return find(inputField).getAttribute("value");
        return find(inputField).getDomProperty("value");
    }

    public void enterText(String text) {
        set(inputField, text);
    }

    public void changeValueFromKeyboard(String direction, int number) {
        Keys button = direction.equals("increase") ? Keys.ARROW_UP : Keys.ARROW_DOWN;
        for (int i = 0; i < number; i++) {
            sendKeys(button);
        }
    }

    public void putCursorIntoInputField() {
        click(inputField);
    }
}
