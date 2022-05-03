package BroweserOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCatagoriesWithFindElements {
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

		driver.get("https://www.demoblaze.com/");

		List<WebElement> categories = driver.findElements(By.cssSelector(".list-group>a"));
		System.out.println("Option count is: " + categories.size());
		//Creating expected result List
		List<String> l1=new ArrayList<String>();
		l1.add("CATEGORIES");
		l1.add("Phones");
		l1.add("Laptops");
		l1.add("Monitors");
		//Logic to get one by one element from the list and performing validation on that
		for (int i = 0; i < categories.size(); i++) {
			WebElement cat = categories.get(i);
			System.out.println("********* Element of List is: " + cat.getText() + "*********");
			System.out.println(cat.isDisplayed());
			System.out.println(cat.isEnabled());
			System.out.println(cat.getText().equals(l1.get(i)));
			
		}
         List<WebElement> MobileCatagoris=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a" ));
         System.out.println("the mobile phone count: "+MobileCatagoris.size());
         for (int i = 0; i < MobileCatagoris.size(); i++) {
 			WebElement cat = MobileCatagoris.get(i);
 			System.out.println("********* Element of List is: " + cat.getText() + "*********");
 			//System.out.println(cat.isDisplayed());
 			//System.out.println(cat.isEnabled());
 			//System.out.println(MobileCatagoris.getText().equals(l1.get(i)));
 			//System.out.println();
 			
 		
 		}

         
         
         
		//System.out.println(MobileCatagoris.get(0));

		
}
	}

