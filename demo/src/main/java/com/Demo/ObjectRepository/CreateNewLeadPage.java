package com.Demo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoGenericUtilities.WebDriverUtilities;

/*
 * author=soumya
 */
public class CreateNewLeadPage extends WebDriverUtilities{
	
	//Declaration
	@FindBy(xpath="//select[@name='salutationtype']") private WebElement salutationDrpDwn;
	@FindBy(xpath="//input[@name='firstname']") private WebElement firstNameTB;
	@FindBy(xpath="//input[@name='lastname']") private WebElement lastNameTB;
	@FindBy(xpath="//select[@name='leadsource']") private WebElement leadSourceDrpDwn;
	@FindBy(xpath="//select[@name='industry']") private WebElement industryDrpDwn;
	@FindBy(xpath="//input[@value='T']") private WebElement assignedTo;
	@FindBy(xpath="//input[@class='crmbutton small save']") private WebElement submitBtn;
	
	//Initialization
	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization

	public WebElement getSalutationDrpDwn() {
		return salutationDrpDwn;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNAmeTB() {
		return lastNameTB;
	}

	public WebElement getLeadSourceDrpDwn() {
		return leadSourceDrpDwn;
	}

	public WebElement getIndustryDrpDwn() {
		return industryDrpDwn;
	}

	public WebElement getAssignedTo() {
		return assignedTo;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public void selectindustryDrpDwn(String industry) {
		selectDropDown(industryDrpDwn, industry);
		
	}
	public void selectleadSourceDrpDwn(String leadsource) {
		selectDropDown(leadSourceDrpDwn, leadsource);
	}
	
	
	

}
