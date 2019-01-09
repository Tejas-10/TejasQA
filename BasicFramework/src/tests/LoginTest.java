package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	LoginPage lp = new LoginPage();
	
  @Test
  public void loginWithIncorrectPassword() {
	  lp.enterEmail("uwaterlootejas");
	  lp.enterPassword("kjaehfjkb");
	  lp.readPasswordError();
	  Assert.assertEquals("Wrong password. Try again or click Forgot password to reset it.", lp.readPasswordError());
	  
  }
  
  @Test
  public void loginWithIncorrectEmail() {
	  lp.enterEmail("jfehwuihwefiu");
      lp.readEmailError();
      Assert.assertEquals("Couldn't find your Google Account", lp.readEmailError());
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	    lp.openBrowser();
	    lp.openGmail();
  }

  @AfterMethod
  public void afterMethod() {
	  lp.closeBrowser();
  }
}
