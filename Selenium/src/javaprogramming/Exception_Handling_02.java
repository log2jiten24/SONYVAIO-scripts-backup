package javaprogramming;

public class Exception_Handling_02 {

	public static void validate (int age) {
		
		if (age <18) {
			throw new ArithmeticException("not valid age");
		}else {
				System.out.println("Welcome");
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		validate(18);

		System.out.println("rest of the code ");
	}

}
