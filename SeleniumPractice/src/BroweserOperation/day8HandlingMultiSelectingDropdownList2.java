package BroweserOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day8HandlingMultiSelectingDropdownList2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./executable/chromedriver.exe");
		//creating an object of chromedriver class and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter required application url
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		
		WebElement CarsDropdown=driver.findElement(By.id("cars"));
		
		Select s1= new Select(CarsDropdown);
		
		System.out.println("Is dropdown multiselected : "+s1.isMultiple());
		
		List<WebElement> Option=s1.getOptions();
		
		System.out.println("Cpount of the Options: "+Option.size());

		for(int i=0;i<Option.size();i++) {
			System.out.println("Option "+i+": "+Option.get(i).getText());
		}
		
		s1.selectByIndex(0);
		s1.selectByValue("saab");
		s1.selectByVisibleText("Audi");
		
		List<WebElement> selectedoption=s1.getAllSelectedOptions();
		
		System.out.println("count of selected options: "+selectedoption.size());
		
		for(int i=0;i<selectedoption.size();i++) {
			System.out.println("selectedoptions "+i+":  "+selectedoption.get(i).getText());
		}
		
		s1.deselectAll();
		
		
		driver.close();

		
		
		
		
		
		
	}

}
