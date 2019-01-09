package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//WebElement footer = driver.findElement(By.id("fsl"));
		//List<WebElement> all = driver.findElements(By.tagName("a"));
		
		List<WebElement> all = driver.findElements(By.xpath(".//*[@id='fsl']/a"));
		System.out.println(all.size());
		
//		System.out.println(all.get(0).getText());
//		System.out.println(all.get(1).getText());
//		System.out.println(all.get(2).getText());
//		System.out.println(all.get(3).getText());
		
		for (int i=0;i<all.size();i++){
			System.out.println(all.get(i).getText());
					
		}
	}
}
