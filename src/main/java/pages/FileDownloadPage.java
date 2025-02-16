package pages;

import org.openqa.selenium.By;

import java.io.File;

public class FileDownloadPage extends HomePage {

    private String testFileName = "file-upload.txt";
    private By fileToDownload = By.linkText(testFileName);

    public void clickOnFileToDownload() {
        click(fileToDownload);
    }

    public boolean checkFileIsDownloaded() {
        File folder = new File(System.getProperty("user.dir"));
        File file = new File(folder, testFileName);
        int elapsedTime = 0;

        while (elapsedTime < 10000) {
            if (file.exists()) {
                file.deleteOnExit();
                return true;
            }
            try {
                Thread.sleep(500);
                elapsedTime += 500;
            } catch (InterruptedException ignored) {}
        }
        return false;
    }
}
