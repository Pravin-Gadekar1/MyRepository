package SeleniumAssignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		String driverpath=".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String PageTitle=driver.getTitle();
		
		System.out.println("Page Title: "+PageTitle);
		System.out.println("page title lenght: "+PageTitle.length());
		
		String SourceCode=driver.getPageSource();
		
		System.out.println(SourceCode.length());
		
		String actualURL=driver.getCurrentUrl();
		System.out.println("Actual URL: "+actualURL);
		String ExpectedURL="https://demo.actitime.com/login.do";
		if(actualURL.equals(ExpectedURL)) {
			System.out.println("Login page opened sucessfully..."); 
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		
		
		driver.close();
		
		
		
			

	}

}
