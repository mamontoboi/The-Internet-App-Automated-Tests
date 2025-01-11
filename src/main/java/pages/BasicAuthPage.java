package pages;

import org.openqa.selenium.By;

public class BasicAuthPage extends HomePage{

    private By confimationText = By.xpath("//p[contains(text(), 'Congratulations!') " +
            "and contains(text(), 'proper credentials')]");

    public boolean checkConfirmationText() {
        return find(confimationText).isDisplayed();
    }

    public void loginViaURL(String username, String password) {
        String baseAuthUrl = "https://%1s:%2s@the-internet.herokuapp.com/basic_auth";
        driver.get(String.format(baseAuthUrl, username, password));
    }
}
