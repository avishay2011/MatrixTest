package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriverWait waitUntil;
	WebDriver driver;
		
	public BasePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		waitUntil=new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	public void fillText(WebElement el, String text) {
		waitUntil.until((ExpectedConditions.visibilityOf(el)));
		el.clear();
		el.sendKeys(text);
	}

	public void click(WebElement el) {
		waitUntil.until(ExpectedConditions.elementToBeClickable(el));
		el.click();
	}

	public String GetText(WebElement el) {
		return el.getText();
	}
	
	public void wait(int miliseconds) {  /// wait function 
		try {
			Thread.sleep(miliseconds);
		} catch (Exception e) {
		}
	}
	
	}







