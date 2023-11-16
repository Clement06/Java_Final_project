package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.FlipkartHomePage;

public class FlipKartTest {
	 private WebDriver driver;
	 private FlipkartHomePage FlipkartHomePage;

	    @BeforeSuite
	    public void setup() {
	        driver = new ChromeDriver();
	        FlipkartHomePage = new FlipkartHomePage(driver);

	    }

	    @Test
	    public void testiPhoneAndSearch() {
	    	Assert.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	    	FlipkartHomePage.searchiPhone("iPhone 14");
	    	FlipkartHomePage.pageValidation();
	    }

	    @AfterSuite
	    public void tearDown() {
	        driver.quit();
	    }

}
