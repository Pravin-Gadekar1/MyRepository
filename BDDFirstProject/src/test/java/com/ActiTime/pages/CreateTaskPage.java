package com.ActiTime.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class CreateTaskPage extends SeleniumUtility {

	public CreateTaskPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	

	public WebElement getTaskButton() {
		return TaskButton;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getSelectNewTask() {
		return SelectNewTask;
	}

	public WebElement getClickMainDropdown() {
		return clickMainDropdown;
	}

	public List<WebElement> getMainDropdown() {
		return  MainDropdown;
	}

	public WebElement getSelectProName() {
		return SelectProName;
	}

	public WebElement getSubDropdown() {
		return subDropdown;
	}

	public WebElement getSelectSubProName() {
		return selectSubProName;
	}

	public WebElement getTasknameInputField() {
		return TasknameInputField;
	}

	public WebElement getTypeOfWork() {
		return TypeOfWork;
	}

	public WebElement getSelectWorkName() {
		return SelectWorkName;
	}

	public WebElement getCreatTaskBt() {
		return CreatTaskBt;
	}

	public List<WebElement> getTasklist() {
		return Tasklist;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getDeleteBt() {
		return DeleteBt;
	}

	public WebElement getPermDeleteBt() {
		return PermDeleteBt;
	}

	public WebElement getNewBt() {
		return newBt;
	}

	public WebElement getSlectStatus() {
		return slectStatus;
	}

	public WebElement getHours() {
		return Hours;
	}

	public WebElement getSetDeadlineBt() {
		return setDeadlineBt;
	}

	public WebElement getSelectDate() {
		return selectDate;
	}
	
	@FindBy(id = "container_tasks")
	private WebElement TaskButton;

	@FindBy(css = ".addNewButton")
	private WebElement addButton;

	@FindBy(css = ".createNewTasks")
	private WebElement SelectNewTask;

	@FindBy(css = ".selectCustomerRow>td div:nth-of-type(3)")
	private WebElement clickMainDropdown;

	@FindBy(css = ".scrollableDropdownView>div>div>div>div")
	private List<WebElement> MainDropdown;

	@FindBy(css = ".searchItemList>div:nth-of-type(5)")
	private WebElement SelectProName;

	@FindBy(css = ".projectSelector div:nth-of-type(3)")
	private WebElement subDropdown;

	@FindBy(css = ".selectProjectRow>td div>div>:nth-of-type(4)")
	private WebElement selectSubProName;

	@FindBy(css = ".nameCell.first>input")
	private WebElement TasknameInputField;

	@FindBy(css = "td[class='billingTypeCell']>div:nth-of-type(2)")
	private WebElement TypeOfWork;

	@FindBy(css = ".typeOfWorkEditorMenu div:nth-of-type(11)>div")
	private WebElement SelectWorkName;

	@FindBy(css = ".commitButtonPlaceHolder>div>div")
	private WebElement CreatTaskBt;

	@FindBy(css = ".createdTasksRowsTable>tbody>tr>td")
	private List<WebElement> Tasklist;

	/*
	 * Deletion task elements
	 */

	@FindBy(xpath = "//tr[td[div[div[div[div[@title='ATesting']]]]]]/td[1]/div/div")
	private WebElement checkBox;

	@FindBy(css = ".bulkOperationsPanel>div:nth-of-type(6)")
	private WebElement DeleteBt;

	@FindBy(xpath = "//*[@id=\"taskManagementPage\"]/div[2]/div[2]/div[1]/div[1]/div/div[5]/div[1]/div")
	private WebElement PermDeleteBt;

	/*
	 * updation task element
	 */

	@FindBy(xpath = "//tr[td[div[div[div[div[@title='ATesting']]]]]]/td[3]/div/div")
	private WebElement newBt;
	
	@FindBy(xpath = "//*[@id='taskListBlock']/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div/div[2]/div[1]/div[3]/div[4]/div/div[3]")
	private WebElement slectStatus;


	@FindBy(xpath = "//tr[td[div[div[div[div[@title='ATesting']]]]]]/td[5]")
	private WebElement Hours;
	
//	@FindBy (xpath="//tr[td[div[div[div[div[@title='ATesting']]]]]]/td[5]/div/div/div")
//	private WebElement EntHr;

	@FindBy(xpath = "//tr[td[div[div[div[div[@title='ATesting']]]]]]/td[7]")
	private WebElement setDeadlineBt;

	@FindBy(xpath = "//tr[td[div[div[div[div[@title='ATesting']]]]]]/td[7]/div[3]/ul/li/div/table/tbody/tr[2]/td/table/tbody/tr[4]/td[4]")
	private WebElement selectDate;

	public void CreatNewTask(String taksname) {
		clickOnElement(TaskButton);
		clickOnElement(addButton);
		clickOnElement(SelectNewTask);
		clickOnElement(clickMainDropdown);

		for (int i = 0; i < MainDropdown.size(); i++) {
			WebElement select1 = MainDropdown.get(i);
			String textoption1 = select1.getText();
			if (textoption1.equalsIgnoreCase("Galaxy Corporation")) {
				clickOnElement(select1);
				break;
			}
		}

		clickOnElement(subDropdown);
		clickOnElement(selectSubProName);
		setSleepTime(1000);
		typeInput(TasknameInputField, taksname);
		clickOnElement(TypeOfWork);
		clickOnElement(SelectWorkName);
		clickOnElement(CreatTaskBt);
	}
	

	public boolean verifyTaskCreation(String taskName) {
		for (int i = 0; i < Tasklist.size(); i++) {
			WebElement select = Tasklist.get(i);
			String textoption2 = select.getText();
			if (textoption2.equalsIgnoreCase(taskName)) {
				//String result=("Yes,  Testing task is created successfully ");
				return true;
			}

		}
		return false;
	}
	
	public void UpdateTask(String duration) {
		clickOnElement(TaskButton);
		clickOnElement(newBt);
		setSleepTime(2000);
		clickOnElement(slectStatus);
		setSleepTime(2000);
		//clickOnElement(Hours);
		
		setSleepTime(1000);
	//	typeInput(EntHr, duration);
		clickOnElement(setDeadlineBt);
		clickOnElement(selectDate);

	}


	public void NewTaskDelete() {
		clickOnElement(TaskButton);
		clickOnElement(checkBox);
		setSleepTime(1000);
		clickOnElement(DeleteBt);

		clickOnElement(PermDeleteBt);

	}
}