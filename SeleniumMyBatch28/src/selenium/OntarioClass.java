package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OntarioClass {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ontario.ca/page/government-ontario");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List <WebElement> all = driver.findElements(By.xpath("//div[@class='stats-caption smaller']/a"));
		System.out.println(all.size());
	
    for (WebElement a:all){
    	System.out.println(a.getText());
    if (a.getText().equals("Health + wellness")){
    	a.click();
    	break;
    }
    }
	}
}
