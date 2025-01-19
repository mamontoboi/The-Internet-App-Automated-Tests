package pages;

import org.openqa.selenium.By;

import static utilities.WaitUtility.explicitWaitUntilElementIsPresent;

public class DynamicLoadingPage extends HomePage {

    private By hiddenElementPage = By.xpath("//a[contains(text(), 'hidden')]");
    private By notPresentElementPage = By.xpath("//a[contains(text(), 'rendered after')]");

    public HiddenElementPage goToHiddenElementPage() {
        explicitWaitUntilElementIsPresent(5, hiddenElementPage);
        click(hiddenElementPage);
        return new HiddenElementPage();
    }

    public NotPresentElementPage goToNotPresentElementPage() {
        click(notPresentElementPage);
        return new NotPresentElementPage();
    }
}
