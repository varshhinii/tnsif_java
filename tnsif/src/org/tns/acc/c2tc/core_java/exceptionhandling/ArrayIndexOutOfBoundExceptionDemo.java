package org.tns.acc.c2tc.core_java.exceptionhandling;

public class ArrayIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		
		int arr[]=new int[4] ; //position start =0, position end =3
		 
		 try {
			 int i =  arr[5];
			 System.out.println(i);
		 }catch (ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e);
		 }

	}

}