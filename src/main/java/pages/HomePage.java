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
    private By keyPresses = By.linkText("Key Presses");
    private By dynamicLoading = By.xpath("//*[contains(@href,'dynamic_loading')]");
    private By exitIntent = By.cssSelector("li > [href='/exit_intent']");
    private By horizontalSlider = By.cssSelector("[href*='horizontal_slider']");
    private By dragAndDrop = By.xpath("//*[contains(text(), 'and Drop')]");
    private By notificationMessage = By.xpath("//*[text()='Notification Messages']");
    private By frames = By.xpath("//*[text()='Frames']");
    private By fileDownload = By.cssSelector("[href$='download']");

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

    public KeyPressesPage goToKeyPressesPage() {
        click(keyPresses);
        return new KeyPressesPage();
    }

    public DynamicLoadingPage goToDynamicLoadingPage() {
        click(dynamicLoading);
        return new DynamicLoadingPage();
    }

    public ExitIntentPage goToExitIntentPage() {
        click(exitIntent);
        return new ExitIntentPage();
    }

    public HorizontalSliderPage goToHorizontalSliderPage() {
        click(horizontalSlider);
        return new HorizontalSliderPage();
    }

    public DragAndDropPage goToDragAndDropPage() {
        click(dragAndDrop);
        return new DragAndDropPage();
    }

    public NotificationMessagePage goToNotificationMessagePage() {
        click(notificationMessage);
        return new NotificationMessagePage();
    }

    public FramesPage goToFramesPage() {
        click(frames);
        return new FramesPage();
    }

    public FileDownloadPage goToFileDownloadPage() {
        click(fileDownload);
        return new FileDownloadPage();
    }
}
