package pages;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {
    @FindBy(id = "g3-name")
    private WebElement nameInput;

    @FindBy(id = "g3-email")
    private WebElement emailInput;

    @FindBy(id = "contact-form-comment-g3-message")
    private WebElement commentInput;

    @FindBy(xpath = "//button[@class='wp-block-button__link has-text-color has-black-color']")
    private WebElement submitButton;

    @FindBy(id = "contact-form-success-header")
    private WebElement messageSent;

    public ContactPage(WebDriver driver) {
        super(driver);
    }
    
    // Common methods to interact with web elements
    
    public void fillFormAndSubmit(String name, String email, String comment) {
  
    	ResourceBundle rb=ResourceBundle.getBundle("TestData");
    	String username=rb.getString("name");
    	String emailid=rb.getString("email");
    	String user_comment=rb.getString("comment");
        nameInput.sendKeys(username);
        emailInput.sendKeys(emailid);
        commentInput.sendKeys(user_comment);
        submitButton.click();
    }

    public boolean isMessageSentDisplayed() {
        return messageSent.isDisplayed();
    }
}
