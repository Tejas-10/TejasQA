package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException{
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("Advertising")).click();
		driver.findElement(By.partialLinkText("Adverti")).click();
		
		Thread.sleep(5000);
		
		String expectedTitle = "Google PPC Online Advertising – Google Ads" ;
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if (expectedTitle.equals(actualTitle)){
		System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
		}

	}


