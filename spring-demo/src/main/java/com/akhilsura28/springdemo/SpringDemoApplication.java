package com.akhilsura28.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akhilsura28.springdemo.game.GameRunner;
import com.akhilsura28.springdemo.game.GamingConsole;
import com.akhilsura28.springdemo.game.Mario;
import com.akhilsura28.springdemo.game.SuperContra;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
	
		
	ConfigurableApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
	
	GameRunner runner = context.getBean(GameRunner.class);
	
	runner.runGame();
	
	//GamingConsole game = new Mario();
	//GamingConsole game = new SuperContra();		
	/*Mario game1 = new Mario();
	SuperContra game2 = new SuperContra();
	
	GameRunner runner1 = new GameRunner(game1);
	GameRunner runner2 = new GameRunner(game2);
	
	runner1.runGame();
	runner2.runGame();*/
	
	}

}
