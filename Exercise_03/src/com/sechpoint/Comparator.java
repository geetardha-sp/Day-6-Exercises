package com.sechpoint;

public class Comparator {
	public int compareByName(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}

	public int compareByAge(Person p1, Person p2) {
		return p1.getAge().compareTo(p2.getAge());
	}
}
