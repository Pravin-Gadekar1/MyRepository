package BroweserOperation;

import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtility;

public class OpenIEBroweser {

	public static void main(String[] args) {

		SeleniumUtility s1= new SeleniumUtility();
		WebDriver driver=s1.Setup("IE", "https://www.facebook.com/");
	}

}
