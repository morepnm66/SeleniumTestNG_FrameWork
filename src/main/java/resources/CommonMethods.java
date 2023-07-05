package resources;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static void selectDropdown(WebElement element,int index) {
		
		
		 WebElement a=element;
	      Select s= new Select(a);
	      s.selectByIndex(index);
	      s.selectByIndex(index);
	      s.selectByIndex(index);
	      s.selectByIndex(index);
	      
	}
//if we to call visible text then call like following way
	/*public static void selectDropdownWithVisibleText(WebElement element,String visibleText) {
		
		
		 WebElement a=element;
	      Select s= new Select(a);
	      s.selectByVisibleText(visibleText);
	      s.selectByVisibleText(visibleText);
	      s.selectByVisibleText(visibleText);
	      s.selectByVisibleText(visibleText);
	      
	}*/

	
	public static void verifyAssertions(WebElement actual,String expectedText,String Message ) {

		WebElement a=actual;
		String actualText=a.getText();
		String ExpectedText=expectedText;
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualText,ExpectedText,Message);
		sa.assertAll();
	}
}


