package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage extends HomePage {
    private By checkbox = By.cssSelector("#checkboxes > [type='checkbox']");

    public int countCheckboxes() {
        return countElements(checkbox);
    }

    public boolean checkIfChecked(int index) {
        List<WebElement> listOfCheckboxes = listAllElements(checkbox);
        String data = listOfCheckboxes.get(index).getDomAttribute("checked");
        return Boolean.parseBoolean(data);
    }

    public void clickOnCheckbox(int index) {
        List<WebElement> listOfCheckboxes = listAllElements(checkbox);
        listOfCheckboxes.get(index).click();
    }
}
