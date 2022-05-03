package SeleniumAssignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoMenuList1 {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "./executable/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();

		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		
		String ActualhomePage=driver.getTitle();
		System.out.println("ActualhomePage: "+ActualhomePage);
		String ExpectedhomePage="Live cricket scores, match schedules, latest cricket news, cricket videos";
		
		if(ActualhomePage.equals(ExpectedhomePage)) {
			System.out.println("Open page successfully or page Title Verified");
		}else {
			System.out.println("Not Open page successfully or page Title Not Verified");
		}
	
		List<WebElement> MainMenuList=driver.findElements(By.cssSelector("div[class='ds-flex ds-items-center ds-justify-between ds-flex-1']>div>div>a"));
     	
		System.out.println("Count of Main menu List: "+MainMenuList.size());
		
		for(int i=0;i<MainMenuList.size();i++) {
			WebElement option=MainMenuList.get(i);
			System.out.println("Option "+i+": "+option.getText());
		}

	
		
	
	}

}
