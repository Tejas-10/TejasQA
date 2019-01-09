package tests;

import org.testng.annotations.Test;

import pages.ExcelData;
import pages.LoginPage;
import pages.LoginPageExcel;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTestExcel {
	LoginPageExcel lp = new LoginPageExcel();
	ExcelData ed = new ExcelData();
	
  @Test
  public void loginWithIncorrectPassword() {
	  lp.enterEmail(ed.CorrectEmail);
	  lp.enterPassword(ed.WrongPassword);
	  lp.readPasswordError();
	  Assert.assertEquals(ed.PasswordError, lp.readPasswordError());
	  
  }
  
  @Test
  public void loginWithIncorrectEmail() {
	  lp.enterEmail(ed.IncorrectEmail);
      lp.readEmailError();
      Assert.assertEquals(ed.EmailError, lp.readEmailError());
  }
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  
	    lp.openBrowser();
	    lp.openGmail();
  }

  @AfterMethod
  public void afterMethod() {
	  lp.closeBrowser();
  }
}
