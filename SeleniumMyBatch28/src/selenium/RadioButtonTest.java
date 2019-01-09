package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.echoecho.com/htmlforms10.htm");
	
	List<WebElement> group1 = driver.findElements(By.xpath("//input[@name='group1']"));
	int a = group1.size();
	System.out.println(a);
	
	for (int i =0; i<a;i++){
		System.out.println(group1.get(i).getAttribute("value")+"-----"+group1.get(i).isSelected());
	}
group1.get(2).click();
System.out.println("-------------------------");
	
	for (int i =0; i<a;i++){
		System.out.println(group1.get(i).getAttribute("value")+"-----"+group1.get(i).isSelected());
	}
}
}