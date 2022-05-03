package BroweserOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginLogout1 {

	public static void main(String[] args) {
	   String Driverpath=".\\executable\\chromedriver.exe";
	   
	   System.setProperty("webdriver.chrome.driver", Driverpath);
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	   driver.get("https://demo.actitime.com/");
	   
	   String ActualPageTitle=driver.getTitle();
	   System.out.println("Current page Title: "+ActualPageTitle);
	   System.out.println("Current page Title Lenght: "+ActualPageTitle.length());
	   
	   String ExpectedPageTitle="actiTIME - Login";
	   if(ActualPageTitle.equals(ExpectedPageTitle)) {
		   System.out.println("Login done succesfull or page title verified ");
	   }else {
		   System.out.println("Either login faild or page title got change ");
	   }
	   System.out.println("***************************************************************************");
	   driver.findElement(By.id("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	   driver.findElement(By.linkText("Login")).click();
	   
	   
	   WebElement LogoutButton=driver.findElement(By.id("logoutLink"));
	   
	   WebDriverWait wait= new WebDriverWait(driver, 20);
	   wait.until(ExpectedConditions.elementToBeClickable(LogoutButton));
	   
	   String ActualhomePageTitle=driver.getTitle();
	   System.out.println("Current page Title: "+ActualhomePageTitle);
	   System.out.println("Current page Title Lenght: "+ActualhomePageTitle.length());
	   
	   
	   String ExpectedHomePageTitle="actiTIME - Enter Time-Track";
	   if(ActualhomePageTitle.equals(ExpectedHomePageTitle)) {
		   System.out.println("Login done succesfull or page title verified ");
	   }else {
		   System.out.println("Either login faild or page title got change ");
	   }
	   
	   LogoutButton.click();
	   driver.close();
	   
	}

}
