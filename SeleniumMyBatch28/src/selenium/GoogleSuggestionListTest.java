package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("canada");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath(".//*[@class='erkvQe']/li"));
		System.out.println(suggestions.size());
		
		for (int i=0; i<suggestions.size();i++){
			System.out.println(suggestions.get(i).getText());
			
//	alternate for loop
//for (WebElement a: suggestions){
//				System.out.println(a.getText());
//			}
		}
		
		

	}

}
