package JavaPractice;

public class Splitfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str = "Welcome to Jiten and Priya Home " ;
	
	// to split the sentence with white spaces
//	String words [] = str.split("\\s+") ;
//	
//	System.out.println("content inside the third array : - " + words[2]);
//	//Example of substring 
//	String cont = words[2].substring(1,3);
//	System.out.println("content inside the third array  : - " + cont );
//	
//	for (int i = 0 ; i < str.length() -1 ; i ++ )	
//	{
//	System.out.println("contents inside the array " + words[i]);	
//	}
	String [] words = str.split(" ") ;
	//String[] words2 = str.split(" " ,2) ;
	for (String word : words)
	{
		System.out.println("contents inside the array " + word );	
	}
	
	for (String wordlimit : str.split(" ", 2) )
	{
	System.out.println("contents inside the array count : " + wordlimit );	
	}
	//Output :
	//contents inside the array count : Welcome
	//contents inside the array count : to Jiten and Priya Home
	
	//Split the array based on t - character and print the array length
	String str2 = "Javattpointt" ;
	String[] w = str2.split("t" , 2);
	for (String count : w)
	{	
    System.out.println("contents inside the array " + count );
	  }
	System.out.println("print arraylength : " + w.length );
	}
       }
