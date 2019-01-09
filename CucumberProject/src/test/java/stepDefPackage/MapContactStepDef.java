package stepDefPackage;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MapContactStepDef {
WebDriver driver;
	
	@Given("^user is on new contact page$")
	public void user_is_on_new_contact_page() {
		  System.out.println("Trying data tables");
		   
	}

	@When("^user enters his/her credentials$")
	public void user_enters_hisOrHer_credentials(DataTable credentials){
	   List<Map<String,String>> data = credentials.asMaps(String.class, String.class);
	    System.out.println(data.get(0).get("firstname"));
	    System.out.println(data.get(0).get("lastname"));
	    System.out.println(data.get(1).get("firstname"));
	    System.out.println(data.get(1).get("lastname"));  
	}

	@Then("^user provides position$")
	public void user_provides_position(DataTable position){
		Map<String,String> pos= position.asMap(String.class, String.class);
		System.out.println(pos.get("position"));
		
		
	}

	@Then("^close the browser$")
	public void close_the_browser() {
	}

}
