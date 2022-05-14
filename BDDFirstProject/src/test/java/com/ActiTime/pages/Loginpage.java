/**
 * 
 */
package com.ActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

/**
 * @author HP
 *
 */
public class Loginpage extends SeleniumUtility{
	WebDriver driver;
	 static String username;
	 static String password;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="username")
	WebElement usernameInputField;
	
	@FindBy (name="pwd")
	WebElement passwordInputField;
	
	@FindBy (id="loginButton")
	WebElement LoginButton;

	public WebElement getUsernameInputField() {
		return usernameInputField;
	}

	public WebElement getPasswordInputField() {
		return passwordInputField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	public void login(String username,String password) {
		typeInput(usernameInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(LoginButton);
		
	}
	

}
