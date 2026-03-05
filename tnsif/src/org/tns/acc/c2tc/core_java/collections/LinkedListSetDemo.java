package org.tns.acc.c2tc.core_java.collections;

import java.util.LinkedHashSet;

public class LinkedListSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set=new LinkedHashSet<>();
		set.add("cherry");
		set.add("banana");
		set.add("apple");
		set.add(null);
		set.add(null);
		System.out.println("LinkedHashSet: " + set);
		
	}

}