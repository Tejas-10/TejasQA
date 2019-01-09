package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(3000);
		
	String text = 	driver.findElement(By.xpath("//*[@id='droppable']/p")).getText();
	System.out.println(text);
	}

}
