package com.naveen.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	// method without lambda
//	public boolean test(int i) {
//		if (i > 10) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public static void main(String[] args) {

		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(5));
		System.out.println(p.test(15));
		
		System.out.println("*******************");
		
		BiPredicate<Integer, Integer> bip = (i, j) -> (i+j) >= 20;
		System.out.println(bip.test(2, 3));
		System.out.println(bip.test(5, 9));
		
	}
}
