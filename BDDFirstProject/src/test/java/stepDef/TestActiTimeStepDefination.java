package stepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.ActiTime.pages.HomePage;
import com.ActiTime.pages.Loginpage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.SeleniumUtility;

public class TestActiTimeStepDefination extends SeleniumUtility {
	static WebDriver driver;
	Loginpage getLoginPage = null;
	HomePage getHomePage = null;
	String username, password;

	@Given("^User Already having Aplication Url$")
	public void user_already_having_aplication_url() {
		driver = setUp("chrome", "https://demo.actitime.com/user/submit_tt.do");
		getLoginPage = new Loginpage(driver);
		getHomePage = new HomePage(driver);

	}

	@When("^User Enter Username and Password and click on login button$")
	public void user_enter_username_and_password_and_click_on_login_button() {
		getLoginPage.login(username,password);
	}

	@Then("^Actitime home page should be Display$")
	public void actitime_home_page_should_be_display() {
		String actualHomePageTitle = getHomePage.getHomePageTitle();
		Assert.assertEquals(actualHomePageTitle, "actiTIME - Enter Time-Track",
				"Either page title got changed or login was failed");
	}

	@And("^Also having Uesrname and Password$")
	public void also_having_uesrname_and_password() {
		username = "admin";
		password = "manager";
	}

	@And("^close the browser$")
	public void close_the_browser() {
		getHomePage.logoutFromApp();
		cleanUp();
	}

}
