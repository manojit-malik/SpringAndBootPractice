package com.spring.learn_spring_framework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		try(//		1: Launch a Spring Context
				var context = new AnnotationConfigApplicationContext
									(HelloWorldConfiguration.class)) {
//			2: Configure the things that we want Spring to manage 
//			HelloWorldConfiguration class - @Configuration
//			name method - @Bean
//			Retrieving Beans Managed by Spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
												//This is a Candidate
			System.out.println(context.getBean("person3Parameters"));
												//This is a Candidate
			System.out.println(context.getBean(Person.class));
//			System.out.println(context.getBean("address"));
//			System.out.println(context.getBean("address2"));	
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean("person5Qualifier"));
			System.out.println();
			// Will print all beans.
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);				
						//Method Reference (System.out::println).
			System.out.println(context.getBeanDefinitionCount());
		}
	}

}

