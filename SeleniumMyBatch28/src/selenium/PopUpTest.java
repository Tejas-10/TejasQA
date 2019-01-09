package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		Thread.sleep(4000);
		
		List<WebElement>popup = driver.findElements(By.xpath("//@a[class='close-layer']"));
		int a = popup.size();
		if(a>0){
			driver.findElement(By.xpath("//@a[class='close-layer']")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("PHONES & ACCESSORIES")).click();
		
		}
		else {
			driver.findElement(By.linkText("PHONES & ACCESSORIES")).click();
			
			
		}

	}

}
