package BroweserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenFirefoxBroweser3 {

	public static void main(String[] args) {
		String driverpath1=".\\executable\\chromedriver.exe";
		String driverpath2=".\\executable\\geckodriver.exe";
		openbroweser(driverpath1,"Chrome");
		openbroweser(driverpath2,"Firefox");
	}
	 static void openbroweser(String driverpath1,String Browsername) {
		
		if(Browsername=="Chrome") {
			System.setProperty("webdriver.chrome.driver", driverpath1);
			
			WebDriver driver= new ChromeDriver();

		}
		else if(Browsername=="Firefox") {
			System.setProperty("webdriver.gecko.driver", driverpath1);
			
			WebDriver driver= new FirefoxDriver();

		}
	}
	

}
