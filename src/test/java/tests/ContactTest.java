package tests;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.ContactPage;
import pages.HomePage;
public class ContactTest {
    private WebDriver driver;
    private HomePage homePage;
    private ContactPage contactPage;

    @BeforeSuite
    public void setup() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        contactPage = new ContactPage(driver);
    }

    @Test
    public void testContactFormSubmission() {
        homePage.clickContactLink();
        Assert.assertEquals(driver.getTitle(), "Contact | Automation Panda");
        contactPage.fillFormAndSubmit("John Doe", "johndoe@example.com", "This is a test comment");
        Assert.assertTrue(contactPage.isMessageSentDisplayed());
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
