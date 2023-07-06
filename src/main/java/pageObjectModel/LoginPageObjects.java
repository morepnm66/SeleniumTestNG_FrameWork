package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	//i made change in LoginPageObjects
	public WebDriver driver;
	private By username= By.xpath("//input[@id='username'] ");
	private By password= By.xpath("//input[@id='password'] ");
	private By login= By.xpath("//input[@id='Login'] ");
	private By tryforfree= By.xpath("//a[@id='signup_link']");
    private By errormessage=By.xpath("//div[@id='error']");

     
      public LoginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
    	  this.driver=driver2;
	}


	public WebElement EnterUserName() {
    	  return driver.findElement(username);
      }
      

      public WebElement EnterPassword() {
    	  return driver.findElement(password);
      }
      

      public WebElement ClickOnLogin() {
    	  return driver.findElement(login);
      }
      

      public WebElement ClickTryForFree() {
    	  return driver.findElement(tryforfree);
      }

      public WebElement ShowErrorMessage() {
    	  return driver.findElement(errormessage);
      }
      }