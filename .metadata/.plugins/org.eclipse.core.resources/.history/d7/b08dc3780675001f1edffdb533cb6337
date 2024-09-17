package com.spring.learn_spring_framework;

import com.spring.learn_spring_framework.game.GameRunner;
import com.spring.learn_spring_framework.game.MarioGame;
import com.spring.learn_spring_framework.game.PacmanGame;
import com.spring.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();			// 1: Object Creation
//		These game Objects are created in JVM
		var gameRunner = new GameRunner(game);	
		// 2: Object Creation + Wiring of Dependencies
		// Game is Dependency of GameRunner class
		gameRunner.run();
	}

}

