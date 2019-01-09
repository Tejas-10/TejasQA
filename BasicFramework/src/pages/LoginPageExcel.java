package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageExcel {
	public WebDriver driver;
	
//	public WebElement email = driver.findElement(By.xpath("//*[@id='identifierId']")); 
//	public WebElement emailNextButton = driver.findElement(By.xpath("//*[@class='RveJvd snByac']"));
//	public WebElement password = driver.findElement(By.xpath("//*[@class='RveJvd snByac']"));
//	public WebElement passwordNextButton = driver.findElement(By.xpath("//*[@class='RveJvd snByac']"));
	//We get error in test class if we declare like this. The reason is when the object of this class
	// is created in test class, all these elements will be called but the driver is null and we use driver in the elements. so we get an error.
	@FindBy(xpath = "//*[@id='identifierId']" )
	public static WebElement email;
	
	@FindBy(xpath = "//*[@aria-label='Enter your password']")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@class='RveJvd snByac']")
	public static WebElement emailNextButton;
	
	@FindBy(xpath = "//span[@class='RveJvd snByac']")
	public static WebElement passwordNextButton ;
	
	@FindBy(xpath = "//*[@id='password']/div[2]/div[2]/div")
	public static WebElement readPasswordErrMessage;
	
	@FindBy(xpath = "//div[@class='GQ8Pzc']" )
	public static WebElement readEmailErrMessage;
	
    Xls_Reader reader = new Xls_Reader("C:\\testing\\ClassExcelTest.xlsx");
		
	public void openBrowser() throws IOException{
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream("C:\\testing\\Prop.properties");
	    prop.load(fs);
	    String browser = prop.getProperty("browser");
		
	    if (browser.equals("firefox")){
		driver = new FirefoxDriver();
	    }
	    else if(browser.equals("chrome")) {
	    	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			}
	    PageFactory.initElements(driver, this);
		//NOTE THIS PAGEFACTORY THING
	}
	
	public void openGmail(){
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void closeBrowser(){
		driver.quit();
	}
	
	public void enterEmail(String a){
		email.sendKeys(a);
		emailNextButton.click();
	}
	
	public void enterPassword(String b){
		password.sendKeys(b);
		passwordNextButton.click();
	}
	
	public String readEmailError(){
		String emailError =	  readEmailErrMessage.getText();
		System.out.println(emailError);
		return emailError;
		
		
	}
	public String readPasswordError(){
		String passwordError = readPasswordErrMessage.getText();
		System.out.println(passwordError);
		return passwordError;
	}

}
