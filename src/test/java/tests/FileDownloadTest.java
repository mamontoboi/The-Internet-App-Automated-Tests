package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileDownloadTest extends BaseTest {

    @Test
    public void fileDownloadTest() {
        var fileDownloadPage = homePage.goToFileDownloadPage();
        fileDownloadPage.clickOnFileToDownload();
        boolean isFileFound = fileDownloadPage.checkFileIsDownloaded();
        Assert.assertTrue(isFileFound, "\n The file is not downloaded!");
    }
}
