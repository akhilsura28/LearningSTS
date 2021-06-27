package com.akhilsura28.springdemo.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	@Autowired
	public static void main(String[] args) {}
	
	private GamingConsole game;
	
	public GameRunner(@Qualifier("mario") GamingConsole game) {
		this.game = game;
	}
	
	public void runGame() {
		
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
