package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {
	    WebDriver driver=null;
	    Actions action= null;

	public WebDriver Setup(String BroweserName,String AppURL) {
		if(BroweserName.equalsIgnoreCase("Chrome")) {
				
			// use setup method of WebDriverManager
			WebDriverManager.chromedriver().setup();
			
			// step2: create an instance of Chrome Browser
			 driver= new ChromeDriver();
			}else if(BroweserName.equalsIgnoreCase("IE")) {
				// use setup method of WebDriverManager
				WebDriverManager.iedriver().setup();
				
				// step2: create an instance of IE Browser
				 driver= new InternetExplorerDriver();
			}else if(BroweserName.equalsIgnoreCase("Firefox")) {
				// use setup method of WebDriverManager
				WebDriverManager.firefoxdriver().setup();
				
				// step2: create an instance of Firefox Browser
				 driver= new FirefoxDriver();

			}
		// maximize browser
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get(AppURL);
				action=new Actions(driver);
				return driver;
				
				
	}
	
	public void cleanup() {
		driver.close();
	}
	public void Rightclick(WebElement option) {
		action.moveToElement(option).contextClick().build().perform();
	}
	public void MouseHoverwithCord(WebElement option, int x, int y) {
		action.moveToElement(option, x,y).perform();
	}
	public void MouseHover(WebElement element) {
		action.moveToElement(element).perform();
	}
	public void doubleClick(WebElement element) {
		action.moveToElement(element).doubleClick().perform();
	}
	public void SwicthtoRequiredFrameUsingName(String name) {
		driver.switchTo().frame(name);
	}
	public void SwichtoRequiredFrameUsingElement(WebElement element) {
		driver.switchTo().frame(element);
		
	}
	public void SwichtoRequiredFrameUsingIndex(int index) {
		driver.switchTo().frame(index);
		
	}
}
