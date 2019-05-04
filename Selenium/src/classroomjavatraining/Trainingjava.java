package classroomjavatraining;

import java.util.Scanner;

public class Trainingjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100 ;
		int b ;
		int c ;
		
		b = ++a ;
		c = b++ ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int numbers [] = {6,10,12,15} ;
		int sum = 0 ; int count = 0 ;
		
		//to find the largest element inside an array 
		
		int largest = numbers[0] ;
		
		for (int x = 0 ; x < numbers.length; x ++ ) 
		{
			if (numbers[x] > largest) 
			largest = numbers[x] ;
			System.out.println("largest number :" + largest);
			
			sum = sum + numbers[x] ;
			System.out.println("summation of numbers:" + sum);
			
		}
		double average = (double)sum/numbers.length ;
		//to view the average in decimal point 
		System.out.println ("average of numbers :" + average) ;
		
		for (int value : numbers)
		{
			if (value > average)
			count ++ ;	
		}
		System.out.println("sales above average :" + count );
		
		//to find the largest elemnets inside the array 
		
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int num[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
         {
        num[i] = s.nextInt();
        }
       max = num[0];
       for(int i = 0; i < n; i++ )
        {
        if(max < num[i])
      {
       max = num[i];
           }
             }
      System.out.println("Maximum value:"+max);

    }
	
	}


