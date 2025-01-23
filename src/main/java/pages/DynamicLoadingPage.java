package pages;

import org.openqa.selenium.By;

import static utilities.WaitUtility.explicitWaitUntilElementIsPresent;

public class DynamicLoadingPage extends HomePage {

    private By hiddenElementPage = By.xpath("//a[contains(text(), 'hidden')]");
    private By notPresentElementPage = By.xpath("//a[contains(text(), 'rendered after')]");

    public HiddenElementBasePage goToHiddenElementPage() {
        explicitWaitUntilElementIsPresent(5, hiddenElementPage);
        click(hiddenElementPage);
        return new HiddenElementBasePage();
    }

    public BasePageWithoutElement goToNotPresentElementPage() {
        click(notPresentElementPage);
        return new BasePageWithoutElement();
    }
}
