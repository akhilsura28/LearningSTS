package com.akhilsura28.springdemo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component

public class SuperContra implements GamingConsole{

	
	public void up() {
		System.out.println("SuperContra UP");
	}
	
	public void down() {
		System.out.println("SuperContra DOWN");
	}
	
	public void left() {
		System.out.println("SuperContra LEFT");
	}
	
	public void right() {
		System.out.println("SuperContra RIGHT");
	}
	
}
