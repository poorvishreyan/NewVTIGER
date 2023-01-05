package com.Demo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		//Declaration
		@FindBy(xpath="//input[@name='user_name']") private WebElement userName;
		@FindBy(xpath="//input[@name='user_password']") private WebElement password;
		@FindBy(xpath="//input[@id='submitButton']") private WebElement loginBtn;
		
		//Initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		
		public WebElement getuserName() {
			return userName;
		}
		
		public WebElement getpassword() {
			return userName;
		}
		public WebElement getloginBtn() {
			return userName;
		}
		
		public void setLogin(String username, String passwordTB) {
			userName.sendKeys(username);
			password.sendKeys(passwordTB);
			loginBtn.click();
			
		}
	
	}


