package SeleniumAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility utility= new SeleniumUtility();
		WebDriver driver= utility.Setup("Chrome", "https://jqueryui.com/sortable/");
		
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
		//driver.switchTo().frame(frame);
		utility.SwichtoRequiredFrameUsingElement(frame);
		System.out.println("**************************************");
		Actions act=new Actions(driver);
		for (int i = 1; i <= 6; i++) {
			WebElement first = driver.findElement(By.cssSelector("ul.ui-sortable>li:nth-of-type(" + i + ")"));
			WebElement last = driver.findElement(By.cssSelector("ul.ui-sortable>li:nth-of-type(" + 6 + ")"));
			Thread.sleep(1000);
			act.dragAndDrop(last, first).build().perform();


		
		
		

	}

	}
}
