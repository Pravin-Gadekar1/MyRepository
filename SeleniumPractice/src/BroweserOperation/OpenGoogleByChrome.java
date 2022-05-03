package BroweserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleByChrome {

	public static void main(String[] args) {
		String driverpath1=".//executable//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ".//executable//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
		System.out.println("Source code lenght"+sourcecode.length());
		System.out.println("Current page URL: "+driver.getCurrentUrl());
		System.out.println("Current page Title:  "+driver.getTitle());
		driver.close();
		

	}

}
