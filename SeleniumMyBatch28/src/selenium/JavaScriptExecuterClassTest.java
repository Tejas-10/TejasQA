package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,10000)", ""); //scrolls by coordinates

		WebElement element = driver.findElement(By.linkText("Mobile apps")); 
		jse.executeScript("arguments[0].scrollIntoView(true);", element); //scrolls until particular element shows up
		System.out.println(element.getLocation());
	}

}
