package stepDefPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePage {
	
	WebDriver driver;
	
	@Given("^the user is on homepage$")
	public void the_user_is_on_homepage() {
	   System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://store.demoqa.com/");
	   String homeTitle = driver.getTitle();
	   Assert.assertEquals("ONLINE STORE | Toolsqa Dummy Test site", homeTitle);
	}
	
	@Before  //import from cucumber.api.java not from junit
	public void setUp(){
		System.out.println("@Before - runs before every SCENARIO");
	}

	@After
	public void tearDown(){
		System.out.println("@After - runs after every SCENARIO");
	}
	@When("^the user clicks on all products link$")
	public void the_user_clicks_on_all_products_link() {
	    driver.findElement(By.linkText("All Product")).click();
	}

	@Then("^go to all products page$")
	public void go_to_all_products_page(){
		String productPageTitle = driver.getTitle();
	    Assert.assertEquals("Product Category | ONLINE STORE", productPageTitle);
	}

	@Then("^Verify it is the correct page$")
	public void verify_it_is_the_correct_page() {
		String productPageTitle = driver.getTitle();
	    Assert.assertEquals("Product Category | ONLINE STORE", productPageTitle);
	    System.out.println("User is on correct page");
	}
}
