package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		String actual = driver.findElement(By.xpath(".//*[@placeholder='Search for anything']")).getAttribute("placeholder");
	
		
		System.out.println(actual);
		

	}

}
