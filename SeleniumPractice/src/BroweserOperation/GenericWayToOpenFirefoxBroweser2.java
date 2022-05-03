package BroweserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenFirefoxBroweser2 {

	public static void main(String[] args) {
		String driverpath1=".\\executable\\chromedriver.exe";
		String driverpath2=".\\executable\\geckodriver.exe";
		openbroweser(driverpath1,"chrome");
		openbroweser(driverpath2,"firefox");
	}
	 static void openbroweser(String driverpath1,String Browsername) {
		
		if(Browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", driverpath1);
			
			WebDriver driver= new ChromeDriver();

		}
		else if(Browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", driverpath1);
			
			WebDriver driver= new FirefoxDriver();

		}
	}
	

}
