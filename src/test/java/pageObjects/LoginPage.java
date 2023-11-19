package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	@FindBy(css="#username")
    private WebElement userName;
	@FindBy(css="#password")
    private WebElement passWord;
	@FindBy(css="#log-in")
    private WebElement loginButton;
	
	

	public LoginPage(WebDriver driver) {
		super(driver);		
	}	
	
	public void login(String userName,String password) {
		fillText(this.userName, userName);
		fillText(this.passWord, password);
		click(loginButton);
}
}










