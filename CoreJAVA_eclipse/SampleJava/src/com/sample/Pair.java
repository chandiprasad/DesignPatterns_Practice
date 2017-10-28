package com.sample;

import java.util.List;

class Pair<T, A> {
	private final T first;
	private final A second;

	public Pair(T first, A second) {
		this.first = first;
		this.second = second;
	}

	
	public T getFirst() {
		return first;
	}

	public A getSecond() {
		
		
		
		return second;
	}

	public static void main(String args[]) {
		//Pair<String, Integer> pair = new Pair<String, Integer>("one", 2);
		//assert pair.getFirst().equals("one") && pair.getSecond() == 2;
	}
}