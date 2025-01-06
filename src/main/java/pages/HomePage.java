package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By basicAuth = By.xpath("//a[@href='/basic_auth']");

    public BasicAuthPage goToBasicAuth() {
        click(basicAuth);
        return new BasicAuthPage();
    }
}
