package SeleniumAssignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameOfSumsungMobGSMarena1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./executable/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/");

		String ActualhomePage = driver.getTitle();
		System.out.println("ActualhomePage: " + ActualhomePage);

		String ExpectedhomePage = "GSMArena.com - mobile phone reviews, news, specifications and more...";

		if (ActualhomePage.equals(ExpectedhomePage)) {
			System.out.println("Open page successfully or page Title Verified");
		} else {
			System.out.println("Not Open page successfully or page Title Not Verified");
		}


		
		WebElement sumsung=driver.findElement(By.cssSelector("a[href=\"samsung-phones-9.php\"]"));
		sumsung.click();

		List<WebElement> MobileList=driver.findElements(By.cssSelector("div[class=\"makers\"]>ul>li>a>strong>span"));
     	
		System.out.println("Count of Main menu List: "+MobileList.size());
		
		for(int i=0;i<MobileList.size();i++) {
			WebElement MobileNames=MobileList.get(i);
			System.out.println("Option "+i+": "+MobileNames.getText());
		}

	}

}
