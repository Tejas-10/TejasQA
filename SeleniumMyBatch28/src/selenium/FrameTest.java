package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> link = driver.findElements(By.linkText("Sortable"));
		
		int a = link.size();
		System.out.println(a);
		
		if (a>0){
			System.out.println("sortable present");
		}
		else {
			System.out.println("sortable not present");
		}

		List <WebElement> drag = driver.findElements(By.id("draggable"));
		int b = drag.size();
		System.out.println(b);

			if (b>0){
				System.out.println("drag present");
}
			else {
				System.out.println("drag not present");
}

System.out.println("------------------------------------switch to frame----------------");

driver.switchTo().frame(0);
//driver.switchTo().frame("demo-frame"); // it only works with id, wont work in this case
//driver.switchTo().frame(driver.findElement(By.className("demo-frame")))

	link = driver.findElements(By.linkText("Sortable"));

	a = link.size();
	System.out.println(a);

if (a>0){
	System.out.println("sortable present");
}
else {
	System.out.println("sortable not present");
}

	drag = driver.findElements(By.id("draggable"));
	b = drag.size();
	System.out.println(b);

if (b>0){
System.out.println("drag present");
}
else {
System.out.println("drag not present");
}

System.out.println("----------------switch to main-----------");
	
	driver.switchTo().defaultContent();
	link = driver.findElements(By.linkText("Sortable"));

	a = link.size();
	System.out.println(a);

if (a>0){
	System.out.println("sortable present");
}
else {
	System.out.println("sortable not present");
}

	drag = driver.findElements(By.id("draggable"));
	b = drag.size();
	System.out.println(b);

if (b>0){
System.out.println("drag present");
}
else {
System.out.println("drag not present");
}

//driver.switchTo().parentFrame();    // to switch to parent frame
	}

}
