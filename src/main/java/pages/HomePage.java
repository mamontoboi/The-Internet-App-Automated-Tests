package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By basicAuth = By.xpath("//a[@href='/basic_auth']");
    private By entryAd = By.xpath("//a[text()='Entry Ad']");

    public BasicAuthPage goToBasicAuth() {
        click(basicAuth);
        return new BasicAuthPage();
    }

    public EntryAdPage goToEntryAdPage() {
        click(entryAd);
        return new EntryAdPage();
    }
}
