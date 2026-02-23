ppackage org.tns.acc.c2tc.core_java.java_basics;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number:");
		int num = sc.nextInt();
		
		int reverseNumber = 0;
		int Quatiant = num;
		while( Quatiant != 0) {
			
			int remainder =  Quatiant % 10 ;
			reverseNumber = reverseNumber*10 + remainder;
			Quatiant = Quatiant / 10;
		}
		
		System.out.println("Entered number:" + num);
		System.out.println("Reversed number:" + reverseNumber);
		
		if(num == reverseNumber) {
			System.out.println("Entered number is palindrome");
		}
		else {
			System.out.println("Entered number is not a palindrome");
		}
		
	}

}