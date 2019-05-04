package javaprogramming;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scannerreadcontentoffile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  String file = "C:\\Users\\Jiten\\Desktop\\VB script functions\\Practice2.txt" ;
		
  try {
	FileWriter fout = new FileWriter (file) ;
	//write the content of the file 
	fout.write("Myname is Jitu 1.5 , 2.5 is true and false");
	fout.close();
	//to read the content of the file 
	FileReader fr = new FileReader (file) ;
	//to scan the content of the file 
	Scanner scan = new Scanner (fr) ;
	
	while (scan.hasNext()) {//it scans the end of file 
	
	if (scan.hasNextDouble())	{
		double d = scan.nextDouble() ;
		System.out.println("double present :"+ d);
	}else if (scan.hasNextInt())	{
		int i = scan.nextInt() ;
		System.out.println("Integer present :" + i);
	}else if (scan.hasNextBoolean()) {
		boolean value = scan.nextBoolean() ;
		System.out.println("boolean value present :" + value);
		} else {
	String str = scan.next() ;
	System.out.println("String present :" + str);
		}		
	      }//while loop closure 
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
  
  
  //output 
  
//  String present :Myname
//  String present :is
//  String present :Jitu
//  double present :1.5
//  String present :,
//  double present :2.5
//  String present :is
//  boolean value present :true
//  String present :and
//  boolean value present :false
	}
        }
