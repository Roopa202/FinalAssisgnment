package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {


        WebDriver driver=null;
	  //protected WebDriver driver;

	    public void lauchbrowser() {
	    	
	    	
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

	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}

	


}
