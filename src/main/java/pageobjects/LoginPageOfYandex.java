package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageOfYandex extends Page {
    public LoginPageOfYandex(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "login")
    WebElement login;

    @FindBy(name = "passwd")
    WebElement password;

    @FindBy(xpath = "//span[contains(text(),'Войти')]")
    WebElement loginButton;

    public void logIn(String username, String password){
        this.login.clear();
        this.login.sendKeys(username);

        this.password.clear();
        this.password.sendKeys(password);

        this.loginButton.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Войти в Яндекс.Почту')]")
    WebElement signInButton;

    public void clickSignInButton(){
        this.signInButton.click();
    }


}
