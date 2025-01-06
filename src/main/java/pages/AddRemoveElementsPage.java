package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElementsPage extends HomePage{

    private By addElementButton = By.xpath("//button[text()='Add Element']");
    private By addedButton = By.cssSelector("button.added-manually");

    public void clickAddElementButton(){
        click(addElementButton);
    }

    public void clickDeleteElementButton(){
        click(addedButton);
    }

    public int countAddedButtons(){
        List<WebElement> buttonsList = driver.findElements(addedButton);
        return buttonsList.size();
    }
}
