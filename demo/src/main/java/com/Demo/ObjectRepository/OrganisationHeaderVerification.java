package com.Demo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationHeaderVerification {
	
	//Declaration
	@FindBy(xpath="//span[@class='dvHeaderText']") private WebElement VerifyHeader;
	
	//Initialization
	public OrganisationHeaderVerification(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getHeader() {
		return VerifyHeader;
	}

}
