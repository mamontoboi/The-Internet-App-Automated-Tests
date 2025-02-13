package pages;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.switchToDefaultContent;
import static utilities.SwitchToUtility.switchToFrameElement;

public class NestedFramePage extends FramesPage {

    private By iFrameTop = By.cssSelector("[name='frame-top']");
    private By iFrameBottom = By.cssSelector("[name='frame-bottom']");
    private By iFrameLeft = By.cssSelector("[name='frame-left']");
    private By iFrameMiddle = By.cssSelector("[name='frame-middle']");
    private By iFrameRight = By.cssSelector("[name='frame-right']");
    private By textBody = By.tagName("body");

    public enum Frames {
        TOP,
        BOTTOM,
        LEFT,
        MIDDLE,
        RIGHT;
    }

    public void goToNestedFrame(Frames frame) {
        By frameName = null;
        switch (frame){
            case TOP:
                frameName = iFrameTop;
                break;
            case BOTTOM:
                frameName = iFrameBottom;
                break;
            case LEFT:
                frameName = iFrameLeft;
                break;
            case MIDDLE:
                frameName = iFrameMiddle;
                break;
            case RIGHT:
                frameName = iFrameRight;
                break;
        }
        switchToFrameElement(find(frameName));
    }

    public void returnToDefaultContext() {
        switchToDefaultContent();
    }

    public String getText() {
        return find(textBody).getText().strip();
    }
}
