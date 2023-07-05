package testCaseces;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObjects;


import resources.BaseClass;
import resources.CommonMethods;
import resources.Constants;

public class LoginTestCase extends BaseClass {

	@Test(dataProvider="testData")
	public void verifyLogin(String username, String password) throws IOException {
		
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		
		lpo.EnterUserName().sendKeys(username);
		
		lpo.EnterPassword().sendKeys(password);
		lpo.ClickOnLogin().click();
		//lpo.ClickTryForFree().click();
      CommonMethods.verifyAssertions(lpo.ShowErrorMessage(),Constants.ExpectedText, Constants.Errormessage);
		/*WebElement a=lpo.ShowErrorMessage();
		String actualText=a.getText();
		String ExpectedText=Constants.ExpectedText;
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualText,ExpectedText,Constants.Errormessage);
		sa.assertAll();*/
		
	}
	

	 @DataProvider
	 public Object[][] testData() {
	  Object[][] data=new Object[3][2];
	  data[0][0]=Constants.username1;
	  data[0][1]=Constants.password1;
	  data[1][0]=Constants.username2;
	  data[1][1]=Constants.password2;
	  data[2][0]=Constants.username3;
	  data[2][1]=Constants.password3;
	  return data;
	 }
		
		
		
	    

}
