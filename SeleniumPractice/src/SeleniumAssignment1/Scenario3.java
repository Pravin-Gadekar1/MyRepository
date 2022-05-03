package SeleniumAssignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
		String driverpath3 = ".\\executable\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath3);

		ChromeDriver Cdriver = new ChromeDriver();
		Cdriver.get("https://www.google.com/");
		System.out.println("Source code of current page "+Cdriver.getPageSource());
		
		System.out.println("********************************************************************");
		System.out.println("Current page URL: "+Cdriver.getCurrentUrl());

		
		
		Cdriver.close();

	}

}
