package com.chocolat0w0.temcho2;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class TimerController extends TimerTask implements OnClickListener {
	Time mTime = null;
	Timer mTimer = null;
	private OnTickListener mListener;
	
	TimerController(Timer timer) {
		this.mTime = new Time(0);
		this.mTimer = timer;
	}
	
	@Override
	public void run() {
		mTime.setTime(mTime.getTime() + 1000);
		java.lang.System.out.println("time:" + mTime.getTime());
		mListener.onTick(mTime);
	}

	@Override
	public void onClick() {
		mTimer.schedule(this, 0, 1000);
	}
	
	void setOnTickListener(OnTickListener listener) {
		this.mListener = listener;
	}

}
