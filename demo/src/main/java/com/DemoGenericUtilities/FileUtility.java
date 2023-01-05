package com.DemoGenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class FileUtility {

	public String getPropertyValue(String key)
	{
		FileInputStream fileinputStream = null;
		try {
			 fileinputStream = new FileInputStream(IAutoConstants.PROP_PATH);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Properties properties = new Properties();
		
		try {
			properties.load(fileinputStream);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String  value = properties.getProperty(key);
		return value;
		
	
	}
}
