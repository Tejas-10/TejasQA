package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		driver.findElement(By.xpath("//*[@id='content']/p[8]/button")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();   //It will select the preselected option in the alert.
		//al.dismiss(); //It will select the other option in the alert.

	}

}
