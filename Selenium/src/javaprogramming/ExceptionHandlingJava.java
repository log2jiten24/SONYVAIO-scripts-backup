package javaprogramming;

public class ExceptionHandlingJava {

	private static int  data;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int data = 50/0 ;
		}catch (ArithmeticException  e ) {
		System.out.println ("valid exception is" + e.getMessage() );
		System.out.println("divided by data is" + data );
	}
     finally {
	  data = 50/3 ;
	  System.out.println("final data is " + data );
	}
	}
           }
