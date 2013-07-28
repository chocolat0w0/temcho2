package com.chocolat0w0.temcho2;

import java.util.Timer;

import javax.swing.JFrame;

 
public class Temcho2 {
	private static MainView mMainView;
	
	public static void main(String arg[]) {
		initView();
		Temcho2 temcho2 = new Temcho2();
	}
	
	public Temcho2() {
		initTimer();
	}

	private void initTimer() {
		Timer timer = new Timer(true);
		TimerController timerTask = new TimerController();
		timer.schedule(timerTask, 0, 1000);
	}

	private static void initView() {
		mMainView = new MainView();
	}
}
