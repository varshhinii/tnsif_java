package org.tns.acc.c2tc.core_java.java_basics;

public class VariableDemo {
	int a = 10;//instance variable
	
	void print()
	{
		String msg = "Hello";//local variable
		 
		System.out.println(msg);
	}
	static String message = "Hello World" ;//static variable

	public static void main(String[] args) {
		
		VariableDemo obj = new VariableDemo(); 
		
		System.out.println("The value of a is "+obj.a);
		obj.print();
		System.out.println(message);

	}
}