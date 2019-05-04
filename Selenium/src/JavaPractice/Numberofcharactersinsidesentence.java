package JavaPractice;

import java.util.Scanner;

public class Numberofcharactersinsidesentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the  sentence : ") ;
		Scanner scan = new Scanner (System.in) ;
		String entered = scan.nextLine() ;
		
		//to count the number of occurences of character inside the string
		
		for ( char ch = 'A' ; ch < 'z' ; ch ++)
		{
		int k = 0 ;	
		for (int i = 0 ; i < entered.length() ; i ++)
		{
		char ch1 = entered.charAt(i) ;
		if (ch == ch1)
		{
		k ++ ;	
		  }
		
		if (k > 0)
		{
	System.out.println("Number of occurences of "+ch1+" inside the  "+entered+" "
			+ " is : "  + k );		   
		}
		     }
		       }   
	              }
                                  }
