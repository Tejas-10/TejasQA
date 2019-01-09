package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowsersTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("C:\\testing\\Prop.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		
		String browser = prop.getProperty("browser"); //chrome,ie
		
		WebDriver driver;
		
		if(browser.equals("firefox")){
			
			 driver = new FirefoxDriver();
		}
		else if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		else {
			System.setProperty("webdriver.ie.driver", "C:\\SeleniumJars\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			
		}
		
		
		driver .get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("hdbfbhbfh");
		driver.findElement(By.name("pass")).sendKeys("afjwnjfn");
		driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();


	}

}
