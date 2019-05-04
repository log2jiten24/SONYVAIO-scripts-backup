package JavaPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmapexample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	HashMap <Integer , String> hm = new HashMap <Integer , String> ();
	
	hm.put(1, "Delhi");
	hm.put(2, "Kolkata");
	hm.put(3, "Ara");
	//replace the key value to a new value
	hm.put(3, "Pune") ;
	
	System.out.println("content present inside the hashmap :" + hm);
	//to get the value for a specified key
	System.out.println("content present inside specific key :" +hm.get(2)) ;
	//containsKey - method -verify the specified key is present or not 
	if(hm.containsKey(1) == true )
	{
	System.out.println("key present ");	
	} 
	
	if (hm.containsValue("Pune"))
	{
	System.out.println("Pune present ");	
	}
	  
//to verify the replace function working on the hashmap 
	hm.replace(3, "Pune", "Sydney");
	System.out.println("content present inside the hashmap after replacing :" + hm); 
	//to verify the remove key 
	hm.remove(3) ;
	System.out.println("content removing element inside hashmap :" + hm);
	
	// to iterate inside the keyset and retrieve each key 
	
	for (int keyelement : hm.keySet())
	{
	System.out.println("each key present :" + keyelement);	
	
	  }
	
	//to retrieve each value from the hash map 
	for (String elements : hm.values())
	{
		System.out.println("each value present :" + elements);
		if (elements.contains("Delhi"))
		{
			System.out.println("Delhi present inside hashmap");		
			break ;
		  }
	        }
	
	
	// to retrieve all the keys and values of the hash map at one go 
	
	for (Map.Entry<Integer, String> alldetails: hm.entrySet())
	{
	//it returns all the elements inside the key	
	int keyvalues = alldetails.getKey() ;
	String mapvalues = alldetails.getValue() ;
	
	System.out.println("all key values present inside hashmap :" +keyvalues + ","
	+  mapvalues);
	
	if (mapvalues.contains("Delhi"))
	{
		System.out.println("Delhi is present at hashmap");		
	}
	}
	
	}	
}
