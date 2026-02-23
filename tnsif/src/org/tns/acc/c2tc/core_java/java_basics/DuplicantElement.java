package org.tns.acc.c2tc.core_java.java_basics;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DuplicantElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array size:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		boolean flag = false;
		for(int i = 0; i<n;i++) {
			System.out.println("ENter the number:");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		for(int i = 0; i<n;i++) {
			for(int j = i+1; j<n;j++) {
				if (arr[i] == arr[j] ) {
					System.out.println("Duplicate element:"+arr[i]);
					flag = true;		
				}
			}	
		}
		
		if(flag == false) {
			System.out.println("Duplicate element not found");
		}
		
		
	}

}