package pages;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.ActionsUtility.*;

public class KeyPressesPage extends HomePage {

    private By inputField = By.id("target");
    private By result = By.id("result");

    public void pressKey(CharSequence key) {
        sendKeys(find(inputField), key);
    }

    public String getEnteredKey() {
        String text = find(result).getText();
        String[] words = text.split(": ");
        for (String word : words) {
            if (words.length > 1 && !word.equals ("You entered")) {
                return word;
            }
        }
        return "";
    }
}
