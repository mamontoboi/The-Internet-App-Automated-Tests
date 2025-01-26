package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.ActionsUtility.dragAndDrop;

public class DragAndDropPage extends HomePage {
    private By columnA = By.id("column-a");
    private By columnB = By.id("column-b");
    private By columnAHeader = By.cssSelector("#column-a header");
    private By columnBHeader = By.cssSelector("#column-b header");

    public String getCurrentHeaderOfColumn(String columnName) {
        if (columnName.equals("A")) {
            return find(columnAHeader).getText();
        } else if (columnName.equals("B")) {
            return find(columnBHeader).getText();
        } else {
            throw new IllegalArgumentException("Only A or B column names are supported");
        }
    }

    public void dragColumnToAnother(String columnName) {
        WebElement columnAElement = find(columnA);
        WebElement columnBElement = find(columnB);
        if (columnName.equals("A")){
            dragAndDrop(columnAElement, columnBElement);
        } else if (columnName.equals("B")) {
            dragAndDrop(columnBElement, columnAElement);
        } else {
            throw new IllegalArgumentException("Only A or B column names are supported");
        }

    }
}
