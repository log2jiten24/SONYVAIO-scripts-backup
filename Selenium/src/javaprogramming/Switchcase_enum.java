package javaprogramming;

public class Switchcase_enum {
	
	enum Day {SUNDAY , MONDAY , TUESDAY, WEDNESDAY }

	public static void main(String[] args) {
		
		//Day day = Day.MONDAY ;

        Day day = Day.TUESDAY ;
		
		
		switch (day) {
		
		case SUNDAY :
		System.out.println("day is " + day);	
		break;
		
		case MONDAY :
		System.out.println("day is " + day);	
		
		
		case TUESDAY :
		System.out.println("day is " + day);	
		
		
		default :
		System.out.println("day is " );	
		break;	
		
		
			
		}

	}

}
