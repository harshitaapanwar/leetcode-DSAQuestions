package com.h.dsa;

import java.util.Stack;

public class StackImplementation {
	public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("stack = " + stack);

        System.out.println("Popped Element =  " + stack.pop());

        System.out.println("Top element in stack = " + stack.peek());

        System.out.println("Is Stack Empty? =  " + stack.isEmpty());

        System.out.println("Size of stack = " + stack.size());
    }

}
