package org.tns.acc.c2tc.core_java.exceptionhandling;

import java.util.Scanner;

public class ArithematicExceptionDemo {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	System.out.println("enter your number:");
	int numinator = scan.nextInt();
	System.out.println("enter your number:");
	int denominastor = scan.nextInt();	
	
	try
	{
		int result = numinator/denominastor;
		System.out.println(result);
	}catch(ArithmeticException e)
	{
		System.out.println("Division by zero is not possible");
	}
	
		/*int number_one=50/5;
		System.out.println(number_one);
		int number_two=50/10;
		System.out.println(number_two);
		try
		{
			int number_three=50/0;
			System.out.println(number_three);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		int number_four=50/25;
		System.out.println(number_four);	*/

	}
}