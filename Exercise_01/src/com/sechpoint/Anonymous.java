package com.sechpoint;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Anonymous {
	public static void main(String[] args) {
		TreeSet<Employee> treeSet = new TreeSet<Employee>(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpId() - o2.getEmpId();
			}
		});

		treeSet.add(new Employee(5, "Five", "five@mail.com"));
		treeSet.add(new Employee(4, "Four", "four@mail.com"));
		treeSet.add(new Employee(2, "Two", "two@mail.com"));
		treeSet.add(new Employee(1, "One", "one@mail.com"));
		treeSet.add(new Employee(3, "Three", "three@mail.com"));

		System.out.println("Tree set in ascending order:");

		Iterator<Employee> itr = treeSet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
