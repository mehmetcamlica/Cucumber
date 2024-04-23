package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoUrlPage {

    public DemoUrlPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Tümünü Kabul Et']")
    public WebElement acceptCookiesButonu;

    @FindBy(id = "gdpr-consent-notice")
    public WebElement cookiesIframe;

    @FindBy(xpath = "//thead//th")
    public List<WebElement> baslikElementleriListesi;
}