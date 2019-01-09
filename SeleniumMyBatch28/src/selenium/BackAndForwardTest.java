package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
driver.findElement(By.linkText("Advertising")).click();
Thread.sleep(4000);
System.out.println(driver.getTitle());

driver.navigate().back();
driver.navigate().back();
Thread.sleep(4000);
System.out.println(driver.getTitle());

driver.navigate().forward();
Thread.sleep(4000);
System.out.println(driver.getTitle());
	}

}
