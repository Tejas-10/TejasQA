package com.storeqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.storeqa.base.BaseClass;

public class HomePage extends BaseClass {
	
	//page factory
	
	@FindBy (linkText="All Product")
	WebElement allProduct;
	
	@FindBy(linkText="Register")
	WebElement register;
	
	@FindBy(xpath="//*[@id='logo']/img")
	WebElement qaLogo;
	
	//Initializing page objects
	
	public HomePage(){                // we can write HomePage.class instead of this
		PageFactory.initElements(driver,this);  //initElements = initialize Elements
	}
	
	//methods or actions
	public String homePageTitle(){
		String homePageTitle = driver.getTitle();
		System.out.println();
		return homePageTitle;
	}
	
	public boolean getLogo(){
	   boolean logo = qaLogo.isDisplayed();
	   return logo;
	}
	
	//This method is returning ProductPage object
	public ProductPage allProductClick(){ 
	allProduct.click();
	return new ProductPage();
	}
	
	
	
	

}
