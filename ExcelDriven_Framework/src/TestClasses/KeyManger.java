package TestClasses;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyManger {

	public void Execute() throws IOException {
		System.out.println("KeyManager Start");

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		System.out.println("WebDriverWrapper Creating.");
		WebDriverWrapper wrapper = new WebDriverWrapper(driver);
		System.out.println("WebDriverWrapper Created");

		System.out.println("File Reading");
		DataLayer d1 = new DataLayer() ;
		
		
		Object[][] excelData = d1.ReadExcel("C:\\Users\\Jiten\\eclipse-workspace\\ExcelDriven_Framework\\TestData\\Excel_Data.xlsx", "Sheet1", 3);
		System.out.println("File Read");

		for (int r = 0; r < excelData.length; r++) {

			String command = (String) excelData[r][0];
			String xpathTraget = (String) excelData[r][1];
			String value = (String) excelData[r][2];
            
			System.out.println(command + "\t" + xpathTraget + "\t" + value);
			if (command.equalsIgnoreCase("open")) {
				System.out.println("Open command Executing");
				wrapper.Open(xpathTraget);
				System.out.println("Open command Executed");
			}
			else if(command.equalsIgnoreCase("type")){
				wrapper.type(xpathTraget, value);
			}

		}

		System.out.println("KeyManager End");
	}

}
