package SeleniumAssignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTrainDetails {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://etrain.info/current-booking");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);

		WebElement Inputfield=driver.findElement(By.id("cbafi1"));
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Inputfield));
		Inputfield.sendKeys("Pune");
		
		driver.findElement(By.cssSelector("#suggest_row1")).click();
		driver.findElement(By.id("cbafi2")).sendKeys("LTT");
		driver.findElement(By.cssSelector("#suggest_row1")).click();

	WebElement bookingbtn= 	driver.findElement(By.id("cbasbmtbtn"));
	WebDriverWait wait1=new WebDriverWait(driver, 30);
	wait1.until(ExpectedConditions.elementToBeClickable(bookingbtn));
	bookingbtn.click();
	

		List<WebElement> NameTrain = driver.findElements(By.cssSelector("tr[class='udborder lrborder']>td>span"));

		System.out.println("Number of Train: " + NameTrain.size());
		for (int i = 0; i < NameTrain.size(); i++) {
			System.out.println("Name of Traines: " + NameTrain.get(i).getText());

			List<WebElement> DepartureTime = driver
					.findElements(By.cssSelector("tr[class='udborder lrborder']>td:nth-child(2)"));
			System.out.println("Departure Time: " + DepartureTime.get(i).getText());
		
			List<WebElement> ArrivelTime = driver
					.findElements(By.cssSelector("tr[class='udborder lrborder']>td:nth-child(3)"));
			System.out.println("Arrivel Time: " + ArrivelTime.get(i).getText());

			
			System.out.println("***********************************************************");


		}

	}

}
