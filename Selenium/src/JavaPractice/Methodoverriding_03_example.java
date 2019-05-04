package JavaPractice;

import java.util.Scanner;

//we cannot declare objects of the abstract class 

// we cannot declare abstract constructors or abstract static methods 

abstract class Maths {
	
//Scanner num1 = new Scanner (System.in) ;
//int var1 = num1.nextInt() ;
//Scanner num2 = new Scanner (System.in) ;
//int var2 = num2.nextInt() ;

int var1,var2,var3 ;
abstract void calculate () ;

void addition () {
var3 = var1 + var2 ; 
System.out.println("Addition is :" + var3);
 
  }

     }



class Arithmetic extends Maths {

	//Create Parameterized Constructor 
	
	Arithmetic (int x , int y ) 
	{
	var1 = x ;
	var2 = y ;
	}
	@Override
	void calculate() {
	var3 = var1 - var2 ; 
	System.out.println ("Substraction is : " + var3 );
		
	}
	

	
}




public class Methodoverriding_03_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Arithmetic a = new Arithmetic (24, 12) ;
	
	a.calculate();
	
	
	
	
	
	
	}

}
