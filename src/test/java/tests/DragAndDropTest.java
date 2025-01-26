package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {

    @Test
    public void dragAndDropTest() {
        var dragAndDropPage = homePage.goToDragAndDropPage();
        String actualColumnAHeader = dragAndDropPage.getCurrentHeaderOfColumn("A");
        Assert.assertEquals(actualColumnAHeader, "A",
                "\n The initial column name is not A, but " + actualColumnAHeader + "\n");
        dragAndDropPage.dragColumnToAnother("A");
        actualColumnAHeader = dragAndDropPage.getCurrentHeaderOfColumn("A");
        Assert.assertEquals(actualColumnAHeader, "B",
                "\n The final column name is not B, but " + actualColumnAHeader + "\n");
    }
}
