package com.h.dsa;

class StackImplementation {
    private int[] stack;
    private int top;
    private int capacity;

    public StackImplementation(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

public class StackDemo {
	public static void main(String[] args) {
		StackImplementation stack = new StackImplementation(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top Element in stack: " + stack.peek());
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Size of stack: " + stack.size());
    }

}
