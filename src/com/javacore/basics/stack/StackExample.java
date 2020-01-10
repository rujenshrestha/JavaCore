package com.javacore.basics.stack;

import java.util.*;

public class StackExample {
	
	// Pushing element on the top of the stack
	public void stack_push(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			stack.push(i * 3);
		}
	}

	// Popping element from the top of the stack
	public void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop :");

		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}

	// Displaying element on the top of the stack
	public void stack_peek(Stack<Integer> stack) {
		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top : " + element);
	}

	// Searching element in the stack
	public void stack_search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);

		if (pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position " + pos);
	}

	public static void main(String[] args) {

		StackExample obj = new StackExample();
		Stack<Integer> stack = new Stack<Integer>();

		obj.stack_push(stack);
		obj.stack_pop(stack);
		obj.stack_push(stack);
		obj.stack_peek(stack);
		obj.stack_search(stack, 2);
		obj.stack_search(stack, 6);
	}
}
