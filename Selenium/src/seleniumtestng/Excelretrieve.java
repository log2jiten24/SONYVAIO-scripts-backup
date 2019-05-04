package seleniumtestng;
import javaprogramming.*;
public class Excelretrieve {
	
	public static String filepath = "D:\\Framework_01.xlsx" ;

	public static void main(String[] args) {
		//calling function by creating object and retreiving values og each row 
		ExcelFunctionlib obj = new ExcelFunctionlib(filepath) ;
		
		System.out.println("the values stored in the excel" + "-" +  obj.getData(0, 2, 2));
		
		if (obj.getData(0, 2, 2).equalsIgnoreCase("Mozilla.exe")) {
			System.out.println("testcase pased");
		}
	}

}
