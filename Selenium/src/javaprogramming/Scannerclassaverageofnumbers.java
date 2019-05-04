package javaprogramming;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scannerclassaverageofnumbers {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//to calculate average of numbers upon entering numbers through keyboard
	Scanner scan = new Scanner (System.in) ;
	int count = 0 ;
	double sum = 0 ;
	System.out.println("Enter the numbers :");
	
	while (scan.hasNext()) //it scans the end of file until it returns true 
	{
	if (scan.hasNextDouble())	{
	//it will take double number as input 	
	double num = scan.nextDouble() ;
	//adding the numbers 
	sum = sum + num ;
	count ++ ;//count the number of occurences 
	} else {
	String str = scan.next() ;
	if (str.equalsIgnoreCase("done")){
		break ;
	 }else {
	System.out.println("Data format error ");	
	return ;
	  }
	     }
	}//while loop closure 
	System.out.println("average sum of numbers :" + sum/count );
//output 	
//	Enter the numbers :
//		2.3
//		3.6
//		2.5
//		6.3
//		done
//		average sum of numbers :3.675
	
	//to write the numbers and find the average of the numbers 
	String file = "C:\\Users\\Jiten\\Desktop\\VB script functions\\Practice1.txt" ;
	double sum1 = 0 ;
	int count1 = 0 ;
	//to write the content inside the file 
	FileWriter fout = new FileWriter (file);
	fout.write("2.5 3.5 3 3.5 done");
	
	//fout.write("2.2,3.5,done");
	fout.close();//to close the file 
	//to read the content of the file 
	FileReader fr = new FileReader (file) ;
	Scanner scan2 = new Scanner (fr) ;
	
	while (scan2.hasNext()){
		//scans the entire notepad
	if(scan2.hasNextDouble()){
	double num1 = scan2.nextDouble() ;
	sum1 = sum1+ num1 ;
	count1 ++ ;
	}else {
	String str = scan2.next() ;
	if (str.equalsIgnoreCase("done")){
		break ; 
	} else {
		 System.out.println("Data format error :");
		 return ;
	}
	  }
	            }
	System.out.println("average sum of numbers :" + sum1/count1 );
	fr.close();
	       }
                     }
