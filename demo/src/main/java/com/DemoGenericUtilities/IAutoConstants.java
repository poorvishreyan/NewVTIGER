package com.DemoGenericUtilities;

public interface IAutoConstants {

	String PROP_PATH = "./src/test/resources/commondata.properties";
	String EXCEL_PATH = "./src/test/resources/abc.xlsx";
	String CHROME_KEY="WebDriver.chrome.driver";
	String CHROME_VALUE=".\\src\\main\\resources\\chromedriver.exe";
	String DBUrl = "jdbc:mysql://localhost:3306/";
	String DBUsername = "root";
	String DBPassword = "root";
	int explicitWaitDuration=10;
	int implicitlyWaitDuration=10;
	int scriptTimeOutDuration=10;
}
