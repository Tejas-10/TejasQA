package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://moodle.cestarcollege.com/moodle/");
		driver.findElement(By.linkText("Faq")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());
		
Iterator<String> iter = allwindows.iterator();
String mainwindow = iter.next();
String childwindow = iter.next();
System.out.println(mainwindow);
System.out.println(childwindow);

driver.switchTo().window(childwindow);
System.out.println(driver.getTitle());

driver.close();

driver.switchTo().window(mainwindow);
System.out.println(driver.getTitle());
	driver.quit();
	
	//driver.quit will quit the browser. driver.close closes the particular window.
	}

}

