package classroomjavatraining;



class Stonecoldwrestler extends Kanewrester  {

	public void stoecoldmusic ()
	{
	System.out.println ("Stonecoldmusic") ;
	}
	
	public void stonecoldfinishingmove()
	{
	System.out.println ("Stonecold finishing move ") ;	
	}
	
}



class Kanewrester extends Abstracttclassss {
   //when we extend class it will show error ,to fix error we have to 
   //add unimplemented methods to it extended from the Abstract class 
	
	
	@Override  //unimplemented method from abstract class
	public void welcomemusic() {
		// TODO Auto-generated method stub
		System.out.println("Wrestler welcome music");	
	}

	@Override //unimplemented method from abstract class
	void finishingmove() {
		// TODO Auto-generated method stub
		System.out.println("Wrestler welcome music");	
	}

	@Override //unimplemented methods of the interface(Interfacemethodd).
	public void wrestlerfight() {
		// TODO Auto-generated method stub
	System.out.println("Wrestlers fight club");		
	}

	@Override //implementing the methods from Interfacemethod2 ,as 
	//2nd interface has extended 1st interface and the 1st(main)interface is 
	//implementing Absractclass and abstractclass is extending kanewrestler class.
	
	public void writewithpen() //unimplemented methods of the Interfacemethodd2
	{
		// TODO Auto-generated method stub
		System.out.println("wrester write with pen");
	}
	
	
}


public abstract class Abstracttclassss implements Interfacemethodd {

	
	public static String writingname = "Jiten01" ;
	//abstract method - abstract class should have 
	//atleast one abstract method
	public abstract void welcomemusic () ;
	//this method body can be implemented by other class by writing the body 
	//inside the method
	
	abstract void finishingmove() ;
	
	public void paymentforwrestling (int hours){
		System.out.println("wrestler will make " + hours + 100  +" "
				+ "fought for every fight ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //creating i1 object reference of the Kanewrestler class
	Interfacemethodd i1 = new Kanewrester() ;
	
	//it will show only the methods defined in the interface
	//not defined in the class--but the method body will be executed kept inside the
	//class 
	//access the objects of the Kanewrestler class  
	//it will also show all the methods of the Interface1 and Interface2
	//writhwithpen - method is abstract ..but the body is defined at the 
	//kanewrestler class 
	 i1.writewithpen();
	 
	 i1.wrestlerfight();
	 
	 //class body is executed 
	 
	 
	 //calling the abstract class method with interface reference variable
	

	 //Once assigned with subclass object, the interface 
	 //variable works practically as an object. 
	 //paymentwrestler is concrete method present at the interface 
	double salary =  i1.paymentwrestler(23.9) ;
	System.out.println(salary);	
		
	//creating object and passing reference as Interface variable  
	Interfacemethodd i2 = new Stonecoldwrestler() ;
	//all the methods assosciated with the interface will be seen ,
	//but the method body inside the class would be executed
	i2.writewithpen(); 
	
	//it will return writingbypen method //
	i2.writhwithpencil() ;
	
	i2.writingbypen() ;
	
	//creating interface reference to acccess the methods of the kaneclass
	Interfacemethodd i3 = new Kanewrester() ;
	
	//all the methods of both the interfaces will be seen 
	//(Interfacemethodd and Interfacemethod2)
	i3.writhwithpencil() ;
	
	i3.wrestlerfight();
	
	//calling runtime polymorphism
	
	Abstracttclassss obj1 = new Kanewrester() ;
	//creating object of the kaneclass and passing reference to the 
	//abstractclass ,we can access all the methods of the interface1 , interface2
	//as well as the methods of all the classes
	
	//method for abstract class
	obj1.paymentforwrestling(20);
	
	//method of abstractclass
	obj1.finishingmove();
	
	//method of interface1 ,but body defined inside class
	obj1.finishingmove();
	
	//method of interface2 ,but body defined inside class
	obj1.writewithpen();
	
	//abstract method of interface2 ,body defined inside the interface 
	obj1.writingbypen() ;
	//concrete method of interface2 ,body defined inside the interface 
	obj1.writingbypen() ;
	//interface2 methods 
	
	}

}
