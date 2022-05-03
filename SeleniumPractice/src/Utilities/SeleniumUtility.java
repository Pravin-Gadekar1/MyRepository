package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	public String getCurrentPageTitle() {
		return driver.getTitle();
	}
	public String getCurrentWorkingDir() {
		String path=System.getProperty("user.dir");
		return path;
	}
	public FileInputStream loadPropertyFile(String path) throws IOException {
		
		FileInputStream fis=new FileInputStream(path);
		return fis;
	}
	public String getPropertyFile(FileInputStream fis, String filename) throws IOException {
		
		Properties prop=new Properties();
		prop.load(fis);
		String getData=prop.getProperty(filename);
		return getData;
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
	
		
	
	public void SwitchtoRequiredFrameUsingName(String name) {
		driver.switchTo().frame(name);
	}
	public void SwitchtoRequiredFrameUsingElement(WebElement element) {
		driver.switchTo().frame(element);
		
	}
	public void SwitchtoRequiredFrameUsingIndex(int index) {
		driver.switchTo().frame(index);
		
	}
	
	public void SwitchControlBackToMainpage() {
		driver.switchTo().defaultContent();
	}
	public WebElement GetActiveElement() {
		return driver.switchTo().activeElement();
	}
	public WebElement getAllElement(String locatortype,String locatorValue ){
		switch (locatortype){
		case "name":
			return 
			driver.findElement(By.name(locatorValue));
			
		case "id":
			return 
			driver.findElement(By.id(locatorValue));
		case "className":
			return
			driver.findElement(By.className(locatorValue));
		case "linkText":
			return
			driver.findElement(By.linkText(locatorValue));
		case "partialLinkText":
			return
			driver.findElement(By.partialLinkText(locatorValue));
		case "tagName":
			return
			driver.findElement(By.tagName(locatorValue));
		case "cssSelector":
			return
			driver.findElement(By.cssSelector(locatorValue));
		case "xpath":
			return
			driver.findElement(By.xpath(locatorValue));
          
}
		return null;
	}
}
