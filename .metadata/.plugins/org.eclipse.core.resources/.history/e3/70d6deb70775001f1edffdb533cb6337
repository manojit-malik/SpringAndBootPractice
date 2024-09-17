package com.spring.learn_spring_framework.examples.a0;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;




@Component
class FieldinjectionExample {
	@Autowired
	Dependency1 dependency1;
	@Autowired
	Dependency2 dependency2;
	public String toString() {
		return "Using Field Injection " + dependency1 +" and " + dependency2;
	}
}

@Component 
class SetterBasedInjectionExample {
	Dependency1 dependency1;
	Dependency2 dependency2;

	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("Setter Injection is used for Dependency1");
		this.dependency1 = dependency1;
	}

	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("Setter Injection is used for Dependency2");
		this.dependency2 = dependency2;
	}
	public String toString() {
		return "Using Setter-Based Injection " + dependency1 +" and " + dependency2;
	}
}

@Component
class ConstructorBasedInjectionExample {
	Dependency1 dependency1;
	Dependency2 dependency2;

//	@Autowired
	public ConstructorBasedInjectionExample(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection is used");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	public String toString() {
		return "Using Constroctor-Based Injection " + dependency1 +" and " + dependency2;
	}
}

@Component
class Dependency1 {
}

@Component
class Dependency2 {
}


@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {
//	@Bean
//	public GamingConsole game () {
//		var game = new SuperContraGame();
//		return game;
//	}
//	The game is Auto-wired to this bean. (When the above code is commented)
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		System.out.println("Gaming Parameter: " + game);
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class))

		{

//			context.getBean(GamingConsole.class).up();
//			context.getBean(GameRunner.class).run();
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(FieldinjectionExample.class));
			System.out.println(context.getBean(SetterBasedInjectionExample.class));
			System.out.println(context.getBean(ConstructorBasedInjectionExample.class));
		}

	}

}

