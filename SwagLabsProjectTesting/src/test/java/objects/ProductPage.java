package objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
WebDriver driver;
	
public ProductPage(WebDriver driver)
{
	this.driver=driver;
}
//WebElements Locators Repository
By ShoppingCartIcon = By.xpath("//div[@id='shopping_cart_container']");
By ProductSort = By.xpath("//select[@class='product_sort_container']");
By ProductName_backpack = By.id("item_4_title_link");
By ProductImage_light = By.id("item_0_img_link");
By ProductColour_Tshirt = By.id("item_3_img_link");
By AddToCartBackpack = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/button");
By AddToCart_BikeLight = By.xpath("//*[@id=\"add-to-cart\"]");
By AddToCart_RedColour = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/button");
By RemoveTshirt = By.xpath("//button[@id='remove-test.allthethings()-t-shirt-(red)']");
By Checkout = By.id("checkout");
By ContinueShopping = By.id("continue-shopping");
By TwitterInFooter = By.xpath("//a[text()='Twitter']");
By FaceBookInFooter = By.xpath("//a[text()='Facebook']");
By LinkedinInFooter = By.xpath("//a[text()='LinkedIn']");
By CancelBtn =By.xpath("//button[@id='cancel']");
By Continue = By.xpath("//input[@id='continue']");
By FirstnameInCheckout = By.xpath("//input[@id='first-name']");
By LastnameInCheckout = By.xpath("//input[@id='last-name']");
By PostalCodeInCheckout = By.id("postal-code");
By backtoproducts = By.id("back-to-products");
By SauceTshirt = By.xpath("//*[@id=\"item_1_img_link\"]/img");
By addsauceTshirt = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/button");
By cancelInCheckout = By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[1]");
public void Filterdropdown() 
{
	try {
		WebElement drop= driver.findElement(ProductSort);
		Select Dropdown = new Select(drop);
		Dropdown.selectByValue("lohi");
	     Thread.sleep(3000);
		
	}
	 catch(Exception e)
	   {
		   System.out.println("Exception caught :" + e.getMessage());
	   }
}

public void ClickOnCart() 
{
	try {
		driver.findElement(ShoppingCartIcon).click();
		Thread.sleep(4000);
	}
	 catch(Exception e)
	 {
		 System.out.println("Exception caught :" + e.getMessage());
	 }
	
}
public void ClickonFirstname(String fname)

{
	   try {
	   driver.findElement(FirstnameInCheckout).sendKeys(fname);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	   
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception caught :" + e.getMessage());
	   }
	   
}

public void ClickonLastname(String lname)
{
	   try {
		   driver.findElement(LastnameInCheckout).sendKeys(lname);
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		   
		   }
		   catch(Exception e)
		   {
			   System.out.println("Exception caught :" + e.getMessage());
		   }
	   
}

public void ClickonPostalCode(String PCname) 
{
	try {
		driver.findElement(PostalCodeInCheckout).sendKeys(PCname);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	catch(Exception e)
	   {
		   System.out.println("Exception caught :" + e.getMessage());
	   }
}

public void ClickBackpack() 
{
try {
	driver.findElement(ProductName_backpack).click();
	Thread.sleep(5000);
}
catch(Exception e)
{
	   System.out.println("Exception caught :" + e.getMessage());
}
}

public void AddBackpack() 
{
	try {
		driver.findElement(AddToCartBackpack).click();
		Thread.sleep(4000);
		driver.navigate().back();
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}


public void ClickBikeLight() 
{
try {
	driver.findElement(ProductImage_light).click();
	Thread.sleep(4000);
}
catch(Exception e)
{
	   System.out.println("Exception caught :" + e.getMessage());
}
}

public void AddBikeLight()
{
	try {
		driver.findElement(AddToCart_BikeLight).click();
		Thread.sleep(4000);
		driver.navigate().back();
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}


public void ClickRedTshirt() 
{
try {
	driver.findElement(ProductColour_Tshirt).click();
	Thread.sleep(4000);
}
catch(Exception e)
{
	   System.out.println("Exception caught :" + e.getMessage());
}
}

public void AddRedTshirt() 
{
	try {
		driver.findElement(AddToCart_RedColour).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}

public void DeleteRedTshirt() 
{
	try {
		driver.findElement(RemoveTshirt).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().back();
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}

public void ClickOnCheckout()
{
	try {
		driver.findElement(Checkout).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}

public void ClickOnContinueShopping() 
{
	try {
		driver.findElement(ContinueShopping).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}

public void ClickOnTwitter()
{
	try {
		driver.findElement(TwitterInFooter).isEnabled();
		Thread.sleep(3000);
		driver.findElement(TwitterInFooter).isDisplayed();
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}

public void ClickOnFacebook()
{
	try {
		driver.findElement(FaceBookInFooter).isEnabled();
		Thread.sleep(3000);
		driver.findElement(FaceBookInFooter).isDisplayed();
		Thread.sleep(3000);
		
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}

public void ClickOnLinkedin()
{
	try {
		driver.findElement(LinkedinInFooter).isEnabled();
		Thread.sleep(3000);
		driver.findElement(LinkedinInFooter).isDisplayed();
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}
 
public void ClickOnCancel()
{
	try {
		driver.findElement(CancelBtn).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().back();
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}

public void ClickOnContinue()
{
	try {
		driver.findElement(Continue).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}

public void ClickOnBackProducts()
{
	try {
		driver.findElement(backtoproducts).click();
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}

public void ClickOnTshirt()
{
	try {
		driver.findElement(SauceTshirt).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}

public void AddTshirt()
{
	try {
		driver.findElement(addsauceTshirt).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}





public void button()
{
	try {
		driver.findElement(cancelInCheckout).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().back();
	}
	catch(Exception e)
	{
		   System.out.println("Exception caught :" + e.getMessage());
	}
}

}

	







	




	




