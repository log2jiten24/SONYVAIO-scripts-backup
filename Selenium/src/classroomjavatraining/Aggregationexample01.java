package classroomjavatraining;

class Address {
	
String name ; 
String city ;
String address ;

Address (String name , String city , String address)
{
	this.name = name ;
	this.city = city ;
	this.address = address ;
   }

void displayaddress ()
{
	System.out.println ("Parent class display :" + 
    name + "," + city + "," + address);
}

int square (int n)
{
return n*n ;	
}
  }
public class Aggregationexample01 {

	int id ;
	String state ;
	//aggregate - has A relationship 
	Address address ;
	
	final double pi = 3.14 ;
	
	Aggregationexample01 (int id ,String state, Address address ){
	this.id = id ;
	this.state = state ;
	this.address = address ;
	}
	
	void displaychildclass (){
	System.out.println(id + ","+ state);	
	//accessing the parent class Address attributes - this is 
	//example of aggregation in java 
	System.out.println("child class display :"+ address.city + "," + address.name + "," 
	+ address.address);
	}
	
	double calculatearea (int radius){
	//accessing the parent class methods without using inheritance 	
	double area = address.square(radius)*pi ;	
	return area ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Address address = new Address("Jitu", "Kolkata", "jenyns road") ;
    Address address1 = new Address("Priya", "Araah", "pakdi road") ;
    
    address.displayaddress();
    address1.displayaddress();
    //passing the object reference to the child class constructor 
    Aggregationexample01 obj = new Aggregationexample01(450, "WB", address1) ;
    address = new Address("Khushi", "Pune", "Wakad");
    address.displayaddress();
    
    double areacal = obj.calculatearea(5);
    System.out.println("area calculate :" + areacal);
    
    obj.displaychildclass();
    
	}

}
