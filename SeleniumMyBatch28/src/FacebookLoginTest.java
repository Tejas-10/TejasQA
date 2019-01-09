import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("hdbfbhbfh");
		driver.findElement(By.name("pass")).sendKeys("afjwnjfn");
		driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();

	}

}
