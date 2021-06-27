package com.akhilsura28.springdemo.game;

import org.springframework.stereotype.Component;

@Component
public class Mario implements GamingConsole {

	public static void main(String[] args) {
	}
	
	@Override
	public void up() {
		System.out.println("UP");
	}
	
	@Override
	public void down() {
		System.out.println("DOWN");
	}
	
	@Override
	public void left() {
		System.out.println("LEFT");
	}
	
	@Override
	public void right() {
		System.out.println("RIGHT");
	}

}
