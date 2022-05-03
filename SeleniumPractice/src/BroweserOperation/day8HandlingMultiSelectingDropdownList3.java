package BroweserOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day8HandlingMultiSelectingDropdownList3 {

	public static void main(String[] args) {

		String Driverpath=".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Driverpath );
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		//**** Idetify dropdown list
		WebElement CarsDropdown=driver.findElement(By.id("multiselect1"));
		//**** Create an instance of Select class and pass above element into its constructor

		Select SelectCars=new Select(CarsDropdown);
		
		//**** check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option: "+SelectCars.isMultiple());
		//**** get default or already select option
		
		//WebElement SelectedOption=SelectSkills.getFirstSelectedOption();
		//String  SelectedOptionName=SelectedOption.getText();
		
		//System.out.println("Already Selected Option Name: "+SelectCars.getFirstSelectedOption().getText());
		//get option count 
		List<WebElement> Option=SelectCars.getOptions();
		System.out.println("Count of options : "+Option.size());
		
		//Get dropdown option names

		for(int i=0;i<Option.size();i++) {
			System.out.println("Options "+i+Option.get(i).getText());
		}
		
		//select options from dropdown

		SelectCars.selectByIndex(0);
		SelectCars.selectByValue("swiftx");
		SelectCars.selectByVisibleText("Audi");
		
		//unselect already select options

		SelectCars.deselectByIndex(0);
		SelectCars.deselectByValue("swiftx");
		SelectCars.deselectByVisibleText("Audi");
		
		driver.close();
		
		

		
		
		
		
		
		
	}

}
