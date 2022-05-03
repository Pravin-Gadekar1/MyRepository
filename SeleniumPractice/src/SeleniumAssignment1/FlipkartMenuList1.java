package SeleniumAssignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMenuList1 {



		public static void main(String[] args) {
			
			String Driverpath=".\\executable\\chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver", Driverpath);
		    WebDriver driver=new ChromeDriver();
		    
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    driver.get("https://www.flipkart.com/");
		    driver.manage().window().maximize();
		    String ActualTitle=driver.getTitle();
		    System.out.println(ActualTitle);
		    
		   String ExpectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		   if(ActualTitle.equals(ExpectedTitle)){
			   System.out.println("Page open suceesfully and title not change");
			   
		   }else {
			   System.out.println("Page not open suceesfully and title got change");
		   }
		   
		   List<WebElement> Catagories=driver.findElements(By.cssSelector("._37M3Pb>div>a>div>div>img"));
		   
		   System.out.println("count of list: "+Catagories.size());
		   for(int i=0;i<Catagories.size();i++) {
			   WebElement cat=Catagories.get(i);
			   System.out.println("Element of List is: "+cat.getAttribute("alt"));
    
	}
		}
}
