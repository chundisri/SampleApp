package com.student.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainExample {

	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Point p =(Point)context.getBean("center");
		p.dispaly();
		
	}

}
