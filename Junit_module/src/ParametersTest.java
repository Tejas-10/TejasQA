import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametersTest {
	public String name;
	public String email;
	public int phone;

	public ParametersTest(String name, String email, int phone){
		
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		Object[][] data = new Object[2][3];
		
		data[0][0]="Tejas";
		data[0][1]="tejas.patel@uwaterloo.ca";
		data[0][2]=437;
		
		data[1][0]="Patel";
		data[1][1]="t27patel@uwaterloo.ca";
		data[1][2]=972;
		return Arrays.asList(data);
		
		
	}
	@Test
public void tejas(){
		System.out.println(name+" - "+email+" - "+phone);
	}
}


