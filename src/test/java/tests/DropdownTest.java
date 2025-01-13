package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownTest extends BaseTest {

    @Test
    public void dropdownTest() {
        DropdownPage dropdownPage = homePage.goToDropdownPage();
        dropdownPage.selectOptionByText("Option 2");
        boolean isSecondOptionSelected = dropdownPage.checkIfSecondOptionSelected();
        Assert.assertTrue(isSecondOptionSelected, "\n The option is not selected. \n");
        dropdownPage.selectOptionByText("Option 1");
        isSecondOptionSelected = dropdownPage.checkIfSecondOptionSelected();
        Assert.assertFalse(isSecondOptionSelected, "\n The option 2 is still selected. \n");
    }
}
