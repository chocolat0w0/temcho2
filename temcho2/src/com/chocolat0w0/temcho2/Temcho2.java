package com.chocolat0w0.temcho2;

import java.util.Timer;

import javax.swing.JFrame;

 
public class Temcho2 {
	private MainView mMainView;
	private TimerController mTimerController;
	
	public static void main(String arg[]) {
		Temcho2 temcho2 = new Temcho2();
	}
	
	public Temcho2() {
		initTimer();
		initView(mTimerController);
		mTimerController.setOnTickListener(mMainView);
	}

	private void initTimer() {
		Timer timer = new Timer(true);
		mTimerController = new TimerController(timer);
	}

	private void initView(OnClickListener timerCtl) {
		mMainView = new MainView();
		mMainView.setOnClickListener(timerCtl);
	}
}
