package classroomjavatraining;

public interface Interfacemethod2 {	
	//interface having public and  static name 
	public static String writingname = "Jiten" ;
	
	public static void writingmethod ()
	{
	//Interface can have concrete body with the definitios of the body 	
	System.out.println("which writing method to use");	
	}
	//abstract methods without body 
	abstract void writewithpen ();
	
	//interface having default method with concrete body
	default String writingbypen()
	{
	return  writingname ;
	}
	
	//only combination of default ,static and abstract 
	default String writhwithpencil ()
	{
	//it can also return method 	
	return writingbypen();		
	}
	  }
