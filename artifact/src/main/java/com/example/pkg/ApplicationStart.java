package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Point p = (Point) applicationContext.getBean("Point10");
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Point3d p3 = (Point3d) applicationContext.getBean("Point3d");
		System.out.println(p3.getX());
		System.out.println(p3.getY());
		System.out.println(p3.getZ());
		
		animal zeb =(animal) applicationContext.getBean("bobby");
		
		System.out.println(zeb.getSize().getWeight());
		System.out.println(zeb.getSize().getHeight());
		System.out.println(zeb.getColor().getColorName());
		System.out.println(zeb.getColor().getIndex());
		
		System.out.println(zeb.getValidator());
		
		/*System.out.println(zeb.getNames().get(0));
		System.out.println(zeb.getNames().get(1)); // for a list */
		System.out.println(zeb.getNames());
		System.out.println(zeb.getMapNames());
		System.out.println(zeb.getMapNames().get(0));
		
		((AbstractApplicationContext) applicationContext).close();
	}

}
