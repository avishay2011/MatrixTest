package commonOps;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.asserts.SoftAssert;

public class Verifications {
	public static void verifyTextEquals(WebElement el,String Expected ) { /// assert text in element is equals to a  specific word 
		AssertJUnit.assertEquals(el.getText(), Expected);    
	}

	public static void visibility_Of_Element(WebElement elem) {	
			assertTrue(elem.isDisplayed(), "Sorry, the required element is not displayed");
		}
		
	}
