package javaprogramming;

import java.util.HashMap;

public class Cognizantinterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to verify the == operator //it works same like as the equals operator 
		//== and equals method are the same
		
//		String s1= "Jitu and Priya" ;
//		String s2 = "jitu and priya" ;
//		
//		if (s1 == s2) {
//			System.out.println ("Strings are equal ")  ;
//		}else {
//			System.out.println ("Strings are not equal ")  ;
//		}
		
		
		//to demonstrate the usage of hash map if duplicate keys value is present  
		
		HashMap <Integer , String > hm = new HashMap <Integer , String> () ;
		
		hm.put(1, "Jitu") ;
		hm.put(2, "priya") ;
		hm.put(1, "khushi") ;
		hm.put(1, "Priya") ;
		hm.replace(1, "Priya", "priyaawaa") ;
		System.out.println("content present in hash map :" + hm);
		//output - content present in hash map :{1=priyaawaa, 2=priya}
		
		//to display all the keys 
		for (Integer keyitems : hm.keySet())
		{
		System.out.println("all keyitems :" + keyitems);	
		}
		
		//to display the all values 
		for (String values : hm.values())
		{
		System.out.println("all values present :" + values);	
		}
	
	
	      }

}
