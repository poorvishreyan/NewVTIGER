package com.Demo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoGenericUtilities.WebDriverUtilities;

public class CreateOrganisationsPage extends WebDriverUtilities{

	
	//Declaration
	@FindBy(xpath="//input[@name='accountname']") private WebElement organisationNameTB;
	@FindBy(xpath="//img[@title='Select']") private WebElement memberOfLkpBtn;
	@FindBy(xpath="//input[@name='search_text']") private WebElement searchMemberOfLkp;
	@FindBy(xpath="//a[text()='org']") private WebElement clickMemberOfLkp;
	@FindBy(xpath="//input[@name='search']") private WebElement searchBtn;
	@FindBy(xpath="//select[@name='industry']") private WebElement industryDrpDwn;
	@FindBy(xpath="//select[@name='accounttype']") private WebElement typeDrpDwn;
	@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement saveBtn;
	
	//Initialization
	public CreateOrganisationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getorganisationNameTB() {
		return organisationNameTB;
	}
	public void setorganisationNameTB(String organisation) {
		organisationNameTB.sendKeys(organisation);
	}
	
	public WebElement getmemberOfLkpBtn() {
		return memberOfLkpBtn;
	}
	public void setmemberOfLkpBtn() {
		memberOfLkpBtn.click();
	}
	
	public void switchToWindow(WebDriver driver, String title) {
		switchTowindow(driver, title);
	}
	
	
	public WebElement getsearchMemberOfLkp() {
		return searchMemberOfLkp;
	}
	public void setsearchMemberOfLkp(String search) {
		searchMemberOfLkp.sendKeys(search);
	}
	
	public WebElement getclickMemberOfLkp() {
		return clickMemberOfLkp;
	}
	public void setclickMemberOfLkp() {
		clickMemberOfLkp.click();
	}
	
	public void setSwitchBackToWindow(WebDriver driver) {
		switchBackToMainPage(driver);
	}
	
	public WebElement getsearchBtn() {
		return searchBtn;
	}
	
	public void setsearchBtn() {
		searchBtn.click();
	}
	
	public WebElement getselectindustryDrpDwn() {
		return industryDrpDwn;
		
	}
	public void setindustryDrpDwn(String industry) {
		selectDropDown(industryDrpDwn, industry);
	}
	
	public WebElement getselectTypeDrpDwn() {
		return typeDrpDwn;
	}
	public void setselectTypeDrpDwn(String type) {
		selectDropDown(typeDrpDwn, type);
	}
	
	public WebElement getsaveBtn() {
		return saveBtn;
	}
	public void setsaveBtn() {
		saveBtn.click();
	}
}
