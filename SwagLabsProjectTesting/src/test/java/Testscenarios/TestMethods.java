package Testscenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.Login;
import objects.ProductPage;

public class TestMethods {
	WebDriver driver;
	Login objrepo1;
	ProductPage objrepo2;
	
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void login1()
	{
		objrepo1=new Login(driver);
		objrepo1.LoginCredentials("standard_user", "secret_sauce");
	}
	
	@Test(priority = 2)
	public void Clicklogin()
	{
		objrepo1=new Login(driver);
		objrepo1.ClickOnLogin();
	}
	
	@Test(priority = 3)
	public void Clickopenmenu()
	{
		objrepo1=new Login(driver);
		objrepo1.ClickOnOpenMenu();
	}
	
	@Test(priority = 4)
	public void ClickAllItems()
	{
		objrepo1=new Login(driver);
		objrepo1.ClickOnAllItems();
	}
	
	@Test(priority = 5)
	public void ClickClose()
	{
		objrepo1=new Login(driver);
		objrepo1.ClickOnClose();
	}
	
	@Test(priority = 6)
	public void Clicktshirt()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickOnTshirt();
	}
	
	@Test(priority = 7)
	public void Addtshirt()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.AddTshirt();
	}
	
	
	@Test(priority = 8)
	public void Clickbackproducts()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickOnBackProducts();
	}
	
	@Test(priority = 9)
	public void openmenu()
	{
		objrepo1=new Login(driver);
		objrepo1.ClickOnOpenMenu();
	}
	
	@Test(priority = 10)
	public void Reset()
	{
		objrepo1=new Login(driver);
		objrepo1.ClickOnResetApp();;
	}
	
	@Test(priority = 11)
	public void twitter()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickOnTwitter();
	}
	
	@Test(priority = 12)
	public void facebook()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickOnFacebook();
	}
	
	@Test(priority = 13)
	public void linkedin()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickOnLinkedin();
	}
	
	@Test(priority = 14)
	public void About()
	{
		objrepo1=new Login(driver);
		objrepo1.ClickOnAbout();
	}
	
	@Test(priority = 15)
	public void Dropdown()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.Filterdropdown();
	}
	
	
	@Test(priority = 16)
	public void Selectbackpack()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickBackpack();
	}
	
	@Test(priority = 17)
	public void Cartbackpack()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.AddBackpack();
	}
	
	@Test(priority = 18)
	public void Selectbikelight()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickBikeLight();
	}
	
	@Test(priority = 19)
	public void Cartbikelight()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.AddBikeLight();
	}
	
	@Test(priority = 20)
	public void SelectRedTshirt()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickRedTshirt();
	}
	
	@Test(priority = 21)
	public void CartRedTshirt()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.AddRedTshirt();
	}
	
	@Test(priority = 22)
	public void Shopping()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickOnCart();
	}
	@Test(priority = 23)
	public void removeRedTshirt()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.DeleteRedTshirt();
	}
	@Test(priority = 24)
	public void  back()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickOnContinueShopping();
	}
	
	@Test(priority = 25)
	public void cart()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickOnCart();
	}
	
	@Test(priority = 26)
	public void payment()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickOnCheckout();
	}
	
	@Test(priority = 29)
	public void PCode()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickonPostalCode("1245");
	}
	
	
	@Test(priority = 30)
	public void checkButton()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickOnCheckout();
	}
	
	@Test(priority = 31)
	public void FName()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickonFirstname("andrew");
	}
	
	@Test(priority = 32)
	public void LaName()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickonLastname("Tate");
	}
	
	@Test(priority = 33)
	public void forward()
	{
		objrepo2=new ProductPage(driver);
		objrepo2.ClickOnContinue();
	}
	
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	
}
