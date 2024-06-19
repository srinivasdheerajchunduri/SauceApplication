package objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		
	} 
	//WebElements Locators Repository

	By UsernameInLogin = By.id("user-name");
	By PasswordInLogin = By.id("password");
	By Loginbtn = By.id("login-button");
	By OpenMenu = By.id("react-burger-menu-btn");
	By Close = By.xpath("//button[text()='Close Menu']");
	By AllItems = By.xpath("//a[@id='inventory_sidebar_link']");
	By About = By.xpath("//a[@id='about_sidebar_link']");
	By Logout = By.xpath("//a[@id='logout_sidebar_link']");
	By ResetApp = By.xpath("//a[@id='reset_sidebar_link']");
	

	
	public void LoginCredentials(String EnterUsername , String EnterPassword) 
	{
		driver.findElement(UsernameInLogin).sendKeys(EnterUsername);
		driver.findElement(PasswordInLogin).sendKeys(EnterPassword);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	public void ClickOnLogin() 
	{
		try {
		driver.findElement(Loginbtn).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
	catch (Exception e) 
		{
			System.out.println("Exception caught :" + e.getMessage());
		}
	}
	
	public void ClickOnAllItems() 
	{
		try {
			driver.findElement(AllItems).click();
			Thread.sleep(5000);
		}
		catch (Exception e) 
		{
			System.out.println("Exception caught :" + e.getMessage());
		}
	}
	
	public void ClickOnOpenMenu() 
	{
		try 
		{
			driver.findElement(OpenMenu).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
		catch (Exception e) 
		{
			System.out.println("Exception caught :" + e.getMessage());
		}
	}
	
	public void ClickOnResetApp() 
	{
		try 
		{
		driver.findElement(ResetApp).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    }
	catch (Exception e) 
	{
		System.out.println("Exception caught :" + e.getMessage());
	}		
}

	public void ClickOnAbout() 
	{
		try 
		{
		driver.findElement(About).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    }
	catch (Exception e) 
	{
		System.out.println("Exception caught :" + e.getMessage());
	}		
		
	}
	
	public void ClickOnClose() 
	{
		try 
		{
		driver.findElement(Close).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    }
	catch (Exception e) 
	{
		System.out.println("Exception caught :" + e.getMessage());
	}		
		
	}
	
	public void ClickOnLogout() 
	{
		try 
		{
		driver.findElement(Logout).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    }
	catch (Exception e) 
	{
		System.out.println("Exception caught :" + e.getMessage());
	}		
		
	}
		
}
