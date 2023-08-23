package com.training.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Applicationcontext.xml");
		
		Person p1 = (Person)context.getBean("person");
		
		System.out.println(p1.getfName());
		
		Person p2 = (Person)context.getBean("person");
		
		//Car c1 = (Car)context.getBean("car");
		
		//System.out.println(c1.getColor());
		
		p2.setfName("Peter");
		
		System.out.println(p1.getPersonDetail());
		//System.out.println(p2.getAge());
	}

}
