package naveenTestNG;

import org.testng.annotations.Test;

public class ExpectedExceptions {

	
	@Test(expectedExceptions=NumberFormatException.class)
	public void exceptionsTest(){
		String t = "100T";
		int te = Integer.parseInt(t);
		System.out.println(te);
	}
	
}
