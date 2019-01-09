package selenium;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.MethodSorter;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;
import org.junit.Assert;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Testing3 {

	@Rule
	public ErrorCollector errcol = new ErrorCollector();
	
	//@Ignore
	@Test
	public void test6(){
		System.out.println("I am in testAssert");
		String actual = "abc";
		String expected = "abc";
		Assert.assertEquals(expected, actual);
		System.out.println("After assert");
		Assert.assertTrue("Verifying if 4>3",4>3);
		System.out.println("After 2nd assert");
		
	}
	
	@Test
	public void test7(){
		System.out.println("I am in testAssert");
		String actual = "abc";
		String expected = "abc1";
	    try{
		Assert.assertEquals(expected, actual);
	    }
	    catch(Throwable t){
	    	System.out.println("I am in first catch");
	    }
	    System.out.println("After assert");
	    try{
		Assert.assertTrue("Verifying if 2>3",2>3);
	    }
	    catch(Throwable t){
		System.out.println("I am in 2nd catch");	
	}
	    System.out.println("After 2nd assert");
	    
}
	@Test
	public void test8(){
		System.out.println("I am in testAssert");
		String actual = "abc";
		String expected = "abc1";
	    try{
		Assert.assertEquals(expected, actual);
	    }
	    catch(Throwable t){
	    	System.out.println("I am in first catch");
	    	errcol.addError(t);
	    }
	    System.out.println("After assert");
	    try{
		Assert.assertTrue("Verifying if 2>3",2>3);
	    }
	    catch(Throwable t){
		System.out.println("I am in 2nd catch");
		errcol.addError(t);
	}
	    System.out.println("After 2nd assert");
	}
}