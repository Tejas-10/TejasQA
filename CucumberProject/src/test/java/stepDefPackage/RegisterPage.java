package stepDefPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RegisterPage {

	WebDriver driver;
	
	@Given("^the user is on register page$")
	public void the_user_is_on_register_page() {
		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.get("http://store.demoqa.com/wp-login.php?action=register");
		   String regTitle = driver.getTitle();
		   Assert.assertEquals("ONLINE STORE ‹ Registration Form", regTitle);
	}

	@When("^the user enters \"(.*)\" and \"(.*)\"$")
	public void the_user_enters_Tejas_and_soccer(String username, String email) {
	    driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys(username);
	    driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys(email);
	    driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
	}

	@Then("^new account should be created$")
	public void new_account_should_be_created() {
		String message = "Registration complete. Please check your email.";
		String actual = driver.findElement(By.xpath("//*[@id='login']/p[1]")).getText();
		Assert.assertEquals(message, actual);
		System.out.println("Account created successfully");
	    
	}

//	@When("^the user enters \"(.*)\" and \"(.*)\"$")
//	public void the_user_enters_Patel_and_soccerist(String username, String email) {
//		driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys(username);
//	    driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys(email);
//	    driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
//	}
	
	
}
