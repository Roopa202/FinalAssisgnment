package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CataloguePage1 {



    WebDriver driver=null;
  // protected WebDriver driver;
	private By txt_category = By.linkText("Women");

	private By txt_top = By.linkText("Tops");
	private By txt_subcategory = By.partialLinkText("T-shirts"); 
	private By txt_size = By.xpath("//*[@id='group_1']");
    private By txt_selectproduct =By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img");
	private By txt_morebtn =By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]");
    private By txt_productqty = By.id("quantity_wanted");
	private By txt_productcolor =By.id("color_11");
    private By txt_addtocart = By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']");
    private By txt_checkout1 = By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span");
  	
	
	private By txt_checkout2 = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span");
    private By txt_checkout3 = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span");
    private By txt_checkout4 =By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span");	
	private By txt_tc= By.xpath("//*[@id=\"cgv\"]");
    private By txt_productName= By.partialLinkText("Blouse");
    private By txt_productPrice =By.xpath("//*[@class='price'][@id='total_product_price_']");
    
    
	public CataloguePage1(WebDriver driver)
	{
		this.driver=driver;
	}


	public void selectcategory() {

		driver.findElement(txt_category).click();
	}

	public void selecttop() {


		driver.findElement(txt_top).click();

	}


	public void selectsubcategory() {
		driver.findElement(txt_subcategory).click();
	}


	public void selectsixe() {
		//driver.findElement(txt_size).click();
		
		  Select oSelect=new Select(driver.findElement(txt_size));
		  oSelect.selectByVisibleText("M");
	}


	public void selecttheproduct()
	{
		  //driver.findElement(txt_selectproduct);
          //driver.findElement(txt_morebtn);
     	
		
		 Actions actions=new Actions(driver);
		 actions.moveToElement(driver.findElement(txt_selectproduct)).moveToElement(driver.findElement(txt_morebtn)).click().perform();
	
	}
	
	public void productqty() {
		
		driver.findElement(txt_productqty).clear();
		driver.findElement(txt_productqty).sendKeys("2");
	}
	
	public void selectcolor() {
		
	    driver.findElement(txt_productcolor).click();
	}
	
	public void addtocart() {

		driver.findElement(txt_addtocart).click();
	}

	public void checkout1() throws InterruptedException {
		
		driver.findElement(txt_checkout1).click();
		Thread.sleep(1000);
	}

	public void checkout2() throws InterruptedException
	{
		 driver.findElement(txt_checkout2).click();
		 Thread.sleep(1000);
	}
	
	public void checkout3() throws InterruptedException
	{
		driver.findElement(txt_checkout3).click();
		Thread.sleep(1000);
	}
	
	public void checkout4() throws InterruptedException
	{
		driver.findElement(txt_tc).click();
		driver.findElement(txt_checkout4).click();
		Thread.sleep(1000);
	}
	
	
	public void validateproductdetails()
	{
		String actualname=driver.findElement(txt_productName).getText();
		System.out.println(actualname);
		String expectedname = "Blouse";
		System.out.println(actualname.equalsIgnoreCase(expectedname));
		
		String actualprice=driver.findElement(txt_productPrice).getText();
		System.out.println(actualprice);
		String expectedprice ="$54.00";
		System.out.println(actualprice.equalsIgnoreCase(expectedname));
		
		
	}
	public void pagescroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
	}


	
}