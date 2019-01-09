package com.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public static void main(String[] args) throws IOException{
	    
		Properties prop = new Properties();
		FileInputStream io = new FileInputStream("C:/Selenium_Workspace/Properties/src/propertiesFile/config.properties");
		prop.load(io);
		
	System.out.println(prop.getProperty("browser"));	
		
	}
}
