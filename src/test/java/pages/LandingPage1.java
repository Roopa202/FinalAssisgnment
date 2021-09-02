package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage1 {

     WebDriver driver=null;


	private By txt_signin = By.partialLinkText("Sign in");
	private By txt_emailid = By.id("email_create"); 
	private By txt_createaccount = By.id("SubmitCreate");

	public LandingPage1(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public void clickonsignin()
	{
		driver.findElement(txt_signin).click();
	}

	public void enteremailid()	{

		driver.findElement(txt_emailid).sendKeys("molly@gmail.com");

	}

	public void clickoncreateaccount(){

		driver.findElement(txt_createaccount).click();
	}


}
