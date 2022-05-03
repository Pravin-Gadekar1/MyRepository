package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.SeleniumUtility;

public class FlipkartMenu2 {
	public static void main (String[]args) {
//		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.Setup("Chrome", "https://www.flipkart.com/");
		//driver.get("https://www.flipkart.com/");
		
		List<WebElement> Mainmenu=driver.findElements(By.xpath("//div[@class='xtXmba']"));
		System.out.println("size of menu: "+Mainmenu.size());
		
		for(int i=0;i<Mainmenu.size();i++) {
			System.out.println("Mainmenu names: "+Mainmenu.get(i).getText());
		}
		
		
	}


}
