package classroomjavatraining;

public interface Interfacemethodd  extends Interfacemethod2{
    
	//interface having abstract methods 
	 abstract void wrestlerfight(); 
	 
	//interface can have static and final variables 
	static double payment = 200.5;

	//interface having concrete method 
	public default double paymentwrestler(double dollars) 
	{
     double amount = payment * dollars ;
	return amount ;
	}
	
	

}


