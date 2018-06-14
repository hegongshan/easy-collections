package com.hegongshan.collections;

public interface Stack<E> {
	
	boolean isEmpty();
	
	int size();
	
	void push(E e);
	
	E pop();
	
	E peek();

}
