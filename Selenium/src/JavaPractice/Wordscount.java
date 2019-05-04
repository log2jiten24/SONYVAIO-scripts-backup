package JavaPractice;

import java.util.Scanner;

public class Wordscount {

	public static void main(String[] args) {
		//to count the number of words inside the string 
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the string");
		String entered = scan.nextLine() ;
		
		System.out.println("Enter the word to be searched : ");
		String words = scan.nextLine() ;
		//storing each character inside char array 
		//int i = 0;
		char ch [] = entered.toCharArray() ;
		//System.out.println("each character inside the array :" + ch[i]);
		
		String str = "";
		int occurence = 0 ;
		//to iterate over the char array
		for (char c : ch )
		{
		//to store each character inside the string and adding it 
		str = str + c  ;
		//to display each character stored inside the string 
		System.out.println("Each stored inside sttrng :" + str);
		if (str.length() == words.length())
		 {
		if (str.equalsIgnoreCase(words))	
		{ 
		occurence ++ ;	
		   }
		str = str.substring(1);
		System.out.println("formation of complete string :" + str);
		     }
		         }
	    if (occurence > 0 )
	    {
	  System.out.println("Number of occurence of "+words+" inside the "+entered+"  is : "
	  		+ occurence ); 	
	    }
	
   }
     }