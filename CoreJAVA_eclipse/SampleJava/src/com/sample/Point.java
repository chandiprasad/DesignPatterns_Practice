package com.sample;

import java.lang.reflect.Method;

class Point {
  public int x;
  public int y;
  public Point(int x, int y) { this.x=x; this.y=y; }
  public Point clone() { return new Point(x,y); }
  
  
  public static void main(String args[]){
	  System.out.println(Point.class.getMethods().length);
	  for (Method m : Point.class.getMethods())  if (m.getName().equals("clone"))    System.out.println(m.toGenericString());
  }
}