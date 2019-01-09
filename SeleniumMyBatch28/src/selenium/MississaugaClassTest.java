package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MississaugaClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.mississauga.ca/portal/home");
		
		Actions builder = new Actions(driver);
		WebElement hall =driver.findElement(By.xpath("//*[@id='tnNavHall']"));
		builder.moveToElement(hall).build().perform();
		
		Thread.sleep(3000);
		
		List<WebElement> menu = driver.findElements(By.xpath(".//*[@id='tnNavHallMenu']/a"));
		int a = menu.size();
		System.out.println(a);
		
		for (int i=0;i<a;i++){
			String name = "City Clerk's Office";
			if (menu.get(i).getText().equals(name)){
				menu.get(i).click();
				break;
			}
			else{
				System.out.println(menu.get(i).getText());	
			}
		

	}
	}
}
