package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		// the reason we use list elements instead of webelement is that if we use webelement and the element is not present, it will give an error.
		// for example, driver.findElement(By.linkText("Advertisingggg")).isDisplayed(); will not go to isDisplayed method if the element is not present.
		List<WebElement>element = driver.findElements(By.linkText("Advertising"));
		System.out.println(element.size());
		
		if (element.size()>0){
			System.out.println("Element present");
		}
		else {
			System.out.println("Element not present");
			
		}
		

	}

}
