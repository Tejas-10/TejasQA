package selenium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.ca/");
		
		//File scrFile = driver.getScreenshotAs(OutputType.FILE);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\testing\\screenshot.png"));
		
//18th line if writing WebDriver in 16th
		//17th if FirefoxDriver in 16th

	}

}
