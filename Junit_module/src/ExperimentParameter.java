import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ExperimentParameter {



	@Before
	public void beforeM(){
		System.out.println("Open browser");
	}
	
	@After
	public void AfterM(){
		System.out.println("Quit browser");
	}
	
	@Test
	public void parametersTest(String name,
			String city,
			String address,
			int phone){

		System.out.println(name+"--"+city+"--"+address+"--"+phone);
	}
	
@Parameters	
public Object[] getData(){
	Object[][] data = new Object[2][4];
	data[0][0]= "Tejas";
	data[0][1]= "Waterloo";
	data[0][2]= "249 Cedarbrae Avenue";
	data[0][3]= 437;
	
	data[1][0]= "Parimal";
	data[1][1]= "New Jersey";
	data[1][2]= "36 Concord Street";
	data[1][3]= 972;
 return data;	
}
}