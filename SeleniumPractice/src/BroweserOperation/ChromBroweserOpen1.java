package BroweserOperation;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromBroweserOpen1 {

	public static void main(String[] args) {
	String driverpath="E:\\javaworkspace\\SeleniumPractice\\executable\\chromedriver.exe";
//		
//		String driverpath2=System.getProperty("user.dir"+"\\executable\\chromedriver.exe");
//		
		String driverpath3=".\\executable\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverpath );
		
		ChromeDriver Cdriver=new ChromeDriver();

	}

}
