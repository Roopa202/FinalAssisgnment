package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.CataloguePage1;
import pages.LandingPage1;
import pages.SignInPage1;

public class AddproductToCart {

	 private static WebDriver driver = null;
	//WebDriver driver = null;
	LandingPage1 land;
	SignInPage1 sign;
	CataloguePage1 catalogue;
	BasePage base;

	@Given("User is on the Homepage")
	public void user_is_on_the_Homepage() {

		    String projectPath =System.getProperty("user.dir");
			System.out.println("Project path is :"+ projectPath);

			System.setProperty("webdriver.chrome.driver", 
					projectPath+"/src/test/resources/drivers/chromedriver.exe");

			driver= new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to("http://automationpractice.com/index.php");


	}

	@And("Login with valid credentials")
	public void login_with_valid_credentials() throws InterruptedException  {

		sign =new SignInPage1(driver);
		sign.login();
        Thread.sleep(2000);
	}

	@Then("Add a product to cart")
	public void add_a_product_to_cart() throws InterruptedException   {
		catalogue = new CataloguePage1(driver);
		catalogue.selectcategory();
	//	catalogue.selecttop();
	//	catalogue.selectsubcategory();
	//	catalogue.selectsixe();
	//  catalogue.pagescroll();
		catalogue.selecttheproduct();
		catalogue.productqty();
		catalogue.addtocart();
		Thread.sleep(2000);
	}

	@And("Proceed to checkout")
	public void proceed_to_checkout() throws InterruptedException {
		catalogue = new CataloguePage1(driver);
		catalogue.checkout1();
		catalogue.checkout2();
		catalogue.checkout3();
		catalogue.checkout4();
		

	}

	@Then("Validate the product details")
	public void validate_the_product_details() {
        
		
		catalogue = new CataloguePage1(driver);
		
		driver.close();
		//catalogue.pagescroll();
		//catalogue.validproductdetails();

	}
}
