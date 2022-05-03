package BroweserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChromeBroweser1 {

	public static void main(String[] args) {
		
		String driverpath1=".\\executable\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath1);
		
		WebDriver driver= new ChromeDriver();

	}

}
