package pageObjects;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonOps.Verifications;

public class TransactionsPage extends BasePage {
	@FindBy(css=".table.table-padded")
    private WebElement transactionTable;
	@FindBy(css=".nowrap>span:nth-child(2)")
	private List<WebElement> statusList;
	@FindBy(css=".status-pill.smaller.green")
	private List<WebElement> statusWithGreenColor; ///  לצורך הבדיקה אשווה את גודל הרשימה של סטטוסים שצבועים בירוק עם הסטטוסים שיש להם את התווית של הצלחה
		
	public TransactionsPage(WebDriver driver) {
		super(driver);
	}
	
	public void findTransactionTable() {     ///assert that the trades table is visible 
		wait(1000);
		Verifications.visibility_Of_Element(transactionTable);
	}
	
	public void countTransactions() {
		int expectedValue=statusWithGreenColor.size();
		int sum=0;
	    for (WebElement status : statusList) {
	    	if (status.getText().equalsIgnoreCase("complete")) {
	    		sum++;
	    	}
		}
	   assertEquals(sum, expectedValue,"The expected value is not equals to the completed transactions number-test FAILED");
	}
}
 

