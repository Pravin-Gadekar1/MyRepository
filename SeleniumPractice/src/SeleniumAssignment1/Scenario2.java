package SeleniumAssignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) {
		String driverpath3 = ".\\executable\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath3);

		ChromeDriver Cdriver = new ChromeDriver();
		Cdriver.get("https://www.facebook.com/");

		String ExpectedTitle = "Facebook – log in or sign up";

		String Actualtitle = Cdriver.getTitle();
		
		System.out.println(ExpectedTitle.equals(Actualtitle));

//		if (ExpectedTitle == Actualtitle) {
//
//			System.out.println(Actualtitle);
//
//		}else {
//			System.out.println("Title not match");
//		}
		
		System.out.println("Actual Title:" +Actualtitle);

		Cdriver.close();

	}

}
