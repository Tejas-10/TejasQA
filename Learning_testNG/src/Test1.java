import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
@Test(priority=1)
public void testLogin(){
	System.out.println("login test");
}
@Test(priority=2)
public void formFill(){
	System.out.println("form bharo");
	throw new SkipException("Ni chale ne");
}
@AfterMethod
public void lastMa(){
	System.out.println("method over");
}
@BeforeMethod
public void pehla(){
	System.out.println("chalu thase");
}
@BeforeTest
public void ekdamPella(){
	System.out.println("ekdam pella");
}
@AfterTest
public void ekdamChhella(){
	System.out.println("ekdam chhella");
}
}