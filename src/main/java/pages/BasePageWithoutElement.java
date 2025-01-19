package pages;

import org.openqa.selenium.WebElement;
import java.util.List;

public class BasePageWithoutElement extends DynamicLoadingElementsBasePage {

    public boolean checkIfFinishElementNotPresent(){
        List<WebElement> listOfElements = listAllElements(processFinished);
        return listOfElements.isEmpty();
    }
}