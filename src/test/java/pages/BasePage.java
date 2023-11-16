package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

//BasePage.java
public class BasePage {
 protected WebDriver driver;

 public BasePage(WebDriver driver) {
     this.driver = driver;
     PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
 }

}
