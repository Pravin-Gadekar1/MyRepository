package com.ActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class DeleteTaskPage extends SeleniumUtility{
	
	public DeleteTaskPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="container_tasks")
	private WebElement TaskButton;
	
	@FindBy (css=".taskRowsTableContainer > table > tbody > tr:nth-child(3)>td>div>div")
	private WebElement checkBox;

	@FindBy (css=".bulkOperationsPanel>div:nth-of-type(6)")
	private WebElement DeleteBt;
	
	@FindBy (xpath="//*[@id=\"taskManagementPage\"]/div[2]/div[2]/div[1]/div[1]/div/div[5]/div[1]/div")
	private WebElement PermDeleteBt;


     public void NewTaskDelete() {
    	 clickOnElement(TaskButton);
    	 clickOnElement(checkBox);
    	 setSleepTime(1000);
    	 clickOnElement(DeleteBt);

    	 clickOnElement(PermDeleteBt);

     }
}