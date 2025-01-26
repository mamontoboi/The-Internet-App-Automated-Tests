package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.ActionsUtility.dragAndDropBy;
import static utilities.JavaScriptUtility.dragAndDropByValue;

public class HorizontalSliderPage extends HomePage {

    private By sliderBar = By.cssSelector(".sliderContainer input");
    private By sliderValue = By.id("range");

    public String getCurrentValue() {
        return find(sliderValue).getText();
    }

    public void moveSliderToValue(int targetValue) {
        WebElement slider = find(sliderBar);

        double maxValue = Double.parseDouble(slider.getDomProperty("max"));
        double minValue = Double.parseDouble(slider.getDomProperty("min"));

        if (targetValue < minValue || targetValue > maxValue) {
            throw new IllegalArgumentException("Target value is out of slider's range!");
        }
        dragAndDropByValue(slider, targetValue);

//        int sliderWidth = getSliderLength();
//        double pxlsPerStep = sliderWidth / (maxValue - minValue);
//        int valueInPxls = (int) ((targetValue - minValue) * pxlsPerStep);
//        dragAndDropBy(slider, valueInPxls, 0);
    }

    private Integer getSliderLength() {
        return find(sliderBar).getSize().width;
    }
}
