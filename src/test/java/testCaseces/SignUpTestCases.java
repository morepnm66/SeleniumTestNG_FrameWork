package testCaseces;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.SignUpPageObjects;
import resources.BaseClass;
import resources.CommonMethods;
import resources.Constants;

public class SignUpTestCases extends BaseClass {

	@Test
	public void verifySignup() throws IOException, InterruptedException {
		
	
	      

	      SignUpPageObjects spo= new SignUpPageObjects (driver);
	      spo.ClickTryForFree().click();
	      Thread.sleep(3000);
	      spo.EnterFirstName().sendKeys(Constants.firstname);
	      spo.EnterLastName().sendKeys(Constants.lastname);
	      spo.EnterJobTitle().sendKeys(Constants.jobtitle);
	      spo.ClickOnNext().click();
	      Thread.sleep(3000);
	      //emploee dropdown
	      
	      CommonMethods.selectDropdown(spo.EnterNumberOfEmployee(), 1);
	      CommonMethods.selectDropdown(spo.EnterNumberOfEmployee(), 2);
	      CommonMethods.selectDropdown(spo.EnterNumberOfEmployee(), 3);
	      CommonMethods.selectDropdown(spo.EnterNumberOfEmployee(), 4);
	      
	      spo.EnterCompanyName().sendKeys(Constants.entercompanyname);
	      CommonMethods.selectDropdown(spo.EnterCountryName(), 98);
	      CommonMethods.selectDropdown(spo.EnterStateName(), 21);
	      
	     /* WebElement a=spo.EnterNumberOfEmployee();
	      Select s= new Select(a);
	      s.selectByIndex(1);
	      s.selectByIndex(2);
	      s.selectByIndex(3);
	      s.selectByIndex(4);*/
	      
	      
	     
	     
	      /*country dropdown
	      WebElement b=spo.EnterCountryName();
	      Select s1= new Select(b);
	      s1.selectByIndex(98);
	      
	      
	      //state dropdown
	      WebElement c=spo.EnterStateName();
	      Select s2=new Select(c);
	      s2.selectByIndex(21);*/
	      
	      
	      spo.ClickOnNext().click();
	      spo.EnterPhoneNumber().sendKeys(Constants.enterphonenumber);
	      spo.EnterEmailAddress().sendKeys(Constants.enteremailaddress);
          CommonMethods.verifyAssertions(spo.ShowSignUpMessage(), Constants.SignUpTextMessage,Constants.SignErrormessage);
			/*WebElement a=spo.ShowSignUpMessage();
			String actualText=a.getText();
			String ExpectedText=Constants.SignUpTextMessage;
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(actualText,ExpectedText,Constants.SignErrormessage);
			sa.assertAll();*/
	      
	      
	      
	      
	      
}

}