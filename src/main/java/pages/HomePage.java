package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By basicAuth = By.xpath("//a[@href='/basic_auth']");
    private By entryAd = By.xpath("//a[text()='Entry Ad']");
    private By addRemoveElements = By.xpath("//a[@href='/add_remove_elements/']");
    private By inputs = By.cssSelector("a[href*='inputs']");
    private By checkboxes = By.linkText("Checkboxes");
    private By contextMenu = By.cssSelector("[href$='context_menu']");
    private By dropdown = By.cssSelector("li > [href='/dropdown']");

    public BasicAuthPage goToBasicAuthPage() {
        click(basicAuth);
        return new BasicAuthPage();
    }

    public EntryAdPage goToEntryAdPage() {
        click(entryAd);
        return new EntryAdPage();
    }

    public AddRemoveElementsPage goToAddRemoveElementsPage() {
        click(addRemoveElements);
        return new AddRemoveElementsPage();
    }

    public InputsPage goToInputsPage() {
        click(inputs);
        return new InputsPage();
    }

    public CheckboxesPage goToCheckboxesPage() {
        click(checkboxes);
        return new CheckboxesPage();
    }

    public ContextMenuPage goToContextMenuPage() {
        click(contextMenu);
        return new ContextMenuPage();
    }

    public DropdownPage goToDropdownPage() {
        click(dropdown);
        return new DropdownPage();
    }
}
