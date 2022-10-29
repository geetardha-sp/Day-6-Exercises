package com.sechpoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethodReference {
	public static int compareByName(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
	
	public static int compareByAge(Person p1, Person p2) {
		return p1.getAge().compareTo(p2.getAge());
	}
	
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		persons.add(new Person("one", 33));
		persons.add(new Person("two", 21));
		persons.add(new Person("three", 34));

		Collections.sort(persons, StaticMethodReference::compareByName);
		
		persons.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);

		System.out.println();
		
		Collections.sort(persons, StaticMethodReference::compareByAge);
	
		persons.stream()
			.map(x -> x.getAge())
			.forEach(System.out::println);
	}
}
