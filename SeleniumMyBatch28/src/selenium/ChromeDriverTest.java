package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("hdbfbhbfh");
		driver.findElement(By.name("pass")).sendKeys("afjwnjfn");
		driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();

	}




	}


