package BroweserOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations2 {

	public static void main(String[] args) throws InterruptedException {
		
		String DriverPath=".\\executable\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", DriverPath);
		
		WebDriver driver= new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(500,700));
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);

		driver.navigate().refresh();
		Thread.sleep(5000);

		driver.navigate().to("https:www.amazon.com/");
		Thread.sleep(5000);


		
		driver.close();
		

	}

}
