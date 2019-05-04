package classroomjavatraining;

import java.util.ArrayList;
import java.util.List;

abstract class Writer {
	
	public void write ()
	{
	System.out.println("abstact class writing");	
	}
	abstract void towrite (); //abstract method without any body 	
     }

class Author extends Writer {

	@Override//adding the unimplemented methods of the abstract class
	void towrite() {
		// TODO Auto-generated method stub
	System.out.println("abstract unimplemented methods for author class");	
	}
	
	public void write ()
	{
	System.out.println ("Author class writes") ;	
	}	
}

class Programmer extends Writer {

	@Override
	void towrite() 
	{
// TODO Auto-generated method stub
System.out.println("abstract unimplemented methods for Programmer class");	
	}
	
	public void write ()
	{
	System.out.println ("Programmer class writes") ;	
	}
}

public class Practiceset1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to verify the array index  out of bounds exception 
		
//		List<Integer> elements = new ArrayList<>();
//		elements.add(10);
//		int firstElmnt = elements.get(1);
//		System.out.println(firstElmnt);
		
		Writer w = new Programmer() ;//object of programmer class having reference 
		//of parent class 
		w.write(); 
		w.towrite();
		//example of run time polymorphism...when the java at run time decides 
		//which method to run ..child class method get the preceedence over the 
		//parent class method 
		
		Writer w1 = new Author() ;
		w1.write();
		w1.towrite();
	}

}
