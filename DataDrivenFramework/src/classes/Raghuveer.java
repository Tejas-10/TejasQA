package classes;

public class Raghuveer {
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			
			
		Xls_Reader reader = new Xls_Reader("C:\\testing\\ReadDataFromExcel.xlsx");
		String firstName =	reader.getCellData("Registration", "firstname", 2);
		String firstname = reader.getCellData("Registration", 0, 2);
		System.out.println(firstName);
		System.out.println(firstname);
		// Kem ma fade la?
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		
		driver.get("https://reg.ebay.in/reg/PartialReg");
		driver.manage().window().maximize();
		Thread.sleep(5000L);
			
			
			
			driver.close();*/

		}

	}


