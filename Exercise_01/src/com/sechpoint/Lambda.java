package com.sechpoint;

import java.util.Iterator;
import java.util.TreeSet;

public class Lambda {
	public static void main(String[] args) {
		TreeSet<Employee> treeSet = new TreeSet<Employee>(
				(o1, o2) -> o1.getEmpId() - o2.getEmpId());
		
		treeSet.add(new Employee(3, "Three", "three@mail.com"));
		treeSet.add(new Employee(5, "Five", "five@mail.com"));
		treeSet.add(new Employee(1, "One", "one@mail.com"));
		treeSet.add(new Employee(2, "Two", "two@mail.com"));
		treeSet.add(new Employee(4, "Four", "four@mail.com"));

		System.out.println("Tree set in ascending order:");

		Iterator<Employee> itr = treeSet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
