package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {

	public static void main(String[] args) throws IOException{
	
	Properties prop = new Properties();
	FileInputStream fs = new FileInputStream("C:\\testing\\Prop.properties");
	prop.load(fs);
	
	prop.getProperty("browser");
	
	}
	
	
}
