package com.spring.learn_spring_framework.examples.f1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass {
	private SomeDependency someDependency;
	public SomeClass (SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All Dependencies are Ready!!");
	}
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("All Connections are getting closed");
	}
}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Getting Ready Using Some Dependency");		
	}
}

@Configuration
@ComponentScan
public class PrePostContextLauncherApplication {
	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext(PrePostContextLauncherApplication.class))

		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("Hehehehe");
		}

	}

}

