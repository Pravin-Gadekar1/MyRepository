package BroweserOperation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBroweserOpen1 {

	public static void main(String[] args) {
		String Driverpath1=".\\executable\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", Driverpath1);
		
		FirefoxDriver Fdriver=new FirefoxDriver();
		
		

	}

}
