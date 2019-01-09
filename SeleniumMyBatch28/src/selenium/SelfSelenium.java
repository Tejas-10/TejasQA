package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SelfSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://iibs.ca/");
		
		Actions action = new Actions(driver);
		
		WebElement mainone = driver.findElement(By.xpath(("//*[@id='menu-item-3878']/a/span")));
		WebElement sideone = driver.findElement(By.xpath("//*[@id='menu-item-3905']/a/span"));
		
		action.moveToElement(mainone).perform();
		Thread.sleep(3000);
		action.moveToElement(sideone).click().perform();
		
		
		

	}

}
