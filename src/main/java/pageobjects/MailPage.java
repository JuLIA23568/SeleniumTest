package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailPage extends Page {
    public MailPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[contains(text(),'Входящие')]")
    WebElement incomingMessagesLink;



    @FindBy(xpath = "//*[@id=\"nb-1\"]/body/div[2]/div[4]/div/div[2]/div[3]/div[2]/div[5]/div[1]/div/div/div[3]/div/div/div/div[1]")
    WebElement text;

    public String getNumberOfIncomingMessages(){
        return this.text.getText();
    }

    public void clickOnIncomingMessagesLink(){
        this.incomingMessagesLink.click();
    }






}
