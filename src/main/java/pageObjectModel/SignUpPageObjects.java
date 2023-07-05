package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
public WebDriver driver;
	private By firstname= By.xpath("//input[@name='UserFirstName']");
	private By lastname= By.xpath("//input[@name='UserLastName']");
	private By jobtitle= By.xpath("//input[@name='UserTitle']");
	private By tryforfree= By.xpath("//a[@id='signup_link']");
    private By next=By.xpath("//span[contains(text(),'Next')]");
    private By selectemployees=By.xpath("//select[@name='CompanyEmployees']");
    private By entercompanyname=By.xpath("//input[@name='CompanyName']");
    private By entercountry=By.xpath("//select[@name='CompanyCountry']");
    private By enterstate=By.xpath("//select[@name='CompanyState']");
    private By enterphonenumber=By.xpath("//input[@name='UserPhone']");
    private By enteremailaddress=By.xpath("//input[@name='UserEmail']");
    private By back=By.xpath("//span[contains(text(),'Back')]");
    private By errormessage=By.xpath("//h2[@id='answer-2-more-questions-and-well-get-you-into-your-free-trial']");
    
    
    
    
	public SignUpPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}

	 public WebElement ClickTryForFree() {
   	  return driver.findElement(tryforfree);
     }
	public WebElement EnterFirstName() {
		
		return driver.findElement(firstname);
	}
	

	public WebElement EnterLastName() {
		
		return driver.findElement(lastname);
	}
	

	public WebElement EnterJobTitle() {
		
		return driver.findElement(jobtitle);
	}
	

	public WebElement ClickOnNext() {
		
		return driver.findElement(next);
	}
	

	public WebElement EnterNumberOfEmployee() {
		
		return driver.findElement(selectemployees);
	}
   public WebElement EnterCompanyName() {
		
		return driver.findElement(entercompanyname);
	}
   public WebElement EnterCountryName() {
		
		return driver.findElement(entercountry);
	}
   public WebElement EnterStateName() {
		
		return driver.findElement(enterstate);
	}
   public WebElement EnterPhoneNumber() {
		
		return driver.findElement(enterphonenumber);
	}
   public WebElement EnterEmailAddress() {
		
		return driver.findElement(enteremailaddress);
	}
   
   public WebElement ClickOnBack() {
		
		return driver.findElement(back);
	}
   public WebElement ShowSignUpMessage() {
		
		return driver.findElement(errormessage);
	}
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	
	
}
