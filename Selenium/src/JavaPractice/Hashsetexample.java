package JavaPractice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//implementation of hashset- it contains unique elements.
		//it implements set interface and extends collection class.
		
		HashSet <String> allCities = new HashSet <String> ();
		//to add the elements inside the hashset 
		allCities.add("Kolkata");
		allCities.add("Mumbai") ;
		allCities.add("Delhi") ;
		allCities.add("Pune") ;
		//it will not allow to add duplicate elements 
		allCities.add("Kolkata");
		//it will also allow to add collection list to the set
		allCities.addAll(allCities) ;
		
	    System.out.println("all elements present inside the set :" + allCities);
	    
	    boolean isdetails = allCities.remove("Delhi") ;
	    System.out.println("city removed successfully:" + isdetails);
	    
	    
	    
	    if (allCities.contains("Kolkata")){
	    System.out.println("Kolkata present");
	    }
	    //iterate the set using Iterator 
	    Iterator <String> alldetails = allCities.iterator() ;
	    while (alldetails.hasNext())
	    {
	    System.out.println("city details stored at hashset :" + alldetails.next());	
	    //to break the loop when particular element is found 
	    if (alldetails.next().contentEquals("Pune"))
	    {
	    System.out.println("Jitu leaves at Pune");
	    break ;
	    }
	       }
	    //iterate using for each loop
	    for (String cities : allCities)
	    {	
	    System.out.println("city details stored at hashset :" + cities);
	    if (cities.contains("Kolkata"))
	     {
	    System.out.println("Priya leaves at Kolkata");
	    break ;
	    		}
	     }
	       }
                    }
