package com.testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test(priority=1, groups="Sanity")
	public void homeTest(){
		System.out.println("Home Test");
		System.out.println("Before assertion");
		Assert.assertTrue(4>3,"Verifying element");
		System.out.println("After assertion");
	}
	
	@Test(priority=2, dependsOnMethods={"homeTest"},groups={"Smoke","Sanity"})
	public void mainTest(){
		System.out.println("Main Test");
		System.out.println("Before assertion");
		softAssert.assertTrue(2>3,"Verifying element");
		System.out.println("After assertion");
		softAssert.assertAll(); //similar to error collector in JUnit
}
	@Test(priority=3, dependsOnMethods={"mainTest"})
	public void endTest(){
		System.out.println("End Test");
		System.out.println("Before assertion");
		softAssert.assertTrue(2>3,"Verifying element");
		System.out.println("After assertion");
		softAssert.assertEquals("abc", "abc1");
		System.out.println("after second assertion");
		softAssert.assertAll();
	}
}