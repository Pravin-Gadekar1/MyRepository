package Stepdefinations;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ActiTime.pages.CreateTaskPage;
import com.ActiTime.pages.HomePage;
import com.ActiTime.pages.Loginpage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.SeleniumUtility;

public class ActiTaskStepDef extends SeleniumUtility {
	static WebDriver driver;
	Loginpage getLoginPage = null;
	HomePage getHomePage = null;
	CreateTaskPage getCreatTaskPage=null;
	String username, password;

    @Given("^Uese already having Apllication Url$")
    public void uese_already_having_apllication_url()  {
    	driver = setUp("chrome", "https://demo.actitime.com/user/submit_tt.do");
		getLoginPage = new Loginpage(driver);
		getHomePage = new HomePage(driver);
		getCreatTaskPage=new CreateTaskPage(driver);
    }

    @When("^User enter Username and password and  Clicks on Login button$")
    public void user_enter_username_and_password_and_clicks_on_login_button() {
    	getLoginPage.login(username,password);
       
    }

    @Then("^ActiTime Homepage should be Displayed$")
    public void actitime_homepage_should_be_displayed()  {
    	String actualHomePageTitle = getHomePage.getHomePageTitle();
		Assert.assertEquals(actualHomePageTitle, "actiTIME - Enter Time-Track",
				"Either page title got changed or login was failed");
       
    }

    @Then("^ActiTime Task will be Created$")
    public void actitime_task_will_be_created() {
    	setSleepTime(2000);
		boolean result=getCreatTaskPage.verifyTaskCreation("ATesting");
		
		Assert.assertTrue(result, "ATesting task is not created Successfully ");
    	
       
    }

    @And("^Also having Username and Password$")
    public void also_having_username_and_password()  {
    	username = "admin";
		password = "manager";
    }

    @And("^Closed the browser$")
    public void closed_the_browser()  {
        cleanUp();
    }

    @And("^user click on tasks button$")
    public void user_click_on_tasks_button()  {
    	WebElement Taskbt=getCreatTaskPage.getTaskButton();
    	clickOnElement(Taskbt);
        
    }

    @And("^uesr click on add new button and select new task option$")
    public void uesr_click_on_add_new_button_and_select_new_task_option()  {
    	WebElement addNewBt=getCreatTaskPage.getAddButton();
    	clickOnElement(addNewBt);
    	
    	WebElement SelNewTask=getCreatTaskPage.getSelectNewTask();
    	clickOnElement(SelNewTask);
    	
    	
    }

    @And("^user click on Main Project dropdown arrow and select Galaxy Corporation$")
    public void user_click_on_main_project_dropdown_arrow_and_select_galaxy_corporation()  {
    	WebElement mainDropdownBt=getCreatTaskPage.getClickMainDropdown();
    	clickOnElement(mainDropdownBt);
    	List<WebElement> seleMainProj= getCreatTaskPage.getMainDropdown();
    	for (int i = 0; i < seleMainProj.size(); i++) {
			WebElement select1 = seleMainProj.get(i);
			String textoption1 = select1.getText();
			if (textoption1.equalsIgnoreCase("Galaxy Corporation")) {
				clickOnElement(select1);
				break;
			}
		}
    }

    @And("^user click on sub Project dropdown arrow and select android prototype$")
    public void user_click_on_sub_project_dropdown_arrow_and_select_android_prototype()  {
    	WebElement subDropdownBt=getCreatTaskPage.getSubDropdown();
    	clickOnElement(subDropdownBt);
    	WebElement selSubProjName=getCreatTaskPage.getSelectSubProName();
    	clickOnElement(selSubProjName);
    }

    @And("^user enter task name as ATesting$")
    public void user_enter_task_name_as_atesting()  {
    	WebElement enterTaskName=getCreatTaskPage.getTasknameInputField();
    	typeInput(enterTaskName, "ATesting");
    }

    @And("^user select worktype as testing and click on creat task button$")
    public void user_select_worktype_as_testing_and_click_on_creat_task_button() {
    	WebElement TypeOfWork=getCreatTaskPage.getTypeOfWork();
    	clickOnElement(TypeOfWork);
    	
    	WebElement selTypeOfWork=getCreatTaskPage.getSelectWorkName();
    	clickOnElement(selTypeOfWork);
    	
    	WebElement creatTaskBt=getCreatTaskPage.getCreatTaskBt();
    	clickOnElement(creatTaskBt);

    	
    	
    }

}

