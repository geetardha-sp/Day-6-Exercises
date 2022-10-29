package com.sechpoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceMethodReference {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		persons.add(new Person("one", 106));
		persons.add(new Person("two", 101));
		persons.add(new Person("three", 82));

		Comparator comparator = new Comparator();
		
		Collections.sort(persons, comparator::compareByName);
		
		persons.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);

		System.out.println();
		
		Collections.sort(persons, comparator::compareByAge);
	
		persons.stream()
			.map(x -> x.getAge())
			.forEach(System.out::println);
	}
}
