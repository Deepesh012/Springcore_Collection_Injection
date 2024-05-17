package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


					//This is the Main Class of Collection Injecting
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
		Emp e1 =(Emp) context.getBean("emp1");
		
		System.out.println(e1.getName());
		System.out.println(e1.getPhones());
		System.out.println(e1.getAddress());
		System.out.println(e1.getCourses());
		System.out.println(e1.getProps());
		
		System.out.println(e1.getName().getClass().getName());
		System.out.println(e1.getPhones().getClass().getName());
		System.out.println(e1.getAddress().getClass().getName());
		System.out.println(e1.getCourses().getClass().getName());
		System.out.println(e1.getProps().getClass().getName());
		

	
		
	}
	
}
