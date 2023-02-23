package com.javatpoint;

public class B {
 private A a;

public void setA(A a) {
	this.a = a;
}
public void method2() {
	 System.out.println("B.method2");
	 a.method1();
}
}