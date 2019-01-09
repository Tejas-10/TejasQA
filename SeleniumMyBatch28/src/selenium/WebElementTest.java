package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement last = driver.findElement(By.name("email"));
		last.sendKeys("ahfgiafb");
		WebElement mobile = driver.findElement(By.name("pass"));
		mobile.click();

	}

}
