
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {

    public static WebDriver driver;


    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", Configs.DRIVERS + "/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        driver = new ChromeDriver(options);

}

    public void WaitFor(boolean pageload){

        driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    }

    public void WaitFor(WebElement element){

        WebDriverWait wait = new WebDriverWait(driver,35000);
        wait.until(ExpectedConditions.visibilityOf(element));
  }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}


