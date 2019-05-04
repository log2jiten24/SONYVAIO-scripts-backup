package javaprogramming;

import java.util.Scanner;

public class alphabetcountinstring {

	public static void main(String[] args) {
		
		//to count the number of characters inside a string
		
		Scanner scan = new Scanner (System.in) ;
		System.out.println("Enter the string to be entered : ");
		String str = scan.nextLine() ;
		
		System.out.println("Enter the character  to be entered : " );
		String str2 = scan.next() ;
		System.out.println("Character entered : " + str2);
		//Converting  the string to a character 
		char ch = str2.charAt(0) ;
		
		int count = 0 ;
		
		for (int i = 0 ; i < str.length() -1 ; i ++ )
		{
		
		if (str.charAt(i) == ch )	
		{
			count ++ ;
		}		
		  }
    
        System.out.println("Occurence of character" + count );

            }
       }