package pages;

import org.openqa.selenium.By;

import static utilities.WaitUtility.explicitWaitForCondition;
import static utilities.WaitUtility.explicitWaitUntilElementIsPresent;

public class NotPresentElementPage extends DynamicLoadingPage {
    private String startBlockXpath = "//div[@id='start']";
    private By startBlock = By.xpath(startBlockXpath);
    private By startButton = By.xpath(startBlockXpath + "/button");
    private By processFinished = By.id("finish");
    private By loadingBar = By.id("loading");

    public boolean checkIfProcessFinishedElementIsNotDisplayed(String stage) {
        boolean isNotDisplayed = false;
        if (stage.equals("Hello World!")) {
            String valueOfAttribute = find(processFinished).getDomAttribute("style");
            isNotDisplayed = valueOfAttribute.equals("display:none");
        } else if (stage.equals("loading bar")) {
            String valueOfAttribute = find(loadingBar).getDomAttribute("style");
            isNotDisplayed = valueOfAttribute.equals("display: none;");
        }
        return isNotDisplayed;
    }

    public void startTheProcess() {
        click(startButton);
    }

    public void checkIfLoadingProcessHasStarted() {
        explicitWaitUntilElementIsPresent(3, loadingBar);
    }

    public void waitUntilLoadingBarIsHidden() {
        explicitWaitForCondition(10, loadingBar, "style", "display: none");
    }

    public boolean checkIfFinishElementNotPresent(){
        try {
            find(processFinished);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}