package pages;

public class ExcelData {
	Xls_Reader reader = new Xls_Reader("C:\\testing\\ClassExcelTest.xlsx");
	
	public String CorrectEmail = reader.getCellData("Sheet1", "CorrectEmail", 2);
	public String IncorrectEmail = reader.getCellData("Sheet1", "IncorrectEmail", 2);
	public String PasswordError = reader.getCellData("Sheet1", "PasswordError", 2);
	public String WrongPassword = reader.getCellData("Sheet1", "WrongPassword", 2);
	public String EmailError = reader.getCellData("Sheet1", "EmailError", 2);
    	
    

}