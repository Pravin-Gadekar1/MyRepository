package SeleniumAssignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfMobileGsmarena1 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "./executable/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/");
		
		String ActualhomePage=driver.getTitle();
		System.out.println("ActualhomePage: "+ActualhomePage);
		
String ExpectedhomePage=" GSMArena.com - mobile phone reviews, news, specifications and more...";
		
		if(ActualhomePage.equals(ExpectedhomePage)) {
			System.out.println("Open page successfully or page Title Verified");
		}else {
			System.out.println("Not Open page successfully or page Title Not Verified");
		}
	
		List<WebElement> MobileList=driver.findElements(By.cssSelector("div[class=\"brandmenu-v2 light l-box clearfix\"]>ul>li>a"));
     	
		System.out.println("Count of  Mobiles  List: "+MobileList.size());
		
		for(int i=0;i<MobileList.size();i++) {
			WebElement name=MobileList.get(i);
			System.out.println("Name of mobile: "+i+": "+name.getText());
			System.out.println("Name of Mobile is Display:"+name.isDisplayed());
			System.out.println("Name of Mobile is Enable:"+name.isEnabled());
			System.out.println("Name of Mobile is clicable :"+name.isSelected());
			System.out.println("*****************************************************************");
		}

		driver.close();
	
		
	
	}

}
