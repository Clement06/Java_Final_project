package pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FlipkartHomePage extends BasePage {
	
    @FindBy(name = "q")
    private WebElement searchField;
    
    @FindBy(xpath = "//span[@role='button']")
    private WebElement closeButton;
  
    
    @FindBy(xpath = "//span[@class='_10Ermr']")
    private WebElement resultCount;
    
    @FindBy(className = "_396cs4")
    private WebElement firstItem;
    
    private String url = "https://www.flipkart.com/";

	public FlipkartHomePage(WebDriver driver) {
		super(driver);
		 driver.get(url);
	}
	
	  // Define web elements and methods for the Flipkart home page
	
	public void searchiPhone(String searchText)
	{
		closeButton.click();
    	ResourceBundle rb=ResourceBundle.getBundle("TestData");
    	String searchtext=rb.getString("searchText");
    	searchField.sendKeys(searchtext,Keys.ENTER);
    	
	}
	
	public void pageValidation() {
		String result = driver.findElement(By.className("_10Ermr")).getText();
		System.out.println("Result Count"+ result);
		firstItem.click();
		Assert.assertEquals(driver.getTitle(), "IPhone 14- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		Assert.assertTrue(driver.getCurrentUrl().contains("https://www.flipkart.com/search?q=iPhone%2014"));
		
	}
	
  
}
