import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MySeleniumClass {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("fgiyagfihb");
		driver.findElement(By.id("pass")).sendKeys("hbafhkfj");
		driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
	}

}
