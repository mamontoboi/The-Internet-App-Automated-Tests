package pages;

import org.openqa.selenium.By;

public class FramesPage extends HomePage {

    private By iFrame = By.linkText("iFrame");
    private By nestedFrame = By.cssSelector("[href$='nested_frames']");

    public IFramePage goToiFramePage() {
        click(iFrame);
        return new IFramePage();
    }

    public NestedFramePage goToNestedFramePage() {
        click(nestedFrame);
        return new NestedFramePage();
    }
}
