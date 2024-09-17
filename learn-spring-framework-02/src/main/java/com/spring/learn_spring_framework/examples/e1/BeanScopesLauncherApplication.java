package com.spring.learn_spring_framework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
// Declare it or not both are same, without declaring it's scope is Singleton only.
// SCOPE_SINGLETON is default scope.
@Component
class NormalClass {
}


// There are 2 types of Scope
// 1. @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// 2. @Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)


@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
}


@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class))

		{
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println();
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}

	}

}

