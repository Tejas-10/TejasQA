import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Write_PropertiesFile {

	public static void main(String[] args) throws IOException {
	//Read Properties file
		FileInputStream fs = new FileInputStream("C:\\testing\\Prop.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
	String browserName = prop.getProperty("browser");
	System.out.println(browserName);
	
	System.out.println(prop.getProperty("testSiteName"));
	System.out.println(prop.getProperty("environment"));
	
	//Write into properties file
	prop.setProperty("name", "Nikul");
	System.out.println(prop.getProperty("name"));
	
	prop.setProperty("last", "Patel");
	System.out.println(prop.getProperty("last"));

	FileOutputStream fo = new FileOutputStream("C:\\testing\\Prop.properties");
	prop.store(fo, "adding to file");
	}

}
