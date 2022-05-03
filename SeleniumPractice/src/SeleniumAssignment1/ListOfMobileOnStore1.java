package SeleniumAssignment1;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfMobileOnStore1 {

	public static void main(String[] args) {
		
		String Driverpath=".\\executable\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", Driverpath);
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get("https://www.demoblaze.com/");
	    driver.manage().window().maximize();
	    String ActualTitle=driver.getTitle();
	    System.out.println(ActualTitle);
	    
	   String ExpectedTitle="STORE";
	   if(ActualTitle.equals(ExpectedTitle)){
		   System.out.println("Page open suceesfully and title not change");
		   
	   }else {
		   System.out.println("Page not open suceesfully and title got change");
	   }
	   
	   List<WebElement> Catagories=driver.findElements(By.cssSelector(".list-group>a"));
	   
	   System.out.println("count of list: "+Catagories.size());
	   for(int i=0;i<Catagories.size();i++) {
		   WebElement cat=Catagories.get(i);
		   System.out.println("Element of List is: "+cat.getText());
	   }
	   
	   List<WebElement> MobilephonesName=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
	   List<String> l1= new ArrayList<String>();
	   l1.add("Samsung galaxy s6");
	   l1.add("Nokia lumia 1520");
	   l1.add("Nexus 6");
	   l1.add("Samsung galaxy s7");
	   l1.add("Iphone 6 32gb");
	   l1.add("Sony xperia z5");
	   l1.add("HTC One M9");
	   l1.add("Sony vaio i5");
	   l1.add("Sony vaio i7");
	   
	   
	   System.out.println("the mobile phones count: "+MobilephonesName.size());
	   
	   for(int i=0;i<MobilephonesName.size();i++) {
		  WebElement phones=MobilephonesName.get(i);
		 System.out.println("Name of mobile phones: "+phones.getText());
		 System.out.println(phones.isDisplayed());
		 System.out.println(phones.isEnabled());
		 System.out.println("Are elements as per requirtment?:"+phones.getText().equals(l1.get(i)));
	   }
	   
	   
	    
	    
	    

	}

}
