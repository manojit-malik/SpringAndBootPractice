package com.spring.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
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
				new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class))

		{

//			context.getBean(GamingConsole.class).up();
//			context.getBean(GameRunner.class).run();
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}

}

