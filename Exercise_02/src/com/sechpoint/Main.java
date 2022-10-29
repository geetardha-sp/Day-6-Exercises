package com.sechpoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,3,4,5,34,34,3,4,121,1,3434,3,434,3,4,34343,3);
		
		System.out.println("Even numbers: " + list.stream()
			.filter(n -> n % 2 == 0)
			.collect(Collectors.toList()));
		
		System.out.println("Numbers starting with 1: " + list.stream()
			.filter(i -> String.valueOf(i).startsWith("1"))
			.collect(Collectors.toList()));
		
		System.out.println("Duplicate numbers: " + list.stream()
			.filter(i -> Collections.frequency(list, i) > 1)
			.collect(Collectors.toSet()));
		
		System.out.println("First element: " + list.stream()
			.findFirst()
			.orElse(null));
		
		System.out.println("Elements count: " + list.stream()
			.count());
		
		System.out.println("Sorted numbers: " + list.stream()
			.sorted()
			.collect(Collectors.toList()));
		
		System.out.println("First non-repeating element: " + list.stream()
			.filter(i -> Collections.frequency(list, i) == 1)
			.collect(Collectors.toList()).get(0));
	}
}
