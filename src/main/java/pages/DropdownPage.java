package pages;

import org.openqa.selenium.By;

import static utilities.DropdownUtility.selectByVisibleText;

public class DropdownPage extends HomePage {

    private By dropdown = By.id("dropdown");
    private By option2 = By.xpath("//*[@id='dropdown']/option[text()='Option 2']");

    public void selectOptionByText(String text) {
        selectByVisibleText(dropdown, text);
    }

    public boolean checkIfSecondOptionSelected() {
        String isSelected =  find(option2).getDomProperty("selected");
        return Boolean.parseBoolean(isSelected);
    }

}
