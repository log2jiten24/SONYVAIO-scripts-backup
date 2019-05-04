package javaprogramming;

class Animal {

public void move () {

System.out.println("Animals can move");

}
	
}

class Dog extends Animal {

public void move () {
	
//invoke parent class method using super keyword 
super.move();
System.out.println("Dogs can walk and run");

}
	
  }

public class Methodoverriding_02_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal b = new Dog() ;
		
		b.move(); 

	}

}
