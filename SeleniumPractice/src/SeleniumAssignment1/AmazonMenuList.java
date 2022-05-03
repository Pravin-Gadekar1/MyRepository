package SeleniumAssignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMenuList {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		// step1: set driver executable path by using System.setProperty(String
		// key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

		
         List<WebElement> MobileCatagoris=driver.findElements(By.cssSelector("#nav-xshop>a" ));
         System.out.println("the mobile phone count: "+MobileCatagoris.size());
         List<String> l1=new ArrayList<>();
         l1.add("Best Sellers");
         l1.add("Mobiles");
         l1.add("Customer Service");
         l1.add("Today's Deals");
         l1.add("Fashion");
         l1.add("Electronics");
         l1.add("Prime");
         l1.add("New Releases");
         for (int i = 0; i < 8; i++) {
 			WebElement cat = MobileCatagoris.get(i);
 			System.out.println("********* Element of List is: " + cat.getText() + "*********");
 			System.out.println(cat.isDisplayed());
 			System.out.println("Are elements as per requirtment?: "+cat.getText().equals(l1.get(i)));
 			//System.out.println();
 			
 		
 		}

         
         
	}

}
