package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.SeleniumUtility;


public class ActiTimeLoginLogout {
	@Test
	public void LoginAndLogout() {
		String Driverpath=".\\executable\\chromedriver.exe";
		   
		   System.setProperty("webdriver.chrome.driver", Driverpath);
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		   driver.get("https://demo.actitime.com/");
		   
		   String ActualPageTitle=driver.getTitle();
		   System.out.println("Current page Title: "+ActualPageTitle);
		   System.out.println("Current page Title Lenght: "+ActualPageTitle.length());
		   
		   String ExpectedPageTitle="actiTIME - Login";
		   Assert.assertEquals(ActualPageTitle, ExpectedPageTitle);
		  
		   System.out.println("***************************************************************************");
		   driver.findElement(By.id("username")).sendKeys("admin");
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   driver.findElement(By.linkText("Login")).click();
		   WebElement LogoutButton=driver.findElement(By.id("logoutLink"));
		   
		   WebDriverWait wait= new WebDriverWait(driver, 20);
		   wait.until(ExpectedConditions.elementToBeClickable(LogoutButton));
		   LogoutButton.click();
		   driver.close();
		
	}
	
	@Test
	
	public void Validation() {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.Setup("Chrome", "https://demo.actitime.com/");
		WebElement UserNameInputField= driver.findElement(By.id("username"));
		
		Assert.assertTrue(UserNameInputField.isDisplayed(), "UserNameInputField IS not Displayed");
		Assert.assertTrue(UserNameInputField.isEnabled(), "UserNameInputField is not functional");
		Assert.assertEquals(UserNameInputField.getAttribute("Placeholder"), "Username", "Username input field placeholder name change");
		
		WebElement checkBox = driver.findElement(By.name("remember"));
		Assert.assertTrue(checkBox.isDisplayed());
		Assert.assertTrue(checkBox.isEnabled(),"Checkbox is not functional");
		Assert.assertFalse(checkBox.isSelected());

		checkBox.click();
		Assert.assertTrue(checkBox.isSelected(),"Checkbox is not functional");
	     s1.cleanup();
		
		
	}

}
