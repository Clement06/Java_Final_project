package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
    private String url = "https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/";

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(url);
    }
    
    @FindBy(xpath  = "//a[contains(.,'Contact')]")
    WebElement contactLink;

    public void clickContactLink() {
        contactLink.click();
    }
}
