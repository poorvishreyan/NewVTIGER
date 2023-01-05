package com.Demo.testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Demo.ObjectRepository.CreateNewLeadPage;
import com.Demo.ObjectRepository.HomePage;
import com.Demo.ObjectRepository.LeadsPage;
import com.Demo.ObjectRepository.LoginPage;
import com.DemoGenericUtilities.BaseClass;
import com.DemoGenericUtilities.ExcelUtility;
import com.DemoGenericUtilities.FileUtility;

@Listeners(com.DemoGenericUtilities.ITestListnerImplementation.class)
public class CreateLeadTest extends BaseClass {

	@Test(priority=1)
	
	public void createLead() {
		ExcelUtility eLib = new ExcelUtility();
		String industry = eLib.getDataFromExcel("Organisations", 4, 3);
		String leadSource = eLib.getDataFromExcel("Organisations", 5, 5);
		
		HomePage hp = new HomePage(driver);
		hp.setleadsLink();
		
		LeadsPage lp = new LeadsPage(driver);
		lp.setcreateLeadBtn();
		
		CreateNewLeadPage clp = new CreateNewLeadPage(driver);
		clp.getFirstNameTB().sendKeys("Shreyu");
		clp.getLastNAmeTB().sendKeys("shre");
		clp.selectindustryDrpDwn(industry);
		clp.selectleadSourceDrpDwn(leadSource);
		clp.getSubmitBtn().click();
		
		
		
		
		
		
		
	}
		

	

}
