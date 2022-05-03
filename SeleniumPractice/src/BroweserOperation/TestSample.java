package BroweserOperation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class TestSample {

		public static void main(String[] args) throws IOException {

			
			SeleniumUtility ul = new SeleniumUtility();
			WebDriver driver=ul.Setup("Chrome", "https://www.google.com/");
			
			System.out.println("Page URL :"+ul.getCurrentURL());
			System.out.println("Page Title :"+ul.getCurrentPageTitle());
			
			WebElement search=ul.getAllElement("name" ,"q");
			search.sendKeys("Java");
			ul.doubleClick(search);
			
			System.out.println("Current Working Directory :"+ul.getCurrentWorkingDir());
			String path = ul.getCurrentWorkingDir() + ".\\Testdata\\data.properties";
			String username=ul.getPropertyFile(ul.loadPropertyFile(path), "Username");
			System.out.println("USERNAME :"+username);
		}
	

}

