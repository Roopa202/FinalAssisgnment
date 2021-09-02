package StepDefinitions;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.CataloguePage1;
import pages.LandingPage1;
import pages.SignInPage1;

public class CreateAccount  {

	private static WebDriver driver = null;
	//WebDriver driver = null;
	LandingPage1 land;
	SignInPage1 sign;
	CataloguePage1 catalogue;
	BasePage base;

	@Given("user is on Application landing page")
	public void user_is_on_Application_landing_page() {
		
		String projectPath =System.getProperty("user.dir");
		System.out.println("Project path is :"+ projectPath);

		System.setProperty("webdriver.chrome.driver", 
				projectPath+"/src/test/resources/drivers/chromedriver.exe");

		driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
       
		String title1 = driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals("Login - My Store", title1);
	}


	@And("click on sign in")
	public void click_on_sign_in()  {

		land = new LandingPage1(driver);
		land.clickonsignin();



	}

	@When("user enters emailid in email Id field")
	public void user_enters_emailid_in_email_Id_field() {

		land = new LandingPage1(driver);
		land.enteremailid();

	}

	@And("user clicks on create account")
	public void user_clicks_on_create_account() {

		land = new LandingPage1(driver);
		land.clickoncreateaccount();

	}

	@Then("enter your details and create account")
	public void enter_your_details_and_create_account() {

		sign =new SignInPage1(driver);
		sign.enterdetails();

	}

	@And("validate the landing screen with  name and surname")
	public void validate_the_landing_screen_with_name_and_surname() {


		sign =new SignInPage1(driver);
		sign.validateregistereduser();

		driver.close();
	}

}
