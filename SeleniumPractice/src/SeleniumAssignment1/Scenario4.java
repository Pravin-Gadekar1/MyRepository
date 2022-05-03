package SeleniumAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario4 {

	public static void main(String[] args) {
		String driverpath = ".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		ChromeDriver driver = new ChromeDriver();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
		driver.get("https://demo.actitime.com/login.do");
		
		String PageTitle = driver.getTitle();

		System.out.println("Page Title: " + PageTitle);
		System.out.println("page title lenght: " + PageTitle.length());

		String SourceCode = driver.getPageSource();

		System.out.println(SourceCode.length());

		String actualURL = driver.getCurrentUrl();
		System.out.println("Actual URL: " + actualURL);
		String ExpectedURL = "https://demo.actitime.com/login.do";
		if (actualURL.equals(ExpectedURL)) {
			System.out.println("Login page opened sucessfully...");
		} else {
			System.out.println("Either login page not opened or page title got changed");
		}

		WebElement UserNameInputField = driver.findElement(By.id("username"));

		UserNameInputField.sendKeys("admin");

		WebElement PwdInputField = driver.findElement(By.name("pwd"));

		PwdInputField.sendKeys("manager");

		WebElement LoginButton = driver.findElement(By.id("loginButton"));

		LoginButton.click();
		
		//explicit wait
		
		WebElement LogoutButton = driver.findElement(By.id("logoutLink"));
		
//		WebDriverWait wait= new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.elementToBeClickable(LogoutButton));
//
//		
//		String ActualHomePageTitle=driver.getTitle();
//		System.out.println("Actual Home Page Title: "+ActualHomePageTitle);
//		String ExpectedHomePageTitle="actiTIME - Enter Time-Track";
//		if(ActualHomePageTitle.equals(ExpectedHomePageTitle)) {
//			System.out.println("Login done succesfull and title verified ");
//		}else {
//			System.out.println("Login done not succesfull and title  change ");
//		}
//		

		LogoutButton.click();
		

	}

}
