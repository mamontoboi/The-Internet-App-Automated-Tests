package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void horizontalSliderTest() {
        HorizontalSliderPage horizontalSliderPage = homePage.goToHorizontalSliderPage();
        String initialValue = horizontalSliderPage.getCurrentValue();
        Assert.assertEquals(initialValue, "0",
                "\n The initial value is not 0: " + initialValue +".\n");
        int expectedValue = 3;
        horizontalSliderPage.moveSliderToValue(expectedValue);
        String actualValue = horizontalSliderPage.getCurrentValue();
        Assert.assertEquals(Integer.parseInt(actualValue), expectedValue,
                "\n The actual value is " +actualValue+  ".\n");
    }
}
