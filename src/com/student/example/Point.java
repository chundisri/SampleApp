package com.student.example;

public class Point {
	
	private int a;
	private float c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}

	
	public void point() {
		System.out.println("def cons");
		} 
	public  Point() {}
	public  Point(int a) {this.a= a;}  
	  
	public  Point(float c) {  this.c = c;}  
	  
	public Point(int a, float c) {  
	    this.a = a;  
	    this.c = c;
	}

	public void dispaly(){
		
		System.out.println("the value of a & c"+ a+c);
	}
}
