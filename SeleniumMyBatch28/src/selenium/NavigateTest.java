package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		//driver.navigate().to("https://www.ebay.ca/"); //lines 11 and 13 are same
		
		//but navigate does more than that
		
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
