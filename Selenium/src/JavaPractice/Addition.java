package JavaPractice;

import java.math.BigInteger;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 20 ; 
//		
//		int b = 30 ; 
//		
//		int sum ; 
//		
//		sum = a + b ;
//		
//		System.out.println ("Sum of two numbers " + sum );
		
//		int num1, num2, sum ;
//		Scanner scan = new Scanner (System.in);
//		System.out.print("Enter first number :");
//		num1 = scan.nextInt() ;
//		System.out.print("Enter second number :");
//		num2 = scan.nextInt() ;
//		scan.close();
//		sum = num1 + num2 ;
//		System.out.println("Addition of two numbers: " + sum);
		
		//Addition of two numbers using BigInteger class
		String num1, num2 ;
		Scanner scan = new Scanner (System.in) ;
		System.out.println("Enter first number : ");
		num1 = scan.nextLine() ;
		
		System.out.println("Enter second number : ");
		num2 = scan.nextLine() ;
		
		BigInteger number1 = new BigInteger (num1) ;
		BigInteger number2 = new BigInteger (num2) ;
		BigInteger sum = number1.add(number2) ;
		System.out.println("Sum of two numbers : " + sum);
		
		
		
		 }
                }
