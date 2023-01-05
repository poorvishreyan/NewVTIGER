package com.Demo.testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Demo.ObjectRepository.CreateOrganisationsPage;
import com.Demo.ObjectRepository.HomePage;
import com.Demo.ObjectRepository.OrganisationHeaderVerification;
import com.Demo.ObjectRepository.OrganisationsPage;
import com.DemoGenericUtilities.BaseClass;
import com.DemoGenericUtilities.ExcelUtility;
import com.DemoGenericUtilities.JavaUtility;
import com.DemoGenericUtilities.WebDriverUtilities;


@Listeners(com.DemoGenericUtilities.ITestListnerImplementation.class)
public class CreateOrganisationsTest extends BaseClass {
	@Test(priority=0)
	public void createOrganisations() {
		
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		
		String org = eLib.getDataFromExcel("Organisations", 2, 2)+jLib.getRandomNumber();
		String industry = eLib.getDataFromExcel("Organisations", 5 , 3);
		String type = eLib.getDataFromExcel("Organisations", 7, 4);
		String searchLkp = eLib.getDataFromExcel("Organisations", 1, 6)+jLib.getRandomNumber();
		String alertMsg = eLib.getDataFromExcel("Organisations", 1, 8);
		
		HomePage hp = new HomePage(driver);
		hp.setorganisationsLink();
		
		OrganisationsPage op = new OrganisationsPage(driver);
		op.setcreateOrganisationBtn();
		
		CreateOrganisationsPage cop = new CreateOrganisationsPage(driver);
		cop.setorganisationNameTB(org);
		cop.setmemberOfLkpBtn();
		
		
		
		WebDriverUtilities wlib=new WebDriverUtilities();
		String wind=wlib.getParentWindow(driver);
		wlib.switchToWindow("http://www.localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_account_address&form=TasksEditView&form_submit=false&fromlink=&recordi", driver);
		
		cop.setsearchMemberOfLkp(searchLkp);
		cop.setsearchBtn();
		
		cop.setclickMemberOfLkp();
		wlib.switchToAlertPopUpAndAccept(driver, alertMsg);
		wlib.switchBackToMainWindow(driver, wind);
		
		cop.setindustryDrpDwn(industry);
		cop.setselectTypeDrpDwn(type);
		cop.setsaveBtn();
		
		OrganisationHeaderVerification ohv = new OrganisationHeaderVerification(driver);
		String presentOrgName = ohv.getHeader().getText();
		Assert.assertTrue(presentOrgName.contains(org));
		
		Reporter.log("create organisation test is pass", true);
		
		
		
	}

}
