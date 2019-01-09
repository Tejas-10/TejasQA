package demoqa.demoqaTest;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.storeqa.base.BaseClass;
import com.storeqa.pages.HomePage;

public class HomePageTest extends BaseClass {
   HomePage hp;
	public HomePageTest() throws IOException{
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		hp = new HomePage();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test(priority=1)
	public void logoTest(){
		boolean qalogo = hp.getLogo();
		Assert.assertTrue(qalogo);
	}
	
	@Test(priority=2)
	public void title(){
		String title = hp.homePageTitle();
		Assert.assertEquals("ONLINE STORE | Toolsqa Dummy Test site", title);
	}
	
	
}
