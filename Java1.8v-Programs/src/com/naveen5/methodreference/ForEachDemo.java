package com.naveen5.methodreference;

import java.util.ArrayList;

public class ForEachDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);
		
		//for loop
		for(int i =0; i< al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("*************************");
		
		//forEach loop
		for(int i : al) {
			System.out.println(i);
		}
		
		System.out.println("*************************");
		
		//forEach() method
		al.forEach(i -> System.out.println(i));
	}

}
