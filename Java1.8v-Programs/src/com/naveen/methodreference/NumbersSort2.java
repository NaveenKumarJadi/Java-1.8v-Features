package com.naveen.methodreference;

import java.util.ArrayList;
import java.util.Collections;

//Approach 1: without Lambda
public class NumbersSort2 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);
		
		System.out.println("Before sort : " + al);
		
		// Descending order
		Collections.sort(al, (i, j) -> (i > j) ? -1 : 1);

		System.out.println("After sort : " + al);
	}
}
