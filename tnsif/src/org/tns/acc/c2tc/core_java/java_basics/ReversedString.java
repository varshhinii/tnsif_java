package org.tns.acc.c2tc.core_java.java_basics;

import java.util.Scanner;

public class ReversedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String  to reverse:");
		String word = sc.next();
		
		String rev_word = "";
		for(int i = word.length() - 1; i >= 0; i--) {
			rev_word += word.charAt(i);
		}
		System.out.println("String :" + word);
		System.out.println("Reversed String :" + rev_word);
		
		sc.close();
	}
	
}