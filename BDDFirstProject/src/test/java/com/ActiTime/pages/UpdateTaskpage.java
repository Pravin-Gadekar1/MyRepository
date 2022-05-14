package com.ActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class UpdateTaskpage extends SeleniumUtility {

	public UpdateTaskpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "container_tasks")
	private WebElement TaskButton;

	@FindBy(xpath = "//*[@id='taskListBlock']/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr[3]/td[3]/div/div/div/div[3]")
	private WebElement newBt;

	@FindBy(xpath = "//*[@id='taskListBlock']/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div/div[2]/div[1]/div[3]/div[4]/div/div[3]")
	private WebElement slectStatus;

	@FindBy(xpath = "//*[@id='taskListBlock']/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr[2]/td[5]/div/div/div")
	private WebElement Hours;

	@FindBy(xpath = "//*[@id='taskListBlock']/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr[3]/td[5]/div/div/div")
	private WebElement addHour;

	@FindBy(xpath = "//*[@id='ext-gen134']/span[2]")
	private WebElement DeadlineBt;

	@FindBy(xpath = "//*[@id='ext-gen64']/tbody/tr[2]/td/table/tbody/tr[4]/td[5]/a/em/span")
	private WebElement date;

	public void UpdateTask(String duration) {
		clickOnElement(TaskButton);
		clickOnElement(newBt);
		clickOnElement(slectStatus);
		clickOnElement(Hours);
		setSleepTime(1000);
		typeInput(addHour, duration);
		clickOnElement(DeadlineBt);
		clickOnElement(date);

	}

}
