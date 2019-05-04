package javaprogramming;

public class Stringsprogramming {

	public static void main(String[] args) {
		
	//string reverse  programming 	
    String str1 = "Welcome to Selenium" ;
    String reverse = "" ;
    int len = str1.length();
    System.out.println("String length is " + "-" + len);
    // print each characer of the string 
    // for loop - first part is initialization ,it will execute first 
    // second part is the condition on which the for loop needs to be checked
    // third part is increment or decrement after each step 
    for (int i =   len-1 ; i >= 0 ; i --  )
    {	
    // it will get each character of the String from last 	
     char ch = str1.charAt(i) ;
     //concat with reverse string 
     reverse = reverse + str1.charAt(i) ;
     System.out.println("reverse of the  string is " + reverse  );
    	
	}

    
    
    //Sorting of strings using String Arrays based on the character 
    
    String name[] = {"Jiten" , "Priya" , "Vivek" , "Khushi" };
    
    String temp ;
    
    for (int i = 0; i <name.length ; i ++)	
    for (int j = 0 ; j < name.length ; j++)
    	
    if (name[i].compareTo(name[j]) < 0)
    {	
    temp = name[i] ;
    name[i] = name[j];
    name[j] = temp ; 
     }
    System.out.println("Sorted strings is - ");
    for (int i = 0 ; i <name.length ; i ++)
    System.out.println("Sorted strings is - " + name[i]);	
    
   }
          }


//output of the sorted strings
//Sorted strings is - Jiten
//Sorted strings is - Khushi
//Sorted strings is - Priya
//Sorted strings is - Vivek