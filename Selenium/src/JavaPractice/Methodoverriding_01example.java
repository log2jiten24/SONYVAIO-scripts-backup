package JavaPractice;

import org.apache.bcel.generic.MethodObserver;


//Method overriding example on how to use super keyword - it immediately address the parent 
//class variable and parent class method to address . 
class Vehicle {
	
int speed = 50 ; 	
}

public class Methodoverriding_01example extends Vehicle  {
 
	int speed = 100 ;
	
	void display ()
	{
	
	System.out.println("Speed of vehicle " + super.speed);
	
	// super keyword addresss the parent class variable and method .
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Methodoverriding_01example object = new Methodoverriding_01example() ; 
	
	object.display(); 
	
	}

}
