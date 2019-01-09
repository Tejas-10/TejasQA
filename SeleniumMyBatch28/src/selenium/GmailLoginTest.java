package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,100);
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("uwaterlootejas");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("tejas");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		
		//Thread.sleep(3000);
		
		String expectederrmsg = "Wrong password. Try again or click Forgot password to reset it.";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(.//*[@aria-atomic='true'])[2]"),"Wrong password. Try again or click Forgot password to reset it." ));
		String actualerrmsg = driver.findElement(By.xpath("(.//*[@aria-atomic='true'])[2]")).getText();
		System.out.println(actualerrmsg);
		System.out.println(expectederrmsg);
		
		if (expectederrmsg.equals(actualerrmsg)){
			System.out.println("test passed");
			
		}
		else {
			System.out.println("test failed");
		}
	}

}
