package SeleniumAssignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFacebookDropdown1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./executable/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String Actualhomepage=driver.getTitle();
		
		System.out.println("Actualhomepage: "+Actualhomepage);
		
		String ExpectedhomePage="Facebook – log in or sign up";
		
		if(Actualhomepage.equals(ExpectedhomePage)) {
			System.out.println("Open page successfully or page Title Verified");
		}else {
			System.out.println("not Open page successfully or page Title not Verified");
		}
		
		WebElement CreatNewAcc=driver.findElement(By.linkText("Create New Account"));
		
		CreatNewAcc.click();
		
		WebElement DateDropdown=driver.findElement(By.id("day"));
		
		Select selectdate=new Select(DateDropdown);
		
		System.out.println("Date dropdown is visible :"+DateDropdown.isDisplayed());
		
		System.out.println("Date dropdown is enable: "+DateDropdown.isEnabled());
		
		System.out.println("Is Date dropdown multi selected: "+selectdate.isMultiple());
		
		
		
		List<WebElement> dates=selectdate.getOptions();
		
		System.out.println("Count of dates: "+dates.size());
		
		for(int i=0;i<dates.size();i++) {
		System.out.print("date:"+dates.get(i).getText()+", ");
		}
		
		String defaultdate=selectdate.getFirstSelectedOption().getText();
		
		System.out.println("Already Selected date : "+defaultdate);
		
		selectdate.selectByIndex(5);
	      
         String UpadatedDate=selectdate.getFirstSelectedOption().getText();
 		
		System.out.println("upadated date:"+UpadatedDate);
		
		if(defaultdate.equals(UpadatedDate)) {
			System.out.println("Date is not Updated");
		}else {
			System.out.println("date is updated");
		}
		System.out.println("*****************************************************************");
		
        WebElement MonthDropdown=driver.findElement(By.id("month"));
		
		Select selectmonths=new Select(MonthDropdown);
		
		System.out.println("month dropdown is visible :"+MonthDropdown.isDisplayed());
		
		System.out.println("months dropdown is enable: "+DateDropdown.isEnabled());
		
		System.out.println("Is months dropdown multi selected: "+selectmonths.isMultiple());
		
		
		
		List<WebElement> months=selectmonths.getOptions();
		
		System.out.println("Count of month: "+months.size());
		
		for(int i=0;i<months.size();i++) {
		System.out.print("month:"+months.get(i).getText()+", ");
		}
		
		String defaultmonths=selectmonths.getFirstSelectedOption().getText();
		
		System.out.println("Already Selected month : "+defaultmonths);
		
		selectmonths.selectByIndex(5);
	      
         String Updatedmonths=selectmonths.getFirstSelectedOption().getText();
 		
		System.out.println("upadated month:"+Updatedmonths);
		
		if(defaultmonths.equals(Updatedmonths)) {
			System.out.println("month is not Updated");
		}else {
			System.out.println("month is updated");
		}
	     
System.out.println("*****************************************************************");
		
        WebElement YearDropdown=driver.findElement(By.id("year"));
		
		Select selectyear=new Select(YearDropdown);
		
		System.out.println("Year dropdown is visible :"+YearDropdown.isDisplayed());
		
		System.out.println("Year dropdown is enable: "+YearDropdown.isEnabled());
		
		System.out.println("Is Year dropdown multi selected: "+selectyear.isMultiple());
		
		
		
		List<WebElement> Year=selectyear.getOptions();
		
		System.out.println("Count of Year: "+Year.size());
		
		for(int i=0;i<Year.size();i++) {
		System.out.print("Year:"+Year.get(i).getText()+", ");
		}
		
		String defaultyear=selectyear.getFirstSelectedOption().getText();
		
		System.out.println("Already Selected Year : "+defaultyear);
		
		selectyear.selectByIndex(5);
	      
         String Updatedyear=selectyear.getFirstSelectedOption().getText();
 		
		System.out.println("upadated Year:"+Updatedyear);
		
		if(defaultyear.equals(Updatedyear)) {
			System.out.println("Year is not Updated");
		}else {
			System.out.println("Year is updated");
		}
	     

		
	      
		
		
		
		
		
		
		
	}

}
