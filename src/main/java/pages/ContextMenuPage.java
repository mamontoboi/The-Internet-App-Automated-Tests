package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.ActionsUtility.rightMouseButtonClick;

public class ContextMenuPage extends HomePage{

    private By hotSpot = By.id("hot-spot");

    public void rightButtonClickOnElement() {
        WebElement hotSpotElement = find(hotSpot);
        rightMouseButtonClick(hotSpotElement);
    }
}
