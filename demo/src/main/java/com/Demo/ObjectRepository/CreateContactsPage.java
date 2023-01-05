package com.Demo.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateContactsPage {

	//Declaration
	@FindBy(xpath="//select[@name='salutationtype']") private WebElement salutationTypeDrpdwn;
	@FindBy(xpath="//input[@name='firstname']") private WebElement firstNameTB;
	@FindBy(xpath="//input[@name='lastname']") private WebElement lastNameTB;
	@FindBy(xpath="//select[@name='leadsource']") private WebElement leadSourceDrpDwn;
	@FindBy(xpath="//img[@id='jscal_trigger_birthday']")  private WebElement birthDate;
	
}
