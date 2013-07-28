package com.chocolat0w0.temcho2;

import java.sql.Time;
import java.util.TimerTask;

public class TimerController extends TimerTask {
	Time mTime = null;
	
	TimerController() {
		mTime = new Time(0);
	}
	
	@Override
	public void run() {
		mTime.setTime(mTime.getTime() + 1000);
		java.lang.System.out.println("time:" + mTime.getTime());
		
	}

}
