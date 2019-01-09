package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.cssSelector("input[type='email']")).sendKeys("tejas");
	String value = driver.findElement(By.cssSelector("input[type='email']")).getAttribute("value");
	System.out.println(value);
	driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("hafbh");
	driver.findElement(By.cssSelector("input[data-testid='royal_login_button']")).click();
	}

}
