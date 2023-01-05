package com.Demo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {
	
	//Declaration
	@FindBy(xpath="//img[@title='Create Opportunity...']") private WebElement createOpportunitiesLkup;
	
	//Initialization
	public void opportunities(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getcreateOpportunitiesLkup() {
		return createOpportunitiesLkup;
	}
	public void setcreateOpportunitiesLkup() {
		createOpportunitiesLkup.click();
	}

	
}
