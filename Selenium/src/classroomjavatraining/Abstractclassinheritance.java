package classroomjavatraining;

abstract class Training {

abstract void javatraining () ;

abstract String csharptraining (String name);

void absrtacttrainig ()
{
System.out.println("abstract parent class training");	
}
	
}

class Infosys extends Training {
   //abstract class method definition defined in child class
	@Override
	void javatraining() {
	System.out.println("Infosys class javatraining");	
	}

	@Override
	String csharptraining(String name) {
		// TODO Auto-generated method stub
	name = name.toUpperCase() ;
	return name ;
	}
	
}

//this proves abstract class can be extended by multiple classes
class Wipro extends Training{

	@Override
	void javatraining() {
		// TODO Auto-generated method stub
	System.out.println("Wipro class javatraining");	
	}	
	

	@Override
	String csharptraining(String name) {
		// TODO Auto-generated method stub
		String name2 = name.toLowerCase() ;
		return name2 ;
	}
	
	void absrtacttrainig ()
	{
	System.out.println("wipro child  class training");	
	}
}


class Zensar extends Training {

	@Override
	void javatraining() {
		// TODO Auto-generated method stub
	System.out.println("Zensar class javatraining");		
	}

	@Override
	String csharptraining(String name) {
		// TODO Auto-generated method stub
		return name;
	}
	
}
//Abstract class can also be extended by many classes
public class Abstractclassinheritance extends Training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of the Infosys class and passing reference of the 
		//abstract class 
		//it will show all the methods defined in the abstract class
		
		Training obj = new Infosys () ;
		//but the body defined inside the child class body will execute
		obj.javatraining();
		//it will print the abstract class body defined inside abstract class 
		obj.absrtacttrainig();
		//but the body defined inside the child class body will execute
		String nm = obj.csharptraining("JiTenn") ;
		System.out.println("Infosys class method execute :" + nm);
		
		Training obj1 = new Wipro ();
		//run time polymorphism - it will print child class method
		obj1.absrtacttrainig();
		//child class body will execute
		String nm01 = obj1.csharptraining("kHusHii");
		System.out.println("Wipro class method execute:" + nm01);
		
		//child class body will execute
		obj1.javatraining(); 
		
		Training obj2 = new Abstractclassinheritance() ;
		//it will print abstract class body defined inside abstract class
		obj2.absrtacttrainig();
		//child class body will execute
		String nm03 = obj2.csharptraining("kHusHii");
		System.out.println("Abstract class method execute:" + nm03);
		
		//child class body will execute
		obj2.javatraining(); 
		
		Training obj3 = new Zensar() ;
		obj3.javatraining();
		String nm04 = obj3.csharptraining("PRIYAWAA") ;
		System.out.println("Zensar class method execute:" + nm04);
	}

	@Override
	void javatraining() {
		// TODO Auto-generated method stub
	System.out.println("Abstract class inheritance javatraining");		
	}

	@Override
	String csharptraining(String name) {
		// TODO Auto-generated method stub
		return name;
	}

}
