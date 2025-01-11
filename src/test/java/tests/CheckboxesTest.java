package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class CheckboxesTest extends BaseTest {

    private void checkCheckboxState (CheckboxesPage page, int index,
                                     String expectedState, String errorMessage) {
        boolean isCheckBoxChecked = page.checkIfChecked(index);
        if (expectedState.equals("checked")) {
            Assert.assertTrue(isCheckBoxChecked, errorMessage);
        } else {
            Assert.assertFalse(isCheckBoxChecked, errorMessage);
        }
    }

    @Test
    public void checkboxesTest() {
        CheckboxesPage checkboxesPage = homePage.goToCheckboxesPage();
        int actualNumberOfCheckboxes = checkboxesPage.countCheckboxes();
        int expectedNumber = 2;
        Assert.assertEquals(actualNumberOfCheckboxes, expectedNumber,
                "\n The actual number of checkboxes is "+ actualNumberOfCheckboxes + "\n");
        checkCheckboxState(checkboxesPage, 0, "unchecked",
                "\n The first checkbox is checked. \n");
        checkCheckboxState(checkboxesPage, 1, "checked",
                "\n The second checkbox is unchecked. \n");

        checkboxesPage.clickOnCheckbox(0);
        checkCheckboxState(checkboxesPage, 0, "checked",
                "\n The first checkbox is still not checked. \n");
        checkboxesPage.clickOnCheckbox(1);
        checkCheckboxState(checkboxesPage, 1, "unchecked",
                "\n The second checkbox is still checked. \n");
    }
}
