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

public class LogoutLogin {

	private static WebDriver driver = null;
	//WebDriver driver = null;
	LandingPage1 land;
	SignInPage1 sign;
	CataloguePage1 catalogue;
	BasePage base;

	@Given("user is on Homepage")
	public void user_is_on_Homepage() {


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
		    String title ="Login - My Store";
		    System.out.print(title1.equals(title));

	}

	@When("login with registered email id")
	public void login_with_registered_email_id() {

		sign =new SignInPage1(driver);
		sign.login();   
	}

	@And("click on logout")
	public void click_on_logout() {

		sign =new SignInPage1(driver);
		sign.logout();
	}

	@Then("validate the registered user")
	public void validate_the_registered_user() {


		sign =new SignInPage1(driver);
		sign.validateregistereduser();
         
		driver.close();

	}


}
