package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.SeleniumUtility;

public class FlipkartMenuBytestNG {
	 @Test
	  public void FlipkartMenu() throws InterruptedException {
		  SeleniumUtility s1=new SeleniumUtility();
			WebDriver driver=s1.Setup("Chrome", "https://www.flipkart.com/");
			//driver.get("https://www.flipkart.com/");
			
			List<WebElement> Mainmenu=driver.findElements(By.xpath("//div[@class='xtXmba']"));
			System.out.println("size of menu: "+Mainmenu.size());
			Actions act=new Actions(driver);
			WebElement popup=driver.findElement(By.xpath("//body"));
			popup.sendKeys(Keys.ESCAPE);
			for(int i=0;i<Mainmenu.size();i++) {
				WebElement option= Mainmenu.get(i);
				System.out.println("Mainmenu names: "+Mainmenu.get(i).getText());
				act.moveToElement(option).perform();
				Thread.sleep(1000);
			}

}
}
