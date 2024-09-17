
package com.spring.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
	public void up () {
		System.out.println("Up");
	}
	public void down () {
		System.out.println("Sit Down");
	}
	public void left () {
		System.out.println("Go Back");
	}
	public void right () {
		System.out.println("Accelerate and Shoot a bullet");
	}

}


