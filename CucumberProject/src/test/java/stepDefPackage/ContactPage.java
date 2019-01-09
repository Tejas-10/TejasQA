//package stepDefPackage;
//
//import java.util.List;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class ContactPage {
//
//	WebDriver driver;
//	
//	@Given("^user is on new contact page$")
//	public void user_is_on_new_contact_page() {
//		  System.out.println("Trying data tables");
//		   
//	}
//
//	@When("^user enters his/her credentials$")
//	public void user_enters_hisOrHer_credentials(DataTable credentials){
//	    List<List<String>> data = credentials.raw();
//	    System.out.println(data.get(0).get(0));
//	    System.out.println(data.get(0).get(1));
//	    System.out.println(data.get(1).get(0));
//	    System.out.println(data.get(1).get(1));
//	}
//
//	@Then("^user provides position$")
//	public void user_provides_position(DataTable position){
//		List<List<String>> positionData= position.raw();
//		System.out.println(positionData.get(0).get(0));
//		System.out.println(positionData.get(1).get(0));
//		
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//	}
//
//
//}
