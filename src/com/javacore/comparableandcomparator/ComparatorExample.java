package com.javacore.comparableandcomparator;

import java.util.Comparator;

public class ComparatorExample {

}

class Stud {
	int rollno;
	String name;
	int age;

	Stud(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

}

class AgeComparator implements Comparator<Stud> {
	public int compare(Stud s1, Stud s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}
