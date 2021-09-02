

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignInPage1 {


    WebDriver driver=null;
   //protected WebDriver driver;

	private By txt_gen = By.id("uniform-id_gender2");	
	private By txt_fname = By.id("customer_firstname");
	private By txt_lname = By.id("customer_lastname"); 
	private By txt_pswd = By.id("passwd");
	private By txt_d = By.id("days");
	private By txt_m= By.id("months");
	private By txt_y= By.id("years");
	private By txt_newsltr=By.id("uniform-newsletter");
	private By txt_comp = By.id("company");
	private By txt_add1 = By.id("address1");
	private By txt_add2 = By.id("address2");
	private By txt_city = By.id("city");
	private By txt_st=By.id("id_state");
	private By txt_postcode = By.id("postcode");
	private By txt_country=By.id("id_country");
	private By txt_info = By.id("other");
	private By txt_ph = By.id("phone");
	private By txt_mph = By.id("phone_mobile");
	private By txt_alias = By.id("alias");
	private By txt_register = By.id("submitAccount");
	private By txt_validuser=By.xpath("//*[@class='account']/span");
	private By txt_signout = By.xpath("//*[@class='logout']");
	private By txt_signin = By.className("login");
	private By txt_emailid=By.id("email"); 
	private By txt_password =By.id("passwd");
	private By txt_submitlogin = By.id("SubmitLogin");


	public SignInPage1(WebDriver driver)
	{
		this.driver=driver;
	}



	public void enterdetails() {

		driver.findElement(txt_gen).click();

		boolean genstatus = driver.findElement(txt_gen).isSelected();
		if(genstatus)
		{
			System.out.println("Gender is Selected");
		}
		else
		{
			System.out.println("Gender is not  Selected");
		}


		driver.findElement(txt_fname).sendKeys("XYZ");
		driver.findElement(txt_lname).sendKeys("ZYX");
		driver.findElement(txt_pswd).sendKeys("XYZ@202");

		driver.findElement(txt_d).click();
		Select date= new Select(driver.findElement(txt_d));
		date.selectByValue("3");

		driver.findElement(txt_m).click();
		Select month = new Select(driver.findElement(txt_m));
		month.selectByValue("3");

		driver.findElement(txt_y).click();
		Select year = new Select(driver.findElement(txt_y));
		year.selectByValue("2019");


		driver.findElement(txt_newsltr).click();
		boolean newsltrstatus= driver.findElement(txt_newsltr).isSelected();
		if(newsltrstatus)
		{
			System.out.println("Newsletter is Selected");
		}
		else
		{
			System.out.println("Newsletter is not  Selected");
		}


		driver.findElement(txt_comp).sendKeys("company");
		driver.findElement(txt_add1).sendKeys("First line address");
		driver.findElement(txt_add2).sendKeys("Second line address");
		driver.findElement(txt_city).sendKeys("Alden");

		driver.findElement(txt_st).click();
		Select state = new Select(driver.findElement(txt_st));
		state.selectByVisibleText("Illinois");

		driver.findElement(txt_postcode).sendKeys("60001");

		driver.findElement(txt_country).click();
		Select country =new Select(driver.findElement(txt_country));
		country.selectByValue("21");

		driver.findElement(txt_info).sendKeys("ABC");
		driver.findElement(txt_ph).sendKeys("12345678");
		driver.findElement(txt_mph).sendKeys("123456789");
		driver.findElement(txt_alias).sendKeys("My Alternate address");
		driver.findElement(txt_register).click();


	}


	public void validateregistereduser() {

		String validuser = driver.findElement(txt_validuser).getText();
		String expecteduser = "XYX ABC";
		System.out.println(validuser);
		System.out.println(validuser.equalsIgnoreCase(expecteduser));
       
	}

	public void logout() {
		driver.findElement(txt_signout).click();

	}

	public void login() {
		driver.findElement(txt_signin).click();
		driver.findElement(txt_emailid).sendKeys("zen@gmail.com");
		driver.findElement(txt_password).sendKeys("XYZ@202");
		driver.findElement(txt_submitlogin).click();
	}
}  

