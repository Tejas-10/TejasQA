package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		
FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.name("lastname")).sendKeys("fgahjfhkabf");
driver.findElement(By.name("reg_email__")).sendKeys("4379933030");
driver.findElement(By.name("reg_passwd__")).sendKeys("testing");
WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
WebElement day = driver.findElement(By.xpath(".//*[@id='day']"));
WebElement year = driver.findElement(By.xpath("//*[@id='year']"));



Select s1 = new Select(month);
Select s2 = new Select(day);
Select s3 = new Select(year);
s1.selectByIndex(6);
s2.selectByIndex(20);
s3.selectByIndex(25);

driver.findElement(By.xpath("(//*[@value='2'])[3]")).click();

driver.findElement(By.name("websubmit")).click();

Thread.sleep(3000);

String actualerror = "What’s your name?" ;
String expectederror = driver.findElement(By.xpath("(.//*[contains(@id,'js_')])[2]")).getText();
System.out.println(expectederror);
if (actualerror.equals(expectederror)){
System.out.println("test passed");
}
else {
	System.out.println("test failed");
}
	}
}
