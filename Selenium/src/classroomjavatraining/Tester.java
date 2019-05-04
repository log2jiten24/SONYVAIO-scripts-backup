package classroomjavatraining;



//class Base {
//	public void mehod (int a) {
//		System.out.println("Base method");
//	}
//	
//	class Derived extends Base {
//		
//		public void method (){
//		
//		System.out.println("Derived method");	
//		}
//	}
//}
//public class Tester {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Base obj = new Derived ();
//		//iy will show complation error 
//		
//		obj.mehod(25);
//		



class Base {
	
	private void basemethod ()
	{
	System.out.println("basemethod");	
	}
	
	public void toread (){
		System.out.println("super class to read");
	}
	
	protected void towrite ()
	{
	System.out.println("super class to write");	
	}
	
	void tospeak ()
	{
	System.out.println("super class to speak");	
	}
}

class Derived extends Base {
	
	private void basemethod ()
	{
	System.out.println("basemethod");	
	}
	
	public void toread ()
	{
		System.out.println("child class to read");
	}
	
	protected void towrite ()
	{
	System.out.println("child class to write");	
	}
	
}

public class Tester {


	public static void main(String[] args) {

		//int x, y ,z ;
		//System.out.println (x + y + z);
	Derived obj = new Derived() ;
// No, a private method cannot be overridden since it is not visible 
// from any other class. 
//You have declared a new method for your subclass 
//that has no relation to the superclass method.
	//obj.b//the overridden method will not be displayed 

  }
}