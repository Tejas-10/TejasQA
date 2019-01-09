package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
@BeforeSuite
public void SuiteTest(){
	System.out.println("Suite");
}
@BeforeTest
public void testTest(){
	System.out.println("Test");
}
@BeforeClass
public void classTest(){
	System.out.println("Class");
}
@BeforeMethod
public void methodTest(){
	System.out.println("Before Method");
}
@Test(priority=1,groups="Sanity")
public void caseTest(){
	System.out.println("Case");
}
@Test(priority=2, groups="Sanity")
public void case2Test(){
	System.out.println("Case2");
}
@AfterTest
public void afterTestTest(){
	System.out.println("After Test");
}
@AfterClass
public void afterClassTest(){
	System.out.println("After Class");
}
@AfterMethod
public void aftermethodTest(){
	System.out.println("After Method");
}
}