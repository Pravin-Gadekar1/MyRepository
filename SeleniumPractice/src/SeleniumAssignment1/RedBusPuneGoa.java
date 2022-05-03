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

public class RedBusPuneGoa {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		
		System.out.println("***************click on bording point************************");

		driver.findElement(By.cssSelector(".autoFill>li:nth-of-type(3)")).click();
		
		System.out.println("***************click on deparcher point************************");
		
		driver.findElement(By.id("dest")).sendKeys("Goa");
		driver.findElement(By.cssSelector(".autoFill>li:nth-of-type(3)")).click();

		System.out.println("***************click on Calender************************");
		driver.findElement(By.id("onward_cal")).click();
		System.out.println("***************select date************************");
		driver.findElement(By.cssSelector(".next")).click();
		driver.findElement(By.cssSelector(".rb-monthTable>tbody>tr:nth-of-type(6)>td:nth-of-type(3)")).click();
		
		System.out.println("***************click on search************************");

		driver.findElement(By.id("search_btn")).click();
		
		System.out.println("***************click on bording time************************");

		//driver.findElement(By.cssSelector(".dept-time>li:nth-of-type(4)")).click();
//		WebElement CheckBox=driver.findElement(By.cssSelector(".dept-time>li:nth-of-type(4)>label"));
//		CheckBox.click();
//		System.out.println("checkbox is selectable: " +CheckBox.isSelected());
		
	//	WebElement CheckBox1=driver.findElement(By.cssSelector(".dept-time>li:nth-of-type(4)>input"));
//		CheckBox1.click();
	//	System.out.println("checkbox is selectable: " +CheckBox1.isSelected());
		
		WebElement CheckBox=driver.findElement(By.cssSelector(".dept-time>li:nth-of-type(4)>label"));
		WebDriverWait wait =new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(CheckBox));

		CheckBox.click();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		WebDriverWait wait1=new WebDriverWait(driver,20);
		WebElement bus=driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label"));
		wait1.until(ExpectedConditions.elementToBeClickable(bus));
		bus.click();
	
	}

}
