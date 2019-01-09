package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

	WebDriver driver;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@Test(groups="smoke")
	public void facebookTest(){
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("hdbfbhbfh");
		driver.findElement(By.name("pass")).sendKeys("afjwnjfn");
		driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
}
	@AfterMethod
	public void afterTest(){
		System.out.println("over");
	}
}

