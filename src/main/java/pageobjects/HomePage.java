package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Почта")
    WebElement mailLink;

    public LoginPage openLogInPage(){
        this.mailLink.click();
        return new LoginPage(driver);

    }

}
