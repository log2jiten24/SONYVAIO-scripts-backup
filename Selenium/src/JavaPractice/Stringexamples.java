package JavaPractice;

public class Stringexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	//to char Array example - it converts the string into character of arrays.
//		String to chararray convert : M
//		String to chararray convert : y
//		String to chararray convert :  
//		String to chararray convert : n
//		String to chararray convert : a
//		String to chararray convert : m
//		String to chararray convert : e	
	String str = "My name is jitu" ;
	char ch [] = str.toCharArray() ;
    for (int i = 0 ; i < ch.length ; i ++)
    {
    System.out.println("String to chararray convert : " + ch[i]);
    }
//	The java string valueOf() method converts different types of values into string.
//	By the help of string valueOf() method, you can convert int to string,
//	long to string, boolean to string, 
//	character to string, float to string, 
//	double to string, object to string and char array to string.		
		
//    int i = 10 ;
//    boolean bol = true ;
//    char ch = 'A' ;
//    String str1 = String.valueOf(i) ;
//    String str2 = String.valueOf(bol) ;
//    String str3 = String.valueOf(ch) ;
    
//    String str = "My name is Jiten" ;
//    //returns the last index of the position of the String 
//    int index1 = str.lastIndexOf('i') ;
//    //returns the last index of  the position inside the String from specific start 
//    //position
//    int index2 = str.lastIndexOf('i', 15) ;
//    //It returns the last index of the substring inside a string 
//    int index3 = str.lastIndexOf("is") ;
//    if (index3 > 0)
//    {
//    System.out.println("Search successfull");
//    }else {
//    System.out.println("Search not successfull");	
//    }
//    //it returns the last index of the substring from speicfic start index 
//    int index4 = str.lastIndexOf("name", 3);
//    
//    System.out.println("integer index : " + index1);
//    System.out.println("integer index starting : " + index2);
//    System.out.println("string index starting of substring :" + index3);
//    System.out.println("string index starting : " + index4);
    
    
  //equals method -  compares two string - character senitive.
  //equals Ignore Case - compares two string - character insenitive
		
//  String s1 = "Sachin" ;
//  String s2 = "SACHIN" ;
//  String s3 = new String("Sachin") ;
//  String s4 = "Sachin" ;
//  String s5 = "sachin" ;
//  
//  System.out.println(s1.equals(s2));
//  
//  System.out.println(s1.equalsIgnoreCase(s2));
//  System.out.println(s1 == s4);
//  System.out.println(s1 == s3) ;
//  System.out.println (s1.equals(s5));
//
// System.out.println (s1.equalsIgnoreCase(s5));
    
 
 //compareTo - method compares values lexicographically and returns an integer value 
 //that describes if first string is less than, equal to or greater than second string.
// s1 == s2 :0
// s1 > s2   :positive value
// s1 < s2   :negative value

String s6 = "Jiten";
String s7 = "Priyawa" ;
String s8 = "jiten";
String s9 = "Jiten" ;
//compareTo - method both the string length should be equal and case sensitive
System.out.println(s6.compareTo(s9));
//it will return zero as both the strings are equal and case sensitive
System.out.println(s6.compareToIgnoreCase(s8));
//it will return zero as both the strings are equal and case insensitive
 
System.out.println(s6.compareTo(s8));
//it will return -1 as both the strings are not equal 

System.out.println(s6.compareTo(s7));
//it will return -1 

System.out.println(s7.compareTo(s6));
// it will return + 1 



	}

}
