package javaprogramming;

import java.util.LinkedList;
import java.util.List;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //length of the string
		String str1 = "My name is Jitu" ;
		String str2 = "My name is JITU" ;
		String str3 = " My name is JItuu " ;
		
		int len = str1.length();
		System.out.println("length of the string :" + len);
		
		//demonstration of charAt() - method
		//it returns each character of the sring based on the index
		char ch = str1.charAt(0) ;
		System.out.println("character of each string :" + ch);

		//demonstration of getChars() - method
		//it extracts the sequence of characters from the string 
//		srcBegin - index of the first character in the string to copy. 
//		srcEnd - index after the last character in the string to copy. 
//		dst - the destination array. 
//		dstBegin - the start offset in the destination array , destination beginning index
		//void getChars (int start, int end , char target[] , int tstart)
		//this will extract the characters from position start to end 
		//and store it in character array target from position tstart 
		//create a char array having 4 character 
//		char[] charArray = new char[15] ;
//		//Create a object from the string builder class
//	    StringBuilder sb = new StringBuilder(str1) ;
//	    System.out.println(str1);
//	    sb.getChars(4, 8, charArray, 0);
//	    System.out.println ("words from the string using getchars:" + charArray);
	   	
		
		// usage of substring method 
		//substring(int start)- it will return the string from where we are going to start
		String word = str1.substring(11) ;
		System.out.println ("words from the string using substring:- " + word);
	   	
		//String word1 = str1.substring(3, 7);
		String word1 = str1.substring(3, 7);
		System.out.println ("words from the string using substring:- " + word1);
		
		
		//getBytes  - it converts the string characters into ASCII equivalents ans 
		// stores it into the byte aaray.
//		byte b[] = new byte [10] ; 
//		b = str1.getBytes() ;
//		System.out.println ("byte from the string - " + b);
		
		//equals and equalsignorecase methods
		//equals method - compares the two string are equal or not and it is case sensitive
		//equalsIgnoreCase - compares the two strings are equal or not and it's not case sensitive
		if (str1.equals(str2))
		{
			System.out.println("Both the string equals");
		}
		else {
			System.out.println("Both the string  is not equal");	
		}
		if (str1.equalsIgnoreCase(str2)) 
		{
			System.out.println("Both the strings are equal");	
		}
		
		
		//compare to and compareIgnorecase methods - 
		//it is used to check whether one string is greater than,less than,or equal 
		//to another string or not 
		//compareTo is case sensitive and compareToIgnoreCase is caseInsensitive
		if (str1.compareTo(str2) == 0)
		{
			System.out.println("Both the string lenth equals");
		}
		else {
			System.out.println("Both the string length is not equal");	
		}	
		if (str1.compareToIgnoreCase(str2) == 0)
		{
			System.out.println("Both the strings length are equal");
		}
		
		
		//indexOf() - method (it is used to search a particular character or substring 
		//in the string then this method can be used, this method returns the index of the particular character 
		//or string which is searched
		//int indexOf(String str) - this method searches the first occurrence of the character from the string.
		// int indexOf (string str, int startIndex)
		//public int indexOf(String str,  int fromIndex)
        //Returns the index within this string of the first occurrence of the specified substring,
        //starting at the specified index. 
        //The returned index is the smallest value k for which: 

		
		int in = str1.indexOf("Jit");
		System.out.println("position of the string" + in);
		
		int n = str1.indexOf("name", 2) ;
		System.out.println("position of the string" + n);
		 
		int m = str1.indexOf(4);
		System.out.println("position of the string" + m);
		
		//lastIndexOf() - returns the index of the particular character or string which is searched
		//int lastIndexOf() = str1.lastIndexOf (String str)
		int lastindexx = str1.lastIndexOf("tu");
		System.out.println("position of the laststring - " + lastindexx);
		
		//int lastindexeg = str1.lastIndexOf (str , int fromindex)
		int lastindexeg = str1.lastIndexOf("tu", 13);
		System.out.println("position of the laststringbased on string start index - " + lastindexeg);
		
		
		//replace() - This method is used to replace all the occurrence of a character 
		//with another character of the string .
		
		//String replace (char original , char replacement ) - it replaces only a single character
		
		String updatedString = str1.replace('M', 'T');
		System.out.println("position of the updatedStringcharacter - " + updatedString);
		
		//String replace (charsequencetarget , charsequencereplacement )
		String updateseqofChars = str1.replace("My", "The");
		System.out.println("position of the updatedStringcharacter - " + updateseqofChars);
		
		// String replaceAll method - replacement sequence of characters
		String updtreplace = str1.replaceAll("i", "a");
		System.out.println("position of the updatedreplace - " + updtreplace);
		
		
		//contains() - method searches the sequence of characters in this string.
		//It returns true if sequence of char values are found in this string otherwise returns false.
		
		System.out.println(str1.contains("name"));
		
		//It will return true if a particular string is searched inside a string .
		
		//contentEquals - method it will return false if the strings are equal or not 
		System.out.println(str1.contentEquals(str2));
		// it will return false as both the strings are equal or not.
		
		//Join() - java string join() method returns a string joined with given delimiter. 
		//In string join method, delimiter is copied for each elements.
		 
		String joinedstring = str1.join("-","Myname", "is" ,"Jitu") ;
		System.out.println("Joined string is  " + joinedstring );
		//Output - Joined string is  Myname-is-Jitu
		
		String joinedstrinng = str1.join("-", "Mynameis" , "Jitu");
		System.out.println("Joined string is  " + joinedstrinng );
		//OutputJoined string is  Mynameis-Jitu
				
		//another example of join method 
		//String java.lang.String.join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
		//Returns a new String composed of copies of the CharSequence elements 
		//joined together with a copy of the specified delimiter. 
		 List<String> strings = new LinkedList();
	     strings.add("Java");
	     strings.add("is");
	     strings.add("cool");
	     String message = String.join(" ", strings);
	     System.out.println("Joined string is  " + message );
	     //message returned is: "Java is cool"
		
	     
	     //trim() method - it removes the spaces from the start and end of the string
	     
	     String trimupdate = str3.trim() ;
	     System.out.println("String after removing spaces - " + trimupdate );
	     
	     
	     //toLowerCase () and toUpperCase () 
	     
	     String uppercaseupdt = str1.toUpperCase() ;
	     System.out.println("String afer converting to uppercase - " +uppercaseupdt ); 
	     
	     String lowercase = str1.toLowerCase() ;
	     System.out.println("String afer converting to uppercase - " +lowercase ); 
	     
	     
	     //split function public String[] split(String regex)
	     //Splits this string around matches of the given regular expression. 
	     //This method works as if by invoking the two-argument split method with the given expression and a limit argument of zero

	     
	     String [] words = str1.split("\\s") ;
	     
	     for (String each : words)
	     {
	    	System.out.println("each words in a sentence - " + each); 
	    	
	    	//System.out.println("particular words in a sentence - " + words[1]);
	    	
	    	if (words[1].contentEquals("name"))
	    	{
	    		System.out.println("test case passed");
	    	}
	    	else {
	    		System.out.println("test case failed");
	    	}
	    	
	     }
	     
	     //Parameters: 
//	    	 regex - the delimiting regular expression 
//	    	 limit - the result threshold, as described above 
//	    	 Returns: 
//	    	 the array of strings computed by splitting this string around matches of the given regular expression 
//	    	 Throws: 
//	    	 PatternSyntaxException - if the regular expression's syntax is invalid 
//           Splits this string around matches of the given regular expression. 
//	         The array returned by this method contains each substring of this string 
//           that is terminated by another substring that matches the given expression or is terminated by the end of the string.
 	     
	     
	     
	     String [] words01 = str1.split("\\s", 0) ;
	     for (String w : words01)
	     {
	     //System.out.println("the words contained in the string delimitter - " + w);	 
	     System.out.println("words contained in the string is - " + words01[2]);
	     
	     System.out.println("words contained in the second  string is - " + words01[3]);
	     
	     
	     }
	     
	     
	     
	     
	     
	     
	     
	     	
	}

}
