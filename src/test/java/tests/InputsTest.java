package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;

@Test
public class InputsTest extends BaseTest {

    public void inputValidNumberViaFieldTest(){
        int expectedNumber = 999;
        InputsPage inputsPage = homePage.goToInputsPage();
        inputsPage.enterNumber(expectedNumber);
        int actualNumber = Integer.parseInt(inputsPage.getInputFieldData());
        Assert.assertEquals(actualNumber, expectedNumber,
                "\n The actual text doesn't match the expected text: " + actualNumber + " \n ");
    }

    public void inputInvalidTextViaFieldTest() {
        String expectedText = "Not valid data";
        InputsPage inputsPage = homePage.goToInputsPage();
        inputsPage.enterText(expectedText);
        String actualText = inputsPage.getInputFieldData();
        Assert.assertNotEquals(actualText, expectedText,
                "\n The actual text do match the expected text! \n");
    }

    public void changeValueUsingArrowsTest() {
        int expectedNumber = 5;
        var inputsPage = homePage.goToInputsPage();
        inputsPage.putCursorIntoInputField();
        inputsPage.changeValueFromKeyboard("increase", 5);
        int actualNumber = Integer.parseInt(inputsPage.getInputFieldData());
        Assert.assertEquals(actualNumber, expectedNumber,
                "\n The actual text doesn't match the expected text: " + actualNumber + " \n ");
    }
}
