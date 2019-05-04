package JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class Hashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashmap extends Hashmap class and it implements abstract class interface.
		//it contains only unique elements,no duplicate elements
		//it has keys and values ,it can contain one null key and many null values
		
		HashMap <Integer , String> hm = new HashMap <Integer , String> () ;
		hm.put(101, "Jitu") ;
		hm.put(105, "Priyaa");
		hm.put(224, "Khushi");
		
		System.out.println("Values before removing element :" + hm);
		//remove the key
		hm.remove(224);
		System.out.println("Values after removing element :" + hm);
		
		System.out.println("Values inside the hashmap present : " + hm.containsValue("Priyaa"));
		System.out.println("Key value inside the hashmap present : " + hm.containsKey(101));
		
		//iterate through hashmap using for each loop
		//entryset method - returns collection of the elements of the hashmap
		for (Map.Entry<Integer, String> allelements : hm.entrySet())
		{	
		int keylist = allelements.getKey() ;
		String values = allelements.getValue() ;
		
		System.out.println("values present inside the key: " + keylist + 
	    "values present for hashmap : " + values ); 
	    }
           }
                    }