package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import excel.Xls_Reader;


public class RegisterFacebook {

	public static void main(String[] args) {
		
		String sheet = "Tej";
		Xls_Reader reader = new Xls_Reader("C:/Selenium_Workspace/DataDrivenFramework/src/excelData/Datadrivenframework.xlsx");
		int rows = reader.getRowCount(sheet);
		System.out.println(rows);
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		for (int i=2;i<=rows;i++){
			
			String lastName = reader.getCellData(sheet, "lastname", i);
			System.out.println(lastName);
			String email = reader.getCellData(sheet,"email",i);
			System.out.println(email);
			String password = reader.getCellData(sheet, "password", i);
			System.out.println(password);
			
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		driver.findElement(By.name("reg_passwd__")).clear();
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
	    
		}
		driver.quit();
	}
}
