import org.junit.Assume;
import org.junit.Test;

public class SecondOne {
	
	
@Test
public void firstInterview(){
	System.out.println("First Interview");
}
@Test
public void secondTest(){
	System.out.println("second interview");
	Assume.assumeTrue(false);
	System.out.println("tejas");
	
}

}
