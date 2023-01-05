package com.Demo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	//Declaration
	@FindBy(xpath="//img[@alt='Create Contact...']") private WebElement createContactsLkp;
	
	//Initialization
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getcreateContactsLkp() {
		return createContactsLkp;
	}
	public void setcreateContactsLkp() {
		createContactsLkp.click();
	}

}
