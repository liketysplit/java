package Boles;
//Rick Boles
//CS 3410 - Data Structures
//Semester (Fall 2017)
//Program 2



public class Stack<E> {
	private final int size;
	private E[] stack;
	private int top = 0;

	@SuppressWarnings("unchecked")
	public Stack(){
		size = Integer.MAX_VALUE;
		stack = (E[]) new Object[size];
	}

	@SuppressWarnings("unchecked")
	public Stack(int i) {
		size = i > 0 ? i : Integer.MAX_VALUE;
		stack = (E[]) new Object[size];
	}

	public void push(E e){
		if (stack.length == 0)
			this.stack[top++] = e;
		else if (top < size)
			this.stack[top++] = e;
		else
			System.out.printf("%s","Stack Full");
	}

	public E peek(){
		return stack[top-1];
	}

	public E pop(){
		if(this.isEmpty()){
			System.out.printf("%s","Stack Empty");
			return stack[-1];
		}
		else
			return stack[--top];
	}

	public boolean isEmpty(){
		return (top == 0);
	}
}