package stepDef;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.ActiTime.pages.HomePage;
import com.ActiTime.pages.Loginpage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.SeleniumUtility;

public class TestActitimeWithOutline extends SeleniumUtility {
	WebDriver driver;
	Loginpage getloginpage = null;
	HomePage gethomepage = null;
	String username, password;

	@Given("^Uese already having Apllication Url$")
	public void uese_already_having_apllication_url() {
		driver = setUp("chrome", "https://demo.actitime.com/");
		getloginpage = new Loginpage(driver);
		gethomepage = new HomePage(driver);
	}

	@Given("^User already having Application Url as (.+)$")
	public void user_already_having_application_url_as(String url) {
		driver = setUp("chrome", url);
	}

	@When("^User enter Username and password and  Clicks on Login button$")
	public void user_enter_username_and_password_and_clicks_on_login_button() {
		
		//getloginpage.login(username,password);

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}

	@When("^user enters username and password and click on login button$")
	public void user_enters_username_and_password_and_click_on_login_button() {
		//getloginpage.login(username,password);

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

	}

	@Then("^ActiTime Homepage should be Displayed$")
	public void actitime_homepage_should_be_displayed() throws InterruptedException {
		String actualHomePageTitle = gethomepage.getHomePageTitle();
		Assert.assertEquals(actualHomePageTitle, "actiTIME - Enter Time-Track",
				"Either page title got changed or login was failed");
//		Thread.sleep(2000);
//		assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track",
//				"Either login is not successful or page not loaded");
	}

	@Then("^Actitime home page will be displayed with application  page title as (.+)$")
	public void actitime_home_page_will_be_displayed_with_application_page_title_as(String title)
			throws InterruptedException {
		Thread.sleep(2000);
		assertEquals(driver.getTitle(), title, "Either login is not successful or page not loaded");
	}

	@And("^Also having Username and Password$")
	public void also_having_username_and_password() {
		username = "admin";
		password = "manager";
	}

	@And("^Closed the browser$")
	public void closed_the_browser() {
		driver.close();
	}

	@And("^also having username as (.+) and password as (.+)$")
	public void also_having_username_as_and_password_as(String username, String password) {
		super.username = username;
		super.password = password;
	}

}
