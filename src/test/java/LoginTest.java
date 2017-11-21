import data.LoginData;
import org.testng.Assert;
import org.testng.annotations.*;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.LoginPageOfYandex;
import pageobjects.MailPage;


public class LoginTest extends FunctionalTest {

   @Test
    public void checkNumberOfIncomingMessages() throws InterruptedException {

       driver.get("http://tut.by/");
       HomePage page = new HomePage(driver);
       LoginData loginData = new LoginData();

       page.openLogInPage();

       LoginPage loginPage = new LoginPage(driver);

       loginPage.logIn(loginData.LOGIN, loginData.PASSWORD);
       WaitFor(true);

       LoginPageOfYandex loginPageOfYandex = new LoginPageOfYandex(driver);

       loginPageOfYandex.clickSignInButton();

       loginPageOfYandex.logIn(loginData.YANDEXLOGIN, loginData.PASSWORD);

       WaitFor(true);

       MailPage mailPage = new MailPage(driver);
       mailPage.clickOnIncomingMessagesLink();
       Assert.assertEquals("В папке «Входящие» нет писем.", mailPage.getNumberOfIncomingMessages());

     }
}
