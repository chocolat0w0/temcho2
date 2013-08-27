package com.chocolat0w0.temcho2;


public class Temcho2 {
	
	public static void main(String arg[]) {
		TimerController timerController = new TimerController();
		
		MainView mainView = new MainView();
		mainView.setOnClickListener(timerController);
		timerController.setOnTickListener(mainView);
	}
	
}
