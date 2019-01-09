package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/en_gb/");
		
		Actions builder = new Actions(driver);
		
		WebElement men = driver.findElement(By.linkText("MEN"));
		builder.moveToElement(men).build().perform();
		
		Thread.sleep(3000);
		
		List<WebElement> menoptions = men.findElements(By.xpath("//*[@id='gnav-bar--section-menu-subnav--men']/div/div/div[2]/div/div/ul/li"));
		int size = menoptions.size();
		System.out.println(size);
		
		for (int i=0; i<size;i++){
			System.out.println(menoptions.get(i).getText());
		}
		
		

	}

}
