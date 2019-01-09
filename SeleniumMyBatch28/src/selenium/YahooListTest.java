package selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?p=us");
		List<WebElement> links = driver.findElementsByXPath(".//li[@data-category='trending news']/ul/li");
		System.out.println(links.size());
		
		for (int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
		}

	}

}
