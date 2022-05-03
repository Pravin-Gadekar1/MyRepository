package SeleniumAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vTigerLoginLogout {

	public static void main(String[] args) {
		String Driverpath = ".\\executable\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", Driverpath);

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		String ActualPageTitle = driver.getTitle();
		System.out.println("Current page Title: " + ActualPageTitle);
		System.out.println("Current page Title Lenght: " + ActualPageTitle.length());

		String ExpectedPageTitle = "vtiger";
		if (ActualPageTitle.equals(ExpectedPageTitle)) {
			System.out.println("Login done succesfull or page title verified ");
		} else {
			System.out.println("Either login faild or page title got change ");
		}
		System.out.println("***************************************************************************");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.className("userName")).click();

		WebElement SignOut = driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));

		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeSelected(SignOut));

	    wait.until(ExpectedConditions.elementToBeClickable(SignOut));

		String ActualhomePageTitle = driver.getTitle();
		System.out.println("Current page Title: " + ActualhomePageTitle);
		System.out.println("Current page Title Lenght: " + ActualhomePageTitle.length());

		String ExpectedHomePageTitle = "Dashboard";
		if (ActualhomePageTitle.equals(ExpectedHomePageTitle)) {
			System.out.println("Login done succesfull or page title verified ");
		} else {
			System.out.println("Either login faild or page title got change ");
		}

		SignOut.click();
		driver.close();

	}
}