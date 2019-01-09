package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfileTest {
	
	//firefox.exe -profilemanager

	public static void main(String[] args) {
	ProfilesIni p1 = new ProfilesIni();
	FirefoxProfile profile = p1.getProfile("Tejas");
	
	WebDriver driver = new FirefoxDriver(profile);
	driver.get("https://www.ebay.com/");
	

	}

}
