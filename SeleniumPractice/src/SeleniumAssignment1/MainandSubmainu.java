package SeleniumAssignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class MainandSubmainu {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.Setup("chrome", "http://demo.automationtesting.in/Register.html");
		//identify all the elements of main menu
		List<WebElement> mainMenu=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li/a"));
		System.out.println("Main Menu option count: "+mainMenu.size());
		//create an instance of Actions class by passing required browser instance to its constructor
		Actions act=new Actions(driver);
		for(int i=0;i<mainMenu.size();i++) {
			//WebElement option=mainMenu.get(i);
			System.out.println("Main menu Option: "+mainMenu.get(i).getText());
//			act.moveToElement(option).perform();
//			Thread.sleep(1000);
			List<WebElement> subMenu=driver.findElements(By.xpath("(//div[@class='navbar-collapse collapse navbar-right']/ul/li)[4]/ul/li/a"));

              WebElement option1=subMenu.get(i);
			
			System.out.println("Main menu Option: "+option1.getText());
	}
					

}
}
	
