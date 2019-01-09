import org.apache.log4j.Logger;

public class LoggingExampleTest {

	public static void main(String[] args) {
		//add log4j.jar
		//add log4j.properties directly inside the src folder
		//create the object in the code
		
		Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		APPLICATION_LOGS.debug("hello");
		APPLICATION_LOGS.debug("We are writing in a log file");
		APPLICATION_LOGS.debug("Starting the test case xyz test");
		APPLICATION_LOGS.debug("Starting the test case xyz test1");
		

		
		
		
		
	}

}
