package com.storeqa.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
public static WebDriver driver;
public static Properties prop;

public BaseClass() throws IOException{	
	prop = new Properties();
	FileInputStream io = new FileInputStream("C:/Selenium_Workspace/demoqaTest/src/main/java/com/storeqa/config/config.properties");
	prop.load(io);	
}

public void initialization(){
	
	String browser = prop.getProperty("browser");
	if (browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else{
		driver = new FirefoxDriver();	
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));	
}
}
