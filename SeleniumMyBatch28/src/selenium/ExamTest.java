package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExamTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://store.demoqa.com/");
		WebElement product = driver.findElement(By.linkText("Product Category"));
		Actions builder = new Actions(driver);
		builder.moveToElement(product).build().perform();
		
		List<WebElement> options = driver.findElements(By.xpath("//*[@id='menu-item-33']/ul/li"));
		int optionsSize = options.size();
		System.out.println(optionsSize);
		for(int i=0;i<optionsSize;i++){
			System.out.println(options.get(i).getText());
		}
		System.out.println("------------------------");
        driver.findElement(By.linkText("iPads")).click();
        driver.findElement(By.xpath("(.//input[@value='Add To Cart'])[2]")).click();
    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(".//*[@class='alert addtocart' and @style='display: block;']/p "),"Item has been added to your cart!"));
	    String item = driver.findElement(By.xpath(".//*[@class='alert addtocart' and @style='display: block;']/p")).getText();
        System.out.println(item);
        String actual ="Item has been added to your cart!";
        if(item.equals(actual)){
	    driver.findElement(By.xpath(".//*[@title='Checkout']")).click();
        }
        else{
        	System.out.println("Not equal");
        }
	    String quantity = driver.findElement(By.xpath(".//*[@name='quantity' and @type='text']")).getAttribute("value");
	    System.out.println(quantity);
	    String price = driver.findElement(By.xpath((".//*[@class='wpsc_product_price wpsc_product_price_0']/span/span"))).getText();
	    System.out.println(price);
	    driver.findElement(By.linkText("Continue")).click();
	    
	    driver.findElement(By.xpath(".//*[@title='billingemail']")).sendKeys("tejas.patel@uwaterloo.ca");
	    driver.findElement(By.xpath(".//*[@title='billingfirstname']")).sendKeys("Tejas");
	    driver.findElement(By.xpath(".//*[@title='billinglastname']")).sendKeys("Patel");
	    driver.findElement(By.xpath(".//*[@title='billingaddress']")).sendKeys("74 Marshall Street");
	    driver.findElement(By.xpath(".//*[@title='billingcity']")).sendKeys("Waterloo");
	    driver.findElement(By.xpath(".//*[@title='billingstate']")).sendKeys("Ontario");
	    WebElement country = driver.findElement(By.xpath(".//*[@title='billingcountry']"));
	    Select sel = new Select(country);
	    sel.selectByVisibleText("Canada");
	    driver.findElement(By.xpath(".//*[@title='billingpostcode']")).sendKeys("N2L4T2");
	    driver.findElement(By.xpath(".//*[@title='billingphone']")).sendKeys("4379933030");
	    driver.findElement(By.id("shippingSameBilling")).click();
	    //driver.findElement(By.xpath(".//*[@value='Purchase']")).click();
	}
       
}
