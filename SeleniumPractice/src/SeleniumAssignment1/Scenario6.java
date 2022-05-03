package SeleniumAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario6 {

	public static void main(String[] args) {
		String driverpath = ".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String PageTitle = driver.getTitle();

		System.out.println("Page Title: " + PageTitle);
		System.out.println("page title lenght: " + PageTitle.length());

		String SourceCode = driver.getPageSource();

		System.out.println(SourceCode.length());

		String actualURL = driver.getCurrentUrl();
		System.out.println("Actual URL: " + actualURL);
		String ExpectedURL = "https://demo.vtiger.com/vtigercrm/index.php";
		if (actualURL.equals(ExpectedURL)) {
			System.out.println("Login page opened sucessfully...");
		} else {
			System.out.println("Either login page not opened or page title got changed");
		}

		WebElement UserNameInputField = driver.findElement(By.id("username"));
		UserNameInputField.clear();

		UserNameInputField.sendKeys("admin");

		WebElement PwdInputField = driver.findElement(By.name("password"));
		PwdInputField.clear();
		PwdInputField.sendKeys("Test@123");

		WebElement SignINButton = driver.findElement(By.tagName("button"));

		SignINButton.click();
		
		driver.close();

	}

}
