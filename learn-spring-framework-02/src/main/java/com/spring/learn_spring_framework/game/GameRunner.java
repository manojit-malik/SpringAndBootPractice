
package com.spring.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//	private MarioGame game;'
	@Autowired @Qualifier("SuperMarioGameQualifier")
	private GamingConsole game;
	public GameRunner( //@Qualifier("SuperMarioGameQualifier") 
	GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running Game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}

