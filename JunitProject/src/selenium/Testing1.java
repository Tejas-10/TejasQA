package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
		System.out.println("login");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		System.out.println("logout");
	}

	@Test
	public void test1() {
		//System.out.println("login");
		  System.out.println("Test1");
		//System.out.println("logout");
	}

	@Test
	public void test2() {
		//System.out.println("login");
		  System.out.println("Test2");
		//System.out.println("logout");
	}
}
