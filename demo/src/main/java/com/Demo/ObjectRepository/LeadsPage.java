package com.Demo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {

	//Declaration
	@FindBy(xpath="//img[@title='Create Lead...']") private WebElement createLeadBtn;
	
	//Initialization
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getcreateLeadBtn() {
		return createLeadBtn;
	}
	
	public void setcreateLeadBtn() {
		createLeadBtn.click();
	}
}
