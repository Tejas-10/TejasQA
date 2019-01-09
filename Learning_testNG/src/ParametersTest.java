import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametersTest {

	@BeforeMethod
	public void beforeM(){
		System.out.println("Open browser");
	}
	
	@AfterMethod
	public void AfterM(){
		System.out.println("Quit browser");
	}
	
	@Test(dataProvider="getData")
	public void parametersTest(String name,
			String city,
			String address,
			int age){

		System.out.println(name+"--"+city+"--"+address+"--"+age);
	}
	
@DataProvider	
public Object[] getData(){
	Object[][] data = new Object[2][4];
	data[0][0]= "Tejas";
	data[0][1]= "Waterloo";
	data[0][2]= "249 Cedarbrae Avenue";
	data[0][3]= 24;
	
	data[1][0]= "Shweta";
	data[1][1]= "New Jersey";
	data[1][2]= "36 Concord Street";
	data[1][3]= 25;
 return data;	
}
}
