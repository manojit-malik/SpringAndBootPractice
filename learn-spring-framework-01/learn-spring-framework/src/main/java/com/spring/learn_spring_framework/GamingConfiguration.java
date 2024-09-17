package com.spring.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.learn_spring_framework.game.GameRunner;
import com.spring.learn_spring_framework.game.GamingConsole;
import com.spring.learn_spring_framework.game.MarioGame;
import com.spring.learn_spring_framework.game.PacmanGame;
import com.spring.learn_spring_framework.game.SuperContraGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game () {
		var game = new SuperContraGame();
		return game;
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}

