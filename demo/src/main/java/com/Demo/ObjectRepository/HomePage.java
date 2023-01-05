package com.Demo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Declaration
	@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']") private WebElement leadsLink;
	@FindBy(xpath="//img[@onmouseout='fnRemoveWindow();']") private WebElement createBtn;
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']") private WebElement organisationsLink;
	@FindBy(xpath="//a[text()='Contacts']") private WebElement contactsLink;
	@FindBy(xpath="//a[text()='Opportunities' and @href='index.php?module=Potentials&action=index']") private WebElement opportunitiesLink;
	
	
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getleadsLink() {
		return leadsLink;
	}
	public void setleadsLink() {
		leadsLink.click();
	}
	
	public WebElement getcreateBtn() {
		return createBtn;
	}
	public void setcreateLeadBtn() {
		createBtn.click();
	}
	
	public WebElement getOrganisationsLink() {
		return organisationsLink;
	}
	
	public void setorganisationsLink() {
		organisationsLink.click();
	}
	
	public WebElement getcontactsLink() {
		return contactsLink;
	}
	public void setcontactsLink() {
		contactsLink.click();
	}
	
	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
		
	}
	public void setopportunitiesLink() {
		opportunitiesLink.click();
	}
	
	

}
