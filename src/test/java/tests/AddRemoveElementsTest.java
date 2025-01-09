package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void addRemoveElementsTest(){
        var basicPage = homePage.goToAddRemoveElementsPage();
        int initialQuantity = basicPage.countAddedButtons();
        Assert.assertEquals(initialQuantity, 0,
                "\n The initial quantity is not 0.\n");
        basicPage.clickAddElementButton();
        basicPage.clickAddElementButton();
        int intermQuantity = basicPage.countAddedButtons();
        Assert.assertEquals(intermQuantity, 2,
                "\n The actual quantity is not 2.\n");
        basicPage.clickDeleteElementButton();
        int finalQuantity = basicPage.countAddedButtons();
        Assert.assertEquals(finalQuantity, 1,
                "\n The actual quantity is not 1.\n");
    }
}
