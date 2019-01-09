import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FirstOne {

	@Before
	public void beginTest(){
		System.out.println("Before Test method");
	}
	
	@After
	public void afterTest(){
		System.out.println("After Test method");
	}
	
	@BeforeClass
	public static void beforeClassTest(){
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClassTest(){
		System.out.println("After class");
	}
	
	@Test
	public void loginTest(){
		System.out.println("Login Tejas");
	}
	@Ignore
	@Test
	public void registerTest(){
		System.out.println("Register Tejas");
	}
	
	@Test
	public void emailTest(){
		System.out.println("email Tejas");
	}
}

