package com.javacore.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Rujen", 27));
		al.add(new Student(106, "Harry", 23));
		al.add(new Student(105, "Jordon", 28));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}
	}
}

class Student implements Comparable<Student> {

	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}
