package SeleniumAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GsmarenaPagination1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gsmarena.com/");
		
		String ActualUrl=driver.getCurrentUrl();
		
		if(ActualUrl.equals("https://www.gsmarena.com/")) {
			System.out.println(" Page Open Successfully..... ");
		}else {
			System.out.println("Page not Open successfully.....");
		}
		
		driver.findElement(By.cssSelector("a[href=\"realme-phones-118.php\"]")).click();
		
		int paginationsize=driver.findElements(By.cssSelector("div.nav-pages>a")).size();
		System.out.println("Pagination size: "+paginationsize);
		
		WebElement page=driver.findElement(By.cssSelector("div.nav-pages>strong"));
		System.out.println("Page: "+page.getText());
		System.out.println(driver.getCurrentUrl());
		
		for (int i = 1; i<=paginationsize; i=i+1) {

			String paginationSelector = "div.nav-pages>a:nth-of-type("+i+")";
			WebElement opt = driver.findElement(By.cssSelector(paginationSelector));
			
			System.out.println("Page: "+opt.getText());
			opt.click();
			System.out.println(driver.getCurrentUrl());
			
		
	}
		
		

		
	}
}
