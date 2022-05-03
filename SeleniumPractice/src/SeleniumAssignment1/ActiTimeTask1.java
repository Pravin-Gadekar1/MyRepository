package SeleniumAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeTask1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String ActualPageTitle=driver.getTitle();
		System.out.println("Actual Page Title: "+ActualPageTitle);
		
		if(ActualPageTitle.equals("actiTIME - Login")) {
			System.out.println("Open page successfully...");
		}else {
			System.out.println("Fail to Open page..");
		}
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.cssSelector("a[class=\"content tasks\"]")).click();
		driver.findElement(By.cssSelector(".addNewButton")).click();
		driver.findElement(By.cssSelector(".createNewTasks")).click();
		
		
		
		
		
		          //click on dropdown
		
		       System.out.println("0*******************");

				driver.findElement(By.cssSelector(".selectCustomerRow>td div:nth-of-type(3)")).click();
				System.out.println("1*******************");

				
//				//select the project
				driver.findElement(By.cssSelector(".searchItemList>div:nth-of-type(4)")).click();
				System.out.println("2*******************");
//
//				//click on subproject dropdown
				driver.findElement(By.cssSelector(".projectSelector div:nth-of-type(3)")).click();
				System.out.println("3*******************");
//
//				//select the subproject
				driver.findElement(By.cssSelector(".selectProjectRow>td div>div>:nth-of-type(4)")).click();
				System.out.println("4*******************");
//
//				
//				//enter task name
//				
				driver.findElement(By.cssSelector(".nameCell.first>input")).sendKeys("Testing");
				System.out.println("5*******************");

				driver.findElement(By.cssSelector("td[class='billingTypeCell']>div:nth-of-type(2)")).click();
				driver.findElement(By.cssSelector(".typeOfWorkEditorMenu div:nth-of-type(11)>div")).click();
				
				//click on creat task
				driver.findElement(By.cssSelector(".commitButtonPlaceHolder>div>div")).click();
				 WebElement checkbox=driver.findElement(By.className("img"));

				WebDriverWait wait=new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.elementToBeClickable(checkbox));
				checkbox.click();
				
				 driver.findElement(By.cssSelector(".bulkOperationsPanel>div:nth-of-type(6)")).click();
				
				System.out.println("6*******************");

				
				
				

	}//td[class='billingTypeCell']>div:nth-of-type(2)

}
