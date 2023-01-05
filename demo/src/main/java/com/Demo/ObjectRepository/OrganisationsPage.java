package com.Demo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationsPage {
	
	//Declaration
	@FindBy(xpath="//img[@title='Create Organization...']") private WebElement createOrganisationBtn;
	
	//Initialization
	public OrganisationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getcreateOrganisationBtn() {
		return createOrganisationBtn;
	}
	public void setcreateOrganisationBtn() {
		createOrganisationBtn.click();
	}
}
