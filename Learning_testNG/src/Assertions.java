import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



class Assertions {
	String a = "tejas";
	String b = "shweta";
	String c = "tejas";
    
	SoftAssert softAssert;
	@Test
	public void assertTest(){
    	System.out.println("A");
	
		Assert.assertEquals(a,c);
	
		System.out.println("B");
	}
	
	@Test
	public void assertTest2(){
		System.out.println("C");
		Assert.assertTrue(a.equals(c),"Not equal");
		System.out.println("D");
	}
    @Test
    public void softAssertTest(){
    	softAssert = new SoftAssert();
    	System.out.println("E");
    	softAssert.assertEquals(a,b);
    	System.out.println("F");
    	softAssert.assertAll();
    }

}
