package tests;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.TransactionsPage;
import utils.UtilsConfiguration;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test1_login extends BaseTest {
    
	@Test
	public  void test1_loginSuccess() {	
		LoginPage logIn=new LoginPage(driver);
		TransactionsPage tp=new TransactionsPage(driver);
		logIn.login(UtilsConfiguration.readProperty("userName"),UtilsConfiguration.readProperty("password"));		
		tp.findTransactionTable();
		}
	}	






