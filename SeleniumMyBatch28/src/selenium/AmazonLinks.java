package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLinks {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		List<WebElement> amazon = driver.findElements(By.xpath("(.//*[@class='navFooterLinkCol navAccessibility']/ul/li)[4]"));
		System.out.println(amazon.size());

	}

}
