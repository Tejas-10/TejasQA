package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	public WebDriver driver;
	
	public void openBrowser(){
		driver = new FirefoxDriver();
	}
	
	public void openGmail(){
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void closeBrowser(){
		driver.quit();
	}
	
	public void enterEmail(String a){
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(a);
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
	}
	
	public void enterPassword(String b){
		driver.findElement(By.xpath("//*[@aria-label='Enter your password']")).sendKeys(b);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}
	
	public String readEmailError(){
		String emailError =	  driver.findElement(By.xpath("//div[@class='GQ8Pzc']")).getText();
		System.out.println(emailError);
		return emailError;
		
		
	}
	public String readPasswordError(){
		String passwordError = driver.findElement(By.xpath("//*[@id='password']/div[2]/div[2]/div")).getText();
		System.out.println(passwordError);
		return passwordError;
	}

}
