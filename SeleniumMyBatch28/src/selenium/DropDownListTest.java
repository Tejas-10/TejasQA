package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		WebElement box = driver.findElement(By.xpath(".//*[@id='gh-cat']"));
		List <WebElement> dropdownoptions = box.findElements(By.tagName("option"));
		// alternate in comment
		//List<WebElement>dropdownoptions = driver.findElements(By.xpath(".//*[@id='gh-cat']/option"));
		System.out.println(dropdownoptions.size());
	

//		for (WebElement a : dropdownoptions){
//			System.out.println(a.getText()+"-------"+a.isSelected());
//		}
		box.sendKeys("Books");
//		System.out.println("-----------------------after selection-----------");
//		
//		for (WebElement a:dropdownoptions){
//			System.out.println(a.getText()+"--------"+a.isSelected());
//		}
//
for (WebElement a: dropdownoptions){

	if (a.isSelected()){
		System.out.println(a.getText());
	}
}
	Select s = new Select(box);
	s.selectByIndex(5);
	Thread.sleep(5000);
	s.selectByValue("550");
	Thread.sleep(5000);
	s.selectByVisibleText("Baby");

	}
}