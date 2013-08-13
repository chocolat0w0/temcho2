package com.chocolat0w0.temcho2;

import java.util.Timer;

 
public class Temcho2 {
	
	public static void main(String arg[]) {
		Timer timer = new Timer(true);
		TimerController timerController = new TimerController(timer);
		
		MainView mainView = new MainView();
		mainView.setOnClickListener(timerController);
		timerController.setOnTickListener(mainView);
	}
	
}
