package com.sample;

import java.lang.reflect.Method;

class Integer implements Comparable<Integer> {
	private final int value;

	public Integer(int value) {
		this.value = value;
	}

	public int compareTo(Integer i) {
		return (value < i.value) ? -1 : (value == i.value) ? 0 : 1;
	}
	
	public static void main(String args[]){
		for (Method m : Integer.class.getMethods())    if (m.getName().equals("compareTo"))        System.out.println(m.toGenericString());
	}
}