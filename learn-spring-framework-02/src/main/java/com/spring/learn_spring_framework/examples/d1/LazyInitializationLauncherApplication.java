package com.spring.learn_spring_framework.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class ClassA {
}

@Component
@Lazy
class ClassB {
	private ClassA classA;
	public ClassB(ClassA classA) {
//		This will be automatically executed even if ArraySysout line is not written.
//		This initialization is automatically called no matter what at the beginning.
//		To prevent it from happening, @Lazy is used. If it is used it will not be executed.
//		Therefore, the ClassB bean is not initialized.
		System.out.println("Some Initialization Logic");
		this.classA = classA;
	}
	public void doSomething() {
		System.out.println("Doing Something");
	}
}


@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class))

		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("Initialization of Context is completed");
//			Only when anywhere ClassB is referred or used then only the bean will be loaded.
//			As ClassB method is called here, now the bean is loaded.
//			This is because of @Lazy
			context.getBean(ClassB.class).doSomething();
		}

	}

}

