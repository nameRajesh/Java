package com.santosh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.santosh.service.ShapeService;

public class MainAop {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		ShapeService shapeService = context.getBean("shapeService",
				ShapeService.class);
		shapeService.getCircle().setName("string args");
		System.out.println(shapeService.getCircle().getName());
		System.out.println(shapeService.getTriangle().getName());
		System.out.println(shapeService.getTriangle().getHeight());
		 shapeService.getCircle().setNameReturn("name args");
	}
}
