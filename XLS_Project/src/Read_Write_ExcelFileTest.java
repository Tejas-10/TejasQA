
public class Read_Write_ExcelFileTest {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("C:\\ANT build\\NikulTest.xlsx");
		
		System.out.println(reader.getCellData("Data1", "Name", 3));
		
		System.out.println(reader.getCellData("Data1", 1, 3));
		
		String validEmail = reader.getCellData("Data1", "UserName", 2);
		
		System.out.println(validEmail);
		
		System.out.println(reader.getRowCount("Data1"));
		
		reader.setCellData("Data1", "Name", 12, "testing1");

	}

}
