package JavaPractice;

public class Evenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = new int [] {10,20,30,35} ;
		
		for (int i = 1 ; i < numbers.length; i ++) {
			
			if (numbers[i]% 2 == 0) {
				System.out.println( "number is even : " + numbers [i]);
			}	else {
				System.out.println("number is odd :" + numbers[i]);	
				}
			           }
		
		//to find the smallest and largest number 
		
		int[] numbers1 = new int []{10,20,89,5} ;
		
		int largest = numbers1[0] ;
		int smallest = numbers1[0] ;
		
		for (int j = 1 ; j < numbers1.length ; j ++) {
		
		if (numbers1[j] > largest) {
			largest = numbers1[j] ;
		System.out.println("largest numbers is :" + largest);	
		} else if (numbers1[j] < smallest) {
			smallest = numbers1[j] ;
		System.out.println("smallest numbers is :" + smallest);		
		}
			
		}
		
		
		                  }
                                  }
