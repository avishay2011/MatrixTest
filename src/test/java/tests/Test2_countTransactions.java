package tests;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.TransactionsPage;

public class Test2_countTransactions extends BaseTest {
	  
		@Test
		public  void test2_countTransactions() {	
			LoginPage logIn=new LoginPage(driver);
			logIn.login("Avishay2011@gmail.com","1234");		
		    TransactionsPage tp=new TransactionsPage(driver);
		    tp.countTransactions();
	
		}	
}

