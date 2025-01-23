package pages;

import org.openqa.selenium.By;

import static utilities.WaitUtility.explicitWaitForCondition;
import static utilities.WaitUtility.explicitWaitUntilElementIsPresent;

public class DynamicLoadingElementsBasePage extends DynamicLoadingPage {

    protected String startBlockXpath = "//div[@id='start']";
    protected By startBlock = By.xpath(startBlockXpath);
    protected By startButton = By.xpath(startBlockXpath + "/button");
    protected By processFinished = By.id("finish");
    protected By loadingBar = By.id("loading");

    public enum Stage {
        START_BUTTON,
        LOADING_BAR,
        HELLO_WORLD
    }

    public boolean ifElementIsHidden(Stage stage) {
        By elementLocator = null;
        String style = "";
        switch (stage) {
            case START_BUTTON:
                elementLocator = startBlock;
                style = "display: none;";
                break;
            case LOADING_BAR:
                elementLocator = loadingBar;
                style = "display: none;";
                break;
            case HELLO_WORLD:
                elementLocator = processFinished;
                style = "display:none";
                break;
        }

        if (elementLocator != null) {
            String valueOfAttribute = find(elementLocator).getDomAttribute("style");
            return valueOfAttribute != null && valueOfAttribute.equals(style);
        }
        return false;
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
}
