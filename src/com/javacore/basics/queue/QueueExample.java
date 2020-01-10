package com.javacore.basics.queue;

//Java program to demonstrate working of Queue interface in Java 
import java.util.LinkedList; 
import java.util.Queue; 

public class QueueExample 
{ 
public static void main(String[] args) 
{ 
	Queue<Integer> q = new LinkedList<>(); 

	// Adds elements {0, 1, 2, 3, 4} to queue 
	for (int i=0; i<5; i++) 
	q.add(i); 

	// Display contents of the queue. 
	System.out.println("Elements of queue-"+q); 

	// To remove the head of queue. 
	int removedele = q.remove(); 
	System.out.println("removed element-" + removedele); 

	System.out.println(q); 

	// To view the head of queue 
	int head = q.peek(); 
	System.out.println("head of queue-" + head); 

	// Rest all methods of collection interface, 
	// Like size and contains can be used with this 
	// implementation. 
	int size = q.size();
	System.out.println("Size of queue-" + size); 
	
	// Removes and returns the head of the queue
	// Returns null if the queue is empty 
	Integer number = q.poll();
	System.out.println("number-" + number);
	size = q.size(); 
	System.out.println("Size of queue-" + size); 
	
	Integer element = q.element();
	System.out.println("element-" + element);
} 
} 
